package AST;

public class TopLevelStatement {
     ComponentDeclaration componentDeclaration;
     Declaration declaration;

    public ComponentDeclaration getComponentDeclaration() {
        return componentDeclaration;
    }

    public void setComponentDeclaration(ComponentDeclaration componentDeclaration) {
        this.componentDeclaration = componentDeclaration;
    }

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopLevelStatement {");

        if (componentDeclaration != null) {
            sb.append("\ncomponentDeclaration=").append(componentDeclaration);
        }

        if (declaration != null) {
            sb.append("\ndeclaration=").append(declaration);
        }

        return sb.toString();
    }


}
