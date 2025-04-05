// Generated from C:/Users/DELL/Desktop/untitled/src/Antlr/AngularParser.g4 by ANTLR 4.13.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#topLevelStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelStatement(AngularParser.TopLevelStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(AngularParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromBlock(AngularParser.ImportFromBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#moduleItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleItems(AngularParser.ModuleItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(AngularParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItem(AngularParser.ImportItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#typedPropertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedPropertyAssignment(AngularParser.TypedPropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#argumentObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentObject(AngularParser.ArgumentObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyAssignmenthtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignmenthtml(AngularParser.PropertyAssignmenthtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValue(AngularParser.PropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bracketedLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketedLiteral(AngularParser.BracketedLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#navigationChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationChain(AngularParser.NavigationChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#navigationStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationStep(AngularParser.NavigationStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bracketAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketAccess(AngularParser.BracketAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceList(AngularParser.InterfaceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlTemplateProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTemplateProperty(AngularParser.HtmlTemplatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(AngularParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(AngularParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(AngularParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayLiteralhtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralhtml(AngularParser.ArrayLiteralhtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectLiteralhtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralhtml(AngularParser.ObjectLiteralhtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateLiteral(AngularParser.TemplateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decoratorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorExpression(AngularParser.DecoratorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#specificDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificDecorator(AngularParser.SpecificDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#varModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarModifier(AngularParser.VarModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(AngularParser.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(AngularParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(AngularParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#unionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionType(AngularParser.UnionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(AngularParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularElement(AngularParser.AngularElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#regularAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularAttribute(AngularParser.RegularAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularAttribute(AngularParser.AngularAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAttribute(AngularParser.ClassAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tWO_WAY_BINDING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTWO_WAY_BINDING(AngularParser.TWO_WAY_BINDINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularAttributeValue(AngularParser.AngularAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularContent(AngularParser.AngularContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(AngularParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#sTRUCTURAL_DIRECTIVE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRUCTURAL_DIRECTIVE(AngularParser.STRUCTURAL_DIRECTIVEContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#closingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosingTag(AngularParser.ClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlInsideBackticks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlInsideBackticks(AngularParser.HtmlInsideBackticksContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(AngularParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(AngularParser.MethodCallContext ctx);
}