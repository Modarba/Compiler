package AST;

import java.util.List;

public class MethodCall {
     String identifier; // Represents the method name.
     List<SingleExpression> arguments; // Represents the arguments passed to the method.

    // Constructor
    public MethodCall(String identifier, List<SingleExpression> arguments) {
        this.identifier = identifier;
        this.arguments = arguments;
    }

    // Getter for the identifier
    public String getIdentifier() {
        return identifier;
    }

    // Setter for the identifier
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    // Getter for the arguments
    public List<SingleExpression> getArguments() {
        return arguments;
    }

    // Setter for the arguments
    public void setArguments(List<SingleExpression> arguments) {
        this.arguments = arguments;
    }

    // Override toString to provide a readable format
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier).append("(");
        if (arguments != null && !arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                sb.append(arguments.get(i));
                if (i < arguments.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
