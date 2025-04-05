package AST;

public class ReturnStatement {
     SingleExpression singleExpression;

    public ReturnStatement(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    @Override
    public String toString() {
        if (singleExpression != null) {
            return "return " + singleExpression.toString();
        } else {
            return "return";
        }
    }
}
