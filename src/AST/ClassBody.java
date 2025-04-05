package AST;

public class ClassBody {
     PropertyDeclaration propertyDeclaration;
     MethodDeclaration methodDeclaration;
     DecoratorExpression decoratorExpression;
     HtmlTemplateProperty htmlTemplateProperty;

    public ClassBody(PropertyDeclaration propertyDeclaration) {
        this.propertyDeclaration = propertyDeclaration;
    }

    public ClassBody(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    public ClassBody(DecoratorExpression decoratorExpression) {
        this.decoratorExpression = decoratorExpression;
    }

    public ClassBody(HtmlTemplateProperty htmlTemplateProperty) {
        this.htmlTemplateProperty = htmlTemplateProperty;
    }
    public ClassBody() {
        this.propertyDeclaration = null;
        this.methodDeclaration = null;
        this.decoratorExpression = null;
        this.htmlTemplateProperty = null;
    }
    public PropertyDeclaration getPropertyDeclaration() {
        return propertyDeclaration;
    }

    public void setPropertyDeclaration(PropertyDeclaration propertyDeclaration) {
        this.propertyDeclaration = propertyDeclaration;
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    public DecoratorExpression getDecoratorExpression() {
        return decoratorExpression;
    }

    public void setDecoratorExpression(DecoratorExpression decoratorExpression) {
        this.decoratorExpression = decoratorExpression;
    }

    public HtmlTemplateProperty getHtmlTemplateProperty() {
        return htmlTemplateProperty;
    }

    public void setHtmlTemplateProperty(HtmlTemplateProperty htmlTemplateProperty) {
        this.htmlTemplateProperty = htmlTemplateProperty;
    }

    @Override
    public String toString() {
        if (propertyDeclaration != null) {
            return "ClassBody{" +
                    "propertyDeclaration=" + propertyDeclaration +
                    '}';
        } else if (methodDeclaration != null) {
            return "ClassBody{" +
                    "methodDeclaration=" + methodDeclaration +
                    '}';
        } else if (decoratorExpression != null) {
            return "ClassBody{" +
                    "decoratorExpression=" + decoratorExpression +
                    '}';
        } else if (htmlTemplateProperty != null) {
            return "ClassBody{" +
                    "htmlTemplateProperty=" + htmlTemplateProperty +
                    '}';
        } else {
            return "ClassBody{}";
        }
    }
}
