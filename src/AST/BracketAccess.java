package AST;

public class BracketAccess {
     SingleExpression singleExpression;  // The expression inside the brackets

    public BracketAccess(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    // Getter and Setter for the single expression
    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    @Override
    public String toString() {
        return "[" + singleExpression.toString() + "]";
    }
}
