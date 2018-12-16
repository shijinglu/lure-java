grammar Lure;

expr_list
    : expr                                          # exprListUnary
    | expr_list ',' expr                            # exprListAppend
    ;

expr
    : literal_value                                 # exprLiteralValue
    | expr cmp_op expr                              # exprDoubleOp
    | expr TK_IN '(' expr_list ')'                  # exprInOp
    | expr TK_NOT TK_IN '(' expr_list ')'           # exprNotInOp
    | TK_IDENTIFIER '(' expr_list? ')'              # exprFunction
    | expr TK_BETWEEN expr TK_AND expr              # exprBetweenOp
    | expr TK_LIKE TK_STRING_LITERAL                # exprLikeOp
    | expr TK_AND expr                              # exprAndOp
    | expr TK_OR expr                               # exprOrOp
    | TK_NOT expr                                   # exprUnaryOp
    | '(' expr ')'                                  # exprGroup
    ;

cmp_op
    : TK_EQ
    | TK_NE
    | TK_GT
    | TK_LT
    | TK_GE
    | TK_LE
    ;

literal_value
    : TK_INT_LITERAL
    | TK_DOUBLE_LITERAL
    | TK_STRING_LITERAL
    | TK_BOOLEAN_LITERAL
    | TK_IDENTIFIER
    ;

TK_INT_LITERAL
    : '-'? ('0' .. '9')+
    ;

TK_DOUBLE_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

TK_STRING_LITERAL
   : '"' ~ ["\r\n]* '"'
   | '\'' ~ ['\r\n]* '\''
   | '`' ~ [`\r\n]* '`'
   ;

TK_AND
    : A N D
    | '&&'
    ;

TK_OR
    : O R
    | '||'
    ;

TK_EQ : '==';
TK_NE : '!=';
TK_GT : '>';
TK_LT : '<';
TK_GE : '>=';
TK_LE : '<=';
TK_NOT : N O T | '!';
TK_BETWEEN : B E T W E E N;
TK_IN : I N;
TK_LIKE: L I K E;
TK_BOOLEAN_LITERAL: T R U E | F A L S E;

TK_IDENTIFIER
    : [a-zA-Z_] [a-zA-Z_0-9.]*
    ;

SPACES
    : [ \u000B\t\r\n] -> channel(HIDDEN)
    ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
