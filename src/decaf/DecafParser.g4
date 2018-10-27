parser grammar DecafParser;

@header {
package decaf;
}

options {
	language = Java;
	tokenVocab = DecafLexer;
}

program: CLASS PROGRAM LCURLY (field_decl)* (method_decl)* RCURLY;
field_decl : ( decl_id | decl_id LCOLCHETE (int_literal)+ RCOLCHETE( VIRGULA ( decl_id LCOLCHETE int_literal RCOLCHETE | decl_id))*) PONTOVIRGULA	;
method_decl : (type | VOID) ID LPARENTESE ( decl_id (VIRGULA decl_id)*)* RPARENTESE block;
block : LCURLY (var_decl)* (statement)* RCURLY;
var_decl : decl_id (VIRGULA ID)* PONTOVIRGULA ;
statement : (location assign_op expr PONTOVIRGULA 
			| method_call PONTOVIRGULA
			| IF expr block (ELSE block)* 
			| FOR ID OPIGUAL expr VIRGULA expr block
			| return_met PONTOVIRGULA
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
return_met: RETURN (expr)*;
call_arg : (expr | STRING);
bin_op : (OPARIT | OPREL | OPEQ | OPCOND);
literal : (int_literal | char_literal | bool_literal);
decl_id: type ID;
type:  (INT | BOOLEAN);
int_literal : (NUMBER | HEX);
char_literal : CHAR;
bool_literal : BOOLEANVALOR;
