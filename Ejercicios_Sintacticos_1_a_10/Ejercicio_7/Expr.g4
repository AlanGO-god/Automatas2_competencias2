grammar Expr ;

root: expr EOF ;

expr: INT ID ASIG NUM;

INT: 'int';
ID: [a-zA-Z]+;
ASIG: '=';

NUM: [0-9]+;

WS: [ \t\r\n]+ -> skip;