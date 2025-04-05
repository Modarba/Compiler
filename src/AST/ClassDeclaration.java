package AST;

import java.util.List;

public class ClassDeclaration {
     String className;
     String extendsClass; // Optional
     List<String> implementsInterfaces; // Optional
     List<ClassBody> classBodyElements;

    // Constructor
    public ClassDeclaration(String className, String extendsClass,
                            List<String> implementsInterfaces, List<ClassBody> classBodyElements) {
        //this.isExported = isExported;
        this.className = className;
        this.extendsClass = extendsClass;
        this.implementsInterfaces = implementsInterfaces;
        this.classBodyElements = classBodyElements;
    }

    // Getter and Setter methods
//    public boolean isExported() {
//        return isExported;
//    }
//
//    public void setExported(boolean exported) {
//        isExported = exported;
//    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getExtendsClass() {
        return extendsClass;
    }

    public void setExtendsClass(String extendsClass) {
        this.extendsClass = extendsClass;
    }

    public List<String> getImplementsInterfaces() {
        return implementsInterfaces;
    }

    public void setImplementsInterfaces(List<String> implementsInterfaces) {
        this.implementsInterfaces = implementsInterfaces;
    }

    public List<ClassBody> getClassBodyElements() {
        return classBodyElements;
    }

    public void setClassBodyElements(List<ClassBody> classBodyElements) {
        this.classBodyElements = classBodyElements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

            sb.append("Export ");


        sb.append("class ").append(className);

        // Append extends if present
        if (extendsClass != null) {
            sb.append(" extends ").append(extendsClass);
        }

        // Append implements if present
        if (implementsInterfaces != null && !implementsInterfaces.isEmpty()) {
            sb.append(" implements ");
            sb.append(String.join(", ", implementsInterfaces));
        }

        // Append class body
        sb.append(" {");
        for (ClassBody bodyElement : classBodyElements) {
            sb.append("\n").append(bodyElement);
        }
        sb.append("\n}");

        return sb.toString();
    }
}
