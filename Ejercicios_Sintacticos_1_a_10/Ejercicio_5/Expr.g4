grammar Expr ;

root: expr EOF ;

expr: PRINT CADENA;

PRINT: 'print';

CADENA: '"' ~["\r\n]+ '"';

WS: [ \t\r\n]+ -> skip;