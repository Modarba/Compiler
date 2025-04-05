package AST;

public class ClosingTag {
     String identifier; // For case: '</' Identifier '>'
     String tagName;    // For case: '</' TagName '>'

    // Constructor for Identifier-based closing tag
    public ClosingTag(String identifier) {
        this.identifier = identifier;
    }

    // Constructor for TagName-based closing tag
    public ClosingTag(String tagName, boolean isTagName) {
        this.tagName = tagName;
    }

    // Getters and Setters
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        if (identifier != null) {
            return "</" + identifier + ">";
        } else {
            return "</" + tagName + ">";
        }
    }

}
