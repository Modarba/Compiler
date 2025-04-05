package AST;

public class VariableDeclaration {
     String identifier;  // The variable name
     TypeAnnotation typeAnnotation;  // The type annotation (optional)
     SingleExpression initializer;  // The initializer expression (optional)

    public VariableDeclaration(String identifier, TypeAnnotation typeAnnotation, SingleExpression initializer) {
        this.identifier = identifier;
        this.typeAnnotation = typeAnnotation;
        this.initializer = initializer;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public SingleExpression getInitializer() {
        return initializer;
    }

    public void setInitializer(SingleExpression initializer) {
        this.initializer = initializer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier);

        if (typeAnnotation != null) {
            sb.append(": ").append(typeAnnotation);
        }

        if (initializer != null) {
            sb.append(" = ").append(initializer);
        }

        return sb.toString();
    }
}
