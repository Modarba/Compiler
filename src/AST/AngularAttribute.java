package AST;

public class AngularAttribute {
     String identifier;
     TwoWayBinding twoWayBinding;
     SingleExpression singleExpression;
     StructuralDirective structuralDirective;
     AngularAttributeValue attributeValue;

    public AngularAttribute(TwoWayBinding twoWayBinding, SingleExpression singleExpression) {
        this.twoWayBinding = twoWayBinding;
        this.singleExpression = singleExpression;
    }

    public AngularAttribute(String identifier, SingleExpression singleExpression) {
        this.identifier = identifier;
        this.singleExpression = singleExpression;
    }

    public AngularAttribute(StructuralDirective structuralDirective) {
        this.structuralDirective = structuralDirective;
    }

    public AngularAttribute(String identifier, AngularAttributeValue attributeValue) {
        this.identifier = identifier;
        this.attributeValue = attributeValue;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public TwoWayBinding getTwoWayBinding() {
        return twoWayBinding;
    }

    public void setTwoWayBinding(TwoWayBinding twoWayBinding) {
        this.twoWayBinding = twoWayBinding;
    }

    public SingleExpression getSingleExpression() {
        return singleExpression;
    }

    public void setSingleExpression(SingleExpression singleExpression) {
        this.singleExpression = singleExpression;
    }

    public StructuralDirective getStructuralDirective() {
        return structuralDirective;
    }

    public void setStructuralDirective(StructuralDirective structuralDirective) {
        this.structuralDirective = structuralDirective;
    }

    public AngularAttributeValue getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(AngularAttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        if (twoWayBinding != null) {
            return "AngularAttribute{" +
                    "twoWayBinding=" + twoWayBinding +
                    ", singleExpression=" + singleExpression +
                    '}';
        } else if (structuralDirective != null) {
            return "AngularAttribute{" +
                    "structuralDirective='" + structuralDirective + '\n' +
                    '}';
        } else if (attributeValue != null) {
            return "AngularAttribute{" +
                    "identifier='" + identifier + '\'' +
                    ", attributeValue='" + attributeValue + '\'' +
                    '}';
        } else {
            return "AngularAttribute{" +
                    "identifier='" + identifier + '\'' +
                    ", singleExpression=" + singleExpression +
                    '}';
        }
    }
}
