package AST;

import java.util.List;

// Class representing a "new" expression
public class NewExpression {
     String identifier;
     List<SingleExpression> arguments;

    public NewExpression(String identifier, List<SingleExpression> arguments) {
        this.identifier = identifier;
        this.arguments = arguments;
    }

    // Getter methods
    public String getIdentifier() {
        return identifier;
    }

    public List<SingleExpression> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("new ").append(identifier).append("(");
        if (arguments != null && !arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                sb.append(arguments.get(i).toString());
                if (i < arguments.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(")");
        return sb.toString();
    }
}

