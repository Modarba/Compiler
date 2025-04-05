package AST;

public class RegularAttribute {
    String name; // Represents the attribute name (Identifier)
    AngularAttributeValue value; // Represents the value of the attribute (angularAttributeValue)

    // Constructor to initialize the name and value
    public RegularAttribute(String name, AngularAttributeValue value) {
        this.name = name;
        this.value = value;
    }

    // Getter for the attribute name
    public String getName() {
        return name;
    }

    // Setter for the attribute name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the attribute value
    public AngularAttributeValue getValue() {
        return value;
    }

    // Setter for the attribute value
    public void setValue(AngularAttributeValue value) {
        this.value = value;
    }

    // Override toString to provide a meaningful string representation
    @Override
    public String toString() {
        return name + "=\"" + value + "\"";  // Output in the form: name="value"
    }
}
