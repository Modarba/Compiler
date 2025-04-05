package AST;
import java.util.ArrayList;
import java.util.List;

public class HtmlTemplateProperty {

    String identifier; // The identifier (e.g., "propertyName")
    List<AngularElement> angularElements; // List of Angular elements
    List<Interpolation> interpolations; // List of interpolation elements
    List<TextNode> texts; // List of text elements
    List<HtmlInsideBackticks> htmlInsideBackticks; // List of HTML inside backticks

    // Constructor
    public HtmlTemplateProperty(String identifier) {
        this.identifier = identifier;
        this.angularElements = new ArrayList<>();
        this.interpolations = new ArrayList<>();
        this.texts = new ArrayList<>();
        this.htmlInsideBackticks = new ArrayList<>();
    }

    // Method to add AngularElement
    public void addAngularElement(AngularElement element) {
        this.angularElements.add(element);
    }

    // Method to add Interpolation
    public void addInterpolation(Interpolation interpolation) {
        this.interpolations.add(interpolation);
    }

    // Method to add Text
    public void addText(TextNode text) {
        this.texts.add(text);
    }

    // Method to add HtmlInsideBackticks
    public void addHtmlInsideBackticks(HtmlInsideBackticks html) {
        this.htmlInsideBackticks.add(html);
    }

    // Getter methods
    public String getIdentifier() {
        return identifier;
    }


    public List<AngularElement> getAngularElements() {
        return angularElements;
    }

    public List<Interpolation> getInterpolations() {
        return interpolations;
    }

    public List<TextNode> getTexts() {
        return texts;
    }

    public List<HtmlInsideBackticks> getHtmlInsideBackticks() {
        return htmlInsideBackticks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier)  // Append the identifier (e.g., "propertyName")
                .append(" : `");  // Append colon and opening backtick

        // Add Angular Elements if not null or empty
        if (angularElements != null && !angularElements.isEmpty()) {
            for (AngularElement angular : angularElements) {
                sb.append(angular.toString());
            }
        }

        // Add Interpolations if not null or empty
        if (interpolations != null && !interpolations.isEmpty()) {
            for (Interpolation interpolation : interpolations) {
                sb.append(interpolation.toString());
            }
        }

        // Add Text Nodes if not null or empty
        if (texts != null && !texts.isEmpty()) {
            for (TextNode text : texts) {
                sb.append(text.toString());
            }
        }

        // Add HTML inside backticks if not null or empty
        if (htmlInsideBackticks != null && !htmlInsideBackticks.isEmpty()) {
            for (HtmlInsideBackticks html : htmlInsideBackticks) {
                sb.append(html.toString());
            }
        }

        sb.append("`");  // Append the closing backtick
        return sb.toString();
    }
}