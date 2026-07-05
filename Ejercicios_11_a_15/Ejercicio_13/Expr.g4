grammar Expr;

root: expr EOF ;    

expr: EOF;

CREATE: 'CREATE';
INSERT: 'INSERT';
INTO: 'INTO';
TABLE: 'TABLE';
VALUES: 'VALUES';
SERIAL: 'SERIAL';
PRIMARY: 'PRIMARY';
KEY: 'KEY';
VARCHAR: 'VARCHAR';
NOT: 'NOT';
NULL: 'NULL';
INTEGER: 'INTEGER';
DATE: 'DATE';
SELECT: 'SELECT';
FROM: 'FROM';
INNER: 'INNER';
JOIN: 'JOIN';
WHERE: 'WHERE';

LLA_IZQ: '{';
LLA_DER: '}';
PAR_IZQ: '(';
PAR_DER: ')';
COR_IZQ: '[';
COR_DER: ']';
ASIGN: '=';
SEMICOL: ';';
COMA: ',';
PUNTO: '.';
COMILLA: '\'';

STRING: COMILLA (~['])* COMILLA;
NUM: [0-9]+ ;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
ALIAS: ID* PUNTO;

WS: [ \t\r\n]+ -> skip ;