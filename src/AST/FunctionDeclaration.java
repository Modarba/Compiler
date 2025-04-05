package AST;

public class FunctionDeclaration {
    boolean isExported;
    String functionName;
    ParameterList parameters;
    TypeAnnotation returnType; // Type annotation for the return type
    BlockStatement block;

    public FunctionDeclaration(boolean isExported, String functionName, ParameterList parameters, TypeAnnotation returnType, BlockStatement block) {
        this.isExported = isExported;
        this.functionName = functionName;
        this.parameters = parameters;
        this.returnType = returnType;
        this.block = block;
    }

    public boolean isExported() {
        return isExported;
    }

    public void setExported(boolean exported) {
        isExported = exported;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public ParameterList getParameters() {
        return parameters;
    }

    public void setParameters(ParameterList parameters) {
        this.parameters = parameters;
    }

    public TypeAnnotation getReturnType() {
        return returnType;
    }

    public void setReturnType(TypeAnnotation returnType) {
        this.returnType = returnType;
    }

    public BlockStatement getBody() {
        return block;
    }

    public void setBody(BlockStatement body) {
        this.block = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Include export keyword if function is exported
        if (isExported) {
            sb.append("export ");
        }

        // Add the function keyword and name
        sb.append("function ").append(functionName);

        // Add parameters
        sb.append("(");
        if (parameters != null) {
            sb.append(parameters.toString());
        }
        sb.append(")");

        // Add return type if present
        if (returnType != null) {
            sb.append(": ").append(returnType.toString());
        }

        // Add the function body
        sb.append(" ").append(block.toString());

        return sb.toString();
    }
}
