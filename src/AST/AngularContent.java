package AST;
import java.util.List;

public class AngularContent {
    List<AngularElement> angularElements;  // List to hold multiple AngularElements
    List<Interpolation> interpolations;    // List to hold multiple Interpolations
    List<TextNode> texts;                  // List to hold multiple TextNodes

    // Getters and setters for each list
    public List<AngularElement> getAngularElements() {
        return angularElements;
    }

    public void setAngularElements(List<AngularElement> angularElements) {
        this.angularElements = angularElements;
    }

    public List<Interpolation> getInterpolations() {
        return interpolations;
    }

    public void setInterpolations(List<Interpolation> interpolations) {
        this.interpolations = interpolations;
    }

    public List<TextNode> getTexts() {
        return texts;
    }

    public void setTexts(List<TextNode> texts) {
        this.texts = texts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AngularContent {");

        // Append Angular Elements
        if (angularElements != null && !angularElements.isEmpty()) {
            sb.append("\nangularElements=\n");
            for (AngularElement element : angularElements) {
                sb.append(element).append("\n");
            }
        }

        // Append Interpolations
        if (interpolations != null && !interpolations.isEmpty()) {
            sb.append("\ninterpolations=\n");
            for (Interpolation interpolation : interpolations) {
                sb.append(interpolation).append("\n");
            }
        }

        // Append Text Nodes
        if (texts != null && !texts.isEmpty()) {
            sb.append("\ntexts=\n");
            for (TextNode text : texts) {
                sb.append(text).append("\n");
            }
        }

        sb.append("}");
        return sb.toString();
    }

}
