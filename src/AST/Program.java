package AST;

import java.util.List;

public class Program {
     List<ImportStatement> importStatements;
     List<TopLevelStatement> topLevelStatements;

    public List<ImportStatement> getImportStatements() {
        return importStatements;
    }

    public void setImportStatements(List<ImportStatement> importStatements) {
        this.importStatements = importStatements;
    }

    public List<TopLevelStatement> getTopLevelStatements() {
        return topLevelStatements;
    }

    public void setTopLevelStatements(List<TopLevelStatement> topLevelStatements) {
        this.topLevelStatements = topLevelStatements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Program {\n");

        // Handle import statements
        if (importStatements != null && !importStatements.isEmpty()) {
            sb.append("importStatements: ");
            for (int i = 0; i < importStatements.size(); i++) {
                sb.append(importStatements.get(i).toString());
                if (i < importStatements.size() - 1) {
                    sb.append(", "); // Add a comma between elements
                }}
        } else {
            sb.append("importStatements: No imports\n");
        }
        // Handle top-level statements
        if (topLevelStatements != null && !topLevelStatements.isEmpty()) {
            sb.append("topLevelStatements: ");
            for (int i = 0; i < topLevelStatements.size(); i++) {
                sb.append(topLevelStatements.get(i).toString());
                if (i < topLevelStatements.size() - 1) {
                    sb.append(", ");
                }
            }

        } else {
            sb.append("topLevelStatements: No top-level statements\n");
        }

        sb.append("}");
        return sb.toString();
    }


}
