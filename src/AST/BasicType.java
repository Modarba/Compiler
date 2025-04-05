package AST;

public class BasicType {
     String identifier; // The type name
     int arrayDimensions; // Number of "[]" pairs

    // Constructor
    public BasicType(String identifier, int arrayDimensions) {
        this.identifier = identifier;
        this.arrayDimensions = arrayDimensions;
    }

    // Getters and Setters
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getArrayDimensions() {
        return arrayDimensions;
    }

    public void setArrayDimensions(int arrayDimensions) {
        this.arrayDimensions = arrayDimensions;
    }

    // Increment array dimensions (used during parsing)
    public void incrementArrayDimensions() {
        this.arrayDimensions++;
    }

    // toString Method for Debugging
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(identifier);
        for (int i = 0; i < arrayDimensions; i++) {
            sb.append("[]");
        }
        return sb.toString();
    }
}
