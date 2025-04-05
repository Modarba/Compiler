package AST;

public class Declaration {
     ClassDeclaration classDeclaration;
     FunctionDeclaration functionDeclaration;
     VariableStatement variableStatement;
     InterfaceDeclaration interfaceDeclaration;
     ModuleDeclaration moduleDeclaration;

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public InterfaceDeclaration getInterfaceDeclaration() {
        return interfaceDeclaration;
    }

    public void setInterfaceDeclaration(InterfaceDeclaration interfaceDeclaration) {
        this.interfaceDeclaration = interfaceDeclaration;
    }

    public ModuleDeclaration getModuleDeclaration() {
        return moduleDeclaration;
    }

    public void setModuleDeclaration(ModuleDeclaration moduleDeclaration) {
        this.moduleDeclaration = moduleDeclaration;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Declaration {");

        if (classDeclaration != null) {
            sb.append("\nclassDeclaration=\n").append(classDeclaration);
        }
        if (functionDeclaration != null) {
            sb.append("\nfunctionDeclaration=\n").append(functionDeclaration);
        }
        if (variableStatement != null) {
            sb.append("\nvariableStatement\n=").append(variableStatement);
        }
        if (interfaceDeclaration != null) {
            sb.append("\ninterfaceDeclaration=\n").append(interfaceDeclaration);
        }
        if (moduleDeclaration != null) {
            sb.append("\nmoduleDeclaration=\n").append(moduleDeclaration);
        }


        return sb.toString();
    }

}
