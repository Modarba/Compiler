package AST;

public class Parameter {
     String accessModifier; // "Private", "Public", or "Protected", or null if not specified
     String name;           // The parameter's name (Identifier)
     TypeAnnotation typeAnnotation; // Optional type annotation
     SingleExpression defaultValue; // Optional default value (singleExpression)

    public Parameter(String accessModifier, String name, TypeAnnotation typeAnnotation, SingleExpression defaultValue) {
        this.accessModifier = accessModifier;
        this.name = name;
        this.typeAnnotation = typeAnnotation;
        this.defaultValue = defaultValue;
    }

    // Getters and setters
    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public SingleExpression getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(SingleExpression defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (accessModifier != null) {
            sb.append(accessModifier).append(" ");
        }
        sb.append(name);
        if (typeAnnotation != null) {
            sb.append(": ").append(typeAnnotation);
        }
        if (defaultValue != null) {
            sb.append(" = ").append(defaultValue);
        }
        return sb.toString();
    }
}
