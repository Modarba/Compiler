package AST;

public class Statement {

    // Fields to hold different types of statements
     VariableStatement variableStatement;
     ExpressionStatement expressionStatement;
     ReturnStatement returnStatement;
     IfStatement ifStatement;
     ForStatement forStatement;
     WhileStatement whileStatement;
     BlockStatement blockStatement;



    public VariableStatement getVariableStatement() {
        return variableStatement;
    }

    public void setVariableStatement(VariableStatement variableStatement) {
        this.variableStatement = variableStatement;
    }

    public ExpressionStatement getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(ExpressionStatement expressionStatement) {
        this.expressionStatement = expressionStatement;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public ForStatement getForStatement() {
        return forStatement;
    }

    public void setForStatement(ForStatement forStatement) {
        this.forStatement = forStatement;
    }

    public WhileStatement getWhileStatement() {
        return whileStatement;
    }

    public void setWhileStatement(WhileStatement whileStatement) {
        this.whileStatement = whileStatement;
    }

    public BlockStatement getBlockStatement() {
        return blockStatement;
    }

    public void setBlockStatement(BlockStatement blockStatement) {
        this.blockStatement = blockStatement;
    }

    // To string method to display the statement contents
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Check each statement type and append it to the result string

        if (variableStatement != null) {
            sb.append("variableStatement = ").append(variableStatement).append('\n');
        }
        if (expressionStatement != null) {
            sb.append("expressionStatement = ").append(expressionStatement).append('\n');
        }
        if (returnStatement != null) {
            sb.append("returnStatement = ").append(returnStatement).append('\n');
        }
        if (ifStatement != null) {
            sb.append("ifStatement = ").append(ifStatement).append('\n');
        }
        if (forStatement != null) {
            sb.append("forStatement = ").append(forStatement).append('\n');
        }
        if (whileStatement != null) {
            sb.append("whileStatement = ").append(whileStatement).append('\n');
        }
        if (blockStatement != null) {
            sb.append("blockStatement = ").append(blockStatement).append('\n');
        }

        return sb.toString();
    }
}
