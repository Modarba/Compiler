package AST;

import java.util.List;

public class MethodDeclaration {
     List<String> decorators;       // List of decorators (optional)
     String methodName;             // Method name (mandatory)
     ParameterList parameterList;   // Parameter list (optional)
     TypeAnnotation returnType;     // Return type annotation (optional)
     BlockStatement body;           // Method body (mandatory)

    // Constructor
    public MethodDeclaration(List<String> decorators, String methodName,
                             ParameterList parameterList, TypeAnnotation returnType,
                             BlockStatement body) {
        this.decorators = decorators;
        this.methodName = methodName;
        this.parameterList = parameterList;
        this.returnType = returnType;
        this.body = body;
    }

    public MethodDeclaration() {

    }

    // Getter and Setter methods
    public List<String> getDecorators() {
        return decorators;
    }

    public void setDecorators(List<String> decorators) {
        this.decorators = decorators;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public TypeAnnotation getReturnType() {
        return returnType;
    }

    public void setReturnType(TypeAnnotation returnType) {
        this.returnType = returnType;
    }

    public BlockStatement getBody() {
        return body;
    }

    public void setBody(BlockStatement body) {
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Append decorators
        if (decorators != null && !decorators.isEmpty()) {
            for (String decorator : decorators) {
                sb.append(decorator).append(" ");
            }
        }

        // Append method name
        sb.append(methodName);

        // Append parameters
        sb.append("(");
        if (parameterList != null) {
            sb.append(parameterList.toString());
        }
        sb.append(")");

        // Append return type
        if (returnType != null) {
            sb.append(": ").append(returnType.toString());
        }

        // Append body

        sb.append(" ").append(body.toString());
        return sb.toString();
    }
}
