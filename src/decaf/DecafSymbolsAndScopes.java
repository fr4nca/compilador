package decaf;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.GlobalScope;
import org.antlr.symtab.LocalScope;
import org.antlr.symtab.Scope;
import org.antlr.symtab.VariableSymbol;
import org.antlr.symtab.Symbol;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import java.lang.System;
import java.util.List;
import java.util.Set;

/**
 * This class defines basic symbols and scopes for Decaf language
 */
public class DecafSymbolsAndScopes extends DecafParserBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope; // define symbols in this scope

    @Override
    public void enterProgram(DecafParser.ProgramContext ctx) {
        globals = new GlobalScope(null);
        pushScope(globals);
    }

    @Override
    public void exitProgram(DecafParser.ProgramContext ctx) {
        System.out.println("Saindo do escopo global\n" + globals);
        if (!globals.getSymbols().contains(new FunctionSymbol("main"))) {
            System.err.println("No main method");
            System.exit(0);
        }

    }

    @Override
    public void enterField_decl(DecafParser.Field_declContext ctx) {
        Token name = ctx.ID().get(0).getSymbol();
        if (ctx.LCOLCHETE().size() > 0) {
            if (ctx.LCOLCHETE().get(0).getText() != "") {
                String index = ctx.int_literal().get(0).NUMBER().getText();
                int numero = Integer.parseInt(index);
                System.out.println(numero);
                if (numero <= 0) {
                    Token alecrim = ctx.int_literal().get(0).NUMBER().getSymbol();
                    this.error(alecrim, "bad array size");
                    System.exit(0);
                }
            }
        }
        this.defineVar(name);
    }

    @Override
    public void exitField_decl(DecafParser.Field_declContext ctx) {
    }

    @Override
    public void enterMethod_decl(DecafParser.Method_declContext ctx) {
        String name = ctx.ID().get(0).getText();

        // int typeTokenType = ctx.type();
        // DecafSymbol.Type type = this.getType(typeTokenType);

        // push new scope by making new one that points to enclosing scope
        FunctionSymbol function = new FunctionSymbol(name);
        // function.setType(type); // Set symbol type

        currentScope.define(function); // Define function in current scope

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
    public void enterStatement(DecafParser.StatementContext ctx) {
        Token t = ctx.location().ID().getSymbol();
        List<? extends Symbol> symbols = currentScope.getSymbols();

        if (!symbols.contains(new VariableSymbol(t.getText()))) {
            this.error(t, "identifier used before being declared");
            System.exit(0);
        }

    }

    @Override
    public void exitStatement(DecafParser.StatementContext ctx) {

    }

    @Override
    public void enterVar_decl(DecafParser.Var_declContext ctx) {
        Token name = ctx.ID().get(0).getSymbol();
        this.defineVar(name);
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
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
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
