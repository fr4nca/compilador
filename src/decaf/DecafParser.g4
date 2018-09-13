parser grammar DecafParser;

@header {
package decaf;
}

options {
	language = Java;
	tokenVocab = DecafLexer;
}

program: CLASS PROGRAM LCURLY (field_decl)* (method_decl)* RCURLY;
field_decl : ( type ID | type ID LCOLCHETE (int_literal)+ RCOLCHETE( VIRGULA ( type ID LCOLCHETE int_literal RCOLCHETE | type ID ))*) PONTOVIRGULA;
method_decl : (type | VOID) ID LPARENTESE ( type ID (VIRGULA type ID)*)* RPARENTESE block;
block : LCURLY (var_decl)* (statement)* RCURLY;
var_decl : type ID (VIRGULA ID)* PONTOVIRGULA ;
statement : (location assign_op expr PONTOVIRGULA 
			| method_call PONTOVIRGULA
			| IF expr block (ELSE block)* 
			| FOR ID OPIGUAL expr VIRGULA expr block
			| RETURN (expr)* PONTOVIRGULA
			| BREAK PONTOVIRGULA
			| CONTINUE PONTOVIRGULA
			| block);
assign_op : OPIGUAL | OPMAISIGUAL | OPMENOSIGUAL;
method_call : (method_name LPARENTESE (expr (VIRGULA expr)*)* RPARENTESE 
			| CALLOUT LPARENTESE STRING (VIRGULA call_arg (VIRGULA call_arg)*)* RPARENTESE );
method_name : ID;
location : (ID | ID LCOLCHETE expr RCOLCHETE);
expr : location (expr)*
	| method_call 
	| literal 
	| expr bin_op expr 
	| MENOS expr 
	| EXCLAMACAO expr 
	| LPARENTESE expr RPARENTESE;
call_arg : (expr | STRING);
bin_op : (OPARIT | OPREL | OPEQ | OPCOND);
literal : (int_literal | char_literal | bool_literal);
type:  (INT | BOOLEAN);
int_literal : (NUMBER | HEX);
char_literal : CHAR;
bool_literal : BOOLEANVALOR;


// 