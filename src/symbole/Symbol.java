package symbole;

class Symbol {
    String name;
    String type;
    Object value;
    Symbol(String name, String type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
    @Override
    public String toString() {
        return "Symbol{name='" + name + "', type='" + type + "', value=" + value + "}";
    }
}
