grammar xml;
/*
* Parser
*/
operation:get_operation|
          initialise_var|
          assignment|
          add_assignment|
          if_statement|
          for_statement|
          while_statement|
          type_cast;

initialise_var: TYPE NAME ASSIGMENT NEW TYPE OPEN_BRACKET expression CLOSE_BRACKET SEMICOLON;

assignment: (TYPE|ARRAY_TYPE)? NAME (OPEN_BRACKET NUMBER_LITERAL CLOSE_BRACKET)? ASSIGMENT expression SEMICOLON;

add_assignment: NAME (OPEN_BRACKET NUMBER_LITERAL CLOSE_BRACKET)? SUM_ASSIGMENT expression SEMICOLON;

get_elem: get_elem SEMICOLON|
    get_elem OPEN_BRACKET params? CLOSE_BRACKET|
    NAME DOT NAME;

get_array_elem: NAME OPEN_SQUAR_EBRACKET NUMBER_LITERAL CLOSE_SQUARE_BRACKET;

func_call: (TYPE|ARRAY_TYPE)? NAME OPEN_BRACKET params? CLOSE_BRACKET SEMICOLON;

params: expression (',' expression)*;

initialise_func: (TYPE|ARRAY_TYPE) NAME OPEN_BRACKET ((TYPE|ARRAY_TYPE) NAME (',' (TYPE|ARRAY_TYPE) NAME)*)? CLOSE_BRACKET OPEN_FIGURE_BRACKET operation* CLOSE_FIGURE_BRACKET;

if_block: IF OPEN_BRACKET condition CLOSE_BRACKET OPEN_FIGURE_BRACKET operation* CLOSE_FIGURE_BRACKET;
else_if_block:ELSE IF OPEN_BRACKET condition CLOSE_BRACKET OPEN_FIGURE_BRACKET operation* CLOSE_FIGURE_BRACKET;
else_block:ELSE OPEN_FIGURE_BRACKET operation* CLOSE_FIGURE_BRACKET;

if_statement: if_block else_if_block* else_block?;

for_statement: FOR OPEN_BRACKET range_statement CLOSE_BRACKET OPEN_FIGURE_BRACKET operation* CLOSE_FIGURE_BRACKET;

range_statement: (TYPE|ARRAY_TYPE) NAME IN NAME;

while_statement:WHILE OPEN_BRACKET condition CLOSE_BRACKET OPEN_FIGURE_BRACKET operation* CLOSE_FIGURE_BRACKET;

condition:expression (AND expression| OR expression)*;

type_cast:NAME ASSIGMENT OPEN_BRACKET TYPE CLOSE_BRACKET NAME SEMICOLON;

expression: OPEN_BRACKET expression CLOSE_BRACKET|
            expression ACTION_OPERATOR expression|
            expression BOOL_OPERATOR expression|
            get_operation|
            (NUMBER_LITERAL | STRING_LITERAL | NAME);

get_operation:get_elem|func_call|get_array_elem;

xml: (operation|initialise_func)+;

/*
* Lexer
*/

ARRAY_TYPE:TYPE OPEN_SQUAR_EBRACKET CLOSE_SQUARE_BRACKET;

TYPE: DOCUMENT|NODE|ATTRIBUTE|STRING|INT|FLOAT;

ACTION_OPERATOR: PlUS| MINUS| MULTIPLICATION| DIVISION;
BOOL_OPERATOR: MORE_THAN|MORE_EQUAL|LESS_THAN|LESS_EQUAL|EQUAL|NOT_EQUAL;

DOCUMENT: 'document';
NODE: 'node';
ATTRIBUTE: 'attribute';
STRING: 'string';
INT: 'int';
FLOAT: 'float';

ELSE: 'else';
IF: 'if';
FOR: 'for';
WHILE: 'while';
IN: 'in';
AND: 'and';
OR:'or';
NEW:'new';

NAME: [a-zA-Z]+;
NUMBER_LITERAL: [0-9]+('.'[0-9]+)?;
STRING_LITERAL : QOUTES_ONE.*?QOUTES_ONE | QOUTES_TWO.*?QOUTES_TWO;

WHITESPACE: (' '|'\t'|'\n') -> skip;

OPEN_BRACKET: '(';
CLOSE_BRACKET: ')';
OPEN_SQUAR_EBRACKET: '[';
CLOSE_SQUARE_BRACKET: ']';
OPEN_FIGURE_BRACKET: '{';
CLOSE_FIGURE_BRACKET: '}';

SEMICOLON: ';';
QOUTES_ONE: '\'';
QOUTES_TWO: '"';
ASSIGMENT: '=';
SUM_ASSIGMENT: '+=';
DOT: '.';
MORE_THAN: '>';
LESS_THAN: '<';
EQUAL: '==';
NOT_EQUAL: '!=';
MORE_EQUAL: '>=';
LESS_EQUAL: '<=';
PlUS: '+';
MINUS: '-';
MULTIPLICATION: '*';
DIVISION: '/';

COMMENT : '//' ~[\r\n]* '\r'? '\n' -> skip ;
