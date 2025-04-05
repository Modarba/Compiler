package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiteralHtml {
    List<SingleExpression> elements = new ArrayList<>();

    public List<SingleExpression> getElements() {
        return elements;
    }

    public void setElements(List<SingleExpression> elements) {
        this.elements = elements != null ? elements : new ArrayList<>();
    }

    @Override
    public String toString() {
        if (elements != null && !elements.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("ArrayLiteralHtml {\n");
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
        return "ArrayLiteralHtml { elements = [] }";
    }
}
