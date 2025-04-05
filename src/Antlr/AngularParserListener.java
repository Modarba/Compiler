// Generated from C:/Users/Lenovo/Desktop/untitled/src/Antlr/AngularParser.g4 by ANTLR 4.13.1
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#topLevelStatement}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelStatement(AngularParser.TopLevelStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#topLevelStatement}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelStatement(AngularParser.TopLevelStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(AngularParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(AngularParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock(AngularParser.ImportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock(AngularParser.ImportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void enterModuleItems(AngularParser.ModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void exitModuleItems(AngularParser.ModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(AngularParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(AngularParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(AngularParser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(AngularParser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#typedPropertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterTypedPropertyAssignment(AngularParser.TypedPropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#typedPropertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitTypedPropertyAssignment(AngularParser.TypedPropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#argumentObject}.
	 * @param ctx the parse tree
	 */
	void enterArgumentObject(AngularParser.ArgumentObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#argumentObject}.
	 * @param ctx the parse tree
	 */
	void exitArgumentObject(AngularParser.ArgumentObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyAssignmenthtml}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignmenthtml(AngularParser.PropertyAssignmenthtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyAssignmenthtml}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignmenthtml(AngularParser.PropertyAssignmenthtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(AngularParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(AngularParser.PropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#bracketedLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBracketedLiteral(AngularParser.BracketedLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#bracketedLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBracketedLiteral(AngularParser.BracketedLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#navigationChain}.
	 * @param ctx the parse tree
	 */
	void enterNavigationChain(AngularParser.NavigationChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#navigationChain}.
	 * @param ctx the parse tree
	 */
	void exitNavigationChain(AngularParser.NavigationChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#navigationStep}.
	 * @param ctx the parse tree
	 */
	void enterNavigationStep(AngularParser.NavigationStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#navigationStep}.
	 * @param ctx the parse tree
	 */
	void exitNavigationStep(AngularParser.NavigationStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#bracketAccess}.
	 * @param ctx the parse tree
	 */
	void enterBracketAccess(AngularParser.BracketAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#bracketAccess}.
	 * @param ctx the parse tree
	 */
	void exitBracketAccess(AngularParser.BracketAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceList(AngularParser.InterfaceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceList(AngularParser.InterfaceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlTemplateProperty}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTemplateProperty(AngularParser.HtmlTemplatePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlTemplateProperty}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTemplateProperty(AngularParser.HtmlTemplatePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngularParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngularParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by .
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(AngularParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by .
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(AngularParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayLiteralhtml}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralhtml(AngularParser.ArrayLiteralhtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayLiteralhtml}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralhtml(AngularParser.ArrayLiteralhtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectLiteralhtml}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralhtml(AngularParser.ObjectLiteralhtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectLiteralhtml}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralhtml(AngularParser.ObjectLiteralhtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTemplateLiteral(AngularParser.TemplateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTemplateLiteral(AngularParser.TemplateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decoratorExpression}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorExpression(AngularParser.DecoratorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decoratorExpression}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorExpression(AngularParser.DecoratorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#specificDecorator}.
	 * @param ctx the parse tree
	 */
	void enterSpecificDecorator(AngularParser.SpecificDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#specificDecorator}.
	 * @param ctx the parse tree
	 */
	void exitSpecificDecorator(AngularParser.SpecificDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(AngularParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(AngularParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(AngularParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(AngularParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(AngularParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(AngularParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(AngularParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(AngularParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#unionType}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(AngularParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#unionType}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(AngularParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(AngularParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(AngularParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularElement}.
	 * @param ctx the parse tree
	 */
	void enterAngularElement(AngularParser.AngularElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularElement}.
	 * @param ctx the parse tree
	 */
	void exitAngularElement(AngularParser.AngularElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#regularAttribute}.
	 * @param ctx the parse tree
	 */
	void enterRegularAttribute(AngularParser.RegularAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#regularAttribute}.
	 * @param ctx the parse tree
	 */
	void exitRegularAttribute(AngularParser.RegularAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAngularAttribute(AngularParser.AngularAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAngularAttribute(AngularParser.AngularAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classAttribute}.
	 * @param ctx the parse tree
	 */
	void enterClassAttribute(AngularParser.ClassAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classAttribute}.
	 * @param ctx the parse tree
	 */
	void exitClassAttribute(AngularParser.ClassAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tWO_WAY_BINDING}.
	 * @param ctx the parse tree
	 */
	void enterTWO_WAY_BINDING(AngularParser.TWO_WAY_BINDINGContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tWO_WAY_BINDING}.
	 * @param ctx the parse tree
	 */
	void exitTWO_WAY_BINDING(AngularParser.TWO_WAY_BINDINGContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAngularAttributeValue(AngularParser.AngularAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAngularAttributeValue(AngularParser.AngularAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularContent}.
	 * @param ctx the parse tree
	 */
	void enterAngularContent(AngularParser.AngularContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularContent}.
	 * @param ctx the parse tree
	 */
	void exitAngularContent(AngularParser.AngularContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(AngularParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(AngularParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#sTRUCTURAL_DIRECTIVE}.
	 * @param ctx the parse tree
	 */
	void enterSTRUCTURAL_DIRECTIVE(AngularParser.STRUCTURAL_DIRECTIVEContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#sTRUCTURAL_DIRECTIVE}.
	 * @param ctx the parse tree
	 */
	void exitSTRUCTURAL_DIRECTIVE(AngularParser.STRUCTURAL_DIRECTIVEContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void enterClosingTag(AngularParser.ClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void exitClosingTag(AngularParser.ClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlInsideBackticks}.
	 * @param ctx the parse tree
	 */
	void enterHtmlInsideBackticks(AngularParser.HtmlInsideBackticksContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlInsideBackticks}.
	 * @param ctx the parse tree
	 */
	void exitHtmlInsideBackticks(AngularParser.HtmlInsideBackticksContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(AngularParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(AngularParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(AngularParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(AngularParser.MethodCallContext ctx);
}