package AST;

public class ExpressionStatement {

     SingleExpression singleExpression;

    // Constructor
    public ExpressionStatement(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    // Getter and Setter for SingleExpression
    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }


    // toString method to print out the ExpressionStatement
    @Override
    public String toString() {
        return "ExpressionStatement: " + singleExpression.toString() ;
    }
}
