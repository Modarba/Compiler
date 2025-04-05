package AST;

public class AngularAttributeValue {
    String stringLiteral;
    Interpolation interpolation;

    // Getter and Setter for stringLiteral
    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    // Getter and Setter for interpolation
    public Interpolation getInterpolation() {
        return interpolation;
    }

    public void setInterpolation(Interpolation interpolation) {
        this.interpolation = interpolation;
    }

    // toString method for meaningful representation of the object
    @Override
    public String toString() {
        if (stringLiteral != null) {
            return "AngularAttributeValue{stringLiteral='" + stringLiteral + "'}";
        } else if (interpolation != null) {
            return "AngularAttributeValue{interpolation=" + interpolation + "}";
        } else {
            return "AngularAttributeValue{empty}";
        }
    }
}
