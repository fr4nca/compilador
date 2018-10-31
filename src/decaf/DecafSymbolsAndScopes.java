package decaf;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.GlobalScope;
import org.antlr.symtab.LocalScope;
import org.antlr.symtab.Scope;
import org.antlr.symtab.VariableSymbol;
import org.antlr.symtab.Symbol;
import org.antlr.symtab.Type;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import decaf.DecafParser.Bool_literalContext;
import decaf.DecafParser.Int_literalContext;
import decaf.DecafParser.LocationContext;
import decaf.DecafParser.Method_callContext;
import decaf.DecafParser.Return_metContext;
import decaf.DecafParser.StatementContext;
import decaf.DecafParser.TypeContext;
import decaf.DecafSymbol;

import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.Variable;

/**
 * This class defines basic symbols and scopes for Decaf language
 */
public class DecafSymbolsAndScopes extends DecafParserBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope
    static List errors;
    int nDecl;
    boolean mVoid, vFor, vAssign_op;
    List<VariableSymbol> argumentos = new ArrayList<VariableSymbol>();
    List<VariableSymbol> parametros = new ArrayList<VariableSymbol>();
    List<VariableSymbol> variaveis = new ArrayList<VariableSymbol>();
    List<FunctionSymbol> funcoes = new ArrayList<FunctionSymbol>();
    List<VariableSymbol> vetores = new ArrayList<VariableSymbol>();

    public DecafSymbolsAndScopes() {
        errors = new ArrayList<String>();
    }

    @Override
    public void enterProgram(DecafParser.ProgramContext ctx) {
        globals = new GlobalScope(null);
        pushScope(globals);
    }

    @Override
    public void exitProgram(DecafParser.ProgramContext ctx) {
        System.out.println("Saindo do escopo global\n" + globals);
        if (!globals.getSymbols().contains(new FunctionSymbol("main"))) {
            Token t = ctx.CLASS().getSymbol();
            this.error(t, "No main method declared");
        }
    }

    @Override
    public void enterField_decl(DecafParser.Field_declContext ctx) {
        Token name = ctx.decl_id().get(0).ID().getSymbol();
        if (ctx.LCOLCHETE().size() > 0) {
            VariableSymbol vVet = new VariableSymbol(ctx.decl_id(0).ID().getText());
            vetores.add(vVet);
            String index = ctx.int_literal().get(0).NUMBER().getText();
            int numero = Integer.parseInt(index);
            if (numero <= 0) {
                Token t = ctx.int_literal().get(0).NUMBER().getSymbol();
                this.error(t, "bad array size");
            }

        }
        this.defineVar(ctx.decl_id(0).type(), name);
    }

    @Override
    public void enterMethod_decl(DecafParser.Method_declContext ctx) {

        String methodName = ctx.ID().getText();

        FunctionSymbol function = new FunctionSymbol(methodName);

        currentScope.define(function); // Define function in current scope

        if (ctx.decl_id().size() > 0) {
            nDecl = ctx.decl_id().size();
            for (int i = 0; i < ctx.decl_id().size(); i++) {
                if (ctx.decl_id(i).type().INT() != null) {
                    VariableSymbol pInt = new VariableSymbol(ctx.decl_id(i).ID().getText());
                    pInt.setType(decaf.DecafSymbol.Type.tINT);
                    parametros.add(pInt);
                } else {
                    VariableSymbol pBoo = new VariableSymbol(ctx.decl_id(i).ID().getText());
                    pBoo.setType(decaf.DecafSymbol.Type.tBOOLEAN);
                    parametros.add(pBoo);
                }
            }

        }

        if (ctx.VOID() != null) {
            mVoid = true;
            funcoes.add(function);
        } else {
            DecafSymbol.Type type = this.getTypee(ctx.type().getStart().getType());
            function.setType(type); // Set symbol type
            funcoes.add(function);
        }

        saveScope(ctx, function);
        pushScope(function);
        for (int i = 0; i < ctx.decl_id().size(); i++) {
            VariableSymbol vPa = new VariableSymbol(ctx.decl_id(i).ID().getText());
            currentScope.define(vPa);
        }
    }

    @Override
    public void exitMethod_decl(DecafParser.Method_declContext ctx) {
        popScope();

    }

    @Override
    public void exitReturn_met(Return_metContext ctx) {
        if (!mVoid) {
            Type type = DecafSymbol.Type.tINT;
            if (ctx.expr(0).location() != null) {
                type = getTypeVar(ctx.expr(0).location().ID().getText());
            } else if (ctx.expr(0).literal() != null && ctx.expr(0).literal().bool_literal() != null) {
                type = getTypeArg(ctx.expr(0).literal().bool_literal().getText());
            } else if (ctx.expr(0).literal() != null && ctx.expr(0).literal().int_literal() != null) {
                type = getTypeArg(ctx.expr(0).literal().int_literal().getText());
            }

            if (type != funcoes.get(0).getType()) {
                this.error(ctx.RETURN().getSymbol(), "return value has wrong type");
            }
        }

    }

    @Override
    public void enterStatement(DecafParser.StatementContext ctx) {
        if (ctx.return_met() == null) {
            if (ctx.location() != null && ctx.location().ID() != null) {
                Token t = ctx.location().ID().getSymbol();
                List<? extends Symbol> globalSymbols = globals.getSymbols();
                List<? extends Symbol> scopeSymbols = currentScope.getSymbols();
                if (!scopeSymbols.contains(new VariableSymbol(t.getText()))
                        && !globalSymbols.contains(new VariableSymbol(t.getText()))) {
                    this.error(t, "identifier used before being declared");
                }

            }
        } else if (mVoid) {
            Token t = ctx.return_met().RETURN().getSymbol();
            this.error(t, "should not return value;");
        }

        if (ctx.FOR() != null) {
            vFor = true;
        } else {
            vFor = false;
        }

        if (ctx.IF() != null) {
            for (int i = 0; i < ctx.expr().size(); i++) {
                for (int x = 0; x < ctx.expr(i).expr().size(); x++) {
                    if (ctx.expr(i).expr(x).bin_op() == null) {
                        this.error(ctx.IF().getSymbol(), "condition should be a boolean");
                    }
                }
            }
        }

    }

    @Override
    public void exitStatement(StatementContext ctx) {
        if (ctx.location() != null && ctx.assign_op().OPIGUAL() != null && ctx.expr() != null) {
            Token t = ctx.PONTOVIRGULA().getSymbol();
            for (int i = 0; i < ctx.expr().size(); i++) {
                if (variaveis.contains(new VariableSymbol(ctx.location().ID().getText()))
                        && getTypeVar(ctx.location().ID().getText()) == DecafSymbol.Type.tINT) {
                    if (ctx.expr(i).bin_op() != null && ctx.expr(i).bin_op().OPARIT() == null) {
                        this.error(t, "rhs should be an int expression");
                    }
                }else if(ctx.expr(i).expr().size()>1){
                    List<Type> type = new ArrayList<Type>();
                    for(int x=0;x<ctx.expr(i).expr().size();x++){
                        if(ctx.expr(i).expr(x).location()==null&&ctx.expr(i).expr(x).literal().int_literal()!=null){
                            type.add(getTypeArg(ctx.expr(i).expr(x).literal().int_literal().getText()));
                        }else{
                            type.add(DecafSymbol.Type.tBOOLEAN);
                        }
                    }
                    if(ctx.expr(i).bin_op().OPREL()!=null){
                        if(type.get(0)!=DecafSymbol.Type.tINT||type.get(1)!=DecafSymbol.Type.tINT){
                            this.error(t, "operands of > must be ints");
                        }
                    }else if(ctx.expr(i).bin_op().OPEQ()!=null&&type.get(0)!=type.get(1)){
                        this.error(t, "types of operands of == must be equal");
                    }
                    
                }else if(ctx.expr(i).EXCLAMACAO()!=null
                    &&ctx.expr(i).expr(0).literal().bool_literal()==null){
                        this.error(t, "operand of ! must be boolean");
                }

                if (ctx.location().LCOLCHETE() != null && ctx.expr(i).location() != null
                        && ctx.expr(i).location().LCOLCHETE() == null
                        && vetores.contains(new VariableSymbol(ctx.expr(i).location().ID().getText()))) {
                    this.error(t, "bad type, rhs should be an int");
                }

            }

        }else if(ctx.location() != null && ctx.assign_op().OPMAISIGUAL() != null && ctx.expr() != null){
            for (int i = 0; i < ctx.expr().size(); i++) {
                if(ctx.expr(i).literal().int_literal()==null){
                    this.error(ctx.PONTOVIRGULA().getSymbol(), "lhs and rhs of += must be int");
                }
            }
        }
    }

    @Override
    public void enterExpr(DecafParser.ExprContext ctx) {
        if (ctx.method_call() != null && ctx.method_call().CALLOUT() == null) {
            if (nDecl != ctx.method_call().expr().size()) {
                Token t = ctx.method_call().LPARENTESE().getSymbol();
                this.error(t, "argument mismatch");
            }
        }
        if (vFor) {
            if (ctx.literal() != null && ctx.literal().int_literal() == null) {
                Token t = ctx.literal().bool_literal().BOOLEANVALOR().getSymbol();
                this.error(t, "initial condition must be an int");

            }
        }
    }

    @Override
    public void enterMethod_call(Method_callContext ctx) {
        argumentos.clear();
    }

    @Override
    public void exitMethod_call(Method_callContext ctx) {
        if (ctx.expr() != null && !argumentos.isEmpty() && !parametros.isEmpty()
                && parametros.size() == argumentos.size()) {
            for (int i = 0; i < ctx.expr().size(); i++) {
                if (argumentos.get(i).getType() != parametros.get(i).getType()) {
                    this.error(ctx.LPARENTESE().getSymbol(), "types don't match signature");
                }
            }
        }
    }

    @Override
    public void exitLocation(LocationContext ctx) {
        if (variaveis.contains(new VariableSymbol(ctx.ID().getText()))) {
            int i = variaveis.indexOf(new VariableSymbol(ctx.ID().getText()));
            VariableSymbol vLoc = new VariableSymbol(ctx.ID().getText());
            vLoc.setType(variaveis.get(i).getType());
            argumentos.add(vLoc);
        }
        if (ctx.LCOLCHETE() != null) {
            if (ctx.expr().location() != null) {
                if (variaveis.indexOf(new VariableSymbol(ctx.expr().location().ID().getText())) != -1) {
                    if (variaveis.get(variaveis.indexOf(new VariableSymbol(ctx.expr().location().ID().getText())))
                            .getType() != DecafSymbol.Type.tINT) {
                        this.error(ctx.LCOLCHETE().getSymbol(), "array index has wrong type");
                    }
                }
            }

        }

    }

    @Override
    public void exitInt_literal(Int_literalContext ctx) {
        VariableSymbol vInt = new VariableSymbol(ctx.getText());
        vInt.setType(decaf.DecafSymbol.Type.tINT);
        argumentos.add(vInt);

    }

    @Override
    public void exitBool_literal(Bool_literalContext ctx) {
        VariableSymbol vBoo = new VariableSymbol(ctx.getText());
        vBoo.setType(decaf.DecafSymbol.Type.tBOOLEAN);
        argumentos.add(vBoo);
    }

    @Override
    public void enterVar_decl(DecafParser.Var_declContext ctx) {
        List<Token> names = new ArrayList<Token>();
        List<? extends Symbol> scopeSymbols = currentScope.getSymbols();
        if (!scopeSymbols.contains(new VariableSymbol(ctx.decl_id().ID().getText()))) {
            names.add(ctx.decl_id().ID().getSymbol());

            if (ctx.ID() != null) {
                for (int i = 0; i < ctx.ID().size(); i++) {
                    if (!scopeSymbols.contains(new VariableSymbol(ctx.ID().get(i).getText()))) {
                        names.add(ctx.ID().get(i).getSymbol());
                    }

                }
            }
        } else {
            Token t = ctx.decl_id().ID().getSymbol();
            this.error(t, "identifier declared twice");
        }
        for (Token name : names) {
            defineVar(ctx.decl_id().type(), name);
        }
    }

    Type getTypeVar(String name) {
        return variaveis.get(variaveis.indexOf(new VariableSymbol(name))).getType();
    }

    Type getTypeArg(String name) {
        return argumentos.get(argumentos.indexOf(new VariableSymbol(name))).getType();
    }

    void defineVar(TypeContext typeCtx, Token nameToken) {
        VariableSymbol var = new VariableSymbol(nameToken.getText());

        DecafSymbol.Type type = this.getTypee(typeCtx.getStart().getType());
        // System.out.println(type);

        var.setType(type);

        variaveis.add(var);
        currentScope.define(var); // Define symbol in current scope
        System.out.println("Variável declarada: " + var.getName());
        System.out.println("Variáveis no escopo: " + currentScope.getSymbolNames());
    }

    /**
     * Método que atuliza o escopo para o atual e imprime o valor
     *
     * @param s
     */
    private void pushScope(Scope s) {

        currentScope = s;
        System.out.println("entering: " + currentScope.getName() + ":" + s);
    }

    /**
     * Método que cria um novo escopo no contexto fornecido
     *
     * @param ctx
     * @param s
     */
    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }

    /**
     * Muda para o contexto superior e atualia o escopo
     */
    private void popScope() {
        System.out.println("leaving: " + currentScope.getName() + ":" + currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    public static void error(Token t, String msg) {
        System.out.printf("line %d - %s\n", t.getLine(), msg);
    }

    /**
     * Valida tipos encontrados na linguagem para tipos reais
     *
     * @param tokenType
     * @return //
     */
    public static DecafSymbol.Type getTypee(int tokenType) {
        switch (tokenType) {
        case DecafParser.INT:
            return DecafSymbol.Type.tINT;
        case DecafParser.BOOLEAN:
            return DecafSymbol.Type.tBOOLEAN;
        }
        return DecafSymbol.Type.tINVALID;
    }

}
