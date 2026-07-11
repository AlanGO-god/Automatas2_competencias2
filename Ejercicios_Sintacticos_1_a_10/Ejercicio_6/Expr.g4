grammar Expr ;

root : expr EOF ;

expr: NUM MAS NUM MULT NUM;

NUM : [0-9]+;

MAS : '+';
MULT: '*';

WS: [ \t\r\n] + -> skip;