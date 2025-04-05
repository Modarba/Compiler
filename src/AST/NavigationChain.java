package AST;

import java.util.ArrayList;
import java.util.List;

public class NavigationChain {
    String identifier; // The initial identifier (e.g., "object")
    List<NavigationStep> steps; // The list of subsequent steps (Dot or BracketAccess)

    // Constructor
    public NavigationChain(String identifier) {
        this.identifier = identifier;
        this.steps = new ArrayList<>();
    }

    // Method to add a dot access or bracket access step
    public void addStep(NavigationStep step) {
        steps.add(step);
    }

    // Getter for identifier
    public String getIdentifier() {
        return identifier;
    }

    // Getter for steps
    public List<NavigationStep> getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavigationChain{");

        // Append the main identifier
        sb.append("identifier: ").append(identifier);

        // Append the steps, separated by commas
        sb.append(", steps: [");
        for (int i = 0; i < steps.size(); i++) {
            sb.append(steps.get(i).toString());
            if (i < steps.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        sb.append("}");
        return sb.toString();
    }


}