package AST;

import java.util.List;

public class VariableStatement {
    VarModifier varModifier; // 'let', 'const', 'var'
     List<VariableDeclaration> variableDeclarations; // List of variable declarations


    public VariableStatement(VarModifier varModifier, List<VariableDeclaration> variableDeclarations) {
        this.varModifier = varModifier;
        this.variableDeclarations = variableDeclarations;
    }

    public VarModifier getVarModifier() {
        return varModifier;
    }

    public void setVarModifier(VarModifier varModifier) {
        this.varModifier = varModifier;
    }

    public List<VariableDeclaration> getVariableDeclarations() {
        return variableDeclarations;
    }

    public void setVariableDeclarations(List<VariableDeclaration> variableDeclarations) {
        this.variableDeclarations = variableDeclarations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(varModifier).append(" ");

        for (int i = 0; i < variableDeclarations.size(); i++) {
            sb.append(variableDeclarations.get(i));
            if (i < variableDeclarations.size() - 1) {
                sb.append(", ");
            }
        }


        return sb.toString();
    }
}
