/* Grammar for TNO, Totally Not Oberon, Algol-68 style syntax. */
grammar TNOA;

tokens { MODULE, INT, VAR, TYPE, PROC }

module : 'MODULE' ID compound_statement ;

compound_statement
             : '{' statements* '}';

statements   : type_decl | var_decl | proc_decl | struct_decl | statement;

type_decl    : 'TYPE' type ID ';';
type         : ID | '^' type |
               '[' number? (',' number?)* ']' type |
               '(.' '.)' type |
               'PROC' type ('<' type '>')? ('(' type (',' type)* ')')?;
var_decl     : 'VAR' var_sub_decl ';';
var_sub_decl : type ID (':=' expression)? (',' ID (':=' expression)?)*;
var_sub_decl_struct
             : type ID (',' ID)*;
proc_decl    : 'PROC' type ('<' type ID '>')?
               ('(' type ID (',' ID)? (';' type ID (',' ID)?)* ')')? ID ';';
struct_decl  : 'STRUCT' '{' (var_sub_decl_struct ';')* '}' ('(' ID ')')? ID
               (';' | compound_statement );

statement    : ID (assignment | proc_call ) ';' |
               'IF' '(' expression ')' compound_statement
               ('ELSE' compound_statement)?;

assignment   : ':=' expression;
proc_call    : '(' (expression (',' expression)*)? ')';

struct_init  : '{' expression? (',' expression)* '}';
array_init   : '[' expression? (',' expression)* ']';
table_init   : '(.' (table_elem (',' table_elem)*)? '.)';
table_elem   : expression ':' expression;
number       : INTEGER | REAL;
expression   : ID | STRING | number | '-' number | ID '.' ID | 'NIL' |
               struct_init | array_init | table_init;

STRING  : '\'' ('\\' '\'' | '\\\\' | .)*? '\''
        | '"' ('\\' '"'| '\\\\' | .)*? '"';
INTEGER : BININT | OCTINT | DECINT | HEXINT ;
fragment BINDIGIT : [01]+ ;
fragment OCTDIGIT : [0-7]+ ;
fragment DECDIGIT : [0-9]+ ;
fragment HEXDIGIT : [0-9A-Fa-f]+ ;
BININT : '#b' BINDIGIT (BINDIGIT | '_')+ BINDIGIT | '#b' BINDIGIT+ ;
OCTINT : '#o' OCTDIGIT (OCTDIGIT | '_')+ OCTDIGIT | '#o' OCTDIGIT+ ;
DECINT : DECDIGIT (DECDIGIT | '_')+ DECDIGIT | DECDIGIT+ ;
HEXINT : '#x' HEXDIGIT (HEXDIGIT | '_')+ HEXDIGIT | '#x' HEXDIGIT+ ;

REAL : DECDIGIT+ '.' DECDIGIT+ ([Ee] DECDIGIT+)* ;

ID : [a-zA-Z_] ([a-zA-Z_] | [0-9])* ;

WS : [ \t\r\n]+ -> skip ;
SL_COMMENT : '//' .*? '\n' -> skip ;
