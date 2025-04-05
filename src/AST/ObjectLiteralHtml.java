package AST;
import java.util.List;

public class ObjectLiteralHtml {
     List<PropertyAssignmentHtml> propertyAssignments; // List of property assignments within the object literal

    // Constructor for ObjectLiteralHtml
    public ObjectLiteralHtml(List<PropertyAssignmentHtml> propertyAssignments) {
        this.propertyAssignments = propertyAssignments;
    }

    // Getters and Setters
    public List<PropertyAssignmentHtml> getPropertyAssignments() {
        return propertyAssignments;
    }

    public void setPropertyAssignments(List<PropertyAssignmentHtml> propertyAssignments) {
        this.propertyAssignments = propertyAssignments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (propertyAssignments != null && !propertyAssignments.isEmpty()) {
            for (int i = 0; i < propertyAssignments.size(); i++) {
                sb.append(propertyAssignments.get(i));
                if (i < propertyAssignments.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
