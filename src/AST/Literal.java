package AST;

public class Literal {
     String nullLiteral;
     Boolean booleanLiteral; // Using Boolean wrapper for nullability
     String stringLiteral;
     Double decimalLiteral; // Using Double wrapper for nullability

    // Getters
    public Boolean isBooleanLiteral() {
        return booleanLiteral;
    }

    public String getNullLiteral() {
        return nullLiteral;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public Double getDecimalLiteral() {
        return decimalLiteral;
    }

    // Setters
    public void setNullLiteral(String nullLiteral) {
        this.nullLiteral = nullLiteral;
    }

    public void setBooleanLiteral(Boolean booleanLiteral) {
        this.booleanLiteral = booleanLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public void setDecimalLiteral(Double decimalLiteral) {
        this.decimalLiteral = decimalLiteral;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (nullLiteral != null) {
            sb.append("NullLiteral: ").append(nullLiteral);
        } else if (stringLiteral != null) {
            sb.append("StringLiteral: ").append(stringLiteral);
        } else if (booleanLiteral != null) {
            sb.append("BooleanLiteral: ").append(booleanLiteral);
        } else if (decimalLiteral != null) {
            sb.append("DecimalLiteral: ").append(decimalLiteral);
        }
        return sb.toString();
    }
}
