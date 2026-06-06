parser grammar MiniLangParser;

options {
    tokenVocab=MiniLangLexer;
}

prog: PROGRAM ID PVIG decls cmdComp PONTO EOF;

decls: (VAR listDecl)?;
listDecl: declTip+;
declTip: listId DPONTOS tip PVIG;
listId: ID (VIG ID)*;
tip: INTEGER | BOOLEAN | STRING;

cmdComp: BEGIN listCmd END;
listCmd: cmd (PVIG cmd)*;
cmd: cmdIf | cmdOthers;

cmdOthers: cmdWhile | cmdRead | cmdWrite | cmdAtrib | cmdComp;
cmdIf: cmdIfMatched | cmdIfUnmatched;

cmdIfMatched: IF expr THEN cmdIfMatched ELSE cmdIfMatched | cmdOthers;
cmdIfUnmatched: IF expr THEN cmd | IF expr THEN cmdIfMatched ELSE cmdIfUnmatched;

cmdWhile: WHILE expr DO cmd;

cmdRead: READ ABPAR listId FPAR;

cmdWrite: WRITE ABPAR listW FPAR;
listW: elemW (VIG elemW)*;
elemW: expr | CADEIA;

cmdAtrib: ID ATRIB expr;

expr: exprRel | expr OPLOG exprRel;
exprRel: exprAd | exprAd OPREL exprAd;
exprAd: exprMult | exprAd OPAD exprMult;
exprMult: fator | exprMult OPMULT fator;
fator: ID | CTE | TRUE | FALSE | ABPAR expr FPAR | OPNEG fator;