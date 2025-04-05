package AST;

public class IfStatement {
     SingleExpression condition; // The condition of the if statement
     BlockStatement ifBlock; // The block executed if the condition is true
     BlockStatement elseBlock; // The block executed if the condition is false (optional)

    // Constructor for IfStatement with or without an else block
    public IfStatement(SingleExpression condition, BlockStatement ifBlock, BlockStatement elseBlock) {
        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elseBlock = elseBlock;
    }

    // Getters and Setters
    public SingleExpression getCondition() {
        return condition;
    }

    public void setCondition(SingleExpression condition) {
        this.condition = condition;
    }

    public BlockStatement getIfBlock() {
        return ifBlock;
    }

    public void setIfBlock(BlockStatement ifBlock) {
        this.ifBlock = ifBlock;
    }

    public BlockStatement getElseBlock() {
        return elseBlock;
    }

    public void setElseBlock(BlockStatement elseBlock) {
        this.elseBlock = elseBlock;
    }

    // toString method for the IfStatement
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (").append(condition).append(") ").append(ifBlock);

        // If the else block is present, add it to the string representation
        if (elseBlock != null) {
            sb.append(" else ").append(elseBlock);
        }

        return sb.toString();
    }
}
