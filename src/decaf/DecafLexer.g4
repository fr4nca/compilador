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

LCOCHETE : '[';
RCOCHETE : ']';

LPARENTESE : '(';
RPARENTESE : ')';

PONTUACAO : (','|';');

IF: 'if';
ELSE : 'else';
BOOLEANVALOR : ('false'|'true');
BOOLEAN : 'boolean';
CAlLOUT : 'callout';
CLASS : 'class';
INT : 'int';
RETURN : 'return';
VOID : 'void';
FOR :'for';
BREAK : 'break';
CONTINUE : 'continue';

NUMBER: [0-9]+;

OPARIT : ('+'|'-'|'*'|'/'|'%');
OPREL : ('>'|'<'|'+='|'<='|'>='|'=='|'!='|'=');
OPLOGIC : ('&&'|'||');


CHAR : '\'' (ESC|ASCII) '\'';

STRING : '"' (ESC|ASCII)* '"';

ID  :[a-zA-Z_][a-zA-Z0-9_]*;


fragment
ESC :  '\\' ('n'|'"'|'t'|'\\'|'\'');

fragment
ASCII : [a-zA-Z0-9 !#-&(-/:-@^-`{-~];


WS_ : (' ' | '\n' | '\t') -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;
