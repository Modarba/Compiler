package AST;

public class PropertyAssignmentHtml {
     String identifier; // For the "Identifier : singleExpression" form
     SingleExpression keyExpression; // For the "[singleExpression] : singleExpression" form
     SingleExpression valueExpression; // The value assigned in both forms

    // Constructor for the "Identifier : singleExpression" form
    public PropertyAssignmentHtml(String identifier, SingleExpression valueExpression) {
        this.identifier = identifier;
        this.valueExpression = valueExpression;
    }

    // Constructor for the "[singleExpression] : singleExpression" form
    public PropertyAssignmentHtml(SingleExpression keyExpression, SingleExpression valueExpression) {
        this.keyExpression = keyExpression;
        this.valueExpression = valueExpression;
    }

    public PropertyAssignmentHtml() {

    }

    // Getters and Setters
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public SingleExpression getKeyExpression() {
        return keyExpression;
    }

    public void setKeyExpression(SingleExpression keyExpression) {
        this.keyExpression = keyExpression;
    }

    public SingleExpression getValueExpression() {
        return valueExpression;
    }

    public void setValueExpression(SingleExpression valueExpression) {
        this.valueExpression = valueExpression;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (identifier != null) {
            sb.append(identifier).append(": ").append(valueExpression);
        } else if (keyExpression != null) {
            sb.append("[").append(keyExpression).append("]").append(": ").append(valueExpression);
        }
        return sb.toString();
    }
}
