grammar Expr ;
root : expr EOF ;

expr : NUM MEN NUM;

NUM : [0-9]+;

MEN : '-';

WS: [ \t\r\n] + -> skip;