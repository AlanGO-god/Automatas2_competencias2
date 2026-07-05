grammar Expr;

root: expr EOF;

expr: EOF;

NMAP: 'nmap';
NMAP_OPTION: '-sS' | '-sV' | '-sn' ;
VERTICAL_BAR: '|';
SUDO: 'sudo';
SS: 'ss';
SS_OPTION: '-tuln' ;
TCPDUMP: 'tcpdump';
TCPDUMP_OPTION: '-i' |  '-c' ;
GREP: 'grep';
CURL: 'curl';
CURL_OPTIONS: '-I';
DIG: 'dig';
MX: 'MX';
DIAGONAL: '/';
MASCARA_SUBRED: '/24';
JOURNALCD: 'journalcd';
JOURNALCD_OPTION: '--since';
JOURNALCD_ARGUMENT: 'today';
COMILLAS_DOBLES: '"';
UFW: 'ufw';
UFW_ACTIONS: 'deny' ;
FROM: 'from';
RUTA_ARCHIVO: [a-zA-Z0-9_./]+;


IP: [0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+;
DOMINIO: [a-zA-Z0-9.-]+ '.' [a-zA-Z]+ [a-zA-Z]{2,} ;
NUMBER: [0-9]+;
STRING: COMILLAS_DOBLES (~["])* COMILLAS_DOBLES;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;