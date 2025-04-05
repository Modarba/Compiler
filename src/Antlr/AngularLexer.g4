lexer grammar AngularLexer;
// Comments and Whitespace
MultiLineComment  : '/*' .*? '*/' -> channel(HIDDEN);
SingleLineComment : '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);
WS                : [ \t\r\n]+ -> skip;
COMMENT           : '<!--' .*? '-->' -> channel(HIDDEN);
// Symbols and Operators
Slash             : '/' ;
GreaterThan       : '>' ;
Decorator         : '@' ;
OpenBracket       : '[' ;
CloseBracket      : ']' ;
OpenParen         : '(' ;
CloseParen        : ')' ;
OpenBrace         : '{' ;
CloseBrace        : '}' ;
SemiColon         : ';' ;
Comma             : ',' ;
Assign            : '=' ;
QuestionMark      : '?' ;
QuestionMarkDot   : '?.' ;
Colon             : ':' ;
Ellipsis          : '...' ;
Dot               : '.' ;
PlusPlus          : '++' ;
MinusMinus        : '--' ;
Plus              : '+' ;
Minus             : '-' ;
BitNot            : '~' ;
Not               : '!' ;
Multiply          : '*' ;
Modulus           : '%' ;
NullCoalesce      : '??' ;
Hashtag           : '#' ;
RightShiftArithmetic : '>>' ;
LeftShiftArithmetic  : '<<' ;
RightShiftLogical : '>>>' ;
LessThan          : '<' ;
CloseTag          : '/>' ;
OpenTag           : '</' ;
LessThanEquals    : '<=' ;
GreaterThanEquals : '>=' ;
Equals_           : '==' ;
NotEquals         : '!=' ;
IdentityEquals    : '===' ;
IdentityNotEquals : '!==' ;
BitAnd            : '&' ;
BitXOr            : '^' ;
BitOr             : '|' ;
And               : '&&' ;
Or                : '||' ;
MultiplyAssign    : '*=' ;
DivideAssign      : '/=' ;
ModulusAssign     : '%=' ;
PlusAssign        : '+=' ;
MinusAssign       : '-=' ;
LeftShiftArithmeticAssign  : '<<=' ;
RightShiftArithmeticAssign : '>>=' ;
RightShiftLogicalAssign    : '>>>=' ;
BitAndAssign      : '&=' ;
BitXorAssign      : '^=' ;
BitOrAssign       : '|=' ;
NullishCoalescingAssign : '??=' ;
ARROW             : '=>' ;
InterpolationStart: '{{' ;
InterpolationEnd  : '}}' ;



// Angular-Specific Keywords and Constructs
Component         : 'Component' ;
Directive         : 'Directive' ;
Injectable        : 'Injectable' ;
NgModule          : 'NgModule' ;
Input             : 'Input' ;
Output            : 'Output' ;
HostListener      : 'HostListener' ;
HostBinding       : 'HostBinding' ;
Pipe              : '@Pipe' ;
ViewChild         : '@ViewChild' ;
ViewChildren      : '@ViewChildren' ;
ContentChild      : '@ContentChild' ;
ContentChildren   : '@ContentChildren' ;
TemplateRef       : 'TemplateRef' ;
ElementRef        : 'ElementRef' ;
ChangeDetectorRef : 'ChangeDetectorRef' ;
OnInit            : '@OnInit' ;
OnDestroy         : 'OnDestroy' ;
NgIf              : 'ngIf' ;
NgFor             : 'ngFor' ;
EventEmitter      : 'EventEmitter' ;

// General TypeScript/JavaScript Keywords
Break             : 'break' ;
Do                : 'do' ;
Instanceof        : 'instanceof' ;
Typeof            : 'typeof' ;
Case              : 'case' ;
Else              : 'else' ;
New               : 'new' ;
Var               : 'var' ;
Catch             : 'catch' ;
Finally           : 'finally' ;
Return            : 'return' ;
Void              : 'void' ;
Continue          : 'continue' ;
For               : 'for' ;
Switch            : 'switch' ;
While             : 'while' ;
Debugger          : 'debugger' ;
Function_         : 'function' ;
This              : 'this' ;
Default           : 'default' ;
If                : 'if' ;
Throw             : 'throw' ;
Delete            : 'delete' ;
In                : 'in' ;
Try               : 'try' ;
Const             : 'const' ;
Let               : 'let' ;
As                : 'as' ;
From              : 'from' ;
Of                : 'of' ;

// Future Reserved Words
Class             : 'class' ;
Enum              : 'enum' ;
Extends           : 'extends' ;
Super             : 'super' ;
Export            : 'export' ;
Import            : 'import' ;
Implements        : 'implements' ;
Private           : 'private' ;
Public            : 'public' ;
Interface         : 'interface' ;
Package           : 'package' ;
Protected         : 'protected' ;
Static            : 'static' ;

// Literals
NullLiteral       : 'null' ;
BooleanLiteral    : 'true' | 'false' ;
StringLiteral
    : '"' (ESC_SEQ | ~["\\\r\n])* '"'   // Double-quoted strings
    | '\'' (ESC_SEQ | ~['\\\r\n])* '\'' // Single-quoted strings
    ;

fragment ESC_SEQ
    : '\\' (['"\\bfnrt/] | 'u' HexDigit HexDigit HexDigit HexDigit);
fragment HexDigit
    : [0-9a-fA-F];
DecimalLiteral
    : DecimalIntegerLiteral '.' [0-9] [0-9_]* ExponentPart?
    | '.' [0-9] [0-9_]* ExponentPart?
    | DecimalIntegerLiteral ExponentPart?;

Identifier        : [a-zA-Z_$][a-zA-Z0-9_$]* ;
TagName           : [a-zA-Z][a-zA-Z0-9-]* ;
Backtick          : '`' ;
// Fragments
fragment Interpolation
    : '{{' .*? '}}' ;

fragment DecimalIntegerLiteral : '0' | [1-9] [0-9_]* ;
fragment ExponentPart          : [eE] [+-]? [0-9_]+ ;

// Embedded CSS Support
CSSBlock          : '<style>' .*? '</style>' -> channel(HIDDEN);
StylesProperty    : 'styles' ':' '`' .*? '`' -> channel(HIDDEN);
