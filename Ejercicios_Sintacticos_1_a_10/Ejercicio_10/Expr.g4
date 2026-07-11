grammar Expr ;

root: expr EOF ;

expr: PRINT PAREN_IZQ CADENA PAREN_DER FIN_LINEA;

PRINT: 'print';

PAREN_IZQ: '(';
PAREN_DER: ')';
FIN_LINEA: ';';

CADENA: '"' ~["\r\n]+ '"';

WS: [ \t\r\n]+ -> skip;