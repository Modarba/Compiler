package AST;

import java.util.List;

public class AngularElement {
     String tagName;
     List<AngularAttribute> angularAttributes;
     List<RegularAttribute> regularAttributes;
     List<ClassAttribute> classAttributes;
     AngularContent angularContent;
    ClosingTag closingTag;


    // Constructor
    public AngularElement(String tagName, List<AngularAttribute> angularAttributes,
                          List<RegularAttribute> regularAttributes, List<ClassAttribute> classAttributes,
                          AngularContent angularContent, ClosingTag closingTag) {
        this.tagName = tagName;
        this.angularAttributes = angularAttributes;
        this.regularAttributes = regularAttributes;
        this.classAttributes = classAttributes;
        this.angularContent = angularContent;
        this.closingTag = closingTag;
    }

    // Getter and setter methods
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<AngularAttribute> getAngularAttributes() {
        return angularAttributes;
    }

    public void setAngularAttributes(List<AngularAttribute> angularAttributes) {
        this.angularAttributes = angularAttributes;
    }

    public List<RegularAttribute> getRegularAttributes() {
        return regularAttributes;
    }

    public void setRegularAttributes(List<RegularAttribute> regularAttributes) {
        this.regularAttributes = regularAttributes;
    }

    public List<ClassAttribute> getClassAttributes() {
        return classAttributes;
    }

    public void setClassAttributes(List<ClassAttribute> classAttributes) {
        this.classAttributes = classAttributes;
    }

    public AngularContent getAngularContent() {
        return angularContent;
    }

    public void setAngularContent(AngularContent angularContent) {
        this.angularContent = angularContent;
    }

    public ClosingTag getClosingTag() {
        return closingTag;
    }

    public void setClosingTag(ClosingTag closingTag) {
        this.closingTag = closingTag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AngularElement {");
       sb.append("\n<");
        if (tagName != null) {
            sb.append("tagName=").append(tagName);
        }
         sb.append(">");
        if (angularAttributes != null && !angularAttributes.isEmpty()) {
            sb.append("\nangularAttributes= ");
            for (AngularAttribute attr : angularAttributes) {
                sb.append(attr).append("\n");
            }
        }

        if (regularAttributes != null && !regularAttributes.isEmpty()) {
            sb.append("\nregularAttributes= ");
            for (RegularAttribute attr : regularAttributes) {
                sb.append(attr).append("\n");
            }
        }

        if (classAttributes != null && !classAttributes.isEmpty()) {
            sb.append("\nclassAttributes= ");
            for (ClassAttribute attr : classAttributes) {
                sb.append(attr);
            }
        }

        if (angularContent != null) {
            sb.append("\nangularContent= ").append(angularContent);
        }

        if (closingTag != null) {
            sb.append("\nclosingTag= ").append(closingTag);
        }

        sb.append("}");
        return sb.toString();
    }

}


