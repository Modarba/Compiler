// Generated from C:/Users/Lenovo/Desktop/untitled/src/Antlr/AngularParser.g4 by ANTLR 4.13.1
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WS=3, COMMENT=4, Slash=5, GreaterThan=6, 
		Decorator=7, OpenBracket=8, CloseBracket=9, OpenParen=10, CloseParen=11, 
		OpenBrace=12, CloseBrace=13, SemiColon=14, Comma=15, Assign=16, QuestionMark=17, 
		QuestionMarkDot=18, Colon=19, Ellipsis=20, Dot=21, PlusPlus=22, MinusMinus=23, 
		Plus=24, Minus=25, BitNot=26, Not=27, Multiply=28, Modulus=29, NullCoalesce=30, 
		Hashtag=31, RightShiftArithmetic=32, LeftShiftArithmetic=33, RightShiftLogical=34, 
		LessThan=35, CloseTag=36, OpenTag=37, LessThanEquals=38, GreaterThanEquals=39, 
		Equals_=40, NotEquals=41, IdentityEquals=42, IdentityNotEquals=43, BitAnd=44, 
		BitXOr=45, BitOr=46, And=47, Or=48, MultiplyAssign=49, DivideAssign=50, 
		ModulusAssign=51, PlusAssign=52, MinusAssign=53, LeftShiftArithmeticAssign=54, 
		RightShiftArithmeticAssign=55, RightShiftLogicalAssign=56, BitAndAssign=57, 
		BitXorAssign=58, BitOrAssign=59, NullishCoalescingAssign=60, ARROW=61, 
		InterpolationStart=62, InterpolationEnd=63, Component=64, Directive=65, 
		Injectable=66, NgModule=67, Input=68, Output=69, HostListener=70, HostBinding=71, 
		Pipe=72, ViewChild=73, ViewChildren=74, ContentChild=75, ContentChildren=76, 
		TemplateRef=77, ElementRef=78, ChangeDetectorRef=79, OnInit=80, OnDestroy=81, 
		NgIf=82, NgFor=83, EventEmitter=84, Break=85, Do=86, Instanceof=87, Typeof=88, 
		Case=89, Else=90, New=91, Var=92, Catch=93, Finally=94, Return=95, Void=96, 
		Continue=97, For=98, Switch=99, While=100, Debugger=101, Function_=102, 
		This=103, Default=104, If=105, Throw=106, Delete=107, In=108, Try=109, 
		Const=110, Let=111, As=112, From=113, Of=114, Class=115, Enum=116, Extends=117, 
		Super=118, Export=119, Import=120, Implements=121, Private=122, Public=123, 
		Interface=124, Package=125, Protected=126, Static=127, NullLiteral=128, 
		BooleanLiteral=129, StringLiteral=130, DecimalLiteral=131, Identifier=132, 
		TagName=133, Backtick=134, CSSBlock=135, StylesProperty=136, Divide=137;
	public static final int
		RULE_program = 0, RULE_topLevelStatement = 1, RULE_eos = 2, RULE_importStatement = 3, 
		RULE_importFromBlock = 4, RULE_moduleItems = 5, RULE_moduleDeclaration = 6, 
		RULE_classDeclaration = 7, RULE_interfaceDeclaration = 8, RULE_importItem = 9, 
		RULE_declaration = 10, RULE_typedPropertyAssignment = 11, RULE_componentDeclaration = 12, 
		RULE_argumentObject = 13, RULE_propertyAssignment = 14, RULE_propertyAssignmenthtml = 15, 
		RULE_propertyValue = 16, RULE_bracketedLiteral = 17, RULE_navigationChain = 18, 
		RULE_navigationStep = 19, RULE_bracketAccess = 20, RULE_interfaceList = 21, 
		RULE_classBody = 22, RULE_htmlTemplateProperty = 23, RULE_propertyDeclaration = 24, 
		RULE_methodDeclaration = 25, RULE_functionDeclaration = 26, RULE_parameterList = 27, 
		RULE_parameter = 28, RULE_variableStatement = 29, RULE_variableDeclaration = 30, 
		RULE_statement = 31, RULE_expressionStatement = 32, RULE_returnStatement = 33, 
		RULE_ifStatement = 34, RULE_forStatement = 35, RULE_whileStatement = 36, 
		RULE_block = 37, RULE_singleExpression = 38, RULE_literal = 39, RULE_arrayLiteral = 40, 
		RULE_arrayLiteralhtml = 41, RULE_objectLiteral = 42, RULE_objectLiteralhtml = 43, 
		RULE_templateLiteral = 44, RULE_functionCall = 45, RULE_decoratorExpression = 46, 
		RULE_specificDecorator = 47, RULE_argumentList = 48, RULE_varModifier = 49, 
		RULE_typeAnnotation = 50, RULE_basicType = 51, RULE_genericType = 52, 
		RULE_unionType = 53, RULE_newExpression = 54, RULE_angularElement = 55, 
		RULE_regularAttribute = 56, RULE_angularAttribute = 57, RULE_classAttribute = 58, 
		RULE_tWO_WAY_BINDING = 59, RULE_angularAttributeValue = 60, RULE_angularContent = 61, 
		RULE_interpolation = 62, RULE_text = 63, RULE_sTRUCTURAL_DIRECTIVE = 64, 
		RULE_closingTag = 65, RULE_htmlInsideBackticks = 66, RULE_unaryExpression = 67, 
		RULE_methodCall = 68;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "topLevelStatement", "eos", "importStatement", "importFromBlock", 
			"moduleItems", "moduleDeclaration", "classDeclaration", "interfaceDeclaration", 
			"importItem", "declaration", "typedPropertyAssignment", "componentDeclaration", 
			"argumentObject", "propertyAssignment", "propertyAssignmenthtml", "propertyValue", 
			"bracketedLiteral", "navigationChain", "navigationStep", "bracketAccess", 
			"interfaceList", "classBody", "htmlTemplateProperty", "propertyDeclaration", 
			"methodDeclaration", "functionDeclaration", "parameterList", "parameter", 
			"variableStatement", "variableDeclaration", "statement", "expressionStatement", 
			"returnStatement", "ifStatement", "forStatement", "whileStatement", "block", 
			"singleExpression", "literal", "arrayLiteral", "arrayLiteralhtml", "objectLiteral", 
			"objectLiteralhtml", "templateLiteral", "functionCall", "decoratorExpression", 
			"specificDecorator", "argumentList", "varModifier", "typeAnnotation", 
			"basicType", "genericType", "unionType", "newExpression", "angularElement", 
			"regularAttribute", "angularAttribute", "classAttribute", "tWO_WAY_BINDING", 
			"angularAttributeValue", "angularContent", "interpolation", "text", "sTRUCTURAL_DIRECTIVE", 
			"closingTag", "htmlInsideBackticks", "unaryExpression", "methodCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'/'", "'>'", "'@'", "'['", "']'", "'('", 
			"')'", "'{'", "'}'", "';'", "','", "'='", "'?'", "'?.'", "':'", "'...'", 
			"'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'%'", "'??'", 
			"'#'", "'>>'", "'<<'", "'>>>'", "'<'", "'/>'", "'</'", "'<='", "'>='", 
			"'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", 
			"'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", 
			"'^='", "'|='", "'??='", "'=>'", "'{{'", "'}}'", "'Component'", "'Directive'", 
			"'Injectable'", "'NgModule'", "'Input'", "'Output'", "'HostListener'", 
			"'HostBinding'", "'@Pipe'", "'@ViewChild'", "'@ViewChildren'", "'@ContentChild'", 
			"'@ContentChildren'", "'TemplateRef'", "'ElementRef'", "'ChangeDetectorRef'", 
			"'@OnInit'", "'OnDestroy'", "'ngIf'", "'ngFor'", "'EventEmitter'", "'break'", 
			"'do'", "'instanceof'", "'typeof'", "'case'", "'else'", "'new'", "'var'", 
			"'catch'", "'finally'", "'return'", "'void'", "'continue'", "'for'", 
			"'switch'", "'while'", "'debugger'", "'function'", "'this'", "'default'", 
			"'if'", "'throw'", "'delete'", "'in'", "'try'", "'const'", "'let'", "'as'", 
			"'from'", "'of'", "'class'", "'enum'", "'extends'", "'super'", "'export'", 
			"'import'", "'implements'", "'private'", "'public'", "'interface'", "'package'", 
			"'protected'", "'static'", "'null'", null, null, null, null, null, "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WS", "COMMENT", "Slash", 
			"GreaterThan", "Decorator", "OpenBracket", "CloseBracket", "OpenParen", 
			"CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Comma", "Assign", 
			"QuestionMark", "QuestionMarkDot", "Colon", "Ellipsis", "Dot", "PlusPlus", 
			"MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", "Modulus", 
			"NullCoalesce", "Hashtag", "RightShiftArithmetic", "LeftShiftArithmetic", 
			"RightShiftLogical", "LessThan", "CloseTag", "OpenTag", "LessThanEquals", 
			"GreaterThanEquals", "Equals_", "NotEquals", "IdentityEquals", "IdentityNotEquals", 
			"BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", 
			"ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
			"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
			"BitXorAssign", "BitOrAssign", "NullishCoalescingAssign", "ARROW", "InterpolationStart", 
			"InterpolationEnd", "Component", "Directive", "Injectable", "NgModule", 
			"Input", "Output", "HostListener", "HostBinding", "Pipe", "ViewChild", 
			"ViewChildren", "ContentChild", "ContentChildren", "TemplateRef", "ElementRef", 
			"ChangeDetectorRef", "OnInit", "OnDestroy", "NgIf", "NgFor", "EventEmitter", 
			"Break", "Do", "Instanceof", "Typeof", "Case", "Else", "New", "Var", 
			"Catch", "Finally", "Return", "Void", "Continue", "For", "Switch", "While", 
			"Debugger", "Function_", "This", "Default", "If", "Throw", "Delete", 
			"In", "Try", "Const", "Let", "As", "From", "Of", "Class", "Enum", "Extends", 
			"Super", "Export", "Import", "Implements", "Private", "Public", "Interface", 
			"Package", "Protected", "Static", "NullLiteral", "BooleanLiteral", "StringLiteral", 
			"DecimalLiteral", "Identifier", "TagName", "Backtick", "CSSBlock", "StylesProperty", 
			"Divide"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<TopLevelStatementContext> topLevelStatement() {
			return getRuleContexts(TopLevelStatementContext.class);
		}
		public TopLevelStatementContext topLevelStatement(int i) {
			return getRuleContext(TopLevelStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(138);
				importStatement();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Decorator || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 4438361089L) != 0)) {
				{
				{
				setState(144);
				topLevelStatement();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelStatementContext extends ParserRuleContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TopLevelStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTopLevelStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTopLevelStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTopLevelStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelStatementContext topLevelStatement() throws RecognitionException {
		TopLevelStatementContext _localctx = new TopLevelStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topLevelStatement);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				componentDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(156);
				match(SemiColon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(AngularParser.Import, 0); }
		public ImportFromBlockContext importFromBlock() {
			return getRuleContext(ImportFromBlockContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(Import);
			setState(160);
			importFromBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromBlockContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode From() { return getToken(AngularParser.From, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ModuleItemsContext moduleItems() {
			return getRuleContext(ModuleItemsContext.class,0);
		}
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importFromBlock);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(StringLiteral);
				setState(163);
				eos();
				}
				break;
			case OpenBrace:
			case From:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(164);
					match(Identifier);
					}
				}

				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace) {
					{
					setState(167);
					moduleItems();
					}
				}

				setState(170);
				match(From);
				setState(171);
				match(StringLiteral);
				setState(172);
				eos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleItemsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleItemsContext moduleItems() throws RecognitionException {
		ModuleItemsContext _localctx = new ModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moduleItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(OpenBrace);
			setState(176);
			importItem();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(177);
				match(Comma);
				setState(178);
				importItem();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleDeclarationContext extends ParserRuleContext {
		public TerminalNode Decorator() { return getToken(AngularParser.Decorator, 0); }
		public TerminalNode NgModule() { return getToken(AngularParser.NgModule, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ArgumentObjectContext argumentObject() {
			return getRuleContext(ArgumentObjectContext.class,0);
		}
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_moduleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(Decorator);
			setState(187);
			match(NgModule);
			setState(188);
			match(OpenParen);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace) {
				{
				setState(189);
				argumentObject();
				}
			}

			setState(192);
			match(CloseParen);
			setState(193);
			classDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public TerminalNode Extends() { return getToken(AngularParser.Extends, 0); }
		public TerminalNode Implements() { return getToken(AngularParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(195);
				match(Export);
				}
			}

			setState(198);
			match(Class);
			setState(199);
			match(Identifier);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(200);
				match(Extends);
				setState(201);
				match(Identifier);
				}
			}

			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(204);
				match(Implements);
				setState(205);
				interfaceList();
				}
			}

			setState(208);
			match(OpenBrace);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Decorator || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1120047726593L) != 0)) {
				{
				{
				setState(209);
				classBody();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(AngularParser.Interface, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public List<TypedPropertyAssignmentContext> typedPropertyAssignment() {
			return getRuleContexts(TypedPropertyAssignmentContext.class);
		}
		public TypedPropertyAssignmentContext typedPropertyAssignment(int i) {
			return getRuleContext(TypedPropertyAssignmentContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(217);
				match(Export);
				}
			}

			setState(220);
			match(Interface);
			setState(221);
			match(Identifier);
			setState(222);
			match(OpenBrace);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				typedPropertyAssignment();
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(228);
			match(CloseBrace);
			setState(229);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode NgModule() { return getToken(AngularParser.NgModule, 0); }
		public TerminalNode Decorator() { return getToken(AngularParser.Decorator, 0); }
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public TerminalNode Input() { return getToken(AngularParser.Input, 0); }
		public TerminalNode Output() { return getToken(AngularParser.Output, 0); }
		public TerminalNode OnInit() { return getToken(AngularParser.OnInit, 0); }
		public TerminalNode Injectable() { return getToken(AngularParser.Injectable, 0); }
		public TerminalNode HostBinding() { return getToken(AngularParser.HostBinding, 0); }
		public TerminalNode HostListener() { return getToken(AngularParser.HostListener, 0); }
		public TerminalNode EventEmitter() { return getToken(AngularParser.EventEmitter, 0); }
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & -432345564227567615L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 2305843009213702657L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				variableStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				moduleDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypedPropertyAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TypedPropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedPropertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypedPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypedPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypedPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedPropertyAssignmentContext typedPropertyAssignment() throws RecognitionException {
		TypedPropertyAssignmentContext _localctx = new TypedPropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typedPropertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(Identifier);
			setState(241);
			match(Colon);
			setState(242);
			typeAnnotation();
			setState(243);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode Decorator() { return getToken(AngularParser.Decorator, 0); }
		public ImportItemContext importItem() {
			return getRuleContext(ImportItemContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ArgumentObjectContext argumentObject() {
			return getRuleContext(ArgumentObjectContext.class,0);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(Decorator);
			setState(246);
			importItem();
			setState(247);
			match(OpenParen);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace) {
				{
				setState(248);
				argumentObject();
				}
			}

			setState(251);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentObjectContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ArgumentObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentObjectContext argumentObject() throws RecognitionException {
		ArgumentObjectContext _localctx = new ArgumentObjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentObject);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(OpenBrace);
			setState(254);
			propertyAssignment();
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					match(Comma);
					setState(256);
					propertyAssignment();
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(262);
				match(Comma);
				}
			}

			setState(265);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(Identifier);
			setState(268);
			match(Colon);
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(269);
				propertyValue();
				}
				break;
			case 2:
				{
				setState(270);
				typeAnnotation();
				}
				break;
			}
			setState(273);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmenthtmlContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public PropertyAssignmenthtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignmenthtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAssignmenthtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAssignmenthtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAssignmenthtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmenthtmlContext propertyAssignmenthtml() throws RecognitionException {
		PropertyAssignmenthtmlContext _localctx = new PropertyAssignmenthtmlContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_propertyAssignmenthtml);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(Identifier);
				setState(276);
				match(Colon);
				setState(277);
				singleExpression(0);
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(OpenBracket);
				setState(279);
				singleExpression(0);
				setState(280);
				match(CloseBracket);
				setState(281);
				match(Colon);
				setState(282);
				singleExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyValueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayLiteralhtmlContext arrayLiteralhtml() {
			return getRuleContext(ArrayLiteralhtmlContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralhtmlContext objectLiteralhtml() {
			return getRuleContext(ObjectLiteralhtmlContext.class,0);
		}
		public TemplateLiteralContext templateLiteral() {
			return getRuleContext(TemplateLiteralContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public NavigationChainContext navigationChain() {
			return getRuleContext(NavigationChainContext.class,0);
		}
		public BracketedLiteralContext bracketedLiteral() {
			return getRuleContext(BracketedLiteralContext.class,0);
		}
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_propertyValue);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				arrayLiteralhtml();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				objectLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				objectLiteralhtml();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				templateLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(292);
				unionType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				functionCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(294);
				match(This);
				setState(295);
				match(Dot);
				setState(296);
				navigationChain();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(297);
				bracketedLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BracketedLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public BracketedLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketedLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBracketedLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBracketedLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBracketedLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketedLiteralContext bracketedLiteral() throws RecognitionException {
		BracketedLiteralContext _localctx = new BracketedLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bracketedLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(OpenBracket);
			setState(301);
			match(DecimalLiteral);
			setState(302);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NavigationChainContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public List<NavigationStepContext> navigationStep() {
			return getRuleContexts(NavigationStepContext.class);
		}
		public NavigationStepContext navigationStep(int i) {
			return getRuleContext(NavigationStepContext.class,i);
		}
		public NavigationChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNavigationChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNavigationChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNavigationChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationChainContext navigationChain() throws RecognitionException {
		NavigationChainContext _localctx = new NavigationChainContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_navigationChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(Identifier);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					navigationStep();
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NavigationStepContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public BracketAccessContext bracketAccess() {
			return getRuleContext(BracketAccessContext.class,0);
		}
		public NavigationStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNavigationStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNavigationStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNavigationStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationStepContext navigationStep() throws RecognitionException {
		NavigationStepContext _localctx = new NavigationStepContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_navigationStep);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dot:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(Dot);
				setState(312);
				match(Identifier);
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				bracketAccess();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BracketAccessContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public BracketAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBracketAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBracketAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBracketAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketAccessContext bracketAccess() throws RecognitionException {
		BracketAccessContext _localctx = new BracketAccessContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bracketAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(OpenBracket);
			setState(317);
			singleExpression(0);
			setState(318);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public InterfaceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceListContext interfaceList() throws RecognitionException {
		InterfaceListContext _localctx = new InterfaceListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_interfaceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(Identifier);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(321);
				match(Comma);
				setState(322);
				match(Identifier);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public DecoratorExpressionContext decoratorExpression() {
			return getRuleContext(DecoratorExpressionContext.class,0);
		}
		public HtmlTemplatePropertyContext htmlTemplateProperty() {
			return getRuleContext(HtmlTemplatePropertyContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_classBody);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				propertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				decoratorExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				htmlTemplateProperty();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTemplatePropertyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public List<TerminalNode> Backtick() { return getTokens(AngularParser.Backtick); }
		public TerminalNode Backtick(int i) {
			return getToken(AngularParser.Backtick, i);
		}
		public List<AngularElementContext> angularElement() {
			return getRuleContexts(AngularElementContext.class);
		}
		public AngularElementContext angularElement(int i) {
			return getRuleContext(AngularElementContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<HtmlInsideBackticksContext> htmlInsideBackticks() {
			return getRuleContexts(HtmlInsideBackticksContext.class);
		}
		public HtmlInsideBackticksContext htmlInsideBackticks(int i) {
			return getRuleContext(HtmlInsideBackticksContext.class,i);
		}
		public HtmlTemplatePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTemplateProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlTemplateProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlTemplateProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlTemplateProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTemplatePropertyContext htmlTemplateProperty() throws RecognitionException {
		HtmlTemplatePropertyContext _localctx = new HtmlTemplatePropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_htmlTemplateProperty);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(Identifier);
			setState(335);
			match(Colon);
			setState(336);
			match(Backtick);
			setState(341); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(341);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(337);
						angularElement();
						}
						break;
					case 2:
						{
						setState(338);
						interpolation();
						}
						break;
					case 3:
						{
						setState(339);
						text();
						}
						break;
					case 4:
						{
						setState(340);
						htmlInsideBackticks();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(343); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(345);
			match(Backtick);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode Private() { return getToken(AngularParser.Private, 0); }
		public TerminalNode Public() { return getToken(AngularParser.Public, 0); }
		public TerminalNode Protected() { return getToken(AngularParser.Protected, 0); }
		public TerminalNode QuestionMark() { return getToken(AngularParser.QuestionMark, 0); }
		public TerminalNode Not() { return getToken(AngularParser.Not, 0); }
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 19L) != 0)) {
				{
				setState(347);
				_la = _input.LA(1);
				if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 19L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 135004161L) != 0)) {
				{
				setState(350);
				varModifier();
				}
			}

			setState(353);
			match(Identifier);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark || _la==Not) {
				{
				setState(354);
				_la = _input.LA(1);
				if ( !(_la==QuestionMark || _la==Not) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(357);
				match(Colon);
				setState(358);
				typeAnnotation();
				}
			}

			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(361);
				match(Assign);
				setState(364);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case New:
					{
					setState(362);
					newExpression();
					}
					break;
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case This:
				case NullLiteral:
				case BooleanLiteral:
				case StringLiteral:
				case DecimalLiteral:
				case Identifier:
				case Backtick:
					{
					setState(363);
					propertyValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(368);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> Decorator() { return getTokens(AngularParser.Decorator); }
		public TerminalNode Decorator(int i) {
			return getToken(AngularParser.Decorator, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Decorator) {
				{
				{
				setState(370);
				match(Decorator);
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(Identifier);
			setState(377);
			match(OpenParen);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 1043L) != 0)) {
				{
				setState(378);
				parameterList();
				}
			}

			setState(381);
			match(CloseParen);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(382);
				match(Colon);
				setState(383);
				typeAnnotation();
				}
			}

			setState(386);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(AngularParser.Function_, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(388);
				match(Export);
				}
			}

			setState(391);
			match(Function_);
			setState(392);
			match(Identifier);
			setState(393);
			match(OpenParen);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 1043L) != 0)) {
				{
				setState(394);
				parameterList();
				}
			}

			setState(397);
			match(CloseParen);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(398);
				match(Colon);
				setState(399);
				typeAnnotation();
				}
			}

			setState(402);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			parameter();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(405);
				match(Comma);
				setState(406);
				parameter();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Private() { return getToken(AngularParser.Private, 0); }
		public TerminalNode Public() { return getToken(AngularParser.Public, 0); }
		public TerminalNode Protected() { return getToken(AngularParser.Protected, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 19L) != 0)) {
				{
				setState(412);
				_la = _input.LA(1);
				if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 19L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(415);
			match(Identifier);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(416);
				match(Colon);
				setState(417);
				typeAnnotation();
				}
			}

			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(420);
				match(Assign);
				setState(421);
				singleExpression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			varModifier();
			setState(425);
			variableDeclaration();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(426);
				match(Comma);
				setState(427);
				variableDeclaration();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(Identifier);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(436);
				match(Colon);
				setState(437);
				typeAnnotation();
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(440);
				match(Assign);
				setState(441);
				singleExpression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statement);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				variableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				returnStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(449);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(450);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			singleExpression(0);
			setState(454);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(AngularParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(Return);
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(457);
				singleExpression(0);
				}
				break;
			}
			setState(460);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(If);
			setState(463);
			match(OpenParen);
			setState(464);
			singleExpression(0);
			setState(465);
			match(CloseParen);
			setState(466);
			block();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(467);
				match(Else);
				setState(468);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(AngularParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(For);
			setState(472);
			match(OpenParen);
			setState(473);
			variableStatement();
			setState(474);
			singleExpression(0);
			setState(475);
			match(SemiColon);
			setState(476);
			singleExpression(0);
			setState(477);
			match(CloseParen);
			setState(478);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(AngularParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(While);
			setState(481);
			match(OpenParen);
			setState(482);
			singleExpression(0);
			setState(483);
			match(CloseParen);
			setState(484);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(OpenBrace);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167777664L) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 4260894364307L) != 0)) {
				{
				{
				setState(487);
				statement();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(AngularParser.New, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ArrayLiteralhtmlContext arrayLiteralhtml() {
			return getRuleContext(ArrayLiteralhtmlContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralhtmlContext objectLiteralhtml() {
			return getRuleContext(ObjectLiteralhtmlContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public DecoratorExpressionContext decoratorExpression() {
			return getRuleContext(DecoratorExpressionContext.class,0);
		}
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public NavigationChainContext navigationChain() {
			return getRuleContext(NavigationChainContext.class,0);
		}
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode Extends() { return getToken(AngularParser.Extends, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public TerminalNode Plus() { return getToken(AngularParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(AngularParser.Minus, 0); }
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(496);
				match(New);
				setState(497);
				singleExpression(23);
				}
				break;
			case 2:
				{
				setState(498);
				arrayLiteral();
				}
				break;
			case 3:
				{
				setState(499);
				literal();
				}
				break;
			case 4:
				{
				setState(500);
				unaryExpression();
				}
				break;
			case 5:
				{
				setState(501);
				methodCall();
				}
				break;
			case 6:
				{
				setState(502);
				arrayLiteralhtml();
				}
				break;
			case 7:
				{
				setState(503);
				objectLiteral();
				}
				break;
			case 8:
				{
				setState(504);
				objectLiteralhtml();
				}
				break;
			case 9:
				{
				setState(505);
				functionCall();
				}
				break;
			case 10:
				{
				setState(506);
				decoratorExpression();
				}
				break;
			case 11:
				{
				setState(507);
				match(This);
				setState(508);
				match(Dot);
				setState(509);
				navigationChain();
				}
				break;
			case 12:
				{
				setState(510);
				genericType();
				}
				break;
			case 13:
				{
				setState(511);
				match(OpenParen);
				setState(512);
				singleExpression(0);
				setState(513);
				match(CloseParen);
				}
				break;
			case 14:
				{
				setState(515);
				match(Identifier);
				}
				break;
			case 15:
				{
				setState(516);
				match(Class);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(517);
					match(Identifier);
					}
				}

				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(520);
					match(Extends);
					setState(521);
					match(Identifier);
					}
				}

				setState(524);
				match(OpenBrace);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Decorator || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1120047726593L) != 0)) {
					{
					{
					setState(525);
					classBody();
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
				match(CloseBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(570);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(534);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(535);
						match(Plus);
						setState(536);
						singleExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(537);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(538);
						match(Minus);
						setState(539);
						singleExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(540);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(541);
						match(Multiply);
						setState(542);
						singleExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(543);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(544);
						match(Divide);
						setState(545);
						singleExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(546);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(547);
						match(Assign);
						setState(548);
						singleExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(549);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(550);
						match(Dot);
						setState(551);
						match(Identifier);
						}
						break;
					case 7:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(552);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(553);
						match(OpenBracket);
						setState(554);
						singleExpression(0);
						setState(555);
						match(CloseBracket);
						}
						break;
					case 8:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(557);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(558);
						match(OpenParen);
						setState(567);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167777664L) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 4260624338945L) != 0)) {
							{
							setState(559);
							singleExpression(0);
							setState(564);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(560);
								match(Comma);
								setState(561);
								singleExpression(0);
								}
								}
								setState(566);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(569);
						match(CloseParen);
						}
						break;
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(AngularParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(OpenBracket);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167777664L) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 4260624338945L) != 0)) {
				{
				setState(578);
				singleExpression(0);
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(579);
						match(Comma);
						setState(580);
						singleExpression(0);
						}
						} 
					}
					setState(585);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
			}

			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(588);
				match(Comma);
				}
			}

			setState(591);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralhtmlContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ArrayLiteralhtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteralhtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteralhtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteralhtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteralhtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralhtmlContext arrayLiteralhtml() throws RecognitionException {
		ArrayLiteralhtmlContext _localctx = new ArrayLiteralhtmlContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrayLiteralhtml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(OpenBracket);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167777664L) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 4260624338945L) != 0)) {
				{
				setState(594);
				singleExpression(0);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(595);
					match(Comma);
					setState(596);
					singleExpression(0);
					}
					}
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(604);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(OpenBrace);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(607);
				propertyAssignment();
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(608);
						match(Comma);
						setState(609);
						propertyAssignment();
						}
						} 
					}
					setState(614);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				}
			}

			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(617);
				match(Comma);
				}
			}

			setState(620);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralhtmlContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<PropertyAssignmenthtmlContext> propertyAssignmenthtml() {
			return getRuleContexts(PropertyAssignmenthtmlContext.class);
		}
		public PropertyAssignmenthtmlContext propertyAssignmenthtml(int i) {
			return getRuleContext(PropertyAssignmenthtmlContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ObjectLiteralhtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteralhtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteralhtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteralhtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteralhtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralhtmlContext objectLiteralhtml() throws RecognitionException {
		ObjectLiteralhtmlContext _localctx = new ObjectLiteralhtmlContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_objectLiteralhtml);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(OpenBrace);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBracket || _la==Identifier) {
				{
				setState(623);
				propertyAssignmenthtml();
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						match(Comma);
						setState(625);
						propertyAssignmenthtml();
						}
						} 
					}
					setState(630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				}
			}

			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(633);
				match(Comma);
				}
			}

			setState(636);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateLiteralContext extends ParserRuleContext {
		public List<TerminalNode> Backtick() { return getTokens(AngularParser.Backtick); }
		public TerminalNode Backtick(int i) {
			return getToken(AngularParser.Backtick, i);
		}
		public List<HtmlTemplatePropertyContext> htmlTemplateProperty() {
			return getRuleContexts(HtmlTemplatePropertyContext.class);
		}
		public HtmlTemplatePropertyContext htmlTemplateProperty(int i) {
			return getRuleContext(HtmlTemplatePropertyContext.class,i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(AngularParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(AngularParser.StringLiteral, i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<AngularElementContext> angularElement() {
			return getRuleContexts(AngularElementContext.class);
		}
		public AngularElementContext angularElement(int i) {
			return getRuleContext(AngularElementContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public TemplateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateLiteralContext templateLiteral() throws RecognitionException {
		TemplateLiteralContext _localctx = new TemplateLiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_templateLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(Backtick);
			setState(647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(645);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(639);
						htmlTemplateProperty();
						}
						break;
					case 2:
						{
						setState(640);
						match(StringLiteral);
						}
						break;
					case 3:
						{
						setState(641);
						singleExpression(0);
						}
						break;
					case 4:
						{
						setState(642);
						angularElement();
						}
						break;
					case 5:
						{
						setState(643);
						interpolation();
						}
						break;
					case 6:
						{
						setState(644);
						text();
						}
						break;
					}
					} 
				}
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(650);
			match(Backtick);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(Identifier);
			setState(653);
			match(OpenParen);
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167777664L) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 4260624338945L) != 0)) {
				{
				setState(654);
				singleExpression(0);
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(655);
					match(Comma);
					setState(656);
					singleExpression(0);
					}
					}
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(664);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorExpressionContext extends ParserRuleContext {
		public TerminalNode Decorator() { return getToken(AngularParser.Decorator, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public SpecificDecoratorContext specificDecorator() {
			return getRuleContext(SpecificDecoratorContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public DecoratorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorExpressionContext decoratorExpression() throws RecognitionException {
		DecoratorExpressionContext _localctx = new DecoratorExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_decoratorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(Decorator);
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Injectable:
			case NgModule:
			case Input:
			case Output:
			case HostListener:
			case HostBinding:
			case Interface:
				{
				setState(667);
				specificDecorator();
				}
				break;
			case Identifier:
				{
				setState(668);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(671);
			match(OpenParen);
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(672);
				argumentList();
				}
				break;
			}
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(675);
				match(CloseParen);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecificDecoratorContext extends ParserRuleContext {
		public TerminalNode Input() { return getToken(AngularParser.Input, 0); }
		public TerminalNode Output() { return getToken(AngularParser.Output, 0); }
		public TerminalNode Injectable() { return getToken(AngularParser.Injectable, 0); }
		public TerminalNode NgModule() { return getToken(AngularParser.NgModule, 0); }
		public TerminalNode HostBinding() { return getToken(AngularParser.HostBinding, 0); }
		public TerminalNode HostListener() { return getToken(AngularParser.HostListener, 0); }
		public TerminalNode Interface() { return getToken(AngularParser.Interface, 0); }
		public SpecificDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specificDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSpecificDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSpecificDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSpecificDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificDecoratorContext specificDecorator() throws RecognitionException {
		SpecificDecoratorContext _localctx = new SpecificDecoratorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_specificDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 288230376151711807L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_argumentList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			objectLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(AngularParser.Var, 0); }
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public TerminalNode Let() { return getToken(AngularParser.Let, 0); }
		public TerminalNode Const() { return getToken(AngularParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_varModifier);
		int _la;
		try {
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(682);
					match(Export);
					}
				}

				setState(685);
				match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(686);
					match(Export);
					}
				}

				setState(689);
				match(Let);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Export) {
					{
					setState(690);
					match(Export);
					}
				}

				setState(693);
				match(Const);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(AngularParser.Void, 0); }
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeAnnotation);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				basicType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				unionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(698);
				genericType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(699);
				match(Void);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public List<TerminalNode> OpenBracket() { return getTokens(AngularParser.OpenBracket); }
		public TerminalNode OpenBracket(int i) {
			return getToken(AngularParser.OpenBracket, i);
		}
		public List<TerminalNode> CloseBracket() { return getTokens(AngularParser.CloseBracket); }
		public TerminalNode CloseBracket(int i) {
			return getToken(AngularParser.CloseBracket, i);
		}
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_basicType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(Identifier);
			setState(707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(703);
					match(OpenBracket);
					setState(704);
					match(CloseBracket);
					}
					} 
				}
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(AngularParser.GreaterThan, 0); }
		public List<TypeAnnotationContext> typeAnnotation() {
			return getRuleContexts(TypeAnnotationContext.class);
		}
		public TypeAnnotationContext typeAnnotation(int i) {
			return getRuleContext(TypeAnnotationContext.class,i);
		}
		public List<UnionTypeContext> unionType() {
			return getRuleContexts(UnionTypeContext.class);
		}
		public UnionTypeContext unionType(int i) {
			return getRuleContext(UnionTypeContext.class,i);
		}
		public List<GenericTypeContext> genericType() {
			return getRuleContexts(GenericTypeContext.class);
		}
		public GenericTypeContext genericType(int i) {
			return getRuleContext(GenericTypeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_genericType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(Identifier);
			setState(711);
			match(LessThan);
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(712);
				typeAnnotation();
				}
				break;
			case 2:
				{
				setState(713);
				unionType();
				}
				break;
			case 3:
				{
				setState(714);
				genericType();
				}
				break;
			}
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(717);
				match(Comma);
				setState(721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(718);
					typeAnnotation();
					}
					break;
				case 2:
					{
					setState(719);
					unionType();
					}
					break;
				case 3:
					{
					setState(720);
					genericType();
					}
					break;
				}
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728);
			match(GreaterThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnionTypeContext extends ParserRuleContext {
		public List<BasicTypeContext> basicType() {
			return getRuleContexts(BasicTypeContext.class);
		}
		public BasicTypeContext basicType(int i) {
			return getRuleContext(BasicTypeContext.class,i);
		}
		public List<TerminalNode> BitOr() { return getTokens(AngularParser.BitOr); }
		public TerminalNode BitOr(int i) {
			return getToken(AngularParser.BitOr, i);
		}
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<GenericTypeContext> genericType() {
			return getRuleContexts(GenericTypeContext.class);
		}
		public GenericTypeContext genericType(int i) {
			return getRuleContext(GenericTypeContext.class,i);
		}
		public UnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unionType);
		int _la;
		try {
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				basicType();
				setState(733); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(731);
					match(BitOr);
					setState(732);
					basicType();
					}
					}
					setState(735); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BitOr );
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				match(OpenParen);
				setState(740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(738);
					basicType();
					}
					break;
				case 2:
					{
					setState(739);
					genericType();
					}
					break;
				}
				setState(747); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(742);
					match(BitOr);
					setState(745);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						setState(743);
						basicType();
						}
						break;
					case 2:
						{
						setState(744);
						genericType();
						}
						break;
					}
					}
					}
					setState(749); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BitOr );
				setState(751);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(AngularParser.New, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_newExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(New);
			setState(756);
			match(Identifier);
			setState(757);
			match(OpenParen);
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167777664L) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 4260624338945L) != 0)) {
				{
				setState(758);
				singleExpression(0);
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(759);
					match(Comma);
					setState(760);
					singleExpression(0);
					}
					}
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(768);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularElementContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode CloseTag() { return getToken(AngularParser.CloseTag, 0); }
		public List<AngularAttributeContext> angularAttribute() {
			return getRuleContexts(AngularAttributeContext.class);
		}
		public AngularAttributeContext angularAttribute(int i) {
			return getRuleContext(AngularAttributeContext.class,i);
		}
		public List<RegularAttributeContext> regularAttribute() {
			return getRuleContexts(RegularAttributeContext.class);
		}
		public RegularAttributeContext regularAttribute(int i) {
			return getRuleContext(RegularAttributeContext.class,i);
		}
		public List<ClassAttributeContext> classAttribute() {
			return getRuleContexts(ClassAttributeContext.class);
		}
		public ClassAttributeContext classAttribute(int i) {
			return getRuleContext(ClassAttributeContext.class,i);
		}
		public TerminalNode GreaterThan() { return getToken(AngularParser.GreaterThan, 0); }
		public ClosingTagContext closingTag() {
			return getRuleContext(ClosingTagContext.class,0);
		}
		public AngularContentContext angularContent() {
			return getRuleContext(AngularContentContext.class,0);
		}
		public TerminalNode TagName() { return getToken(AngularParser.TagName, 0); }
		public AngularElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularElementContext angularElement() throws RecognitionException {
		AngularElementContext _localctx = new AngularElementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_angularElement);
		int _la;
		try {
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				match(LessThan);
				setState(771);
				match(Identifier);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268436736L) != 0) || _la==Class || _la==Identifier) {
					{
					setState(775);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(772);
						angularAttribute();
						}
						break;
					case 2:
						{
						setState(773);
						regularAttribute();
						}
						break;
					case 3:
						{
						setState(774);
						classAttribute();
						}
						break;
					}
					}
					setState(779);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(780);
				match(CloseTag);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				match(LessThan);
				setState(782);
				match(Identifier);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268436736L) != 0) || _la==Class || _la==Identifier) {
					{
					setState(786);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						setState(783);
						angularAttribute();
						}
						break;
					case 2:
						{
						setState(784);
						regularAttribute();
						}
						break;
					case 3:
						{
						setState(785);
						classAttribute();
						}
						break;
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(791);
				match(GreaterThan);
				setState(793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(792);
					angularContent();
					}
					break;
				}
				setState(795);
				closingTag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(796);
				match(LessThan);
				setState(797);
				match(TagName);
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268436736L) != 0) || _la==Class || _la==Identifier) {
					{
					setState(801);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						setState(798);
						angularAttribute();
						}
						break;
					case 2:
						{
						setState(799);
						regularAttribute();
						}
						break;
					case 3:
						{
						setState(800);
						classAttribute();
						}
						break;
					}
					}
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(806);
				match(CloseTag);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				match(LessThan);
				setState(808);
				match(TagName);
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268436736L) != 0) || _la==Class || _la==Identifier) {
					{
					setState(812);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						setState(809);
						angularAttribute();
						}
						break;
					case 2:
						{
						setState(810);
						regularAttribute();
						}
						break;
					case 3:
						{
						setState(811);
						classAttribute();
						}
						break;
					}
					}
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(817);
				match(GreaterThan);
				setState(819);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(818);
					angularContent();
					}
					break;
				}
				setState(821);
				closingTag();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegularAttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public AngularAttributeValueContext angularAttributeValue() {
			return getRuleContext(AngularAttributeValueContext.class,0);
		}
		public RegularAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRegularAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRegularAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRegularAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularAttributeContext regularAttribute() throws RecognitionException {
		RegularAttributeContext _localctx = new RegularAttributeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_regularAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(Identifier);
			setState(825);
			match(Assign);
			setState(826);
			angularAttributeValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularAttributeContext extends ParserRuleContext {
		public TWO_WAY_BINDINGContext tWO_WAY_BINDING() {
			return getRuleContext(TWO_WAY_BINDINGContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public STRUCTURAL_DIRECTIVEContext sTRUCTURAL_DIRECTIVE() {
			return getRuleContext(STRUCTURAL_DIRECTIVEContext.class,0);
		}
		public AngularAttributeValueContext angularAttributeValue() {
			return getRuleContext(AngularAttributeValueContext.class,0);
		}
		public AngularAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularAttributeContext angularAttribute() throws RecognitionException {
		AngularAttributeContext _localctx = new AngularAttributeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_angularAttribute);
		try {
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				tWO_WAY_BINDING();
				setState(829);
				match(Assign);
				setState(830);
				singleExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				match(OpenBracket);
				setState(833);
				match(Identifier);
				setState(834);
				match(CloseBracket);
				setState(835);
				match(Assign);
				setState(836);
				singleExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				match(OpenParen);
				setState(838);
				match(Identifier);
				setState(839);
				match(CloseParen);
				setState(840);
				match(Assign);
				setState(841);
				singleExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(842);
				sTRUCTURAL_DIRECTIVE();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(843);
				match(Identifier);
				setState(844);
				match(Assign);
				setState(845);
				angularAttributeValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassAttributeContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public ClassAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAttributeContext classAttribute() throws RecognitionException {
		ClassAttributeContext _localctx = new ClassAttributeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_classAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(Class);
			setState(849);
			match(Assign);
			setState(850);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TWO_WAY_BINDINGContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TWO_WAY_BINDINGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tWO_WAY_BINDING; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTWO_WAY_BINDING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTWO_WAY_BINDING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTWO_WAY_BINDING(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TWO_WAY_BINDINGContext tWO_WAY_BINDING() throws RecognitionException {
		TWO_WAY_BINDINGContext _localctx = new TWO_WAY_BINDINGContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_tWO_WAY_BINDING);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(OpenBracket);
			setState(853);
			match(OpenParen);
			setState(854);
			match(Identifier);
			setState(855);
			match(CloseParen);
			setState(856);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularAttributeValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public AngularAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularAttributeValueContext angularAttributeValue() throws RecognitionException {
		AngularAttributeValueContext _localctx = new AngularAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_angularAttributeValue);
		try {
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				match(StringLiteral);
				}
				break;
			case InterpolationStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(859);
				interpolation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularContentContext extends ParserRuleContext {
		public List<AngularElementContext> angularElement() {
			return getRuleContexts(AngularElementContext.class);
		}
		public AngularElementContext angularElement(int i) {
			return getRuleContext(AngularElementContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public AngularContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularContentContext angularContent() throws RecognitionException {
		AngularContentContext _localctx = new AngularContentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_angularContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(865);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						setState(862);
						angularElement();
						}
						break;
					case 2:
						{
						setState(863);
						interpolation();
						}
						break;
					case 3:
						{
						setState(864);
						text();
						}
						break;
					}
					} 
				}
				setState(869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode InterpolationStart() { return getToken(AngularParser.InterpolationStart, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode InterpolationEnd() { return getToken(AngularParser.InterpolationEnd, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(InterpolationStart);
			setState(871);
			singleExpression(0);
			setState(872);
			match(InterpolationEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> LessThan() { return getTokens(AngularParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(AngularParser.LessThan, i);
		}
		public List<TerminalNode> OpenBrace() { return getTokens(AngularParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(AngularParser.OpenBrace, i);
		}
		public List<TerminalNode> CloseBrace() { return getTokens(AngularParser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(AngularParser.CloseBrace, i);
		}
		public List<TerminalNode> OpenBracket() { return getTokens(AngularParser.OpenBracket); }
		public TerminalNode OpenBracket(int i) {
			return getToken(AngularParser.OpenBracket, i);
		}
		public List<TerminalNode> OpenParen() { return getTokens(AngularParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(AngularParser.OpenParen, i);
		}
		public List<TerminalNode> Multiply() { return getTokens(AngularParser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(AngularParser.Multiply, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(875); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(874);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34628187392L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(877); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class STRUCTURAL_DIRECTIVEContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode NgIf() { return getToken(AngularParser.NgIf, 0); }
		public TerminalNode NgFor() { return getToken(AngularParser.NgFor, 0); }
		public STRUCTURAL_DIRECTIVEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sTRUCTURAL_DIRECTIVE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSTRUCTURAL_DIRECTIVE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSTRUCTURAL_DIRECTIVE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSTRUCTURAL_DIRECTIVE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final STRUCTURAL_DIRECTIVEContext sTRUCTURAL_DIRECTIVE() throws RecognitionException {
		STRUCTURAL_DIRECTIVEContext _localctx = new STRUCTURAL_DIRECTIVEContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_sTRUCTURAL_DIRECTIVE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(Multiply);
			setState(880);
			_la = _input.LA(1);
			if ( !(_la==NgIf || _la==NgFor) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(881);
			match(Assign);
			setState(882);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClosingTagContext extends ParserRuleContext {
		public TerminalNode OpenTag() { return getToken(AngularParser.OpenTag, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode GreaterThan() { return getToken(AngularParser.GreaterThan, 0); }
		public TerminalNode TagName() { return getToken(AngularParser.TagName, 0); }
		public ClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosingTagContext closingTag() throws RecognitionException {
		ClosingTagContext _localctx = new ClosingTagContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_closingTag);
		try {
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				match(OpenTag);
				setState(885);
				match(Identifier);
				setState(886);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				match(OpenTag);
				setState(888);
				match(TagName);
				setState(889);
				match(GreaterThan);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlInsideBackticksContext extends ParserRuleContext {
		public List<TerminalNode> Backtick() { return getTokens(AngularParser.Backtick); }
		public TerminalNode Backtick(int i) {
			return getToken(AngularParser.Backtick, i);
		}
		public List<AngularElementContext> angularElement() {
			return getRuleContexts(AngularElementContext.class);
		}
		public AngularElementContext angularElement(int i) {
			return getRuleContext(AngularElementContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public HtmlInsideBackticksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlInsideBackticks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlInsideBackticks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlInsideBackticks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlInsideBackticks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlInsideBackticksContext htmlInsideBackticks() throws RecognitionException {
		HtmlInsideBackticksContext _localctx = new HtmlInsideBackticksContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_htmlInsideBackticks);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(Backtick);
			setState(898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(896);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						setState(893);
						angularElement();
						}
						break;
					case 2:
						{
						setState(894);
						interpolation();
						}
						break;
					case 3:
						{
						setState(895);
						text();
						}
						break;
					}
					} 
				}
				setState(900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(901);
			match(Backtick);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Not() { return getToken(AngularParser.Not, 0); }
		public TerminalNode Minus() { return getToken(AngularParser.Minus, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_la = _input.LA(1);
			if ( !(_la==Minus || _la==Not) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(904);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(Identifier);
			setState(907);
			match(OpenParen);
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167777664L) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 4260624338945L) != 0)) {
				{
				setState(908);
				singleExpression(0);
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(909);
					match(Comma);
					setState(910);
					singleExpression(0);
					}
					}
					setState(915);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(918);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0089\u0399\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0001\u0000"+
		"\u0005\u0000\u008c\b\u0000\n\u0000\f\u0000\u008f\t\u0000\u0001\u0000\u0005"+
		"\u0000\u0092\b\u0000\n\u0000\f\u0000\u0095\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u009b\b\u0001\u0001\u0002\u0003\u0002"+
		"\u009e\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00a6\b\u0004\u0001\u0004\u0003\u0004\u00a9\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ae\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b4\b\u0005\n"+
		"\u0005\f\u0005\u00b7\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00bf\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u00c5\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00cb\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00cf\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d3"+
		"\b\u0007\n\u0007\f\u0007\u00d6\t\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0003\b\u00db\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00e1\b\b\u000b"+
		"\b\f\b\u00e2\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00ef\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00fa"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0102\b\r"+
		"\n\r\f\r\u0105\t\r\u0001\r\u0003\r\u0108\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0110\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u011d\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u012b\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0133\b\u0012\n\u0012\f\u0012\u0136"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u013b\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u0144\b\u0015\n\u0015\f\u0015\u0147\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u014d\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0004\u0017\u0156\b\u0017\u000b\u0017\f\u0017\u0157\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0003\u0018\u015d\b\u0018\u0001\u0018\u0003\u0018"+
		"\u0160\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0164\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0168\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u016d\b\u0018\u0003\u0018\u016f\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0005\u0019\u0174\b\u0019\n\u0019\f\u0019\u0177"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u017c\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0181\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0003\u001a\u0186\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u018c\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0191\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0198\b\u001b\n\u001b\f\u001b\u019b"+
		"\t\u001b\u0001\u001c\u0003\u001c\u019e\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01a3\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01a7\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u01ad\b\u001d\n\u001d\f\u001d\u01b0\t\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01b7\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01bb\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01c4\b\u001f\u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0003!\u01cb\b!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01d6\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0005%\u01e9\b%\n%\f%\u01ec\t%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u0207\b&\u0001&\u0001&\u0003&\u020b"+
		"\b&\u0001&\u0001&\u0005&\u020f\b&\n&\f&\u0212\t&\u0001&\u0003&\u0215\b"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u0233"+
		"\b&\n&\f&\u0236\t&\u0003&\u0238\b&\u0001&\u0005&\u023b\b&\n&\f&\u023e"+
		"\t&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0005(\u0246\b(\n(\f("+
		"\u0249\t(\u0003(\u024b\b(\u0001(\u0003(\u024e\b(\u0001(\u0001(\u0001)"+
		"\u0001)\u0001)\u0001)\u0005)\u0256\b)\n)\f)\u0259\t)\u0003)\u025b\b)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0005*\u0263\b*\n*\f*\u0266\t*\u0003"+
		"*\u0268\b*\u0001*\u0003*\u026b\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u0273\b+\n+\f+\u0276\t+\u0003+\u0278\b+\u0001+\u0003+\u027b\b"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u0286\b,\n,\f,\u0289\t,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0005-\u0292\b-\n-\f-\u0295\t-\u0003-\u0297\b-\u0001-\u0001-\u0001."+
		"\u0001.\u0001.\u0003.\u029e\b.\u0001.\u0001.\u0003.\u02a2\b.\u0001.\u0003"+
		".\u02a5\b.\u0001/\u0001/\u00010\u00010\u00011\u00031\u02ac\b1\u00011\u0001"+
		"1\u00031\u02b0\b1\u00011\u00011\u00031\u02b4\b1\u00011\u00031\u02b7\b"+
		"1\u00012\u00012\u00012\u00012\u00032\u02bd\b2\u00013\u00013\u00013\u0005"+
		"3\u02c2\b3\n3\f3\u02c5\t3\u00014\u00014\u00014\u00014\u00014\u00034\u02cc"+
		"\b4\u00014\u00014\u00014\u00014\u00034\u02d2\b4\u00054\u02d4\b4\n4\f4"+
		"\u02d7\t4\u00014\u00014\u00015\u00015\u00015\u00045\u02de\b5\u000b5\f"+
		"5\u02df\u00015\u00015\u00015\u00035\u02e5\b5\u00015\u00015\u00015\u0003"+
		"5\u02ea\b5\u00045\u02ec\b5\u000b5\f5\u02ed\u00015\u00015\u00035\u02f2"+
		"\b5\u00016\u00016\u00016\u00016\u00016\u00016\u00056\u02fa\b6\n6\f6\u02fd"+
		"\t6\u00036\u02ff\b6\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u0005"+
		"7\u0308\b7\n7\f7\u030b\t7\u00017\u00017\u00017\u00017\u00017\u00017\u0005"+
		"7\u0313\b7\n7\f7\u0316\t7\u00017\u00017\u00037\u031a\b7\u00017\u00017"+
		"\u00017\u00017\u00017\u00017\u00057\u0322\b7\n7\f7\u0325\t7\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00057\u032d\b7\n7\f7\u0330\t7\u00017\u0001"+
		"7\u00037\u0334\b7\u00017\u00037\u0337\b7\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u034f\b9\u0001"+
		":\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		"<\u0001<\u0003<\u035d\b<\u0001=\u0001=\u0001=\u0005=\u0362\b=\n=\f=\u0365"+
		"\t=\u0001>\u0001>\u0001>\u0001>\u0001?\u0004?\u036c\b?\u000b?\f?\u036d"+
		"\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0003A\u037b\bA\u0001B\u0001B\u0001B\u0001B\u0005B\u0381\bB\n"+
		"B\fB\u0384\tB\u0001B\u0001B\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D"+
		"\u0001D\u0001D\u0005D\u0390\bD\nD\fD\u0393\tD\u0003D\u0395\bD\u0001D\u0001"+
		"D\u0001D\u0000\u0001LE\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u0000\b\u0006\u0000\u0007"+
		"\u0007@@BGPPTT\u0084\u0084\u0002\u0000z{~~\u0002\u0000\u0011\u0011\u001b"+
		"\u001b\u0001\u0000\u0080\u0083\u0002\u0000BG||\u0005\u0000\b\b\n\n\f\r"+
		"\u001c\u001c##\u0001\u0000RS\u0002\u0000\u0019\u0019\u001b\u001b\u0400"+
		"\u0000\u008d\u0001\u0000\u0000\u0000\u0002\u009a\u0001\u0000\u0000\u0000"+
		"\u0004\u009d\u0001\u0000\u0000\u0000\u0006\u009f\u0001\u0000\u0000\u0000"+
		"\b\u00ad\u0001\u0000\u0000\u0000\n\u00af\u0001\u0000\u0000\u0000\f\u00ba"+
		"\u0001\u0000\u0000\u0000\u000e\u00c4\u0001\u0000\u0000\u0000\u0010\u00da"+
		"\u0001\u0000\u0000\u0000\u0012\u00e7\u0001\u0000\u0000\u0000\u0014\u00ee"+
		"\u0001\u0000\u0000\u0000\u0016\u00f0\u0001\u0000\u0000\u0000\u0018\u00f5"+
		"\u0001\u0000\u0000\u0000\u001a\u00fd\u0001\u0000\u0000\u0000\u001c\u010b"+
		"\u0001\u0000\u0000\u0000\u001e\u011c\u0001\u0000\u0000\u0000 \u012a\u0001"+
		"\u0000\u0000\u0000\"\u012c\u0001\u0000\u0000\u0000$\u0130\u0001\u0000"+
		"\u0000\u0000&\u013a\u0001\u0000\u0000\u0000(\u013c\u0001\u0000\u0000\u0000"+
		"*\u0140\u0001\u0000\u0000\u0000,\u014c\u0001\u0000\u0000\u0000.\u014e"+
		"\u0001\u0000\u0000\u00000\u015c\u0001\u0000\u0000\u00002\u0175\u0001\u0000"+
		"\u0000\u00004\u0185\u0001\u0000\u0000\u00006\u0194\u0001\u0000\u0000\u0000"+
		"8\u019d\u0001\u0000\u0000\u0000:\u01a8\u0001\u0000\u0000\u0000<\u01b3"+
		"\u0001\u0000\u0000\u0000>\u01c3\u0001\u0000\u0000\u0000@\u01c5\u0001\u0000"+
		"\u0000\u0000B\u01c8\u0001\u0000\u0000\u0000D\u01ce\u0001\u0000\u0000\u0000"+
		"F\u01d7\u0001\u0000\u0000\u0000H\u01e0\u0001\u0000\u0000\u0000J\u01e6"+
		"\u0001\u0000\u0000\u0000L\u0214\u0001\u0000\u0000\u0000N\u023f\u0001\u0000"+
		"\u0000\u0000P\u0241\u0001\u0000\u0000\u0000R\u0251\u0001\u0000\u0000\u0000"+
		"T\u025e\u0001\u0000\u0000\u0000V\u026e\u0001\u0000\u0000\u0000X\u027e"+
		"\u0001\u0000\u0000\u0000Z\u028c\u0001\u0000\u0000\u0000\\\u029a\u0001"+
		"\u0000\u0000\u0000^\u02a6\u0001\u0000\u0000\u0000`\u02a8\u0001\u0000\u0000"+
		"\u0000b\u02b6\u0001\u0000\u0000\u0000d\u02bc\u0001\u0000\u0000\u0000f"+
		"\u02be\u0001\u0000\u0000\u0000h\u02c6\u0001\u0000\u0000\u0000j\u02f1\u0001"+
		"\u0000\u0000\u0000l\u02f3\u0001\u0000\u0000\u0000n\u0336\u0001\u0000\u0000"+
		"\u0000p\u0338\u0001\u0000\u0000\u0000r\u034e\u0001\u0000\u0000\u0000t"+
		"\u0350\u0001\u0000\u0000\u0000v\u0354\u0001\u0000\u0000\u0000x\u035c\u0001"+
		"\u0000\u0000\u0000z\u0363\u0001\u0000\u0000\u0000|\u0366\u0001\u0000\u0000"+
		"\u0000~\u036b\u0001\u0000\u0000\u0000\u0080\u036f\u0001\u0000\u0000\u0000"+
		"\u0082\u037a\u0001\u0000\u0000\u0000\u0084\u037c\u0001\u0000\u0000\u0000"+
		"\u0086\u0387\u0001\u0000\u0000\u0000\u0088\u038a\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0003\u0006\u0003\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0093\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0003\u0002\u0001\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005\u0000\u0000\u0001\u0097\u0001\u0001\u0000\u0000\u0000"+
		"\u0098\u009b\u0003\u0018\f\u0000\u0099\u009b\u0003\u0014\n\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u0003\u0001\u0000\u0000\u0000\u009c\u009e\u0005\u000e\u0000\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u0005\u0001\u0000\u0000\u0000\u009f\u00a0\u0005x\u0000\u0000\u00a0\u00a1"+
		"\u0003\b\u0004\u0000\u00a1\u0007\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"\u0082\u0000\u0000\u00a3\u00ae\u0003\u0004\u0002\u0000\u00a4\u00a6\u0005"+
		"\u0084\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003"+
		"\n\u0005\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005q\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0082\u0000\u0000\u00ac\u00ae\u0003\u0004\u0002"+
		"\u0000\u00ad\u00a2\u0001\u0000\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000"+
		"\u0000\u00ae\t\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\f\u0000\u0000"+
		"\u00b0\u00b5\u0003\u0012\t\u0000\u00b1\u00b2\u0005\u000f\u0000\u0000\u00b2"+
		"\u00b4\u0003\u0012\t\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\r\u0000\u0000\u00b9\u000b\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005\u0007\u0000\u0000\u00bb\u00bc\u0005"+
		"C\u0000\u0000\u00bc\u00be\u0005\n\u0000\u0000\u00bd\u00bf\u0003\u001a"+
		"\r\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u000b\u0000"+
		"\u0000\u00c1\u00c2\u0003\u000e\u0007\u0000\u00c2\r\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c5\u0005w\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0005s\u0000\u0000\u00c7\u00ca\u0005\u0084\u0000\u0000\u00c8\u00c9"+
		"\u0005u\u0000\u0000\u00c9\u00cb\u0005\u0084\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005y\u0000\u0000\u00cd\u00cf\u0003*\u0015"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d4\u0005\f\u0000\u0000"+
		"\u00d1\u00d3\u0003,\u0016\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\r\u0000\u0000\u00d8\u000f"+
		"\u0001\u0000\u0000\u0000\u00d9\u00db\u0005w\u0000\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0005|\u0000\u0000\u00dd\u00de\u0005\u0084"+
		"\u0000\u0000\u00de\u00e0\u0005\f\u0000\u0000\u00df\u00e1\u0003\u0016\u000b"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\r\u0000\u0000"+
		"\u00e5\u00e6\u0003\u0004\u0002\u0000\u00e6\u0011\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0007\u0000\u0000\u0000\u00e8\u0013\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ef\u0003\u000e\u0007\u0000\u00ea\u00ef\u00034\u001a\u0000\u00eb"+
		"\u00ef\u0003:\u001d\u0000\u00ec\u00ef\u0003\u0010\b\u0000\u00ed\u00ef"+
		"\u0003\f\u0006\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u0015\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005\u0084\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0013\u0000\u0000\u00f2\u00f3\u0003d2\u0000\u00f3\u00f4\u0003\u0004\u0002"+
		"\u0000\u00f4\u0017\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0007\u0000"+
		"\u0000\u00f6\u00f7\u0003\u0012\t\u0000\u00f7\u00f9\u0005\n\u0000\u0000"+
		"\u00f8\u00fa\u0003\u001a\r\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005\u000b\u0000\u0000\u00fc\u0019\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005\f\u0000\u0000\u00fe\u0103\u0003\u001c\u000e\u0000\u00ff\u0100"+
		"\u0005\u000f\u0000\u0000\u0100\u0102\u0003\u001c\u000e\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0107"+
		"\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0108"+
		"\u0005\u000f\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0005\r\u0000\u0000\u010a\u001b\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"\u0084\u0000\u0000\u010c\u010f\u0005\u0013\u0000\u0000\u010d\u0110\u0003"+
		" \u0010\u0000\u010e\u0110\u0003d2\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0003\u0004\u0002\u0000\u0112\u001d\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005\u0084\u0000\u0000\u0114\u0115\u0005\u0013\u0000"+
		"\u0000\u0115\u011d\u0003L&\u0000\u0116\u0117\u0005\b\u0000\u0000\u0117"+
		"\u0118\u0003L&\u0000\u0118\u0119\u0005\t\u0000\u0000\u0119\u011a\u0005"+
		"\u0013\u0000\u0000\u011a\u011b\u0003L&\u0000\u011b\u011d\u0001\u0000\u0000"+
		"\u0000\u011c\u0113\u0001\u0000\u0000\u0000\u011c\u0116\u0001\u0000\u0000"+
		"\u0000\u011d\u001f\u0001\u0000\u0000\u0000\u011e\u012b\u0003N\'\u0000"+
		"\u011f\u012b\u0003R)\u0000\u0120\u012b\u0003P(\u0000\u0121\u012b\u0003"+
		"T*\u0000\u0122\u012b\u0003V+\u0000\u0123\u012b\u0003X,\u0000\u0124\u012b"+
		"\u0003j5\u0000\u0125\u012b\u0003Z-\u0000\u0126\u0127\u0005g\u0000\u0000"+
		"\u0127\u0128\u0005\u0015\u0000\u0000\u0128\u012b\u0003$\u0012\u0000\u0129"+
		"\u012b\u0003\"\u0011\u0000\u012a\u011e\u0001\u0000\u0000\u0000\u012a\u011f"+
		"\u0001\u0000\u0000\u0000\u012a\u0120\u0001\u0000\u0000\u0000\u012a\u0121"+
		"\u0001\u0000\u0000\u0000\u012a\u0122\u0001\u0000\u0000\u0000\u012a\u0123"+
		"\u0001\u0000\u0000\u0000\u012a\u0124\u0001\u0000\u0000\u0000\u012a\u0125"+
		"\u0001\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012a\u0129"+
		"\u0001\u0000\u0000\u0000\u012b!\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"\b\u0000\u0000\u012d\u012e\u0005\u0083\u0000\u0000\u012e\u012f\u0005\t"+
		"\u0000\u0000\u012f#\u0001\u0000\u0000\u0000\u0130\u0134\u0005\u0084\u0000"+
		"\u0000\u0131\u0133\u0003&\u0013\u0000\u0132\u0131\u0001\u0000\u0000\u0000"+
		"\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135%\u0001\u0000\u0000\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u0015\u0000\u0000\u0138"+
		"\u013b\u0005\u0084\u0000\u0000\u0139\u013b\u0003(\u0014\u0000\u013a\u0137"+
		"\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b\'\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0005\b\u0000\u0000\u013d\u013e\u0003L"+
		"&\u0000\u013e\u013f\u0005\t\u0000\u0000\u013f)\u0001\u0000\u0000\u0000"+
		"\u0140\u0145\u0005\u0084\u0000\u0000\u0141\u0142\u0005\u000f\u0000\u0000"+
		"\u0142\u0144\u0005\u0084\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0001\u0000\u0000\u0000\u0146+\u0001\u0000\u0000\u0000\u0147"+
		"\u0145\u0001\u0000\u0000\u0000\u0148\u014d\u00030\u0018\u0000\u0149\u014d"+
		"\u00032\u0019\u0000\u014a\u014d\u0003\\.\u0000\u014b\u014d\u0003.\u0017"+
		"\u0000\u014c\u0148\u0001\u0000\u0000\u0000\u014c\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000"+
		"\u0000\u014d-\u0001\u0000\u0000\u0000\u014e\u014f\u0005\u0084\u0000\u0000"+
		"\u014f\u0150\u0005\u0013\u0000\u0000\u0150\u0155\u0005\u0086\u0000\u0000"+
		"\u0151\u0156\u0003n7\u0000\u0152\u0156\u0003|>\u0000\u0153\u0156\u0003"+
		"~?\u0000\u0154\u0156\u0003\u0084B\u0000\u0155\u0151\u0001\u0000\u0000"+
		"\u0000\u0155\u0152\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0086\u0000"+
		"\u0000\u015a/\u0001\u0000\u0000\u0000\u015b\u015d\u0007\u0001\u0000\u0000"+
		"\u015c\u015b\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000"+
		"\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u0160\u0003b1\u0000\u015f\u015e"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0001\u0000\u0000\u0000\u0161\u0163\u0005\u0084\u0000\u0000\u0162\u0164"+
		"\u0007\u0002\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0005\u0013\u0000\u0000\u0166\u0168\u0003d2\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016e\u0001\u0000"+
		"\u0000\u0000\u0169\u016c\u0005\u0010\u0000\u0000\u016a\u016d\u0003l6\u0000"+
		"\u016b\u016d\u0003 \u0010\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c"+
		"\u016b\u0001\u0000\u0000\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e"+
		"\u0169\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0003\u0004\u0002\u0000\u0171"+
		"1\u0001\u0000\u0000\u0000\u0172\u0174\u0005\u0007\u0000\u0000\u0173\u0172"+
		"\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0178"+
		"\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u0179"+
		"\u0005\u0084\u0000\u0000\u0179\u017b\u0005\n\u0000\u0000\u017a\u017c\u0003"+
		"6\u001b\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u0180\u0005\u000b"+
		"\u0000\u0000\u017e\u017f\u0005\u0013\u0000\u0000\u017f\u0181\u0003d2\u0000"+
		"\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0003J%\u0000\u01833"+
		"\u0001\u0000\u0000\u0000\u0184\u0186\u0005w\u0000\u0000\u0185\u0184\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0005f\u0000\u0000\u0188\u0189\u0005\u0084"+
		"\u0000\u0000\u0189\u018b\u0005\n\u0000\u0000\u018a\u018c\u00036\u001b"+
		"\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0190\u0005\u000b\u0000"+
		"\u0000\u018e\u018f\u0005\u0013\u0000\u0000\u018f\u0191\u0003d2\u0000\u0190"+
		"\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0003J%\u0000\u01935\u0001"+
		"\u0000\u0000\u0000\u0194\u0199\u00038\u001c\u0000\u0195\u0196\u0005\u000f"+
		"\u0000\u0000\u0196\u0198\u00038\u001c\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a7\u0001\u0000\u0000\u0000"+
		"\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019e\u0007\u0001\u0000\u0000"+
		"\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a2\u0005\u0084\u0000\u0000"+
		"\u01a0\u01a1\u0005\u0013\u0000\u0000\u01a1\u01a3\u0003d2\u0000\u01a2\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u0010\u0000\u0000\u01a5\u01a7"+
		"\u0003L&\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a79\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003b1\u0000"+
		"\u01a9\u01ae\u0003<\u001e\u0000\u01aa\u01ab\u0005\u000f\u0000\u0000\u01ab"+
		"\u01ad\u0003<\u001e\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b0"+
		"\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b2\u0003\u0004\u0002\u0000\u01b2;\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b6\u0005\u0084\u0000\u0000\u01b4\u01b5\u0005"+
		"\u0013\u0000\u0000\u01b5\u01b7\u0003d2\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0005\u0010\u0000\u0000\u01b9\u01bb\u0003L&\u0000\u01ba"+
		"\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb"+
		"=\u0001\u0000\u0000\u0000\u01bc\u01c4\u0003:\u001d\u0000\u01bd\u01c4\u0003"+
		"@ \u0000\u01be\u01c4\u0003B!\u0000\u01bf\u01c4\u0003D\"\u0000\u01c0\u01c4"+
		"\u0003F#\u0000\u01c1\u01c4\u0003H$\u0000\u01c2\u01c4\u0003J%\u0000\u01c3"+
		"\u01bc\u0001\u0000\u0000\u0000\u01c3\u01bd\u0001\u0000\u0000\u0000\u01c3"+
		"\u01be\u0001\u0000\u0000\u0000\u01c3\u01bf\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c4?\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0003L&\u0000\u01c6\u01c7\u0003\u0004\u0002\u0000\u01c7A\u0001\u0000"+
		"\u0000\u0000\u01c8\u01ca\u0005_\u0000\u0000\u01c9\u01cb\u0003L&\u0000"+
		"\u01ca\u01c9\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd\u0003\u0004\u0002\u0000"+
		"\u01cdC\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005i\u0000\u0000\u01cf\u01d0"+
		"\u0005\n\u0000\u0000\u01d0\u01d1\u0003L&\u0000\u01d1\u01d2\u0005\u000b"+
		"\u0000\u0000\u01d2\u01d5\u0003J%\u0000\u01d3\u01d4\u0005Z\u0000\u0000"+
		"\u01d4\u01d6\u0003J%\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6E\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005"+
		"b\u0000\u0000\u01d8\u01d9\u0005\n\u0000\u0000\u01d9\u01da\u0003:\u001d"+
		"\u0000\u01da\u01db\u0003L&\u0000\u01db\u01dc\u0005\u000e\u0000\u0000\u01dc"+
		"\u01dd\u0003L&\u0000\u01dd\u01de\u0005\u000b\u0000\u0000\u01de\u01df\u0003"+
		"J%\u0000\u01dfG\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005d\u0000\u0000"+
		"\u01e1\u01e2\u0005\n\u0000\u0000\u01e2\u01e3\u0003L&\u0000\u01e3\u01e4"+
		"\u0005\u000b\u0000\u0000\u01e4\u01e5\u0003J%\u0000\u01e5I\u0001\u0000"+
		"\u0000\u0000\u01e6\u01ea\u0005\f\u0000\u0000\u01e7\u01e9\u0003>\u001f"+
		"\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0005\r\u0000\u0000\u01eeK\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f0\u0006&\uffff\uffff\u0000\u01f0\u01f1\u0005[\u0000\u0000\u01f1"+
		"\u0215\u0003L&\u0017\u01f2\u0215\u0003P(\u0000\u01f3\u0215\u0003N\'\u0000"+
		"\u01f4\u0215\u0003\u0086C\u0000\u01f5\u0215\u0003\u0088D\u0000\u01f6\u0215"+
		"\u0003R)\u0000\u01f7\u0215\u0003T*\u0000\u01f8\u0215\u0003V+\u0000\u01f9"+
		"\u0215\u0003Z-\u0000\u01fa\u0215\u0003\\.\u0000\u01fb\u01fc\u0005g\u0000"+
		"\u0000\u01fc\u01fd\u0005\u0015\u0000\u0000\u01fd\u0215\u0003$\u0012\u0000"+
		"\u01fe\u0215\u0003h4\u0000\u01ff\u0200\u0005\n\u0000\u0000\u0200\u0201"+
		"\u0003L&\u0000\u0201\u0202\u0005\u000b\u0000\u0000\u0202\u0215\u0001\u0000"+
		"\u0000\u0000\u0203\u0215\u0005\u0084\u0000\u0000\u0204\u0206\u0005s\u0000"+
		"\u0000\u0205\u0207\u0005\u0084\u0000\u0000\u0206\u0205\u0001\u0000\u0000"+
		"\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000"+
		"\u0000\u0208\u0209\u0005u\u0000\u0000\u0209\u020b\u0005\u0084\u0000\u0000"+
		"\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u0210\u0005\f\u0000\u0000\u020d"+
		"\u020f\u0003,\u0016\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020f\u0212"+
		"\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0001\u0000\u0000\u0000\u0211\u0213\u0001\u0000\u0000\u0000\u0212\u0210"+
		"\u0001\u0000\u0000\u0000\u0213\u0215\u0005\r\u0000\u0000\u0214\u01ef\u0001"+
		"\u0000\u0000\u0000\u0214\u01f2\u0001\u0000\u0000\u0000\u0214\u01f3\u0001"+
		"\u0000\u0000\u0000\u0214\u01f4\u0001\u0000\u0000\u0000\u0214\u01f5\u0001"+
		"\u0000\u0000\u0000\u0214\u01f6\u0001\u0000\u0000\u0000\u0214\u01f7\u0001"+
		"\u0000\u0000\u0000\u0214\u01f8\u0001\u0000\u0000\u0000\u0214\u01f9\u0001"+
		"\u0000\u0000\u0000\u0214\u01fa\u0001\u0000\u0000\u0000\u0214\u01fb\u0001"+
		"\u0000\u0000\u0000\u0214\u01fe\u0001\u0000\u0000\u0000\u0214\u01ff\u0001"+
		"\u0000\u0000\u0000\u0214\u0203\u0001\u0000\u0000\u0000\u0214\u0204\u0001"+
		"\u0000\u0000\u0000\u0215\u023c\u0001\u0000\u0000\u0000\u0216\u0217\n\u0006"+
		"\u0000\u0000\u0217\u0218\u0005\u0018\u0000\u0000\u0218\u023b\u0003L&\u0007"+
		"\u0219\u021a\n\u0005\u0000\u0000\u021a\u021b\u0005\u0019\u0000\u0000\u021b"+
		"\u023b\u0003L&\u0006\u021c\u021d\n\u0004\u0000\u0000\u021d\u021e\u0005"+
		"\u001c\u0000\u0000\u021e\u023b\u0003L&\u0005\u021f\u0220\n\u0003\u0000"+
		"\u0000\u0220\u0221\u0005\u0089\u0000\u0000\u0221\u023b\u0003L&\u0004\u0222"+
		"\u0223\n\u0002\u0000\u0000\u0223\u0224\u0005\u0010\u0000\u0000\u0224\u023b"+
		"\u0003L&\u0003\u0225\u0226\n\f\u0000\u0000\u0226\u0227\u0005\u0015\u0000"+
		"\u0000\u0227\u023b\u0005\u0084\u0000\u0000\u0228\u0229\n\u000b\u0000\u0000"+
		"\u0229\u022a\u0005\b\u0000\u0000\u022a\u022b\u0003L&\u0000\u022b\u022c"+
		"\u0005\t\u0000\u0000\u022c\u023b\u0001\u0000\u0000\u0000\u022d\u022e\n"+
		"\n\u0000\u0000\u022e\u0237\u0005\n\u0000\u0000\u022f\u0234\u0003L&\u0000"+
		"\u0230\u0231\u0005\u000f\u0000\u0000\u0231\u0233\u0003L&\u0000\u0232\u0230"+
		"\u0001\u0000\u0000\u0000\u0233\u0236\u0001\u0000\u0000\u0000\u0234\u0232"+
		"\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0238"+
		"\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0237\u022f"+
		"\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0001\u0000\u0000\u0000\u0239\u023b\u0005\u000b\u0000\u0000\u023a\u0216"+
		"\u0001\u0000\u0000\u0000\u023a\u0219\u0001\u0000\u0000\u0000\u023a\u021c"+
		"\u0001\u0000\u0000\u0000\u023a\u021f\u0001\u0000\u0000\u0000\u023a\u0222"+
		"\u0001\u0000\u0000\u0000\u023a\u0225\u0001\u0000\u0000\u0000\u023a\u0228"+
		"\u0001\u0000\u0000\u0000\u023a\u022d\u0001\u0000\u0000\u0000\u023b\u023e"+
		"\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023d"+
		"\u0001\u0000\u0000\u0000\u023dM\u0001\u0000\u0000\u0000\u023e\u023c\u0001"+
		"\u0000\u0000\u0000\u023f\u0240\u0007\u0003\u0000\u0000\u0240O\u0001\u0000"+
		"\u0000\u0000\u0241\u024a\u0005\b\u0000\u0000\u0242\u0247\u0003L&\u0000"+
		"\u0243\u0244\u0005\u000f\u0000\u0000\u0244\u0246\u0003L&\u0000\u0245\u0243"+
		"\u0001\u0000\u0000\u0000\u0246\u0249\u0001\u0000\u0000\u0000\u0247\u0245"+
		"\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024b"+
		"\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u024a\u0242"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024d"+
		"\u0001\u0000\u0000\u0000\u024c\u024e\u0005\u000f\u0000\u0000\u024d\u024c"+
		"\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u024f"+
		"\u0001\u0000\u0000\u0000\u024f\u0250\u0005\t\u0000\u0000\u0250Q\u0001"+
		"\u0000\u0000\u0000\u0251\u025a\u0005\b\u0000\u0000\u0252\u0257\u0003L"+
		"&\u0000\u0253\u0254\u0005\u000f\u0000\u0000\u0254\u0256\u0003L&\u0000"+
		"\u0255\u0253\u0001\u0000\u0000\u0000\u0256\u0259\u0001\u0000\u0000\u0000"+
		"\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000"+
		"\u0258\u025b\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000"+
		"\u025a\u0252\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000"+
		"\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0005\t\u0000\u0000\u025d"+
		"S\u0001\u0000\u0000\u0000\u025e\u0267\u0005\f\u0000\u0000\u025f\u0264"+
		"\u0003\u001c\u000e\u0000\u0260\u0261\u0005\u000f\u0000\u0000\u0261\u0263"+
		"\u0003\u001c\u000e\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0266"+
		"\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0264\u0265"+
		"\u0001\u0000\u0000\u0000\u0265\u0268\u0001\u0000\u0000\u0000\u0266\u0264"+
		"\u0001\u0000\u0000\u0000\u0267\u025f\u0001\u0000\u0000\u0000\u0267\u0268"+
		"\u0001\u0000\u0000\u0000\u0268\u026a\u0001\u0000\u0000\u0000\u0269\u026b"+
		"\u0005\u000f\u0000\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026a\u026b"+
		"\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0005\r\u0000\u0000\u026dU\u0001\u0000\u0000\u0000\u026e\u0277\u0005"+
		"\f\u0000\u0000\u026f\u0274\u0003\u001e\u000f\u0000\u0270\u0271\u0005\u000f"+
		"\u0000\u0000\u0271\u0273\u0003\u001e\u000f\u0000\u0272\u0270\u0001\u0000"+
		"\u0000\u0000\u0273\u0276\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0278\u0001\u0000"+
		"\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0277\u026f\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027a\u0001\u0000"+
		"\u0000\u0000\u0279\u027b\u0005\u000f\u0000\u0000\u027a\u0279\u0001\u0000"+
		"\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000"+
		"\u0000\u0000\u027c\u027d\u0005\r\u0000\u0000\u027dW\u0001\u0000\u0000"+
		"\u0000\u027e\u0287\u0005\u0086\u0000\u0000\u027f\u0286\u0003.\u0017\u0000"+
		"\u0280\u0286\u0005\u0082\u0000\u0000\u0281\u0286\u0003L&\u0000\u0282\u0286"+
		"\u0003n7\u0000\u0283\u0286\u0003|>\u0000\u0284\u0286\u0003~?\u0000\u0285"+
		"\u027f\u0001\u0000\u0000\u0000\u0285\u0280\u0001\u0000\u0000\u0000\u0285"+
		"\u0281\u0001\u0000\u0000\u0000\u0285\u0282\u0001\u0000\u0000\u0000\u0285"+
		"\u0283\u0001\u0000\u0000\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0286"+
		"\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0001\u0000\u0000\u0000\u0288\u028a\u0001\u0000\u0000\u0000\u0289"+
		"\u0287\u0001\u0000\u0000\u0000\u028a\u028b\u0005\u0086\u0000\u0000\u028b"+
		"Y\u0001\u0000\u0000\u0000\u028c\u028d\u0005\u0084\u0000\u0000\u028d\u0296"+
		"\u0005\n\u0000\u0000\u028e\u0293\u0003L&\u0000\u028f\u0290\u0005\u000f"+
		"\u0000\u0000\u0290\u0292\u0003L&\u0000\u0291\u028f\u0001\u0000\u0000\u0000"+
		"\u0292\u0295\u0001\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000"+
		"\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0297\u0001\u0000\u0000\u0000"+
		"\u0295\u0293\u0001\u0000\u0000\u0000\u0296\u028e\u0001\u0000\u0000\u0000"+
		"\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u0005\u000b\u0000\u0000\u0299[\u0001\u0000\u0000\u0000\u029a"+
		"\u029d\u0005\u0007\u0000\u0000\u029b\u029e\u0003^/\u0000\u029c\u029e\u0005"+
		"\u0084\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029c\u0001"+
		"\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a1\u0005"+
		"\n\u0000\u0000\u02a0\u02a2\u0003`0\u0000\u02a1\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a5\u0005\u000b\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5]\u0001\u0000\u0000\u0000"+
		"\u02a6\u02a7\u0007\u0004\u0000\u0000\u02a7_\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a9\u0003T*\u0000\u02a9a\u0001\u0000\u0000\u0000\u02aa\u02ac\u0005"+
		"w\u0000\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02b7\u0005\\\u0000"+
		"\u0000\u02ae\u02b0\u0005w\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000"+
		"\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b7\u0005o\u0000\u0000\u02b2\u02b4\u0005w\u0000\u0000\u02b3\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b7\u0005n\u0000\u0000\u02b6\u02ab\u0001"+
		"\u0000\u0000\u0000\u02b6\u02af\u0001\u0000\u0000\u0000\u02b6\u02b3\u0001"+
		"\u0000\u0000\u0000\u02b7c\u0001\u0000\u0000\u0000\u02b8\u02bd\u0003f3"+
		"\u0000\u02b9\u02bd\u0003j5\u0000\u02ba\u02bd\u0003h4\u0000\u02bb\u02bd"+
		"\u0005`\u0000\u0000\u02bc\u02b8\u0001\u0000\u0000\u0000\u02bc\u02b9\u0001"+
		"\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bb\u0001"+
		"\u0000\u0000\u0000\u02bde\u0001\u0000\u0000\u0000\u02be\u02c3\u0005\u0084"+
		"\u0000\u0000\u02bf\u02c0\u0005\b\u0000\u0000\u02c0\u02c2\u0005\t\u0000"+
		"\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c4g\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c6\u02c7\u0005\u0084\u0000\u0000\u02c7\u02cb\u0005#\u0000\u0000\u02c8"+
		"\u02cc\u0003d2\u0000\u02c9\u02cc\u0003j5\u0000\u02ca\u02cc\u0003h4\u0000"+
		"\u02cb\u02c8\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000"+
		"\u02cb\u02ca\u0001\u0000\u0000\u0000\u02cc\u02d5\u0001\u0000\u0000\u0000"+
		"\u02cd\u02d1\u0005\u000f\u0000\u0000\u02ce\u02d2\u0003d2\u0000\u02cf\u02d2"+
		"\u0003j5\u0000\u02d0\u02d2\u0003h4\u0000\u02d1\u02ce\u0001\u0000\u0000"+
		"\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d4\u0001\u0000\u0000\u0000\u02d3\u02cd\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d7\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02d8\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005\u0006\u0000"+
		"\u0000\u02d9i\u0001\u0000\u0000\u0000\u02da\u02dd\u0003f3\u0000\u02db"+
		"\u02dc\u0005.\u0000\u0000\u02dc\u02de\u0003f3\u0000\u02dd\u02db\u0001"+
		"\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df\u02dd\u0001"+
		"\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02f2\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e4\u0005\n\u0000\u0000\u02e2\u02e5\u0003f"+
		"3\u0000\u02e3\u02e5\u0003h4\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e5\u02eb\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e9\u0005.\u0000\u0000\u02e7\u02ea\u0003f3\u0000\u02e8\u02ea"+
		"\u0003h4\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02e9\u02e8\u0001\u0000"+
		"\u0000\u0000\u02ea\u02ec\u0001\u0000\u0000\u0000\u02eb\u02e6\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f0\u0005\u000b\u0000\u0000\u02f0\u02f2\u0001\u0000"+
		"\u0000\u0000\u02f1\u02da\u0001\u0000\u0000\u0000\u02f1\u02e1\u0001\u0000"+
		"\u0000\u0000\u02f2k\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005[\u0000\u0000"+
		"\u02f4\u02f5\u0005\u0084\u0000\u0000\u02f5\u02fe\u0005\n\u0000\u0000\u02f6"+
		"\u02fb\u0003L&\u0000\u02f7\u02f8\u0005\u000f\u0000\u0000\u02f8\u02fa\u0003"+
		"L&\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fd\u0001\u0000\u0000"+
		"\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fc\u02ff\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fe\u02f6\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000"+
		"\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0301\u0005\u000b\u0000"+
		"\u0000\u0301m\u0001\u0000\u0000\u0000\u0302\u0303\u0005#\u0000\u0000\u0303"+
		"\u0309\u0005\u0084\u0000\u0000\u0304\u0308\u0003r9\u0000\u0305\u0308\u0003"+
		"p8\u0000\u0306\u0308\u0003t:\u0000\u0307\u0304\u0001\u0000\u0000\u0000"+
		"\u0307\u0305\u0001\u0000\u0000\u0000\u0307\u0306\u0001\u0000\u0000\u0000"+
		"\u0308\u030b\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000"+
		"\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030c\u0001\u0000\u0000\u0000"+
		"\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u0337\u0005$\u0000\u0000\u030d"+
		"\u030e\u0005#\u0000\u0000\u030e\u0314\u0005\u0084\u0000\u0000\u030f\u0313"+
		"\u0003r9\u0000\u0310\u0313\u0003p8\u0000\u0311\u0313\u0003t:\u0000\u0312"+
		"\u030f\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0312"+
		"\u0311\u0001\u0000\u0000\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314"+
		"\u0312\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315"+
		"\u0317\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0317"+
		"\u0319\u0005\u0006\u0000\u0000\u0318\u031a\u0003z=\u0000\u0319\u0318\u0001"+
		"\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u031b\u0001"+
		"\u0000\u0000\u0000\u031b\u0337\u0003\u0082A\u0000\u031c\u031d\u0005#\u0000"+
		"\u0000\u031d\u0323\u0005\u0085\u0000\u0000\u031e\u0322\u0003r9\u0000\u031f"+
		"\u0322\u0003p8\u0000\u0320\u0322\u0003t:\u0000\u0321\u031e\u0001\u0000"+
		"\u0000\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0321\u0320\u0001\u0000"+
		"\u0000\u0000\u0322\u0325\u0001\u0000\u0000\u0000\u0323\u0321\u0001\u0000"+
		"\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0326\u0001\u0000"+
		"\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0326\u0337\u0005$\u0000"+
		"\u0000\u0327\u0328\u0005#\u0000\u0000\u0328\u032e\u0005\u0085\u0000\u0000"+
		"\u0329\u032d\u0003r9\u0000\u032a\u032d\u0003p8\u0000\u032b\u032d\u0003"+
		"t:\u0000\u032c\u0329\u0001\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000"+
		"\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032d\u0330\u0001\u0000\u0000"+
		"\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000"+
		"\u0000\u032f\u0331\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000"+
		"\u0000\u0331\u0333\u0005\u0006\u0000\u0000\u0332\u0334\u0003z=\u0000\u0333"+
		"\u0332\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334"+
		"\u0335\u0001\u0000\u0000\u0000\u0335\u0337\u0003\u0082A\u0000\u0336\u0302"+
		"\u0001\u0000\u0000\u0000\u0336\u030d\u0001\u0000\u0000\u0000\u0336\u031c"+
		"\u0001\u0000\u0000\u0000\u0336\u0327\u0001\u0000\u0000\u0000\u0337o\u0001"+
		"\u0000\u0000\u0000\u0338\u0339\u0005\u0084\u0000\u0000\u0339\u033a\u0005"+
		"\u0010\u0000\u0000\u033a\u033b\u0003x<\u0000\u033bq\u0001\u0000\u0000"+
		"\u0000\u033c\u033d\u0003v;\u0000\u033d\u033e\u0005\u0010\u0000\u0000\u033e"+
		"\u033f\u0003L&\u0000\u033f\u034f\u0001\u0000\u0000\u0000\u0340\u0341\u0005"+
		"\b\u0000\u0000\u0341\u0342\u0005\u0084\u0000\u0000\u0342\u0343\u0005\t"+
		"\u0000\u0000\u0343\u0344\u0005\u0010\u0000\u0000\u0344\u034f\u0003L&\u0000"+
		"\u0345\u0346\u0005\n\u0000\u0000\u0346\u0347\u0005\u0084\u0000\u0000\u0347"+
		"\u0348\u0005\u000b\u0000\u0000\u0348\u0349\u0005\u0010\u0000\u0000\u0349"+
		"\u034f\u0003L&\u0000\u034a\u034f\u0003\u0080@\u0000\u034b\u034c\u0005"+
		"\u0084\u0000\u0000\u034c\u034d\u0005\u0010\u0000\u0000\u034d\u034f\u0003"+
		"x<\u0000\u034e\u033c\u0001\u0000\u0000\u0000\u034e\u0340\u0001\u0000\u0000"+
		"\u0000\u034e\u0345\u0001\u0000\u0000\u0000\u034e\u034a\u0001\u0000\u0000"+
		"\u0000\u034e\u034b\u0001\u0000\u0000\u0000\u034fs\u0001\u0000\u0000\u0000"+
		"\u0350\u0351\u0005s\u0000\u0000\u0351\u0352\u0005\u0010\u0000\u0000\u0352"+
		"\u0353\u0005\u0082\u0000\u0000\u0353u\u0001\u0000\u0000\u0000\u0354\u0355"+
		"\u0005\b\u0000\u0000\u0355\u0356\u0005\n\u0000\u0000\u0356\u0357\u0005"+
		"\u0084\u0000\u0000\u0357\u0358\u0005\u000b\u0000\u0000\u0358\u0359\u0005"+
		"\t\u0000\u0000\u0359w\u0001\u0000\u0000\u0000\u035a\u035d\u0005\u0082"+
		"\u0000\u0000\u035b\u035d\u0003|>\u0000\u035c\u035a\u0001\u0000\u0000\u0000"+
		"\u035c\u035b\u0001\u0000\u0000\u0000\u035dy\u0001\u0000\u0000\u0000\u035e"+
		"\u0362\u0003n7\u0000\u035f\u0362\u0003|>\u0000\u0360\u0362\u0003~?\u0000"+
		"\u0361\u035e\u0001\u0000\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000"+
		"\u0361\u0360\u0001\u0000\u0000\u0000\u0362\u0365\u0001\u0000\u0000\u0000"+
		"\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000"+
		"\u0364{\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0366"+
		"\u0367\u0005>\u0000\u0000\u0367\u0368\u0003L&\u0000\u0368\u0369\u0005"+
		"?\u0000\u0000\u0369}\u0001\u0000\u0000\u0000\u036a\u036c\b\u0005\u0000"+
		"\u0000\u036b\u036a\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000"+
		"\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036d\u036e\u0001\u0000\u0000"+
		"\u0000\u036e\u007f\u0001\u0000\u0000\u0000\u036f\u0370\u0005\u001c\u0000"+
		"\u0000\u0370\u0371\u0007\u0006\u0000\u0000\u0371\u0372\u0005\u0010\u0000"+
		"\u0000\u0372\u0373\u0003L&\u0000\u0373\u0081\u0001\u0000\u0000\u0000\u0374"+
		"\u0375\u0005%\u0000\u0000\u0375\u0376\u0005\u0084\u0000\u0000\u0376\u037b"+
		"\u0005\u0006\u0000\u0000\u0377\u0378\u0005%\u0000\u0000\u0378\u0379\u0005"+
		"\u0085\u0000\u0000\u0379\u037b\u0005\u0006\u0000\u0000\u037a\u0374\u0001"+
		"\u0000\u0000\u0000\u037a\u0377\u0001\u0000\u0000\u0000\u037b\u0083\u0001"+
		"\u0000\u0000\u0000\u037c\u0382\u0005\u0086\u0000\u0000\u037d\u0381\u0003"+
		"n7\u0000\u037e\u0381\u0003|>\u0000\u037f\u0381\u0003~?\u0000\u0380\u037d"+
		"\u0001\u0000\u0000\u0000\u0380\u037e\u0001\u0000\u0000\u0000\u0380\u037f"+
		"\u0001\u0000\u0000\u0000\u0381\u0384\u0001\u0000\u0000\u0000\u0382\u0380"+
		"\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0385"+
		"\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0385\u0386"+
		"\u0005\u0086\u0000\u0000\u0386\u0085\u0001\u0000\u0000\u0000\u0387\u0388"+
		"\u0007\u0007\u0000\u0000\u0388\u0389\u0003L&\u0000\u0389\u0087\u0001\u0000"+
		"\u0000\u0000\u038a\u038b\u0005\u0084\u0000\u0000\u038b\u0394\u0005\n\u0000"+
		"\u0000\u038c\u0391\u0003L&\u0000\u038d\u038e\u0005\u000f\u0000\u0000\u038e"+
		"\u0390\u0003L&\u0000\u038f\u038d\u0001\u0000\u0000\u0000\u0390\u0393\u0001"+
		"\u0000\u0000\u0000\u0391\u038f\u0001\u0000\u0000\u0000\u0391\u0392\u0001"+
		"\u0000\u0000\u0000\u0392\u0395\u0001\u0000\u0000\u0000\u0393\u0391\u0001"+
		"\u0000\u0000\u0000\u0394\u038c\u0001\u0000\u0000\u0000\u0394\u0395\u0001"+
		"\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u0397\u0005"+
		"\u000b\u0000\u0000\u0397\u0089\u0001\u0000\u0000\u0000r\u008d\u0093\u009a"+
		"\u009d\u00a5\u00a8\u00ad\u00b5\u00be\u00c4\u00ca\u00ce\u00d4\u00da\u00e2"+
		"\u00ee\u00f9\u0103\u0107\u010f\u011c\u012a\u0134\u013a\u0145\u014c\u0155"+
		"\u0157\u015c\u015f\u0163\u0167\u016c\u016e\u0175\u017b\u0180\u0185\u018b"+
		"\u0190\u0199\u019d\u01a2\u01a6\u01ae\u01b6\u01ba\u01c3\u01ca\u01d5\u01ea"+
		"\u0206\u020a\u0210\u0214\u0234\u0237\u023a\u023c\u0247\u024a\u024d\u0257"+
		"\u025a\u0264\u0267\u026a\u0274\u0277\u027a\u0285\u0287\u0293\u0296\u029d"+
		"\u02a1\u02a4\u02ab\u02af\u02b3\u02b6\u02bc\u02c3\u02cb\u02d1\u02d5\u02df"+
		"\u02e4\u02e9\u02ed\u02f1\u02fb\u02fe\u0307\u0309\u0312\u0314\u0319\u0321"+
		"\u0323\u032c\u032e\u0333\u0336\u034e\u035c\u0361\u0363\u036d\u037a\u0380"+
		"\u0382\u0391\u0394";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}