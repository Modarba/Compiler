package visit;
import AST.*;
import Antlr.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbole.Row;
import symbole.SymbolTable;
import java.util.ArrayList;
import java.util.List;
import Antlr.AngularParser;
public  class Visitor extends AngularParserBaseVisitor {
    SymbolTable symbolTable = new SymbolTable();

    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {
        Program program = new Program();

        // Process import statements
        if (ctx.importStatement() != null && !ctx.importStatement().isEmpty()) {
            List<ImportStatement> importStatements = new ArrayList<>();
            for (AngularParser.ImportStatementContext importCtx : ctx.importStatement()) {
                importStatements.add(visitImportStatement(importCtx));
            }
            program.setImportStatements(importStatements);
        }

        // Process top-level statements
        if (ctx.topLevelStatement() != null && !ctx.topLevelStatement().isEmpty()) {
            List<TopLevelStatement> topLevelStatements = new ArrayList<>();
            for (AngularParser.TopLevelStatementContext stmtCtx : ctx.topLevelStatement()) {
                TopLevelStatement topLevelStatement = visitTopLevelStatement(stmtCtx);
                topLevelStatements.add(topLevelStatement);
            }
            program.setTopLevelStatements(topLevelStatements);
        }
        this.symbolTable.printyy();

        return program;
    }

    @Override
    public ImportStatement visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        if (ctx.importFromBlock() != null) {
            ImportFromBlock importFromBlock = visitImportFromBlock(ctx.importFromBlock());
            importStatement.setImportFromBlock(importFromBlock);
        }

        return importStatement;
    }
    @Override
    public TopLevelStatement visitTopLevelStatement(AngularParser.TopLevelStatementContext ctx) {
        TopLevelStatement topLevelStatement = new TopLevelStatement();

        // Process ComponentDeclaration
        if (ctx.componentDeclaration() != null) {
            ComponentDeclaration componentDeclaration = visitComponentDeclaration(ctx.componentDeclaration());
            topLevelStatement.setComponentDeclaration(componentDeclaration);
        }

        // Process Declaration
        if (ctx.declaration() != null) {
            Declaration declaration = visitDeclaration(ctx.declaration());
            topLevelStatement.setDeclaration(declaration);
        }

        // Return the constructed statement
        return topLevelStatement;
    }


    @Override
    public Declaration visitDeclaration(AngularParser.DeclarationContext ctx) {
        Declaration declaration = new Declaration();

        // Process classDeclaration
        if (ctx.classDeclaration() != null) {
            ClassDeclaration classDecl = visitClassDeclaration(ctx.classDeclaration());
            declaration.setClassDeclaration(classDecl);
        }

        // Process functionDeclaration
        if (ctx.functionDeclaration() != null) {
            FunctionDeclaration funcDecl = visitFunctionDeclaration(ctx.functionDeclaration());
            declaration.setFunctionDeclaration(funcDecl);
        }

        // Process variableStatement
        if (ctx.variableStatement() != null) {
            VariableStatement varStmt = visitVariableStatement(ctx.variableStatement());
            declaration.setVariableStatement(varStmt);
        }

        // Process interfaceDeclaration
        if (ctx.interfaceDeclaration() != null) {
            InterfaceDeclaration interfaceDecl = visitInterfaceDeclaration(ctx.interfaceDeclaration());
            declaration.setInterfaceDeclaration(interfaceDecl);
        }

        // Process moduleDeclaration
        if (ctx.moduleDeclaration() != null) {
            ModuleDeclaration moduleDecl = visitModuleDeclaration(ctx.moduleDeclaration());
            declaration.setModuleDeclaration(moduleDecl);
        }

        return declaration;
    }

    @Override
    public VariableStatement visitVariableStatement(AngularParser.VariableStatementContext ctx) {
        // Initialize the list for variable declarations
        List<VariableDeclaration> variableDeclarations = new ArrayList<>();

        // Extract the varModifier ('let', 'const', 'var')
        VarModifier varModifier = null;
        if (ctx.varModifier() != null) {
            varModifier = visitVarModifier(ctx.varModifier()); // Assuming visitVarModifier method is implemented
        }

        // Extract the first variable declaration
        if (ctx.variableDeclaration(0) != null) {
            variableDeclarations.add(visitVariableDeclaration(ctx.variableDeclaration(0))); // Assuming visitVariableDeclaration is implemented
        }

        // Handle additional variable declarations separated by commas
        for (int i = 1; i < ctx.variableDeclaration().size(); i++) {
            if (ctx.variableDeclaration(i) != null) {
                variableDeclarations.add(visitVariableDeclaration(ctx.variableDeclaration(i)));
            }
        }

        // Return the constructed VariableStatement object
        return new VariableStatement(varModifier, variableDeclarations);
    }

    @Override
    public VarModifier visitVarModifier(AngularParser.VarModifierContext ctx) {
        // Check if the Export keyword is present
        boolean isExported = (ctx.Export() != null);

        // Determine the type of the modifier (Var, Let, or Const)
        String type = null;
        if (ctx.Var() != null) {
            type = "Var";
        } else if (ctx.Let() != null) {
            type = "Let";
        } else if (ctx.Const() != null) {
            type = "Const";
        }

        // Return the VarModifier object with the correct type and export status
        return new VarModifier(isExported, type);
    }

    @Override
    public InterfaceDeclaration visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx) {
        // Check if the interface is exported
        boolean isExported = ctx.Export() != null;

        // Get the name of the interface
        String identifier = ctx.Identifier().getText();

        // Visit the properties of the interface
        List<TypedPropertyAssignment> properties = new ArrayList<>();
        if (ctx.typedPropertyAssignment() != null) {
            for (AngularParser.TypedPropertyAssignmentContext propertyCtx : ctx.typedPropertyAssignment()) {
                properties.add(visitTypedPropertyAssignment(propertyCtx));
            }
        }

        // Construct the InterfaceDeclaration object

        return new InterfaceDeclaration(
                isExported,
                identifier,
                properties
        );
    }
    @Override
    public FunctionDeclaration visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        // Check if the function is exported
        boolean isExported = ctx.Export() != null;  // Assuming the export keyword is represented as EXPORT in your grammar

        // Get the function name
        String functionName = ctx.Identifier().getText();  // Assuming the function name is captured by Identifier

        // Get the parameters
        ParameterList parameters = visitParameterList(ctx.parameterList());  // Assuming parameterList is a rule in your grammar

        // Get the return type
        TypeAnnotation returnType = null;
        if (ctx.typeAnnotation() != null) {
            returnType = visitTypeAnnotation(ctx.typeAnnotation());  // Assuming typeAnnotation is another rule in your grammar
        }

        // Get the function body (block of statements)
        BlockStatement block = visitBlock(ctx.block());  // Assuming blockStatement represents the body of the function

        // Return a new FunctionDeclaration object with the parsed data
        return new FunctionDeclaration(isExported, functionName, parameters, returnType, block);
    }
    @Override
    public ParameterList visitParameterList(AngularParser.ParameterListContext ctx) {
        // Create a list to hold the parameters
        List<Parameter> parameters = new ArrayList<>();

        // Visit each parameter in the parameter list
        if (ctx.parameter() != null) {
            for (AngularParser.ParameterContext parameterCtx : ctx.parameter()) {
                Parameter parameter = visitParameter(parameterCtx);
                parameters.add(parameter);

                // Save the parameter name in the symbol table
                if (parameter.getName() != null) {
                    Row parameterRow = new Row();
                    parameterRow.setType("ParameterName");
                    parameterRow.setValue(parameter.getName());
                    this.symbolTable.getRows().add(parameterRow);
                }
            }
        }

        // Construct and return the ParameterList object
        return new ParameterList(parameters);
    }

    @Override
    public Parameter visitParameter(AngularParser.ParameterContext ctx) {
        Parameter parameter = new Parameter(null, null, null, null);

        // Create a row to store parameter details
        Row parameterRow = new Row();
        parameterRow.setType("parameters");

        // Capture parameter name and type
        if (ctx.Identifier() != null) {
            String paramName = ctx.Identifier().getText();
            parameter.setName(paramName);
            parameterRow.setValue(paramName + " { Identifier }");
        }

        // Add the parameter row to the symbol table
        if (this.symbolTable != null) {
            this.symbolTable.getRows().add(parameterRow);
        }

        return parameter;
    }

    @Override
    public TypedPropertyAssignment visitTypedPropertyAssignment(AngularParser.TypedPropertyAssignmentContext ctx) {
        String identifier = ctx.Identifier().getText();
        TypeAnnotation typeAnnotation = null;
        if (ctx.typeAnnotation() != null) {
            typeAnnotation = visitTypeAnnotation(ctx.typeAnnotation());
        }
        Row row = new Row();
        row.setType("NameOfVar");
        row.setValue(identifier); // Use the property name as the value

        // Add type information if available
        if (typeAnnotation != null) {
            row.setValue(identifier + " { " + typeAnnotation.toString() + " }");
        }

        // Add the row to the symbol table
        if (this.symbolTable != null) {
            this.symbolTable.getRows().add(row);
        }

        // Construct and return the TypedPropertyAssignment object
        return new TypedPropertyAssignment(identifier, typeAnnotation);
    }


    @Override
    public ClassDeclaration visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        String className = ctx.Identifier(0).getText(); // The first Identifier corresponds to the class name
        Row classRow = new Row();
        classRow.setType("ClassName");
        classRow.setValue(className);
        this.symbolTable.getRows().add(classRow);

        if (ctx.Extends() != null) {
            String extendsClass = ctx.Identifier(1).getText(); // The second Identifier corresponds to the extends class
            Row extendsRow = new Row();
            extendsRow.setType("Extends");
            extendsRow.setValue(extendsClass);
            this.symbolTable.getRows().add(extendsRow);
        }

        if (ctx.Implements() != null) {
            for (int i = 2; i < ctx.Identifier().size(); i++) { // Remaining Identifiers are interfaces
                String interfaceName = ctx.Identifier(i).getText();
                Row implementsRow = new Row();
                implementsRow.setType("Implements");
                implementsRow.setValue(interfaceName);
                this.symbolTable.getRows().add(implementsRow);
            }
        }

        // Extracting the class body elements (methods, fields, etc.)
        List<ClassBody> classBodyElements = new ArrayList<>();
        if (ctx.classBody() != null) {
            for (AngularParser.ClassBodyContext bodyContext : ctx.classBody()) {
                ClassBody classBodyElement = visitClassBody(bodyContext);  // Assuming visitClassBody() processes the body
                classBodyElements.add(classBodyElement);
            }
        }

        // Return the constructed ClassDeclaration AST
        return new ClassDeclaration(className, null, null, classBodyElements);
    }

    @Override
    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();

        // Extract property declarations, if present
        if (ctx.propertyDeclaration() != null) {
            PropertyDeclaration propertyDecl = visitPropertyDeclaration(ctx.propertyDeclaration());
            classBody = new ClassBody(propertyDecl);
        }

        // Process methodDeclaration
        if (ctx.methodDeclaration() != null) {
            MethodDeclaration methodDecl = visitMethodDeclaration(ctx.methodDeclaration());
            classBody = new ClassBody(methodDecl);
        }

        // Process decoratorExpression
        if (ctx.decoratorExpression() != null) {
            DecoratorExpression decoratorExpr = visitDecoratorExpression(ctx.decoratorExpression());
            classBody = new ClassBody(decoratorExpr);
        }

        // Process htmlTemplateProperty
        if (ctx.htmlTemplateProperty() != null) {
            HtmlTemplateProperty htmlTemplateProp = visitHtmlTemplateProperty(ctx.htmlTemplateProperty());
            classBody = new ClassBody(htmlTemplateProp);
        }

        return classBody;

    }


    @Override
    public SpecificDecorator visitSpecificDecorator(AngularParser.SpecificDecoratorContext ctx) {
        // Assuming the decorator name is a child node or token in the context,
        // such as ctx.DecoratorName().getText() or similar (depending on the parser rules)

        String decoratorName = ctx.getText();  // Extract the decorator name from the context

        // Create a SpecificDecorator instance with the extracted name
        SpecificDecorator specificDecorator = new SpecificDecorator(decoratorName);

        // Now, check if there are other decorator properties (like Input, Output, etc.)
        if (ctx.Input() != null) {
            specificDecorator.setInput(true);
        }

        if (ctx.Output() != null) {
            specificDecorator.setOutput(true);
        }

        if (ctx.Injectable() != null) {
            specificDecorator.setInjectable(true);
        }

        if (ctx.NgModule() != null) {
            specificDecorator.setNgModule(true);
        }

        if (ctx.HostBinding() != null) {
            specificDecorator.setHostBinding(true);
        }

        if (ctx.HostListener() != null) {
            specificDecorator.setHostListener(true);
        }

        if (ctx.Interface() != null) {
            specificDecorator.setInterface(true);
        }

        // Return the populated SpecificDecorator object
        return specificDecorator;
    }


    @Override
    public DecoratorExpression visitDecoratorExpression(AngularParser.DecoratorExpressionContext ctx) {
        // Create a new DecoratorExpression object
        DecoratorExpression decoratorExpression = new DecoratorExpression();

        // Extract the decorator keyword (like '@')
        if (ctx.Decorator() != null) {
            String decorator = ctx.Decorator().getText();
            decoratorExpression.setDecorator(decorator);
        }

        // Extract the specific decorator (if present)
        if (ctx.specificDecorator() != null) {
            SpecificDecorator specificDecorator = visitSpecificDecorator(ctx.specificDecorator());  // visitSpecificDecorator is a separate method
            decoratorExpression.setSpecificDecorator(specificDecorator);
        }

        // Extract the argument list (if present)
        if (ctx.argumentList() != null) {
            ArgumentList argumentList = visitArgumentList(ctx.argumentList());  // visitArgumentList is a separate method
            decoratorExpression.setArgumentList(argumentList);
        }

        // Return the populated DecoratorExpression object
        return decoratorExpression;
    }

    @Override
    public ComponentDeclaration visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        // Create a new ComponentDeclaration object
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();

        // Extract and set the import item
        if (ctx.importItem() != null) {
            componentDeclaration.setImportItem(ctx.importItem().getText());
        }

        // Extract and set the argumentObject (if present)
        if (ctx.argumentObject() != null) {
            componentDeclaration.setArgumentObject(visitArgumentObject(ctx.argumentObject()));
        }

        // Extract and set the classDeclaration


        // Return the constructed ComponentDeclaration object
        return componentDeclaration;
    }


    @Override
    public ImportFromBlock visitImportFromBlock(AngularParser.ImportFromBlockContext ctx) {
        ImportFromBlock importFromBlock = new ImportFromBlock();


        if (ctx.Identifier() != null) {
            importFromBlock.setIdentifier(ctx.Identifier().getText());
        }
        if (ctx.moduleItems() != null) {
            importFromBlock.setModuleItems(visitModuleItems(ctx.moduleItems()));
        }

        if (ctx.StringLiteral() != null) {
            importFromBlock.setImportFrom(ctx.StringLiteral().getText());
        }

        return importFromBlock;
    }
    @Override
    public Statement visitStatement(AngularParser.StatementContext ctx) {
        Statement statement = new Statement();

         if (ctx.variableStatement() != null) {
            statement.setVariableStatement(visitVariableStatement(ctx.variableStatement()));
        }
        // Check for expression statement
        else if (ctx.expressionStatement() != null) {
            statement.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
        }
        // Check for return statement
        else if (ctx.returnStatement() != null) {
            statement.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
        }
        // Check for if statement
        else if (ctx.ifStatement() != null) {
            statement.setIfStatement(visitIfStatement(ctx.ifStatement()));
        }

        else if (ctx.forStatement() != null) {
            statement.setForStatement(visitForStatement(ctx.forStatement()));
        }
        // Check for while statement
        else if (ctx.whileStatement() != null) {
            statement.setWhileStatement(visitWhileStatement(ctx.whileStatement()));
        }
        // Check for block statement
        else if (ctx.block() != null) {
            statement.setBlockStatement(visitBlock(ctx.block()));
        }

        return statement;
    }
    @Override
    public ReturnStatement visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        // Initialize singleExpression to null
        SingleExpression singleExpression = null;

        // Check if the return statement contains a singleExpression
        if (ctx.singleExpression() != null) {
            singleExpression = visitSingleExpression(ctx.singleExpression());
        }

        // Create and return a new ReturnStatement AST node
        return new ReturnStatement(singleExpression);
    }
    @Override
    public ExpressionStatement visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
        // Visit the singleExpression
        SingleExpression singleExpression = visitSingleExpression(ctx.singleExpression());

        // Create and return the ExpressionStatement AST node
        return new ExpressionStatement(singleExpression);
    }

    @Override
    public WhileStatement visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        // Step 1: Visit the expression inside the parentheses (the condition of the while loop)
        SingleExpression condition = visitSingleExpression(ctx.singleExpression());

        // Step 2: Visit the block of statements inside the while loop
        BlockStatement block = visitBlock(ctx.block());

        // Step 3: Create and return a new WhileStatement with the visited condition and block
        return new WhileStatement(condition, block);
    }
    @Override
    public ForStatement visitForStatement(AngularParser.ForStatementContext ctx) {
        // Step 1: Visit the variable statement (e.g., initialization)
        VariableStatement variableStatement = visitVariableStatement(ctx.variableStatement());

        // Step 2: Visit the first single expression (condition) (e.g., x < 10)
        SingleExpression condition = visitSingleExpression(ctx.singleExpression(0));

        // Step 3: Visit the second single expression (update) (e.g., x++)
        SingleExpression update = visitSingleExpression(ctx.singleExpression(1));

        // Step 4: Visit the block (the body of the for loop)
        BlockStatement block = visitBlock(ctx.block());

        // Return a new ForStatement with the visited components
        return new ForStatement(variableStatement, condition, update, block);
    }

    @Override
    public IfStatement visitIfStatement(AngularParser.IfStatementContext ctx) {
        // Step 1: Visit the condition (singleExpression)
        SingleExpression condition = visitSingleExpression(ctx.singleExpression());

        // Step 2: Visit the 'if' block
        BlockStatement ifBlock = visitBlock(ctx.block(0));

        // Step 3: Visit the 'else' block if it exists
        BlockStatement elseBlock = null;
        if (ctx.block().size() > 1) {
            elseBlock = visitBlock(ctx.block(1));
        }

        // Step 4: Create and return the IfStatement AST node
        return new IfStatement(condition, ifBlock, elseBlock);
    }


    @Override
    public BlockStatement visitBlock(AngularParser.BlockContext ctx) {
        BlockStatement blockStatement = new BlockStatement();

        // Check if there are any statements in the block
        if (ctx.statement() != null && !ctx.statement().isEmpty()) {
            List<Statement> statements = new ArrayList<>();
            for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
                // Assuming each statement is a type of Statement (which could be subclassed)
                statements.add(visitStatement(stmtCtx));  // visitStatement will handle different types of statements
            }
            blockStatement.setStatements(statements);
        }

        return blockStatement;
    }
    @Override
    public ModuleItems visitModuleItems(AngularParser.ModuleItemsContext ctx) {
        ModuleItems moduleItems = new ModuleItems();

        for (AngularParser.ImportItemContext itemCtx : ctx.importItem()) {
            ImportItem importItem = visitImportItem(itemCtx);
            moduleItems.addImportItem(importItem);
        }

        return moduleItems;
    }


    @Override
    public ImportItem visitImportItem(AngularParser.ImportItemContext ctx) {
        ImportItem importItem = new ImportItem();

        if (ctx.Identifier() != null) {
            importItem.setItemName(ctx.Identifier().getText());
        }
        if (ctx.NgModule() != null) {
            importItem.setNgModule(true);
        }
        if (ctx.Decorator() != null) {
            importItem.setDecorator(true);
        }
        if (ctx.Component() != null) {
            importItem.setComponent(true);
        }
        if (ctx.Input() != null) {
            importItem.setInput(true);
        }
        if (ctx.Output() != null) {
            importItem.setOutput(true);
        }
        if (ctx.OnInit() != null) {
            importItem.setOnInit(true);
        }
        if (ctx.Injectable() != null) {
            importItem.setInjectable(true);
        }
        if (ctx.HostBinding() != null) {
            importItem.setHostBinding(true);
        }
        if (ctx.HostListener() != null) {
            importItem.setHostListener(true);
        }
        if (ctx.EventEmitter() != null) {
            importItem.setEventEmitter(true);
        }

        return importItem;
    }

    @Override
    public ModuleDeclaration visitModuleDeclaration(AngularParser.ModuleDeclarationContext ctx) {
        // Create a new ModuleDeclaration instance
        ModuleDeclaration moduleDeclaration = new ModuleDeclaration();

        // Set the decorator if present
        if (ctx.Decorator() != null) {
            moduleDeclaration.setDecorator(ctx.Decorator().getText());
        }

        // Set the ngModule if present
        if (ctx.NgModule() != null) {
            moduleDeclaration.setNgModule(ctx.NgModule().getText());
        }

        // Set the argumentObject if present
        if (ctx.argumentObject() != null) {
            ArgumentObject argumentObject = visitArgumentObject(ctx.argumentObject());
            moduleDeclaration.setArgumentObject(argumentObject);
        }

        // Set the classDeclaration if present
        if (ctx.classDeclaration() != null) {
            ClassDeclaration classDeclaration = visitClassDeclaration(ctx.classDeclaration());
            moduleDeclaration.setClassDeclaration(classDeclaration);
        }

        return moduleDeclaration;
    }



    @Override
    public NavigationStep visitNavigationStep(AngularParser.NavigationStepContext ctx) {
        // Check if it's a dot access (Dot Identifier)
        if (ctx.Dot() != null && ctx.Identifier() != null) {
            return new NavigationStep(ctx.Identifier().getText());
        }
        // Check if it's a bracket access (bracketAccess)
        else if (ctx.bracketAccess() != null) {
            BracketAccess bracketAccess = visitBracketAccess(ctx.bracketAccess());
            return new NavigationStep(bracketAccess);
        }

        return null; // Return null if neither case is matched (unlikely)
    }


    @Override
    public ArgumentObject visitArgumentObject(AngularParser.ArgumentObjectContext ctx) {
        // Create an ArgumentObject instance
        ArgumentObject argumentObject = new ArgumentObject();

        List<PropertyAssignment> propertyAssignments = new ArrayList<>();

        for (AngularParser.PropertyAssignmentContext propertyCtx : ctx.propertyAssignment()) {
            PropertyAssignment propertyAssignment = visitPropertyAssignment(propertyCtx);
            propertyAssignments.add(propertyAssignment);
        }

        argumentObject.setPropertyAssignments(propertyAssignments);

        return argumentObject;
    }

    @Override
    public PropertyAssignment visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx) {
        // Extract the identifier (the property name)
        String identifier = ctx.Identifier().getText();

        // Visit the value to get the property value (could be STRING, NUMBER, or IDENTIFIER)
        PropertyValue propertyValue = visitPropertyValue(ctx.propertyValue());

        // Visit the typeAnnotation (if present)
        TypeAnnotation typeAnnotation = null;
        if (ctx.typeAnnotation() != null) {
            typeAnnotation = visitTypeAnnotation(ctx.typeAnnotation());
        }

        // Create a PropertyAssignment object and set its properties

        return new PropertyAssignment(identifier, propertyValue, typeAnnotation);
    }

    @Override
    public PropertyValue visitPropertyValue(AngularParser.PropertyValueContext ctx) {
        // Create an instance of PropertyValue
        PropertyValue propertyValue = new PropertyValue();

        // Check which kind of value this PropertyValue is, based on context
        if (ctx.literal() != null) {
            propertyValue.setLiteral(visitLiteral(ctx.literal()));
        } else if (ctx.arrayLiteral() != null) {
            propertyValue.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        } else if (ctx.arrayLiteralhtml() != null) {
            propertyValue.setArrayLiteralHTML(visitArrayLiteralhtml(ctx.arrayLiteralhtml()));
        } else if (ctx.objectLiteral() != null) {
            // If it's an object literal
            propertyValue.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        } else if (ctx.objectLiteralhtml() != null) {
            propertyValue.setObjectLiteralHTML(visitObjectLiteralhtml(ctx.objectLiteralhtml()));
        } else if (ctx.templateLiteral() != null) {
            // If it's a template literal
            propertyValue.setTemplateLiteral(visitTemplateLiteral(ctx.templateLiteral()));
        } else if (ctx.unionType() != null) {
            // If it's a union type
            propertyValue.setUnionType(visitUnionType(ctx.unionType()));
        } else if (ctx.functionCall() != null) {
            // If it's a function call
            propertyValue.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        } else if (ctx.navigationChain() != null) {
            // If it's a navigation chain
            propertyValue.setNavigationChain(visitNavigationChain(ctx.navigationChain()));
        } else if (ctx.bracketedLiteral() != null) {
            // If it's a bracketed literal
            propertyValue.setBracketedLiteral(visitBracketedLiteral(ctx.bracketedLiteral()));
        }

        return propertyValue;
    }


    @Override
    public BracketedLiteral visitBracketedLiteral(AngularParser.BracketedLiteralContext ctx) {
        // Parse the decimal value inside the brackets
        double decimalValue = Double.parseDouble(ctx.DecimalLiteral().getText());

        // Create a BracketedLiteral instance
        return new BracketedLiteral(decimalValue);
    }
    @Override
    public BasicType visitBasicType(AngularParser.BasicTypeContext ctx) {
        // Initialize identifier and arrayDimensions
        String identifier;
        int arrayDimensions = 0;

        // Check if Identifier exists
        if (ctx.Identifier() != null) {
            identifier = ctx.Identifier().getText();
        } else {
            throw new IllegalArgumentException("BasicType must have an identifier.");
        }

        // Check if there are array dimensions
        if (ctx.OpenBracket() != null && ctx.CloseBracket() != null) {
            // Ensure matching brackets
            if (ctx.OpenBracket().size() == ctx.CloseBracket().size()) {
                arrayDimensions = ctx.OpenBracket().size();
            } else {
                throw new IllegalArgumentException("Mismatched brackets in BasicType.");
            }
        }

        // Create and return the BasicType object
        return new BasicType(identifier, arrayDimensions);
    }
    @Override
    public SingleExpression visitSingleExpression(AngularParser.SingleExpressionContext ctx) {
        SingleExpression singleExpression = new SingleExpression();
        // Handle identifier expressions (standalone identifier)
// Handle identifier expressions (standalone identifier)
        if (ctx.Identifier() != null && !ctx.Identifier().isEmpty()) {
            // Access the first identifier (or the one relevant in your case)
            singleExpression.setIdentifier(ctx.Identifier(0).getText());
        }

        // Handle literal
        if (ctx.literal() != null) {
            Literal literal = visitLiteral(ctx.literal());
            singleExpression.setLiteral(literal);
        }

        // Handle "New" keyword expressions
        if (ctx.New() != null) {
            singleExpression.setLeft(visitSingleExpression(ctx.singleExpression(0)));
        }

        // Handle array literal
        if (ctx.arrayLiteral() != null) {
            ArrayLiteral arrayLiteral = visitArrayLiteral(ctx.arrayLiteral());
            singleExpression.setArrayLiteral(arrayLiteral);

            // Add to symbol table
            if (this.symbolTable != null) {
                Row symbolRow = new Row();
                symbolRow.setType("ArrayLiteral");
                symbolRow.setValue("ArrayLiteral detected"); // Optionally, you can add specific details about the array
                this.symbolTable.getRows().add(symbolRow);
            }
        }


        // Handle object literal
        if (ctx.objectLiteral() != null) {
            ObjectLiteral objectLiteral = visitObjectLiteral(ctx.objectLiteral());
            singleExpression.setObjectLiteral(objectLiteral);
        }

        // Handle array literal HTML
        if (ctx.arrayLiteralhtml() != null) {
            ArrayLiteralHtml arrayLiteralHtml = visitArrayLiteralhtml(ctx.arrayLiteralhtml());
            singleExpression.setArrayLiteralHtml(arrayLiteralHtml);
        }

        // Handle object literal HTML
        if (ctx.objectLiteralhtml() != null) {
            ObjectLiteralHtml objectLiteralHtml = visitObjectLiteralhtml(ctx.objectLiteralhtml());
            singleExpression.setObjectLiteralHtml(objectLiteralHtml);
        }

        // Handle "This Dot navigationChain"
        if (ctx.This() != null && ctx.Dot() != null && ctx.navigationChain() != null) {
            // Create a new SingleExpression for "this"
            SingleExpression leftExpr = new SingleExpression();
            leftExpr.setIdentifier("this");  // Set the identifier to "this"

            // Visit the navigationChain and set it as the right expression
            NavigationChain navigationChain = visitNavigationChain(ctx.navigationChain());

            // Set the left and right expressions
            singleExpression.setLeft(leftExpr);
            singleExpression.setNavigationChain(navigationChain);
            singleExpression.setOperator(".");  // Set the operator to dot notation
        }



        // Handle "singleExpression Dot Identifier"
        // Handle "singleExpression Dot Identifier"
        if (ctx.singleExpression() != null && ctx.singleExpression(0) != null
                && ctx.Dot() != null && ctx.Identifier() != null) {

            if (ctx.singleExpression(0) != null && ctx.singleExpression(0).Identifier() != null) {
                singleExpression.setIdentifier(ctx.Identifier(0).getText());
                singleExpression.setOperator(".");  // Set the operator to '.'
                singleExpression.setLeft(new SingleExpression());
                singleExpression.getLeft().setIdentifier(ctx.singleExpression(0).Identifier(0).getText());
            } else {
                // Handle the case where the left side is another expression
                singleExpression.setLeft(visitSingleExpression(ctx.singleExpression(0)));
            }
        }

        // Handle "singleExpression OpenBracket singleExpression CloseBracket"
        if (ctx.singleExpression(0) != null && ctx.OpenBracket() != null && ctx.CloseBracket() != null) {
            singleExpression.setLeft(visitSingleExpression(ctx.singleExpression(0)));
            singleExpression.setRight(visitSingleExpression(ctx.singleExpression(1)));
            singleExpression.setOperator("[]");
        }

        // Handle function call
        if (ctx.functionCall() != null) {
            FunctionCall functionCall = visitFunctionCall(ctx.functionCall());
            singleExpression.setFunctionCall(functionCall);
        }

        // Handle generic type expression
        if (ctx.genericType() != null) {
            GenericType genericType = visitGenericType(ctx.genericType());
            singleExpression.setGenericType(genericType);
        }

        // Handle parentheses around expressions
        if (ctx.OpenParen() != null && ctx.CloseParen() != null && ctx.singleExpression(0) != null) {
            singleExpression.setLeft(visitSingleExpression(ctx.singleExpression(0)));
        }

        if (ctx.Assign() != null) {

            SingleExpression leftExpr = visitSingleExpression(ctx.singleExpression(0));  // Visit left expression
            SingleExpression rightExpr = visitSingleExpression(ctx.singleExpression(1)); // Visit right expression


            singleExpression.setLeft(leftExpr);
            singleExpression.setRight(rightExpr);
            singleExpression.setOperator("=");  // Set the assignment operator

            return singleExpression; // Return the complete assignment expression
        }


        // Handle binary operators
        if (ctx.Plus() != null || ctx.Minus() != null || ctx.Multiply() != null || ctx.Divide() != null || ctx.Assign() != null) {
            singleExpression.setLeft(visitSingleExpression(ctx.singleExpression(0)));
            singleExpression.setRight(visitSingleExpression(ctx.singleExpression(1)));

            // Determine the operator
            if (ctx.Plus() != null) {
                singleExpression.setOperator("+");
            } else if (ctx.Minus() != null) {
                singleExpression.setOperator("-");
            } else if (ctx.Multiply() != null) {
                singleExpression.setOperator("*");
            } else if (ctx.Divide() != null) {
                singleExpression.setOperator("/");
            } else if (ctx.Assign() != null) {
                singleExpression.setOperator("=");
            }
        }

        // Handle class definition
        if (ctx.Class() != null) {
            singleExpression.setIdentifier(ctx.Identifier(0) != null ? ctx.Identifier(0).getText() : null);

            // Handle optional "extends" clause
            if (ctx.Extends() != null && ctx.Identifier(1) != null) {
                SingleExpression extendsExpression = new SingleExpression();
                extendsExpression.setIdentifier(ctx.Identifier(1).getText());
                singleExpression.setRight(extendsExpression);
            }

            // Handle class body
            if (ctx.classBody() != null) {
                ClassBody classBody = visitClassBody((AngularParser.ClassBodyContext) ctx.classBody());
                singleExpression.setClassBody(classBody);
            }
        }

        return singleExpression;
    }






    @Override
    public UnionType visitUnionType(AngularParser.UnionTypeContext ctx) {
        UnionType unionType = new UnionType();

        for (AngularParser.BasicTypeContext basicTypeCtx : ctx.basicType()) {
            BasicType basicType = visitBasicType(basicTypeCtx);
            unionType.addBasicType(basicType);
        }

        // Process GenericTypes
        for (AngularParser.GenericTypeContext genericTypeCtx : ctx.genericType()) {
            GenericType genericType = visitGenericType(genericTypeCtx);
            unionType.addGenericType(genericType);
        }

        return unionType;
    }

    @Override
    public FunctionCall visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        // Parse the function name from the context
        String functionName = ctx.Identifier().getText();

        // Parse the arguments of the function call
        List<SingleExpression> arguments = new ArrayList<>();
        for (AngularParser.SingleExpressionContext argCtx : ctx.singleExpression()) {
            arguments.add(visitSingleExpression(argCtx)); // Recursively visit each argument
        }

        // Create a new FunctionCall instance with the parsed name and arguments
        return new FunctionCall(functionName, arguments);
    }


    @Override
    public TypeAnnotation visitTypeAnnotation(AngularParser.TypeAnnotationContext ctx) {
        // Create a new instance of TypeAnnotation
        TypeAnnotation typeAnnotation = new TypeAnnotation();

        // Check if it represents a void type
        if (ctx.Void() != null) {
            typeAnnotation.setVoid(true);
        } else {
            // Handle other cases: basic type, union type, or generic type
            if (ctx.basicType() != null) {
                // If it's a basic type
                typeAnnotation.setBasicType(visitBasicType(ctx.basicType()));
            } else if (ctx.unionType() != null) {
                // If it's a union type
                typeAnnotation.setUnionType(visitUnionType(ctx.unionType()));
            } else if (ctx.genericType() != null) {
                // If it's a generic type
                typeAnnotation.setGenericType(visitGenericType(ctx.genericType()));
            }
        }

        return typeAnnotation;
    }

    @Override
    public GenericType visitGenericType(AngularParser.GenericTypeContext ctx) {
        // Create a new GenericType object
        GenericType genericType = new GenericType();

        // Set the identifier
        if (ctx.Identifier() != null) {
            genericType.setIdentifier(ctx.Identifier().getText());
        } else {
            throw new IllegalArgumentException("GenericType must have an identifier.");
        }

        // Process the parameters inside the angle brackets
        for (AngularParser.TypeAnnotationContext taCtx : ctx.typeAnnotation()) {
            TypeAnnotation typeAnnotation = visitTypeAnnotation(taCtx); // Assuming a visitTypeAnnotation method exists
            genericType.addTypeAnnotation(typeAnnotation);
        }

        for (AngularParser.UnionTypeContext utCtx : ctx.unionType()) {
            UnionType unionType = visitUnionType(utCtx); // Assuming a visitUnionType method exists
            genericType.addUnionType(unionType);
        }

        for (AngularParser.GenericTypeContext gtCtx : ctx.genericType()) {
            GenericType nestedGenericType = visitGenericType(gtCtx); // Recursive call
            genericType.addGenericType(nestedGenericType);
        }

        return genericType;
    }

    @Override
    public ObjectLiteral visitObjectLiteral(AngularParser.ObjectLiteralContext ctx) {
        // Create an ObjectLiteral instance
        ObjectLiteral objectLiteral = new ObjectLiteral();

        // List to hold the property assignments
        List<PropertyAssignment> properties = new ArrayList<>();

        // Loop through each property assignment and visit it
        for (AngularParser.PropertyAssignmentContext propertyCtx : ctx.propertyAssignment()) {
            // Visit each property assignment and add it to the list
            PropertyAssignment propertyAssignment = visitPropertyAssignment(propertyCtx);
            properties.add(propertyAssignment);
        }

        // Set the properties in the object literal
        objectLiteral.setProperties(properties);

        return objectLiteral;
    }


    @Override/// ////////////////
    public MethodCall visitMethodCall(AngularParser.MethodCallContext ctx) {
        // Extract the method name (identifier)
        String identifier = ctx.Identifier().getText();

        // Initialize a list to hold the arguments
        List<SingleExpression> arguments = new ArrayList<>();

        // Check if the method has arguments
        if (ctx.singleExpression() != null && !ctx.singleExpression().isEmpty()) {
            // Iterate over the singleExpression nodes and visit each to collect the arguments
            for (AngularParser.SingleExpressionContext exprCtx : ctx.singleExpression()) {
                SingleExpression argument = visitSingleExpression(exprCtx);
                arguments.add(argument);
            }
        }

        // Return the constructed MethodCall object
        return new MethodCall(identifier, arguments);
    }


    @Override/// ////////////////////////////
    public UnaryExpression visitUnaryExpression(AngularParser.UnaryExpressionContext ctx) {
        // Create a new UnaryExpression object
        UnaryExpression unaryExpression = new UnaryExpression();

        // Check the operator ('!' or '-') and set it in the UnaryExpression object
        if (ctx.getChild(0).getText().equals("!")) {
            unaryExpression.setOperator("!");
        } else if (ctx.getChild(0).getText().equals("-")) {
            unaryExpression.setOperator("-");
        }

        // Visit the singleExpression part and set it as the operand
        SingleExpression operand = visitSingleExpression(ctx.singleExpression());
        unaryExpression.setOperand(operand);

        // Return the constructed UnaryExpression object
        return unaryExpression;
    }


    @Override
    public HtmlInsideBackticks visitHtmlInsideBackticks(AngularParser.HtmlInsideBackticksContext ctx) {
        HtmlInsideBackticks htmlInsideBackticks = new HtmlInsideBackticks();

        // Process AngularElement, if present
        if (ctx.angularElement() != null) {
            AngularElement angularElement = visitAngularElement((AngularParser.AngularElementContext) ctx.angularElement());  // Assuming visitAngularElement processes the element
            htmlInsideBackticks.setAngularElement(angularElement);
        }

        // Process Interpolation, if present
        if (ctx.interpolation() != null) {
            Interpolation interpolation = visitInterpolation((AngularParser.InterpolationContext) ctx.interpolation());  // Assuming visitInterpolation processes the interpolation
            htmlInsideBackticks.setInterpolation(interpolation);
        }

        // Process Text, if present
        if (ctx.text() != null) {
            TextNode textNode = visitText((AngularParser.TextContext) ctx.text());  // Assuming visitText processes the text node
            htmlInsideBackticks.setText(textNode);
        }

        return htmlInsideBackticks;  // Return the populated HtmlInsideBackticks object
    }

    @Override
    public ClassAttribute visitClassAttribute(AngularParser.ClassAttributeContext ctx) {
        // Initialize variables
        String attributeName = "class"; // Fixed value based on the rule
        String value;

        // Extract the StringLiteral
        if (ctx.StringLiteral() != null) {
            value = ctx.StringLiteral().getText();
            // Remove the surrounding quotes from the string literal
            value = value.substring(1, value.length() - 1);
        } else {
            throw new IllegalArgumentException("ClassAttribute must have a StringLiteral value.");
        }
        Row valueRow = new Row();
        valueRow.setType("HtmlAttributeValue");
        valueRow.setValue(value);
        this.symbolTable.getRows().add(valueRow);

        // Create and return the ClassAttribute object
        return new ClassAttribute(attributeName, value);
    }

    @Override
    public ClosingTag visitClosingTag(AngularParser.ClosingTagContext ctx) {
        ClosingTag closingTag;

        // Case 1: "</Identifier>"
        if (ctx.Identifier() != null) {
            closingTag = new ClosingTag(ctx.Identifier().getText()); // Use the identifier for the closing tag
        }
        // Case 2: "</TagName>"
        else if (ctx.TagName() != null) {
            closingTag = new ClosingTag(ctx.TagName().getText(), true); // Use the tag name for the closing tag
        } else {
            // In case no valid tag is found, return null or throw an exception
            closingTag = null;  // This should probably never happen, depending on grammar constraints.
        }

        return closingTag;
    }


    @Override
    public StructuralDirective visitSTRUCTURAL_DIRECTIVE(AngularParser.STRUCTURAL_DIRECTIVEContext ctx) {
        String directiveType ;
        SingleExpression expression ;
        if (ctx.NgIf() != null) {
            directiveType = "NgIf";
        } else if (ctx.NgFor() != null) {
            directiveType = "NgFor";
        } else {
            throw new IllegalArgumentException("StructuralDirective must have either NgIf or NgFor.");
        }

        // Visit and extract the singleExpression
        if (ctx.singleExpression() != null) {
            expression = visitSingleExpression(ctx.singleExpression()); // Assuming visitSingleExpression is implemented
        } else {
            throw new IllegalArgumentException("StructuralDirective must have a singleExpression.");
        }

        // Create and return the StructuralDirective object
        return new StructuralDirective(directiveType, expression);
    }

    @Override
    public Interpolation visitInterpolation(AngularParser.InterpolationContext ctx) {
        // Extract the interpolation start token (e.g., "{{")
        String interpolationStart = ctx.InterpolationStart().getText();

        // Process the single expression inside the interpolation (e.g., the content between the curly braces)
        SingleExpression expression = visitSingleExpression(ctx.singleExpression());  // visitSingleExpression processes the expression inside the interpolation

        // Extract the interpolation end token (e.g., "}}")
        String interpolationEnd = ctx.InterpolationEnd().getText();

        // Return a new Interpolation object with the extracted tokens
        return new Interpolation(interpolationStart, expression, interpolationEnd);
    }
    @Override
    public AngularAttribute visitAngularAttribute(AngularParser.AngularAttributeContext ctx) {
        AngularAttribute angularAttribute = null;

        // Case 1: Two-Way Binding (tWO_WAY_BINDING Assign singleExpression)
        if (ctx.tWO_WAY_BINDING() != null) {
            TwoWayBinding twoWayBinding = visitTWO_WAY_BINDING(ctx.tWO_WAY_BINDING());
            SingleExpression singleExpression = visitSingleExpression(ctx.singleExpression());
            angularAttribute = new AngularAttribute(twoWayBinding, singleExpression);

            // Add only the identifier to the symbol table
            Row row = new Row();
            row.setType("htmlAttributeName");
            row.setValue(twoWayBinding.getIdentifier());
            this.symbolTable.getRows().add(row);
        }

        // Case 2: Angular attribute with square brackets (Identifier Assign singleExpression)
        if (ctx.Identifier() != null && ctx.singleExpression() != null && ctx.getChild(0).getText().equals("[")) {
            String identifier = ctx.Identifier().getText();
            SingleExpression singleExpression = visitSingleExpression(ctx.singleExpression());
            angularAttribute = new AngularAttribute(identifier, singleExpression);

            // Add only the identifier to the symbol table
            Row row = new Row();
            row.setType("htmlAttributeName");
            row.setValue(identifier);
            this.symbolTable.getRows().add(row);
        }

        // Case 3: Angular attribute with parentheses (Identifier Assign singleExpression)
        if (ctx.Identifier() != null && ctx.singleExpression() != null && ctx.getChild(0).getText().equals("(")) {
            String identifier = ctx.Identifier().getText();
            SingleExpression singleExpression = visitSingleExpression(ctx.singleExpression());
            angularAttribute = new AngularAttribute(identifier, singleExpression);

            // Add only the identifier to the symbol table
            Row row = new Row();
            row.setType("htmlAttributeName");
            row.setValue(identifier);
            this.symbolTable.getRows().add(row);
        }

        // Case 4: Structural Directive (e.g., *ngFor)
        if (ctx.sTRUCTURAL_DIRECTIVE() != null) {
            StructuralDirective structuralDirective = visitSTRUCTURAL_DIRECTIVE(ctx.sTRUCTURAL_DIRECTIVE());
            angularAttribute = new AngularAttribute(structuralDirective);

            // Add only the structural directive name to the symbol table
            Row row = new Row();
            row.setType("htmlAttributeName");
            row.setValue(structuralDirective.getDirectiveType());
            this.symbolTable.getRows().add(row);
        }

        // Case 5: Basic Identifier assignment with Angular Attribute Value (Identifier = angularAttributeValue)
        if (ctx.Identifier() != null && ctx.angularAttributeValue() != null) {
            String identifier = ctx.Identifier().getText();
            AngularAttributeValue attributeValue = visitAngularAttributeValue(ctx.angularAttributeValue());
            angularAttribute = new AngularAttribute(identifier, attributeValue);

            // Add only the identifier to the symbol table
            Row row = new Row();
            row.setType("htmlAttributeName");
            row.setValue(identifier);
            this.symbolTable.getRows().add(row);
        }

        // Return the constructed AngularAttribute object
        return angularAttribute;
    }


    @Override
    public AngularContent visitAngularContent(AngularParser.AngularContentContext ctx) {
        // Create lists to hold Angular elements, interpolations, and text nodes
        List<AngularElement> angularElements = new ArrayList<>();
        List<Interpolation> interpolations = new ArrayList<>();
        List<TextNode> texts = new ArrayList<>();

        // Visit Angular Elements
        if (ctx.angularElement() != null) {
            for (AngularParser.AngularElementContext elementCtx : ctx.angularElement()) {
                angularElements.add(visitAngularElement(elementCtx));
            }
        }

        // Visit Interpolations
        if (ctx.interpolation() != null) {
            for (AngularParser.InterpolationContext interpolationCtx : ctx.interpolation()) {
                interpolations.add(visitInterpolation(interpolationCtx));
            }
        }

        // Visit Text Nodes
        if (ctx.text() != null) {
            for (AngularParser.TextContext textCtx : ctx.text()) {
                texts.add(visitText(textCtx));
            }
        }

        // Create and return the AngularContent object
        AngularContent angularContent = new AngularContent();
        angularContent.setAngularElements(angularElements);
        angularContent.setInterpolations(interpolations);
        angularContent.setTexts(texts);

        return angularContent;
    }


    @Override
    public TwoWayBinding visitTWO_WAY_BINDING(AngularParser.TWO_WAY_BINDINGContext ctx) {
        String identifier ;

        // Check if Identifier exists
        if (ctx.Identifier() != null) {
            identifier = ctx.Identifier().getText();
        } else {
            throw new IllegalArgumentException("TwoWayBinding must contain an identifier.");
        }

        // Create and return the TwoWayBinding object
        return new TwoWayBinding(identifier);
    }

    @Override
    public RegularAttribute visitRegularAttribute(AngularParser.RegularAttributeContext ctx) {
        // Initialize RegularAttribute with default values
        RegularAttribute regularAttribute = new RegularAttribute(null, null);

        // Extract the attribute name (Identifier)
        String name = ctx.Identifier().getText();
        regularAttribute.setName(name);  // Set the name in the RegularAttribute object

        // Visit the angularAttributeValue and set the value
        if (ctx.angularAttributeValue() != null) {
            AngularAttributeValue value = visitAngularAttributeValue(ctx.angularAttributeValue());
            regularAttribute.setValue(value);  // Set the value in the RegularAttribute object
        }

        return regularAttribute;  // Return the populated RegularAttribute object
    }



    @Override
    public ArgumentList visitArgumentList(AngularParser.ArgumentListContext ctx) {
        ArgumentList argumentList = new ArgumentList(null);  // Initialize ArgumentList with a default value

        // Extract ObjectLiteral, if present
        if (ctx.objectLiteral() != null) {
            ObjectLiteral objectLiteral = visitObjectLiteral(ctx.objectLiteral());  // visitObjectLiteral is a separate method
            argumentList.setObjectLiteral(objectLiteral);
        }

        return argumentList;
    }

    @Override
    public TemplateLiteral visitTemplateLiteral(AngularParser.TemplateLiteralContext ctx) {
        // Initialize lists for each component
        List<HtmlTemplateProperty> htmlTemplateProperties = new ArrayList<>();
        List<String> stringLiterals = new ArrayList<>();
        List<SingleExpression> singleExpressions = new ArrayList<>();
        List<AngularElement> angularElements = new ArrayList<>();
        List<Interpolation> interpolations = new ArrayList<>();
        List<TextNode> texts = new ArrayList<>();

        // Iterate over the children of the templateLiteral rule
        for (ParseTree child : ctx.children) {
            if (child instanceof AngularParser.HtmlTemplatePropertyContext) {
                // Visit HtmlTemplateProperty
                HtmlTemplateProperty htmlProp = visitHtmlTemplateProperty((AngularParser.HtmlTemplatePropertyContext) child);
                if (htmlProp != null) {
                    htmlTemplateProperties.add(htmlProp);
                }
            } else if (child instanceof TerminalNode && child.getText().startsWith("\"")) {
                // Add StringLiteral directly
                stringLiterals.add(child.getText());
            } else if (child instanceof AngularParser.SingleExpressionContext) {
                // Visit SingleExpression
                SingleExpression singleExpr = visitSingleExpression((AngularParser.SingleExpressionContext) child);
                if (singleExpr != null) {
                    singleExpressions.add(singleExpr);
                }
            } else if (child instanceof AngularParser.AngularElementContext) {
                // Visit AngularElement
                AngularElement angularElem = visitAngularElement((AngularParser.AngularElementContext) child);
                if (angularElem != null) {
                    angularElements.add(angularElem);
                }
            } else if (child instanceof AngularParser.InterpolationContext) {
                // Visit Interpolation
                Interpolation interpolation = visitInterpolation((AngularParser.InterpolationContext) child);
                if (interpolation != null) {
                    interpolations.add(interpolation);
                }
            } else if (child instanceof AngularParser.TextContext) {
                // Visit Text
                TextNode textNode = visitText((AngularParser.TextContext) child);
                if (textNode != null) {
                    texts.add(textNode);
                }
            }
        }

        // Create and return the TemplateLiteral object
        return new TemplateLiteral(
                htmlTemplateProperties,
                stringLiterals,
                singleExpressions,
                angularElements,
                interpolations,
                texts
        );
    }

    @Override
    public TextNode visitText(AngularParser.TextContext ctx) {
        // Create a new TextNode object
        TextNode textNode = new TextNode("");

        // Check if the content is not null and set it accordingly
        if (ctx != null && ctx.getText() != null) {
            textNode.setContent(ctx.getText());  // Set the content of the text node from the parser
        }

        return textNode;  // Return the constructed TextNode
    }

    @Override
    public AngularAttributeValue visitAngularAttributeValue(AngularParser.AngularAttributeValueContext ctx) {
        AngularAttributeValue angularAttributeValue = new AngularAttributeValue();

        // Check if the context contains a StringLiteral
        if (ctx.StringLiteral() != null) {
            // Set the StringLiteral in the AngularAttributeValue object
            angularAttributeValue.setStringLiteral(ctx.StringLiteral().getText());
        }

        // Check if the context contains an interpolation
        if (ctx.interpolation() != null) {
            // Visit the interpolation and set it in the AngularAttributeValue object
            angularAttributeValue.setInterpolation(visitInterpolation(ctx.interpolation()));
        }

        return angularAttributeValue;  // Return the populated AngularAttributeValue object
    }

    @Override
    public NewExpression visitNewExpression(AngularParser.NewExpressionContext ctx) {
        // Extract the identifier
        String identifier = ctx.Identifier().getText();

        // Process the arguments
        List<SingleExpression> arguments = new ArrayList<>();
        if (ctx.singleExpression() != null) {
            for (AngularParser.SingleExpressionContext argCtx : ctx.singleExpression()) {
                SingleExpression argument = visitSingleExpression(argCtx);
                arguments.add(argument);
            }
        }

        // Create and return the NewExpression object
        return new NewExpression(identifier, arguments);
    }


    @Override
    public ObjectLiteralHtml visitObjectLiteralhtml(AngularParser.ObjectLiteralhtmlContext ctx) {
        List<PropertyAssignmentHtml> propertyAssignments = new ArrayList<>();

        // Iterate through each propertyAssignmentHtml rule in the context
        for (AngularParser.PropertyAssignmenthtmlContext propertyCtx : ctx.propertyAssignmenthtml()) {
            // Visit the propertyAssignmentHtml and add it to the list
            PropertyAssignmentHtml propertyAssignmentHtml = visitPropertyAssignmenthtml(propertyCtx);
            propertyAssignments.add(propertyAssignmentHtml);
        }

        // Create and return an ObjectLiteralHtml with the collected property assignments
        return new ObjectLiteralHtml(propertyAssignments);
    }
    @Override
    public ArrayLiteralHtml visitArrayLiteralhtml(AngularParser.ArrayLiteralhtmlContext ctx) {
        List<SingleExpression> elements = new ArrayList<>();

        // Iterate through each element of the array
        for (AngularParser.SingleExpressionContext exprCtx : ctx.singleExpression()) {
            SingleExpression element = visitSingleExpression(exprCtx);
            elements.add(element);
        }

        // Create a new ArrayLiteralHtml and set its elements
        ArrayLiteralHtml arrayLiteralHtml = new ArrayLiteralHtml();
        arrayLiteralHtml.setElements(elements);

        // Return the ArrayLiteralHtml object with the elements
        return arrayLiteralHtml;
    }


    @Override
    public MethodDeclaration visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
        MethodDeclaration methodDeclaration = new MethodDeclaration(); // No arguments

        // Check for decorators and add them to the method declaration
        if (ctx.Decorator() != null && !ctx.Decorator().isEmpty()) {
            List<String> decorators = new ArrayList<>();
            for (TerminalNode decorator : ctx.Decorator()) {
                decorators.add(decorator.getText());
            }
            methodDeclaration.setDecorators(decorators);
        }

        // Set the method name
        String methodName = ctx.Identifier().getText();
        methodDeclaration.setMethodName(methodName);

        // Save the method name in the symbol table
        Row methodRow = new Row();
        methodRow.setType("MethodName");
        methodRow.setValue(methodName);
        this.symbolTable.getRows().add(methodRow);

        // Check if there's a parameter list and set it
        if (ctx.parameterList() != null) {
            methodDeclaration.setParameterList(visitParameterList(ctx.parameterList()));
        }

        // Check if there's a return type and set it
        if (ctx.typeAnnotation() != null) {
            methodDeclaration.setReturnType(visitTypeAnnotation(ctx.typeAnnotation()));
        }

        // Set the method body
        methodDeclaration.setBody(visitBlock(ctx.block()));

        return methodDeclaration;
    }


    @Override
    public PropertyDeclaration visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx) {
        // Extract visibility modifier (if present)
        String visibilityModifier = null;
        if (ctx.Private() != null) {
            visibilityModifier = "private";
        } else if (ctx.Public() != null) {
            visibilityModifier = "public";
        } else if (ctx.Protected() != null) {
            visibilityModifier = "protected";
        }

        // Extract variable modifier (if present)
        List<VarModifier> varModifiers = new ArrayList<>();
        if (ctx.varModifier() instanceof List) {
            for (AngularParser.VarModifierContext varCtx : (List<AngularParser.VarModifierContext>) ctx.varModifier()) {
                varModifiers.add(visitVarModifier(varCtx));
            }
        } else if (ctx.varModifier() != null) {
            varModifiers.add(visitVarModifier(ctx.varModifier()));
        }

        // Extract identifier
        String identifier = ctx.Identifier().getText();

        // Save the identifier in the symbol table
        Row identifierRow = new Row();
        identifierRow.setType("NameOfVar");
        identifierRow.setValue(identifier);
        this.symbolTable.getRows().add(identifierRow);

        // Extract nullability indicator (if present)
        List<String> nullabilityIndicator = new ArrayList<>();
        if (ctx.QuestionMark() != null) {
            nullabilityIndicator.add("?");
        } else if (ctx.Not() != null) {
            nullabilityIndicator.add("!");
        }

        // Extract type annotation (if present)
        List<TypeAnnotation> typeAnnotations = new ArrayList<>();
        if (ctx.typeAnnotation() != null) {
            typeAnnotations.add(visitTypeAnnotation(ctx.typeAnnotation()));
        }

        // Extract new expression or property value (if present)
        List<NewExpression> newExpressions = new ArrayList<>();
        List<PropertyValue> propertyValues = new ArrayList<>();
        if (ctx.newExpression() != null) {
            newExpressions.add(visitNewExpression(ctx.newExpression()));
        } else if (ctx.propertyValue() != null) {
            propertyValues.add(visitPropertyValue(ctx.propertyValue()));
        }

        // Construct and return the PropertyDeclaration node
        return new PropertyDeclaration(
                visibilityModifier,
                varModifiers,
                identifier,
                nullabilityIndicator,
                typeAnnotations,
                newExpressions,
                propertyValues
        );
    }



    @Override
    public HtmlTemplateProperty visitHtmlTemplateProperty(AngularParser.HtmlTemplatePropertyContext ctx) {
        // Extract the identifier (e.g., property name)
        String identifier = ctx.Identifier().getText();

        // Initialize a new HtmlTemplateProperty with the identifier
        HtmlTemplateProperty htmlTemplateProperty = new HtmlTemplateProperty(identifier);

        // Extract AngularElements, if present
        for (AngularParser.AngularElementContext angularElementCtx : ctx.angularElement()) {
            AngularElement angularElement = visitAngularElement(angularElementCtx);  // visitAngularElement is a separate method
            htmlTemplateProperty.addAngularElement(angularElement);
        }

        // Extract Interpolations, if present
        for (AngularParser.InterpolationContext interpolationCtx : ctx.interpolation()) {
            Interpolation interpolation = visitInterpolation(interpolationCtx);  // visitInterpolation is a separate method
            htmlTemplateProperty.addInterpolation(interpolation);
        }

        // Extract TextNodes, if present
        for (AngularParser.TextContext textCtx : ctx.text()) {
            TextNode textNode = visitText(textCtx);  // visitText is a separate method
            htmlTemplateProperty.addText(textNode);
        }

        // Extract HtmlInsideBackticks, if present
        for (AngularParser.HtmlInsideBackticksContext htmlCtx : ctx.htmlInsideBackticks()) {
            HtmlInsideBackticks htmlInsideBackticks = visitHtmlInsideBackticks(htmlCtx);  // visitHtmlInsideBackticks is a separate method
            htmlTemplateProperty.addHtmlInsideBackticks(htmlInsideBackticks);
        }

        return htmlTemplateProperty;  // Return the populated HtmlTemplateProperty
    }


    @Override
    public InterfaceList visitInterfaceList(AngularParser.InterfaceListContext ctx) {
        List<String> identifiers = new ArrayList<>();

        // Add the first identifier
        if (ctx.Identifier(0) != null) {
            identifiers.add(ctx.Identifier(0).getText());
        }

        // Add subsequent identifiers separated by commas
        for (int i = 1; i < ctx.Identifier().size(); i++) {
            identifiers.add(ctx.Identifier(i).getText());
        }

        // Create an InterfaceList instance with the collected identifiers
        return new InterfaceList(identifiers);
    }

    @Override
    public BracketAccess visitBracketAccess(AngularParser.BracketAccessContext ctx) {
        // Visit the singleExpression inside the brackets
        SingleExpression singleExpression = visitSingleExpression(ctx.singleExpression());

        // Validate that singleExpression is not null
        if (singleExpression == null) {
            throw new IllegalStateException("BracketAccess must contain a valid SingleExpression.");
        }

        // Create and return a BracketAccess instance
        return new BracketAccess(singleExpression);
    }


    @Override
    public NavigationChain visitNavigationChain(AngularParser.NavigationChainContext ctx) {
        // Extract the base identifier
        String baseIdentifier = ctx.Identifier().getText();

        NavigationChain navigationChain = new NavigationChain(baseIdentifier);

        // Process the navigation steps
        if (ctx.navigationStep() != null) {
            for (AngularParser.NavigationStepContext stepCtx : ctx.navigationStep()) {
                // Visit each navigationStep and add it to the navigationChain
                NavigationStep step = visitNavigationStep(stepCtx);
                navigationChain.addStep(step);
            }
        }

        return navigationChain;
    }

    @Override
    public AngularElement visitAngularElement(AngularParser.AngularElementContext ctx) {
        // Extract the tag name (can be either Identifier or TagName)
        String tagName = ctx.Identifier() != null ? ctx.Identifier().getText() : ctx.TagName().getText();

        // Initialize lists to hold the different attributes
        List<AngularAttribute> angularAttributes = new ArrayList<>();
        List<RegularAttribute> regularAttributes = new ArrayList<>();
        List<ClassAttribute> classAttributes = new ArrayList<>();

        // Visit angular, regular, and class attributes
        for (AngularParser.AngularAttributeContext angularAttr : ctx.angularAttribute()) {
            angularAttributes.add(visitAngularAttribute(angularAttr)); // Assuming visitAngularAttribute handles the AngularAttribute
        }

        for (AngularParser.RegularAttributeContext regularAttr : ctx.regularAttribute()) {
            regularAttributes.add(visitRegularAttribute(regularAttr)); // Assuming visitRegularAttribute handles the RegularAttribute
        }

        for (AngularParser.ClassAttributeContext classAttr : ctx.classAttribute()) {
            classAttributes.add(visitClassAttribute(classAttr)); // Assuming visitClassAttribute handles the ClassAttribute
        }

        // Visit angular content (optional, as it may not exist)
        AngularContent angularContent = null;
        if (ctx.angularContent() != null) {
            angularContent = visitAngularContent(ctx.angularContent()); // Assuming visitAngularContent handles the AngularContent
        }

        // Visit closing tag (optional, as it may not exist)
        ClosingTag closingTag = null;
        if (ctx.closingTag() != null) {
            closingTag = visitClosingTag(ctx.closingTag()); // Assuming visitClosingTag handles the ClosingTag
        }

        // Return the constructed AngularElement
        return new AngularElement(tagName, angularAttributes, regularAttributes, classAttributes, angularContent, closingTag);
    }

    @Override
    public PropertyAssignmentHtml visitPropertyAssignmenthtml(AngularParser.PropertyAssignmenthtmlContext ctx) {
        PropertyAssignmentHtml propertyAssignment = new PropertyAssignmentHtml();

        // Case 1: "Identifier : singleExpression"
        if (ctx.Identifier() != null && ctx.singleExpression() != null) {
            propertyAssignment.setIdentifier(ctx.Identifier().getText()); // Set the identifier
            propertyAssignment.setValueExpression(visitSingleExpression((AngularParser.SingleExpressionContext) ctx.singleExpression())); // Set the value expression
        }
        // Case 2: "[singleExpression] : singleExpression"
        else if (ctx.singleExpression(0) != null && ctx.singleExpression(1) != null) {
            propertyAssignment.setKeyExpression(visitSingleExpression(ctx.singleExpression(0))); // Set the key expression
            propertyAssignment.setValueExpression(visitSingleExpression(ctx.singleExpression(1))); // Set the value expression
        }

        return propertyAssignment;
    }


    @Override
    public VariableDeclaration visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        // Extract the variable name (identifier)
        String identifier = ctx.Identifier().getText();

        // Extract type annotation if it exists
        TypeAnnotation typeAnnotation = null;
        if (ctx.typeAnnotation() != null) {
            typeAnnotation = visitTypeAnnotation(ctx.typeAnnotation());
        }

        // Extract initializer if it exists
        SingleExpression initializer = null;
        if (ctx.singleExpression() != null) {
            initializer = visitSingleExpression(ctx.singleExpression());
        }

        // Create a new VariableDeclaration instance with the extracted values
        VariableDeclaration variableDeclaration = new VariableDeclaration(identifier, typeAnnotation, initializer);

        // Optionally print the symbol table
        this.symbolTable.printyy();

        return variableDeclaration;
    }

    @Override
    public Literal visitLiteral(AngularParser.LiteralContext ctx) {
        Literal literal = new Literal();

        if (ctx.NullLiteral() != null) {
            literal.setNullLiteral("null");
        } else if (ctx.BooleanLiteral() != null) {
            literal.setBooleanLiteral(Boolean.valueOf(ctx.BooleanLiteral().getText()));
        } else if (ctx.StringLiteral() != null) {
            literal.setStringLiteral(ctx.StringLiteral().getText());
        } else if (ctx.DecimalLiteral() != null) {
            literal.setDecimalLiteral(Double.valueOf(ctx.DecimalLiteral().getText()));
        }

        return literal;
    }


    @Override
    public ArrayLiteral visitArrayLiteral(AngularParser.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral = new ArrayLiteral();
        List<SingleExpression> elements = new ArrayList<>();

        // Iterate through the single expressions in the array literal
        for (AngularParser.SingleExpressionContext elementCtx : ctx.singleExpression()) {
            // Visit each element and add to the elements list
            SingleExpression singleExpression = visitSingleExpression(elementCtx);
            elements.add(singleExpression);
        }
        arrayLiteral.setElements(elements);

        return arrayLiteral;
    }

}




