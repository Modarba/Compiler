package AST;

import java.util.ArrayList;
import java.util.List;

public class UnionType {
     List<BasicType> basicTypes; // Holds all basic types in the union
     List<GenericType> genericTypes; // Holds all generic types in the union
     boolean isParenthesized; // True if the union is enclosed in parentheses

    public UnionType() {
        this.basicTypes = new ArrayList<>();
        this.genericTypes = new ArrayList<>();
        this.isParenthesized = false;
    }

    // Getter and Setter for isParenthesized
    public boolean isParenthesized() {
        return isParenthesized;
    }

    public void setParenthesized(boolean parenthesized) {
        isParenthesized = parenthesized;
    }

    // Getters for the lists
    public List<BasicType> getBasicTypes() {
        return basicTypes;
    }

    public List<GenericType> getGenericTypes() {
        return genericTypes;
    }

    // Add methods
    public void addBasicType(BasicType basicType) {
        this.basicTypes.add(basicType);
    }

    public void addGenericType(GenericType genericType) {
        this.genericTypes.add(genericType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (isParenthesized) {
            sb.append("(");
        }

        List<String> components = new ArrayList<>();

        for (BasicType bt : basicTypes) {
            components.add(bt.toString());
        }
        for (GenericType gt : genericTypes) {
            components.add(gt.toString());
        }

        sb.append(String.join(" | ", components));

        if (isParenthesized) {
            sb.append(")");
        }

        return sb.toString();
    }
}
