grammar Expr ;

root: expr EOF ;

expr: EOF;

IF: 'if';
PAREN_IZQ: '(';
PAREN_DER: ')';
MAY: '>';
ID: [a-zA-Z]+;

NUM: [0-9]+;

WS: [ \t\r\n]+ -> skip;