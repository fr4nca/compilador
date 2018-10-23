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
import decaf.DecafParser.Method_callContext;

import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * This class defines basic symbols and scopes for Decaf language
 */
public class DecafSymbolsAndScopes extends DecafParserBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope
    static List errors;
    int nDecl;
    boolean tmetodo, vFor;

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
            Token t= ctx.CLASS().getSymbol();
            this.error(t, "No main method declared");
        }
    }

    @Override
    public void enterField_decl(DecafParser.Field_declContext ctx) {
        Token name = ctx.decl_id().get(0).ID().getSymbol();
        if (ctx.LCOLCHETE().size() > 0) {
            String index = ctx.int_literal().get(0).NUMBER().getText();
            int numero = Integer.parseInt(index);
            if (numero <= 0) {
                Token t = ctx.int_literal().get(0).NUMBER().getSymbol();
                this.error(t, "bad array size");
            }

        }
        this.defineVar(name);
    }

    @Override
    public void exitField_decl(DecafParser.Field_declContext ctx) {
    }

    @Override
    public void enterMethod_decl(DecafParser.Method_declContext ctx) {

        String methodName = ctx.ID().getText();

        FunctionSymbol function = new FunctionSymbol(methodName);
        // function.setType(type); // Set symbol type

        currentScope.define(function); // Define function in current scope
        
        

        if(ctx.decl_id().size()>0){
            nDecl = ctx.decl_id().size();
            
        }
        if(ctx.VOID()!=null){
            tmetodo=true;
        }

        saveScope(ctx, function);
        pushScope(function);
    }


    @Override
    public void exitMethod_decl(DecafParser.Method_declContext ctx) {
        
        popScope();
    }

    @Override
    public void enterBlock(DecafParser.BlockContext ctx) {
    }

    @Override
    public void exitBlock(DecafParser.BlockContext ctx) {
    }

    @Override
    public void enterDecl_id(DecafParser.Decl_idContext ctx) {
    }

    @Override
    public void exitDecl_id(DecafParser.Decl_idContext ctx) {
        
    }

    @Override
    public void enterStatement(DecafParser.StatementContext ctx) {
        if (ctx.RETURN() == null) {
            if(ctx.location()!=null){
            if (ctx.location().ID() != null) {
                Token t = ctx.location().ID().getSymbol();
                List<? extends Symbol> globalSymbols = globals.getSymbols();
                List<? extends Symbol> scopeSymbols = currentScope.getSymbols();

                if (!scopeSymbols.contains(new VariableSymbol(t.getText()))
                        && !globalSymbols.contains(new VariableSymbol(t.getText()))) {
                    this.error(t, "identifier used before being declared");
                }
            }
        }
        }else if(tmetodo){
            Token t=ctx.RETURN().getSymbol();
            this.error(t, "should not return value;");
        }

        if(ctx.FOR()!=null){
            vFor=true;
        }else{
            vFor=false;
        }
    }

    @Override
    public void exitMethod_call(Method_callContext ctx) {
        
    }
    

    @Override 
    public void enterExpr(DecafParser.ExprContext ctx) { 
        if(ctx.method_call()!=null){
            if(ctx.method_call().CALLOUT()==null){
                if(nDecl!=ctx.method_call().expr().size()){
                    Token t = ctx.method_call().LPARENTESE().getSymbol();
                    this.error(t, "argument mismatch");
                }
            }
            
        }
        if(vFor){
            if(ctx.literal()!=null){
                if(ctx.literal().int_literal()==null){
                    Token t=ctx.literal().bool_literal().BOOLEANVALOR().getSymbol();
                    this.error(t, "initial condition must be an int");
                }
            }
            
        }

    }


    @Override
    public void enterLocation(DecafParser.LocationContext ctx) {
    }

    @Override
    public void exitStatement(DecafParser.StatementContext ctx) {


    }

    @Override
    public void enterVar_decl(DecafParser.Var_declContext ctx) {
        List<Token> names = new ArrayList<Token>();
        List<? extends Symbol> scopeSymbols = currentScope.getSymbols();
        if(!scopeSymbols.contains(new VariableSymbol(ctx.decl_id().ID().getText()))){
            names.add(ctx.decl_id().ID().getSymbol());
        
            if (ctx.ID() != null) {
                for (int i = 0; i < ctx.ID().size(); i++) {
                    if(!scopeSymbols.contains(new VariableSymbol(ctx.ID().get(i).getText()))){
                        names.add(ctx.ID().get(i).getSymbol());
                    }
                    
                }
            }
        }else{
            Token t = ctx.decl_id().ID().getSymbol();
            this.error(t, "identifier declared twice");
        }
        
       
        for (Token name : names) {
            defineVar(name);
        }
    }


    @Override
    public void exitVar_decl(DecafParser.Var_declContext ctx) {
    }

    void defineVar(Token nameToken) {
        // int typeTokenType = typeCtx.start.getType();
        VariableSymbol var = new VariableSymbol(nameToken.getText());

        // DecafSymbol.Type type = this.getType(typeTokenType);
        // var.setType(type);

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
    // public static DecafSymbol.Type getType(int tokenType) {
    // switch (tokenType) {
    // case DecafParser.VOID:
    // return DecafSymbol.Type.tVOID;
    // case DecafParser.INT_LITERAL:
    // return DecafSymbol.Type.tINT;
    // }
    // return DecafSymbol.Type.tINVALID;
    // }

}
