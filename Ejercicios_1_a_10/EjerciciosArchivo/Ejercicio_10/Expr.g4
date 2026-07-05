grammar Expr ;

root: expr EOF ;

expr: EOF;

PRINT: 'print';

PAREN_IZQ: '(';
PAREN_DER: ')';
FIN_LINEA: ';';

CADENA: '"' ~["\r\n]+ '"';

WS: [ \t\r\n]+ -> skip;