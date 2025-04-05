package AST;

import java.util.List;

public class PropertyValue {
     Literal literal;                    // Literal value
     ArrayLiteral arrayLiteral;          // Array literal
     ArrayLiteralHtml arrayLiteralHTML;  // HTML array literal
     ObjectLiteral objectLiteral;        // Object literal
     ObjectLiteralHtml objectLiteralHTML; // HTML object literal
     TemplateLiteral templateLiteral;    // Template literal
     UnionType unionType;                // Union type
     FunctionCall functionCall;          // Function call
     NavigationChain navigationChain;    // This.Dot.navigationChain
     BracketedLiteral bracketedLiteral;  // Bracketed literal

    // Constructor
    public PropertyValue() {}

    // Getters and Setters
    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public ArrayLiteralHtml getArrayLiteralHTML() {
        return arrayLiteralHTML;
    }

    public void setArrayLiteralHTML(ArrayLiteralHtml arrayLiteralHTML) {
        this.arrayLiteralHTML = arrayLiteralHTML;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public ObjectLiteralHtml getObjectLiteralHTML() {
        return objectLiteralHTML;
    }

    public void setObjectLiteralHTML(ObjectLiteralHtml objectLiteralHTML) {
        this.objectLiteralHTML = objectLiteralHTML;
    }

    public TemplateLiteral getTemplateLiteral() {
        return templateLiteral;
    }

    public void setTemplateLiteral(TemplateLiteral templateLiteral) {
        this.templateLiteral = templateLiteral;
    }

    public UnionType getUnionType() {
        return unionType;
    }

    public void setUnionType(UnionType unionType) {
        this.unionType = unionType;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public NavigationChain getNavigationChain() {
        return navigationChain;
    }

    public void setNavigationChain(NavigationChain navigationChain) {
        this.navigationChain = navigationChain;
    }

    public BracketedLiteral getBracketedLiteral() {
        return bracketedLiteral;
    }

    public void setBracketedLiteral(BracketedLiteral bracketedLiteral) {
        this.bracketedLiteral = bracketedLiteral;
    }

    // toString Method for Debugging
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PropertyValue { ");
        if (literal != null) sb.append("literal: ").append(literal).append(",");
        if (arrayLiteral != null) sb.append("arrayLiteral: ").append(arrayLiteral).append(", ");
        if (arrayLiteralHTML != null) sb.append("arrayLiteralHTML: ").append(arrayLiteralHTML).append(", ");
        if (objectLiteral != null) sb.append("objectLiteral: ").append(objectLiteral).append(", ");
        if (objectLiteralHTML != null) sb.append("objectLiteralHTML: ").append(objectLiteralHTML).append(", ");
        if (templateLiteral != null) sb.append("templateLiteral: ").append(templateLiteral).append(", ");
        if (unionType != null) sb.append("unionType: ").append(unionType).append(", ");
        if (functionCall != null) sb.append("functionCall: ").append(functionCall).append(", ");
        if (navigationChain != null) sb.append("navigationChain: ").append(navigationChain).append(", ");
        if (bracketedLiteral != null) sb.append("bracketedLiteral: ").append(bracketedLiteral);
        sb.append("}");
        return sb.toString();
    }
}
