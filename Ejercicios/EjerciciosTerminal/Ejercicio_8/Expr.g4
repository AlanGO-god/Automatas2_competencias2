grammar Expr ;

root: expr EOF ;

expr: EOF;

ID: [a-zA-Z]+;
COMP_MAY_EQ: '>=';

NUM: [0-9]+;

WS: [ \t\r\n]+ -> skip;