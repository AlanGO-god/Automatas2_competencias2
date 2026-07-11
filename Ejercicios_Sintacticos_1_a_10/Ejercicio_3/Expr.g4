grammar Expr ;
root : expr EOF ;

expr : ID ASIG NUM;

ID: [a-zA-Z];
NUM : [0-9]+;
ASIG : '=';

WS: [ \t\r\n] + -> skip;