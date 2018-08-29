lexer grammar DecafLexer;

@header {
package decaf;
}

options
{
  language=Java;
}

tokens
{
  TK_class
}

LCURLY : '{';
RCURLY : '}';

IF: 'if';

CHAR : '\'' (ESC|ASCII) '\'';

STRING : '"' (ESC|ASCII)* '"';

ID  :[a-zA-z_][a-zA-Z0-9_]*;



fragment
ESC :  '\\' ('n'|'"'|'t'|'\\'|'\'');

fragment
ASCII : [a-zA-Z0-9 !#-&(-/:-@^-`{-~];


WS_ : (' ' | '\n' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;
