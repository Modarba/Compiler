package AST;

import java.util.List;


public class InterfaceList {
     List<String> identifiers;  // List of identifiers in the interface list

    public InterfaceList(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < identifiers.size(); i++) {
            sb.append(identifiers.get(i).toString());
            if (i < identifiers.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
