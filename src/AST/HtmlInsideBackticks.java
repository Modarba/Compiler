package AST;

public class HtmlInsideBackticks {
    AngularElement angularElement;
    Interpolation interpolation;
    TextNode text;

    public TextNode getText() {
        return text;
    }

    public void setText(TextNode text) {
        this.text = text;
    }

    public Interpolation getInterpolation() {
        return interpolation;
    }

    public void setInterpolation(Interpolation interpolation) {
        this.interpolation = interpolation;
    }

    public AngularElement getAngularElement() {
        return angularElement;
    }

    public void setAngularElement(AngularElement angularElement) {
        this.angularElement = angularElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Backtick{");

        if (angularElement != null) {
            sb.append("angularElement=").append(angularElement.toString()).append(", ");
        }
        if (interpolation != null) {
            sb.append("interpolation=").append(interpolation.toString()).append(", ");
        }
        if (text != null) {
            sb.append("text=").append(text.toString()).append(", ");
        }

        // Remove last comma and space if there's any content
        if (sb.length() > 8) {
            sb.setLength(sb.length() - 2);
        }

        sb.append("}Backtick");
        return sb.toString();
    }
}
