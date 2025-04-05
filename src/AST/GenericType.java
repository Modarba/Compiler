package AST;

import java.util.ArrayList;
import java.util.List;

public class GenericType {
     String identifier; // The main type identifier (e.g., "List")
     List<TypeAnnotation> typeAnnotations; // List of typeAnnotations
     List<UnionType> unionTypes; // List of unionTypes
     List<GenericType> genericTypes; // List of nested genericTypes

    public GenericType() {
        this.typeAnnotations = new ArrayList<>();
        this.unionTypes = new ArrayList<>();
        this.genericTypes = new ArrayList<>();
    }

    // Getter and Setter for Identifier
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    // Getters for the lists
    public List<TypeAnnotation> getTypeAnnotations() {
        return typeAnnotations;
    }

    public List<UnionType> getUnionTypes() {
        return unionTypes;
    }

    public List<GenericType> getGenericTypes() {
        return genericTypes;
    }

    // Add methods for each list
    public void addTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotations.add(typeAnnotation);
    }

    public void addUnionType(UnionType unionType) {
        this.unionTypes.add(unionType);
    }

    public void addGenericType(GenericType genericType) {
        this.genericTypes.add(genericType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier).append("<");

        List<String> components = new ArrayList<>();

        for (TypeAnnotation ta : typeAnnotations) {
            components.add(ta.toString());
        }
        for (UnionType ut : unionTypes) {
            components.add(ut.toString());
        }
        for (GenericType gt : genericTypes) {
            components.add(gt.toString());
        }

        sb.append(String.join(", ", components));
        sb.append(">");
        return sb.toString();
    }
}
