package AST;

import java.util.ArrayList;
import java.util.List;

public class ModuleItems {
    List<ImportItem> importItems; // List to store import items

    public ModuleItems() {
        this.importItems = new ArrayList<>();
    }

    // Method to add import items (like UseRef, UseState, UseEffect, or Identifiers)
    public void addImportItem(ImportItem item) {
        importItems.add(item);
    }

    // Getter for importItems
    public List<ImportItem> getImportItems() {
        return importItems;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        // Loop through the importItems list to append each item, separated by commas
        for (int i = 0; i < importItems.size(); i++) {
            sb.append(importItems.get(i));
            if (i < importItems.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append("}");
        return sb.toString();
    }
}
