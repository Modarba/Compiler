package AST;

public class ComponentDeclaration {
     String importItem;
     ArgumentObject argumentObject;

    // Getters and setters for the fields

    public String getImportItem() {
        return importItem;
    }

    public void setImportItem(String importItem) {
        this.importItem = importItem;
    }

    public ArgumentObject getArgumentObject() {
        return argumentObject;
    }

    public void setArgumentObject(ArgumentObject argumentObject) {
        this.argumentObject = argumentObject;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComponentDeclaration{")
                .append("decorator='").append('@').append('\'')
                .append(",importItem='").append(importItem).append('\'');

        if (argumentObject != null) {
           sb.append("(").append("\nargumentObject=").append(argumentObject ).append(")");
        }


        return sb.toString();
    }
}
