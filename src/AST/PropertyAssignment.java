package AST;

public class PropertyAssignment {
     String identifier; // The identifier for the property
     PropertyValue propertyValue; // Value assigned to the property (if it's a propertyValue)
     TypeAnnotation typeAnnotation; // Type annotation for the property (if specified)

    // Constructor
    public PropertyAssignment(String identifier, PropertyValue propertyValue, TypeAnnotation typeAnnotation) {
        this.identifier = identifier;
        this.propertyValue = propertyValue;
        this.typeAnnotation = typeAnnotation;
    }

    // Getters and Setters
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public PropertyValue getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(PropertyValue propertyValue) {
        this.propertyValue = propertyValue;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    // toString Method for Debugging
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPropertyAssignment= { ")
                .append("identifier: ").append(identifier).append(", ");

        if (propertyValue != null) {
            sb.append("propertyValue: ").append(propertyValue).append(", ");
        }

        if (typeAnnotation != null) {
            sb.append("typeAnnotation: ").append(typeAnnotation);
        }

        sb.append(" }");
        return sb.toString();
    }
}
