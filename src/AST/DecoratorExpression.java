package AST;

public class DecoratorExpression {
     String decorator; // The Decorator keyword as a String
    String identifier;
    SpecificDecorator specificDecorator; // This can hold either a SpecificDecorator or an Identifier
     ArgumentList argumentList; // The optional argument list

    // Constructor
    public DecoratorExpression(String decorator, SpecificDecorator specificDecorator, ArgumentList argumentList) {
        this.decorator = decorator;
        this.specificDecorator = specificDecorator;
        this.argumentList = argumentList;
    }

    public DecoratorExpression() {

    }

    public SpecificDecorator getSpecificDecorator() {
        return specificDecorator;
    }

    public void setSpecificDecorator(SpecificDecorator specificDecorator) {
        this.specificDecorator = specificDecorator;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    // Getter and Setter for decorator
    public String getDecorator() {
        return decorator;
    }

    public void setDecorator(String decorator) {
        this.decorator = decorator;
    }

    // Getter and Setter for decoratorValue (can be SpecificDecorator or Identifier)
    public Object getDecoratorValue() {
        return specificDecorator;
    }

    public void setDecoratorValue(SpecificDecorator specificDecorator) {
        this.specificDecorator = specificDecorator;
    }

    // Getter and Setter for argumentList
    public ArgumentList getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(ArgumentList argumentList) {
        this.argumentList = argumentList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Append the decorator name
        sb.append(decorator);

        // Append the specificDecorator or identifier if present
        if (specificDecorator != null) {
            sb.append(specificDecorator);
        } else if (identifier != null && !identifier.isEmpty()) {
            sb.append(" ").append(identifier);
        }

        // Append argumentList if present
        if (argumentList != null) {
            sb.append("(").append(argumentList).append(")");
        }

        // Close the decorator if there are parentheses
        if (argumentList == null && decorator != null && !decorator.isEmpty()) {
            sb.append("()");
        }

        return sb.toString();
    }

}
