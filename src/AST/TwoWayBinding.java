package AST;

public class TwoWayBinding {
     String identifier;

    public TwoWayBinding(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "[(" + identifier + ")]";
    }
}
