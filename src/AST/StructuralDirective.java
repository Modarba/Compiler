package AST;

public class StructuralDirective {
     String directiveType; // Can be "NgIf" or "NgFor"
     SingleExpression expression;

    public StructuralDirective(String directiveType, SingleExpression expression) {
        this.directiveType = directiveType;
        this.expression = expression;
    }

    public String getDirectiveType() {
        return directiveType;
    }

    public void setDirectiveType(String directiveType) {
        this.directiveType = directiveType;
    }

    public SingleExpression getExpression() {
        return expression;
    }

    public void setExpression(SingleExpression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "StructuralDirective{" +
                "directiveType='" + directiveType + '\'' +
                ", expression=" + expression +
                '}';
    }
}
