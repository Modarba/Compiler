package AST;

public class BracketedLiteral {
     double decimalValue;

    public BracketedLiteral(double decimalValue) {
        this.decimalValue = decimalValue;
    }

    public double getDecimalValue() {
        return decimalValue;
    }

    // Setter
    public void setDecimalValue(double decimalValue) {
        this.decimalValue = decimalValue;
    }

    @Override
    public String toString() {
        return "BracketedLiteral{" +
                "decimalValue=[" + decimalValue + "]" +
                '}';
    }
}
