package AST;

public class UnaryExpression {
     String operator; // Represents the unary operator ('!' or '-')
     SingleExpression operand; // Represents the singleExpression being operated on

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public SingleExpression getOperand() {
        return operand;
    }

    public void setOperand(SingleExpression operand) {
        this.operand = operand;
    }

    @Override
    public String toString() {
        return "UnaryExpression{" +
                "operator='" + operator + '\'' +
                ", operand=" + operand +
                '}';
    }
}

