grammar Expr;

root: expr EOF ;    

expr: NUM | IDF ;

PUBLIC: 'public';
CLASS: 'class';
STATIC: 'static';
VOID: 'void';
MAIN: 'main';
STRING: 'String';
INT: 'int';
IMPRIMIR: 'System.out.println';

LLA_IZQ: '{';
LLA_DER: '}';
PAR_IZQ: '(';
PAR_DER: ')';
COR_IZQ: '[';
COR_DER: ']';
ASIGN: '=';
MAS: '+';
SEMICOL: ';';

CADENA: '"' ~["\r\n]+ '"';
NUM: [0-9]+ ;
IDF: [a-zA-Z]+ ;

WS: [ \t\r\n]+ -> skip ;