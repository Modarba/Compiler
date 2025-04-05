package AST;

public class WhileStatement {
     SingleExpression condition; // The condition for the while loop (e.g., x < 10)
     BlockStatement block; // The block of code to execute while the condition is true

    // Constructor for WhileStatement
    public WhileStatement(SingleExpression condition, BlockStatement block) {
        this.condition = condition;
        this.block = block;
    }

    // Getters and Setters
    public SingleExpression getCondition() {
        return condition;
    }

    public void setCondition(SingleExpression condition) {
        this.condition = condition;
    }

    public BlockStatement getBlock() {
        return block;
    }

    public void setBlock(BlockStatement block) {
        this.block = block;
    }

    // toString method for the WhileStatement
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("while (").append(condition).append(") ").append(block);
        return sb.toString();
    }
}
