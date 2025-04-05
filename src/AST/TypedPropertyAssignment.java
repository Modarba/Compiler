package AST;

public class TypedPropertyAssignment {
     String identifier;  // The property name
     TypeAnnotation typeAnnotation;  // The type annotation

    public TypedPropertyAssignment(String identifier, TypeAnnotation typeAnnotation) {
        this.identifier = identifier;
        this.typeAnnotation = typeAnnotation;
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

    @Override
    public String toString() {
        return identifier + ": " + typeAnnotation;
    }
}
