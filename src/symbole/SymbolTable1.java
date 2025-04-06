package symbole;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable1 {
    private Map<String, Symbol> symbols = new HashMap<>();
    public void addSymbol(String name, String type, Object value) {
        symbols.put(name, new Symbol(name, type, value));
    }

    public Symbol getSymbol(String name) {
        return symbols.get(name);
    }

    public boolean contains(String name) {
        return symbols.containsKey(name);
    }
    @Override
    public String toString() {
        return symbols.toString();
    }

}
