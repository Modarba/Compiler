package AST;
public class SingleExpression {
    String identifier;
     SingleExpression left;
     SingleExpression right;
     SingleExpression condition;
     Literal literal;
     ArrayLiteral arrayLiteral;
     ObjectLiteral objectLiteral;
     ArrayLiteralHtml arrayLiteralHtml;
     ObjectLiteralHtml objectLiteralHtml;
     FunctionCall functionCall;
    UnaryExpression unaryExpression;
    GenericType genericType;
    MethodCall methodCall;
    String operator; // For binary operators like +, -, *, /
    DecoratorExpression decoratorExpression;
    NavigationChain navigationChain;

    public GenericType getGenericType() {
        return genericType;
    }

    public void setGenericType(GenericType genericType) {
        this.genericType = genericType;
    }


    public ClassBody getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBody classBody) {
        this.classBody = classBody;
    }

    ClassBody classBody;
    public NavigationChain getNavigationChain() {
        return navigationChain;
    }

    public void setNavigationChain(NavigationChain navigationChain) {
        this.navigationChain = navigationChain;
    }

    // Getters and Setters
    public SingleExpression getLeft() {
        return left;
    }

    public void setLeft(SingleExpression left) {
        this.left = left;
    }

    public DecoratorExpression getDecoratorExpression() {
        return decoratorExpression;
    }

    public void setDecoratorExpression(DecoratorExpression decoratorExpression) {
        this.decoratorExpression = decoratorExpression;
    }

    public SingleExpression getRight() {
        return right;
    }

    public void setRight(SingleExpression right) {
        this.right = right;
    }

    public SingleExpression getCondition() {
        return condition;
    }

    public void setCondition(SingleExpression condition) {
        this.condition = condition;
    }

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public ArrayLiteralHtml getArrayLiteralHtml() {
        return arrayLiteralHtml;
    }

    public void setArrayLiteralHtml(ArrayLiteralHtml arrayLiteralHtml) {
        this.arrayLiteralHtml = arrayLiteralHtml;
    }

    public ObjectLiteralHtml getObjectLiteralHtml() {
        return objectLiteralHtml;
    }

    public void setObjectLiteralHtml(ObjectLiteralHtml objectLiteralHtml) {
        this.objectLiteralHtml = objectLiteralHtml;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public UnaryExpression getUnaryExpression() {
        return unaryExpression;
    }

    public void setUnaryExpression(UnaryExpression unaryExpression) {
        this.unaryExpression = unaryExpression;
    }

    public GenericType getGenericExpression() {
        return genericType;
    }

    public void setGenericExpression(GenericType genericExpression) {
        this.genericType = genericExpression;
    }

    public MethodCall getMethodCall() {
        return methodCall;
    }

    public void setMethodCall(MethodCall methodCall) {
        this.methodCall = methodCall;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SingleExpression {");

        // Handle the assignment case specifically
        if (operator != null && operator.equals("=")) {
            // Handle the left and right expressions when the operator is "="
            if (left != null) {
                sb.append("\nleft=").append(left);
            }
            sb.append("  operator: ").append(operator);
            if (right != null) {
                sb.append("\nright=").append(right);
            }
        } else {
            // For other cases (not assignment), handle normally
            if (left != null) {
                sb.append("\nleft=").append(left);
            }

            // Handle the operator, which is used for binary operations or dot notation
            if (operator != null) {
                sb.append("  operator=").append(operator);
            }

            // Handle the identifier, which is the name after the dot operator or a standalone identifier
            if (identifier != null) {
                sb.append("identifier=").append(identifier);
            }

            // Handle the right expression (for binary operators)
            if (right != null) {
                sb.append("\nright=").append(right);
            }
        }

        // Handle navigationChain separately if it exists
        if (navigationChain != null) {
            sb.append("\nnavigationChain=").append(navigationChain);
        }

        // Handle additional properties like conditions, literals, etc.
        if (literal != null) {
            sb.append("\nliteral=").append(literal);
        }

        if (arrayLiteral != null) {
            sb.append("\narrayLiteral=").append(arrayLiteral);
        }

        if (objectLiteral != null) {
            sb.append("\nobjectLiteral=").append(objectLiteral);
        }

        if (arrayLiteralHtml != null) {
            sb.append("\narrayLiteralHtml=").append(arrayLiteralHtml);
        }

        if (objectLiteralHtml != null) {
            sb.append("\nobjectLiteralHtml=").append(objectLiteralHtml);
        }

        if (functionCall != null) {
            sb.append("\nfunctionCall=").append(functionCall);
        }

        if (unaryExpression != null) {
            sb.append("\nunaryExpression=").append(unaryExpression);
        }

        if (genericType != null) {
            sb.append("\ngenericType=").append(genericType);
        }

        if (methodCall != null) {
            sb.append("\nmethodCall=").append(methodCall);
        }

        if (condition != null) {
            sb.append("\ncondition=").append(condition);
        }

        if (decoratorExpression != null) {
            sb.append("\ndecoratorExpression=").append(decoratorExpression);
        }

        if (classBody != null) {
            sb.append("\nclassBody=").append(classBody);
        }

        sb.append("}");
        return sb.toString();
    }



}
