grammar TNOO;
    WS        : [ \t\r\n]+ -> skip ;

    Integer   : Digit+ | (Digit HexDigit* 'H'); 
    Real      : Digit+ '.' Digit* (('E' | 'D')('+' | '-')? Digit+)?;
    Character : Digit HexDigit* 'X';
    Ident     : Letter (Letter | Digit)*;
    String    : ["] SqChar* ["] | ['] DqChar* ['];


/* CHARACTERS */
    Letter    : [A-Za-z];
    Digit     : [0-9];
    HexDigit  : Digit | [A-Fa-f];
    SqChar    : ~["\n];
    DqChar    : ~['\n];

/* COMMENTS FROM "(*" TO "*)" NESTED */
    Comment   : '(*' .*? '*)' -> skip;

/* PRODUCTIONS */
    number       : Integer | Real;

    // The productions from here down to the next comment are straight from Appendix 2 of the Oberon-2 report, 
    // except those that are added or modified for TNOO.
    module       : 'MODULE' Ident ';' importList? declSeq ('BEGIN' statementSeq)? 'END' Ident '.';
    importList   : 'IMPORT' (Ident ':=')? Ident (',' (Ident ':=')? Ident)* ';';
    declSeq      : ('CONST' (constDecl ';')* | 'TYPE' (typeDecl ';')* | 'VAR' (varDecl ';')*)* (procDecl ';' | forwardDecl ';')*;
    constDecl    : identDef '=' constExpr;
    typeDecl     : identDef '=' type;
    varDecl      : identList ':' type (':=' expr)?;
    procDecl     : 'PROCEDURE' (receiver)? identDef (formalPars)? ';' declSeq ('BEGIN' statementSeq)? 'END' Ident;
    forwardDecl  : 'PROCEDURE' '^' (receiver)? identDef (formalPars)?;
    formalPars   : '(' (fPSection (';' fPSection)*)? ')' (':' qualident (',' qualident)*)?;
    fPSection    : ('VAR')? Ident (',' Ident)* ':' type;
    receiver     : '(' ('VAR')? Ident ':' Ident ')';
    type         : qualident
                   | 'ARRAY' (constExpr (',' constExpr)*)? 'OF' type
                   | 'RECORD' ('(' qualident ')')? fieldList (';' fieldList)* 'END'
                   | 'TABLE' 'OF' type
                   | 'POINTER' 'TO' type
                   | 'PROCEDURE' (formalPars)?;
    fieldList    : identList ':' type;
    statementSeq : statement (';' statement)*;
    statement    : ( designator (',' designator)* ':=' expr (',' expr)*
                   | designator ('(' (exprList)? ')')?
                   | 'IF' expr 'THEN' statementSeq ('ELSIF' expr 'THEN' statementSeq)* ('ELSE' statementSeq)? 'END'
                   | 'CASE' expr 'OF' case ('|' case)* ('ELSE' statementSeq)? 'END'
                   | 'WHILE' expr 'DO' statementSeq 'END'
                   | 'REPEAT' statementSeq 'UNTIL' expr
                   | 'FOR' Ident ':=' expr 'TO' expr ('BY' constExpr)? 'DO' statementSeq 'END'
                   | 'LOOP' statementSeq 'END'
                   | 'WITH' guard 'DO' statementSeq ('|' guard 'DO' statementSeq)* ('ELSE' statementSeq)? 'END'
                   | 'EXIT'
                   | 'RETURN' (expr (',' expr)*)?
                   )?;
    case         : (caseLabels (',' caseLabels)* ':' statementSeq)?;
    caseLabels   : constExpr ('..' constExpr)?;
    guard        : qualident ':' qualident;
    constExpr    : expr;
    expr         : composite | simpleExpr (relation simpleExpr)?;
    composite    : arrayComp | tableComp | recordComp;
    arrayComp    : '[' (expr (',' expr)*)* ']';                               // Array initializer.
    tableComp    : '[:' ((expr ':' expr) (',' expr ':' expr)*)* ':]';         // Table initializer.
    recordComp   : '[.' expr (',' expr)* '.]';                                // Struct initializer.
    simpleExpr   : ('+' | '-')? term (addOp term)*;
    term         : factor (mulOp factor)*;
    factor       : designator ('(' (exprList)? ')')? | number | Character | String | 'NIL' | set | '(' expr ')' | '~' factor;
    set          : '{' (element (',' element)*)? '}';
    element      : expr ('..' expr)?;
    relation     : '=' | '#' | '<' | '<=' | '>' | '>=' | 'IN' | 'IS';
    addOp        : '+' | '-' | 'OR';
    mulOp        : '*' | '/' | 'DIV' | 'MOD' | '&';
    designator   : qualident ('.' Ident | '[' exprList ']' | '^' | '(' qualident ')')*;
    exprList     : expr (',' expr)*;
    identList    : identDef (',' identDef)*;
    qualident    : (Ident '.')? Ident;
    identDef     : Ident ('*' | '-')?;
    // The productions from Appendix B of the Oberon-2 report end here.

