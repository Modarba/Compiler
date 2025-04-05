package AST;
import java.util.List;

public class ArgumentObject {
    List<PropertyAssignment> propertyAssignments;

    public List<PropertyAssignment> getPropertyAssignments() {
        return propertyAssignments;
    }

    public void setPropertyAssignments(List<PropertyAssignment> propertyAssignments) {
        this.propertyAssignments = propertyAssignments;
    }

    @Override
    public String toString() {
        // Use StringBuilder for efficient string concatenation
        StringBuilder sb = new StringBuilder();

        // Start with an opening curly brace
        sb.append("{");

        // Append each propertyAssignment
        if (propertyAssignments != null && !propertyAssignments.isEmpty()) {
            for (int i = 0; i < propertyAssignments.size(); i++) {
                sb.append(propertyAssignments.get(i).toString());
                if (i < propertyAssignments.size() - 1) {
                    sb.append(", "); // Add a comma between property assignments, except after the last one
                }
            }
        }

        // End with a closing curly brace
        sb.append("}");

        return sb.toString();
    }
}
