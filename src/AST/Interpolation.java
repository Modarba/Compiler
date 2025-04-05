package AST;

public class Interpolation {
     String interpolationStart; // Represents InterpolationStart token
     SingleExpression expression; // Represents singleExpression
     String interpolationEnd;   // Represents InterpolationEnd token

    public Interpolation(String interpolationStart, SingleExpression expression, String interpolationEnd) {
        this.interpolationStart = interpolationStart;
        this.expression = expression;
        this.interpolationEnd = interpolationEnd;
    }

    public String getInterpolationStart() {
        return interpolationStart;
    }

    public void setInterpolationStart(String interpolationStart) {
        this.interpolationStart = interpolationStart;
    }

    public SingleExpression getExpression() {
        return expression;
    }

    public void setExpression(SingleExpression expression) {
        this.expression = expression;
    }

    public String getInterpolationEnd() {
        return interpolationEnd;
    }

    public void setInterpolationEnd(String interpolationEnd) {
        this.interpolationEnd = interpolationEnd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Interpolation {");

        // Append interpolationStart if it exists
        if (interpolationStart != null) {
            sb.append("\ninterpolationStart=").append(interpolationStart);
        }

        // Append expression if it exists
        if (expression != null) {
            sb.append("\nexpression=").append(expression);
        }

        // Append interpolationEnd if it exists
        if (interpolationEnd != null) {
            sb.append("\ninterpolationEnd=").append(interpolationEnd);
        }

        sb.append(" }");
        return sb.toString();
    }

}
