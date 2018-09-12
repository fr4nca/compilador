parser grammar DecafParser;

@header {
package decaf;
}

options {
	language = Java;
	tokenVocab = DecafLexer;
}

program: CLASS PROGRAM LCURLY field_decl RCURLY;
field_decl : ( type ID | type ID LCOLCHETE int_literal RCOLCHETE ) ( VIRGULA field_decl )* PONTOVIRGULA;
type:  INT | BOOLEAN ;
int_literal : NUMBER | HEX;

// 