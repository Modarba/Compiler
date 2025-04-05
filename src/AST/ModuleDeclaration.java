package AST;

public class ModuleDeclaration {
     String decorator;
     String ngModule;
     ArgumentObject argumentObject;
     ClassDeclaration classDeclaration;

    public String getDecorator() {
        return decorator;
    }

    public void setDecorator(String decorator) {
        this.decorator = decorator;
    }

    public String getNgModule() {
        return ngModule;
    }

    public void setNgModule(String ngModule) {
        this.ngModule = ngModule;
    }

    public ArgumentObject getArgumentObject() {
        return argumentObject;
    }

    public void setArgumentObject(ArgumentObject argumentObject) {
        this.argumentObject = argumentObject;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        return "ModuleDeclaration{" +
                "decorator=" + decorator +
                ", ngModule=" + ngModule +
                ", argumentObject=" + argumentObject +
                ", classDeclaration=" + classDeclaration +
                '}';
    }
}