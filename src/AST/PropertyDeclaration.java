    package AST;
    import java.util.List;


    public class PropertyDeclaration {
        String visibilityModifier;
        List<VarModifier> varModifier;
        String identifier;
        List<String> nullabilityIndicator;
        List<TypeAnnotation> typeAnnotation;
        List<NewExpression> newExpressions;
        List<PropertyValue> propertyValues;

        public PropertyDeclaration(String visibilityModifier, List<VarModifier> varModifier, String identifier,
                                   List<String> nullabilityIndicator, List<TypeAnnotation> typeAnnotation, List<NewExpression> newExpressions,
                                   List<PropertyValue> propertyValues) {
            this.visibilityModifier = visibilityModifier;
            this.varModifier = varModifier;
            this.identifier = identifier;
            this.nullabilityIndicator = nullabilityIndicator;
            this.typeAnnotation = typeAnnotation;
            this.newExpressions = newExpressions;
            this.propertyValues = propertyValues;
        }

        // Getter methods
        public String getVisibilityModifier() {
            return visibilityModifier;
        }

        public List<VarModifier> getVarModifier() {
            return varModifier;
        }

        public String getIdentifier() {
            return identifier;
        }

        public List<String> getNullabilityIndicator() {
            return nullabilityIndicator;
        }

        public List<TypeAnnotation> getTypeAnnotation() {
            return typeAnnotation;
        }

        public List<NewExpression> getNewExpressions() {
            return newExpressions;
        }

        public List<PropertyValue> getPropertyValues() {
            return propertyValues;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            // Adding visibility modifier (if present)
            if (visibilityModifier != null && !visibilityModifier.isEmpty()) {
                sb.append(String.join(" ", visibilityModifier)).append(" ");
            }

            // Adding variable modifier (if present)
            if (varModifier != null && !varModifier.isEmpty()) {
                sb.append(varModifier.toString()).append(" ");
            }

            // Adding the identifier (mandatory)
            sb.append(identifier);

            // Adding the nullability indicator (if present)
            if (nullabilityIndicator != null && !nullabilityIndicator.isEmpty()) {
                sb.append(String.join("", nullabilityIndicator)).append(" ");
            }

            // Adding type annotation (if present)
            if (typeAnnotation != null && !typeAnnotation.isEmpty()) {
                sb.append(": ").append(typeAnnotation.toString()).append(" ");
            }

            // Adding new expression or property value (if present)
            if (newExpressions != null && !newExpressions.isEmpty()) {
                sb.append("= ").append(newExpressions.toString());
            } else if (propertyValues != null && !propertyValues.isEmpty()) {
                sb.append("= ").append(propertyValues.toString());
            }

            // Adding an end of statement symbol, assuming it's part of the rule
            sb.append(";");

            return sb.toString();
        }


    }