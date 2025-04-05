package AST;

public class ForStatement {
     VariableStatement variableStatement; // The variable statement (e.g., initialization)
     SingleExpression condition; // The condition for the loop (e.g., x < 10)
     SingleExpression update; // The update expression for the loop (e.g., x++)
     BlockStatement block; // The block of code to execute in the loop

    public ForStatement(VariableStatement variableStatement,
                        SingleExpression condition,
                        SingleExpression update,
                        BlockStatement block) {
        this.variableStatement = variableStatement;
        this.condition = condition;
        this.update = update;
        this.block = block;
    }

    // Getters and Setters
    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public SingleExpression getCondition() {
        return condition;
    }

    public void setCondition(SingleExpression condition) {
        this.condition = condition;
    }

    public SingleExpression getUpdate() {
        return update;
    }

    public void setUpdate(SingleExpression update) {
        this.update = update;
    }

    public BlockStatement getBlock() {
        return block;
    }

    public void setBlock(BlockStatement block) {
        this.block = block;
    }

    // toString method for the ForStatement
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("for (").append(variableStatement).append("; ")
                .append(condition).append("; ")
                .append(update).append(") ").append(block);
        return sb.toString();
    }
}
