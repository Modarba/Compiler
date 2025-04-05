package AST;

public class VarModifier {
     boolean isExported; // Indicates if the Export keyword is present
     String type; // The type of modifier: Var, Let, or Const

    // Constructor for setting the modifier type and whether it's exported
    public VarModifier(boolean isExported, String type) {
        this.isExported = isExported;
        this.type = type;
    }

    // Getter for isExported
    public boolean isExported() {
        return isExported;
    }

    // Setter for isExported
    public void setExported(boolean exported) {
        isExported = exported;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        if (isExported)
        {
            return "Export " + type; // For example: "Export Var"
        } else
        {
            return type; // For example: "Var"
        }
    }

}