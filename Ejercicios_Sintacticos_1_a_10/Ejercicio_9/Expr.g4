grammar Expr ;

root: expr EOF ;

expr: IF PAREN_IZQ ID MAY NUM PAREN_DER;

IF: 'if';
PAREN_IZQ: '(';
PAREN_DER: ')';
MAY: '>';
ID: [a-zA-Z]+;

NUM: [0-9]+;

WS: [ \t\r\n]+ -> skip;