grammar Expr ;

root: expr EOF ;

expr: EOF;

FUNC: 'print';

CADENA: '"' ~["\r\n]+ '"';

WS: [ \t\r\n]+ -> skip;