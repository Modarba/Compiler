package AST;

import java.util.List;

public class TemplateLiteral {
     List<HtmlTemplateProperty> htmlTemplateProperties;
     List<String> stringLiterals;
     List<SingleExpression> singleExpressions;
     List<AngularElement> angularElements;
     List<Interpolation> interpolations;
     List<TextNode> texts;

    public TemplateLiteral(List<HtmlTemplateProperty> htmlTemplateProperties,
                           List<String> stringLiterals,
                           List<SingleExpression> singleExpressions,
                           List<AngularElement> angularElements,
                           List<Interpolation> interpolations,
                           List<TextNode> texts) {
        this.htmlTemplateProperties = htmlTemplateProperties;
        this.stringLiterals = stringLiterals;
        this.singleExpressions = singleExpressions;
        this.angularElements = angularElements;
        this.interpolations = interpolations;
        this.texts = texts;
    }

    // Getter methods
    public List<HtmlTemplateProperty> getHtmlTemplateProperties() {
        return htmlTemplateProperties;
    }

    public List<String> getStringLiterals() {
        return stringLiterals;
    }

    public List<SingleExpression> getSingleExpressions() {
        return singleExpressions;
    }

    public List<AngularElement> getAngularElements() {
        return angularElements;
    }

    public List<Interpolation> getInterpolations() {
        return interpolations;
    }

    public List<TextNode> getTexts() {
        return texts;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TemplateLiteral {");

        if (htmlTemplateProperties != null && !htmlTemplateProperties.isEmpty()) {
            sb.append("\nhtmlTemplateProperties=\n");
            for (HtmlTemplateProperty property : htmlTemplateProperties) {
                sb.append(property).append("\n");
            }
        }
        if (stringLiterals != null && !stringLiterals.isEmpty()) {
            sb.append("\nstringLiterals=\n");
            for (String literal : stringLiterals) {
                sb.append(literal).append("\n");
            }
        }
        if (singleExpressions != null && !singleExpressions.isEmpty()) {
            sb.append("\nsingleExpressions=\n");
            for (SingleExpression expression : singleExpressions) {
                sb.append(expression).append("\n");
            }
        }
        if (angularElements != null && !angularElements.isEmpty()) {
            sb.append("\nangularElements=\n");
            for (AngularElement element : angularElements) {
                sb.append(element).append("\n");
            }
        }
        if (interpolations != null && !interpolations.isEmpty()) {
            sb.append("\ninterpolations=\n");
            for (Interpolation interpolation : interpolations) {
                sb.append(interpolation).append("\n");
            }
        }
        if (texts != null && !texts.isEmpty()) {
            sb.append("\ntexts=\n");
            for (TextNode text : texts) {
                sb.append(text).append("\n");
            }
        }

        sb.append("\n}");
        return sb.toString();
    }


}
