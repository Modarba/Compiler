package AST;

import java.util.List;

public class InterfaceDeclaration {
     boolean isExported; // Optional export keyword
     String identifier;  // The name of the interface
     List<TypedPropertyAssignment> properties; // List of typed property assignments (e.g., fields in the interface)

    // Constructor for InterfaceDeclaration
    public InterfaceDeclaration(boolean isExported, String identifier, List<TypedPropertyAssignment> properties) {
        this.isExported = isExported;
        this.identifier = identifier;
        this.properties = properties;
    }

    // Getters and Setters
    public boolean isExported() {
        return isExported;
    }

    public void setExported(boolean exported) {
        isExported = exported;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<TypedPropertyAssignment> getProperties() {
        return properties;
    }

    public void setProperties(List<TypedPropertyAssignment> properties) {
        this.properties = properties;
    }

    // toString method for the InterfaceDeclaration
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isExported) {
            sb.append("export ");
        }
        sb.append("interface ").append(identifier).append(" {");

        // Append the properties of the interface
        for (TypedPropertyAssignment property : properties) {
            sb.append(property).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
}
