parser grammar AngularParser;

options {
  tokenVocab = AngularLexer;
}

program ///////////////////
    : importStatement* topLevelStatement* EOF;

topLevelStatement //////////////////
    : componentDeclaration
    | declaration;

eos
    : SemiColon?;

importStatement/////////////////
    : Import importFromBlock;

importFromBlock///////////
    : StringLiteral eos
    | Identifier? moduleItems? From StringLiteral eos;

moduleItems////////////////
    : '{' importItem (Comma importItem)* '}';

moduleDeclaration//////////////
    : Decorator NgModule '(' argumentObject? ')' classDeclaration;
classDeclaration///////////////???????????
    : Export? Class Identifier (Extends Identifier)? (Implements interfaceList)? '{' classBody* '}';
interfaceDeclaration/////////////
    : Export? Interface Identifier '{' typedPropertyAssignment+ '}' eos;

importItem////////////////////////
    : Identifier
    | NgModule
    | Decorator
    | Component
    | Input
    | Output
    | OnInit
    | Injectable
    | HostBinding
    | HostListener
    | EventEmitter;

// Declarations
declaration////////
    : classDeclaration
    | functionDeclaration
    | variableStatement
    | interfaceDeclaration
    | moduleDeclaration;

typedPropertyAssignment//////////////
    : Identifier Colon typeAnnotation eos;

componentDeclaration////////
    : '@' importItem '(' argumentObject? ')' ;

argumentObject///////////
    : '{' propertyAssignment (',' propertyAssignment)* ','? '}';
propertyAssignment///?????
    : Identifier Colon (propertyValue | typeAnnotation) eos;
propertyAssignmenthtml///////////
    : Identifier ':' singleExpression
    | '[' singleExpression ']' ':' singleExpression;

propertyValue////
    : literal
    | arrayLiteralhtml
    |arrayLiteral
    | objectLiteral
    |objectLiteralhtml
    | templateLiteral
    | unionType
    | functionCall
    | This Dot navigationChain
    | bracketedLiteral;

bracketedLiteral////////////
    : OpenBracket DecimalLiteral CloseBracket;

navigationChain///////////
    : Identifier (navigationStep)*;
navigationStep
   :Dot Identifier | bracketAccess;
bracketAccess/////////
    : OpenBracket singleExpression CloseBracket;

interfaceList
    : Identifier (Comma Identifier)*;

classBody////////////////
    : propertyDeclaration
    | methodDeclaration
    | decoratorExpression
    | htmlTemplateProperty;

htmlTemplateProperty////////
    : Identifier Colon Backtick (angularElement | interpolation | text | htmlInsideBackticks)+ Backtick;
propertyDeclaration//////////////////
    : (Private | Public | Protected)? varModifier? Identifier ('?' | '!')? (Colon typeAnnotation)? (Assign (newExpression | propertyValue))? eos;

methodDeclaration//////////
    : Decorator* Identifier '(' parameterList? ')' (Colon typeAnnotation)? block;

functionDeclaration///////////////
    : Export? Function_ Identifier '(' parameterList? ')' (Colon typeAnnotation)? block;

parameterList//////////
    : parameter (',' parameter)*;

parameter////////////
    : (Private | Public | Protected)? Identifier (Colon typeAnnotation)? (Assign singleExpression)?;

variableStatement/////////////
    : varModifier variableDeclaration (',' variableDeclaration)* eos;

variableDeclaration////////////
    : Identifier (Colon typeAnnotation)? (Assign singleExpression)?;
// Statements
statement//////////
    : variableStatement
    | expressionStatement
    | returnStatement
    | ifStatement
    | forStatement
    | whileStatement
    | block;

expressionStatement/////////////////
    : singleExpression eos;

returnStatement/////////////
    : Return singleExpression? eos;

ifStatement///////
    : If '(' singleExpression ')' block (Else block)?;

    forStatement//////////
        : For '(' variableStatement singleExpression SemiColon singleExpression ')' block;

whileStatement////////////////
    : While '(' singleExpression ')' block;

block////////////////
    : '{' statement* '}';

// Expressions
singleExpression//////////////////
    : New singleExpression//////
    | arrayLiteral///
    | literal////
    | unaryExpression
    | methodCall
    |arrayLiteralhtml
    | objectLiteral
    |objectLiteralhtml
    | functionCall
    | decoratorExpression
    | This Dot navigationChain
    | singleExpression Dot Identifier
    | singleExpression OpenBracket singleExpression CloseBracket
    | singleExpression OpenParen (singleExpression (',' singleExpression)*)? CloseParen
    | genericType
    | OpenParen singleExpression CloseParen
    | Identifier
    | singleExpression Plus singleExpression
    | singleExpression Minus singleExpression
    | singleExpression Multiply singleExpression
    | singleExpression Divide singleExpression
    | singleExpression Assign singleExpression
    | Class Identifier? (Extends Identifier)? '{' classBody* '}';


literal//////////
    : NullLiteral
    | BooleanLiteral
    | StringLiteral
    | DecimalLiteral;

arrayLiteral//////////////
    : OpenBracket (singleExpression (',' singleExpression)*)? ','? CloseBracket;

arrayLiteralhtml////////////
    : '[' (singleExpression (',' singleExpression)*)? ']';

objectLiteral///////////
    : '{' (propertyAssignment (',' propertyAssignment)*)? ','? '}';

objectLiteralhtml///////////
    : '{' (propertyAssignmenthtml (',' propertyAssignmenthtml)*)? ','? '}';

templateLiteral////////////
    : Backtick (htmlTemplateProperty | StringLiteral | singleExpression | angularElement | interpolation | text)* Backtick;

functionCall///////////////
    : Identifier '(' (singleExpression (',' singleExpression)*)? ')';

decoratorExpression//////?????????????????
    : Decorator (specificDecorator | Identifier) '(' argumentList? ')'?;

specificDecorator///////
    : Input
    | Output
    | Injectable
    | NgModule
    | HostBinding
    | HostListener
    | Interface;

argumentList//////
    : objectLiteral;

varModifier////////////////////
    : Export? Var
    | Export? Let
    | Export? Const;

typeAnnotation///////////
    : basicType
    | unionType
    | genericType
    | Void;

basicType/////////
    : Identifier (OpenBracket CloseBracket)*;

genericType///////////
    : Identifier '<' (typeAnnotation | unionType | genericType) (',' (typeAnnotation | unionType | genericType))* '>';

unionType/////////
    : basicType (BitOr basicType)+
    | '(' (basicType | genericType) (BitOr (basicType | genericType))+ ')';

newExpression//////
    : New Identifier '(' (singleExpression (',' singleExpression)*)? ')';
angularElement//////////////
    : '<' Identifier (angularAttribute | regularAttribute | classAttribute)* CloseTag
    | '<' Identifier (angularAttribute | regularAttribute | classAttribute)* '>' angularContent? closingTag
    | '<' TagName (angularAttribute | regularAttribute | classAttribute)* CloseTag
    | '<' TagName (angularAttribute | regularAttribute | classAttribute)* '>' angularContent? closingTag
    ;

regularAttribute///////////
    : Identifier '=' angularAttributeValue;

angularAttribute/////////////
    : tWO_WAY_BINDING Assign singleExpression
    | '[' Identifier ']' Assign singleExpression
    | '(' Identifier ')' Assign singleExpression
    | sTRUCTURAL_DIRECTIVE
    | Identifier '=' angularAttributeValue;
classAttribute///////
        : 'class' '=' StringLiteral;

tWO_WAY_BINDING//////////////////
        : '[' '(' Identifier ')' ']';
angularAttributeValue//////////////
        : StringLiteral
        | interpolation;

angularContent///////////
                : (angularElement | interpolation | text)*;

interpolation/////////
            : InterpolationStart singleExpression InterpolationEnd;


text/////////////
    : ~('<' | '{' | '}' | '[' | '(' | '*' )+;

sTRUCTURAL_DIRECTIVE/////////////
    : '*' ( NgIf | NgFor ) Assign singleExpression;

closingTag/////////////
    : '</' Identifier '>'
    | '</' TagName '>';

htmlInsideBackticks///////////
    : Backtick (angularElement | interpolation | text)* Backtick;
unaryExpression////////////
    : ('!' | '-') singleExpression;
methodCall///////////////
    : Identifier '(' (singleExpression (',' singleExpression)*)? ')';

