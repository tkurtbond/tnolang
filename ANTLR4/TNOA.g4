/* Grammar for TNO, Totally Not Oberon, Algol-68 style syntax. */
grammar TNOA;

tokens { MODULE, INT, VAR, TYPE, PROC }

module : 'MODULE' ID compound ;

compound     : '{' statements* '}';

statements   : import_decl | type_decl | struct_decl | proc_decl | const_decl
             | var_decl | statement;

type         : ID | '^' type |
               '[' number? (',' number?)* ']' type |
               '(:' ':)' type |
               'PROC' type ('<' type '>')? ('(' type (',' type)* ')')?;
import_decl  : 'IMPORT' ID ('AS' ID)? (',' ID ('AS' ID)?)* ';';
type_decl    : 'TYPE' type ID '*'? ';';
struct_decl  : 'STRUCT' '{' (var_sub_decl_struct ';')* '}' ('(' ID ')')?
               ID '*'? ';';
proc_decl    : 'PROC' type ('<' type ID '>')?
               ('(' ('VAR' | 'IN')? type ID (',' ID)?
               (';' ('VAR' | 'IN')? type ID (',' ID)?)* ')')? ID '*'?
               (';' | compound);
const_decl   : 'CONST' var_sub_decl ';';
var_decl     : 'VAR' var_sub_decl ';';
var_sub_decl : type ID ('*' | '-')? (':=' expression)?
               (',' ID ('*' | '-')? (':=' expression)?)*;
var_sub_decl_struct
             : type ID (',' ID)*;

statement    : ID (assignment | proc_call ) ';' |
               'IF' '(' expression ')' compound
               ('ELSIF' '(' expression ')' compound)*
               ('ELSE' compound)? |
               'RETURN' expression ';';
assignment   : ':=' expression;
proc_call    : '(' (expression (',' expression)*)? ')';

struct_init  : '{' expression? (',' expression)* '}';
array_init   : '[' expression? (',' expression)* ']';
table_init   : '(:' (table_elem (',' table_elem)*)? ':)';
table_elem   : expression ':' expression;
number       : INTEGER | FLOAT;
expression   : ID | STRING | number | '-' number | ID '.' ID | 'NIL' |
               struct_init | array_init | table_init;

STRING  : '\'' ('\\' '\'' | '\\\\' | .)*? '\''
        | '"' ('\\' '"'| '\\\\' | .)*? '"';
INTEGER : BININT | OCTINT | DECINT | HEXINT ;
fragment BINDIGIT : [01]+ ;
fragment OCTDIGIT : [0-7]+ ;
fragment DECDIGIT : [0-9]+ ;
fragment HEXDIGIT : [0-9A-Fa-f]+ ;
BININT : '2' ('R' | 'r') ((BINDIGIT (BINDIGIT | '_')+ BINDIGIT) | BINDIGIT+) ;
OCTINT : '8' ('R' | 'r') ((OCTDIGIT (OCTDIGIT | '_')+ OCTDIGIT) | OCTDIGIT+) ;
DECINT : DECDIGIT (DECDIGIT | '_')+ DECDIGIT | DECDIGIT+ ;
HEXINT : '16'('R' | 'r') ((HEXDIGIT (HEXDIGIT | '_')+ HEXDIGIT) | HEXDIGIT+) ;

FLOAT  : ((DECDIGIT (DECDIGIT | '_')+ DECDIGIT) | DECDIGIT+) '.'
         ((DECDIGIT (DECDIGIT | '_')+ DECDIGIT) | DECDIGIT+) 
         ([Ee] [-+]* ((DECDIGIT (DECDIGIT | '_')+ DECDIGIT) | DECDIGIT+))? ;

ID : [a-zA-Z_] ([a-zA-Z_] | [0-9])* ;

WS : [ \t\r\n]+ -> skip ;
SL_COMMENT : '//' .*? '\n' -> skip ;
