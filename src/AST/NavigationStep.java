package AST;

public class NavigationStep {
    String identifier;         // The identifier for dot access
    BracketAccess bracketAccess; // The bracket access expression

    // Constructor for DotAccess
    public NavigationStep(String identifier) {
        this.identifier = identifier;
        this.bracketAccess = null;
    }

    // Constructor for BracketAccess
    public NavigationStep(BracketAccess bracketAccess) {
        this.identifier = null;
        this.bracketAccess = bracketAccess;
    }

    // Getter for identifier
    public String getIdentifier() {
        return identifier;
    }

    // Getter for bracketAccess
    public BracketAccess getBracketAccess() {
        return bracketAccess;
    }

    @Override
    public String toString() {
        if (identifier != null) {
            return "." + identifier; // Dot access format: .identifier
        } else if (bracketAccess != null) {
            return bracketAccess.toString(); // Bracket access format
        }
        return ""; // Return empty string if both are null (unlikely case)
    }
}
