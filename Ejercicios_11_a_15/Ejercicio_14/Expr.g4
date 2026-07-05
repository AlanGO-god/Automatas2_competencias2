grammar Expr;

root: expr EOF;

expr: EOF;

UPDATE: 'UPDATE';
SET: 'SET';
WHERE: 'WHERE';
IGUAL: '=';
COMILLA_SIMPLE: '\'';
COMA: ',';
PUNTO_COMA: ';';
STRING: COMILLA_SIMPLE (~['])* COMILLA_SIMPLE;

NUMBER: [0-9]+;
ID: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;