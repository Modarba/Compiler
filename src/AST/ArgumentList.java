package AST;
public class ArgumentList {
     ObjectLiteral objectLiteral;

    public ArgumentList(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    @Override
    public String toString() {
        return "ArgumentList: " + objectLiteral.toString();
    }
}