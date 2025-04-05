package AST;

public class TypeAnnotation {
     BasicType basicType;
     UnionType unionType;
     GenericType genericType;
     boolean isVoid;

    public GenericType getGenericType() {
        return genericType;
    }

    public void setGenericType(GenericType genericType) {
        this.genericType = genericType;
    }

    public UnionType getUnionType() {
        return unionType;
    }

    public void setUnionType(UnionType unionType) {
        this.unionType = unionType;
    }

    public BasicType getBasicType() {
        return basicType;
    }

    public void setBasicType(BasicType basicType) {
        this.basicType = basicType;
    }

    public boolean isVoid() {
        return isVoid;
    }

    public void setVoid(boolean isVoid) {
        this.isVoid = isVoid;
    }

    @Override
    public String toString() {
        if (isVoid) {
            return "TypeAnnotation{Void}";
        }
        if (basicType != null) {
            return "TypeAnnotation{" +
                    "basicType=" + basicType +
                    '}';
        }
        if (unionType != null) {
            return "TypeAnnotation{" +
                    "unionType=" + unionType +
                    '}';
        }
        if (genericType != null) {
            return "TypeAnnotation{" +
                    "genericType=" + genericType +
                    '}';
        }
        return "TypeAnnotation{undefined}";
    }
}
