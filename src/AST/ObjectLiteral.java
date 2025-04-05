package AST;

import java.util.ArrayList;
import java.util.List;

public class ObjectLiteral {
    private List<PropertyAssignment> properties = new ArrayList<>();

    // Getter for properties
    public List<PropertyAssignment> getProperties() {
        return properties;
    }

    // Setter for properties
    public void setProperties(List<PropertyAssignment> properties) {
        this.properties = properties != null ? properties : new ArrayList<>();
    }

    // toString Method for readable representation
    @Override
    public String toString() {
        if (properties != null && !properties.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("ObjectLiteral {\n");
            sb.append("  properties = {\n");
            for (int i = 0; i < properties.size(); i++) {
                sb.append("    ").append(properties.get(i));
                if (i < properties.size() - 1) {
                    sb.append(",");
                }
                sb.append("\n");
            }
            sb.append("  }\n");
            sb.append("}");
            return sb.toString();
        }
        return "ObjectLiteral { properties = {} }"; // Handles empty case
    }
}
