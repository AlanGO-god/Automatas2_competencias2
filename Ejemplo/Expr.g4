grammar Expr;
root: expr EOF;
expr: EOF;

IF: 'if';
ID: [a-zA-Z]+;
MAYOR_QUE: '>';
NUM: [0-9]+;
WS: [ \t\r\n]+ -> skip;
