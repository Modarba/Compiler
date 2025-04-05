package AST;

import java.util.List;

public class FunctionCall {
     String functionName; // The name of the function being called
     List<SingleExpression> arguments; // List of arguments passed to the function

    public FunctionCall(String functionName, List<SingleExpression> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<SingleExpression> getArguments() {
        return arguments;
    }

    public void setArguments(List<SingleExpression> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
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
