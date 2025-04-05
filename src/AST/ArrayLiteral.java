package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiteral {
    List<SingleExpression> elements = new ArrayList<>(); // List to hold the elements of the array

    // Getter for elements
    public List<SingleExpression> getElements() {
        return elements;
    }

    // Setter for elements
    public void setElements(List<SingleExpression> elements) {
        this.elements = elements != null ? elements : new ArrayList<>();
    }

    // toString Method for readability
    @Override
    public String toString() {
        if (elements != null && !elements.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("ArrayLiteral {\n");
            sb.append("  elements = [");
            for (int i = 0; i < elements.size(); i++) {
                sb.append(elements.get(i));
                if (i < elements.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]\n");
            sb.append("}");
            return sb.toString();
        }
        return "ArrayLiteral { elements = [] }"; // For empty arrays
    }
}
