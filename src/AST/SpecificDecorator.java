package AST;

public class SpecificDecorator {
     boolean isInput;
     boolean isOutput;
     boolean isInjectable;
     boolean isNgModule;
     boolean isHostBinding;
     boolean isHostListener;
     boolean isInterface;

    // Constructor
    public SpecificDecorator(String decoratorName) {

        this.isInput = decoratorName.equals("Input");
        this.isOutput = decoratorName.equals("Output");
        this.isInjectable = decoratorName.equals("Injectable");
        this.isNgModule = decoratorName.equals("NgModule");
        this.isHostBinding = decoratorName.equals("HostBinding");
        this.isHostListener = decoratorName.equals("HostListener");
        this.isInterface = decoratorName.equals("Interface");
    }



    public boolean isInput() {
        return isInput;
    }

    public void setInput(boolean isInput) {
        this.isInput = isInput;
    }

    public boolean isOutput() {
        return isOutput;
    }

    public void setOutput(boolean isOutput) {
        this.isOutput = isOutput;
    }

    public boolean isInjectable() {
        return isInjectable;
    }

    public void setInjectable(boolean isInjectable) {
        this.isInjectable = isInjectable;
    }

    public boolean isNgModule() {
        return isNgModule;
    }

    public void setNgModule(boolean isNgModule) {
        this.isNgModule = isNgModule;
    }

    public boolean isHostBinding() {
        return isHostBinding;
    }

    public void setHostBinding(boolean isHostBinding) {
        this.isHostBinding = isHostBinding;
    }

    public boolean isHostListener() {
        return isHostListener;
    }

    public void setHostListener(boolean isHostListener) {
        this.isHostListener = isHostListener;
    }

    public boolean isInterface() {
        return isInterface;
    }

    public void setInterface(boolean isInterface) {
        this.isInterface = isInterface;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
      sb.append(" { ");

        if (isInput) sb.append("Input ");
        if (isOutput) sb.append("Output ");
        if (isInjectable) sb.append("Injectable ");
        if (isNgModule) sb.append("NgModule ");
        if (isHostBinding) sb.append("HostBinding ");
        if (isHostListener) sb.append("HostListener ");
        if (isInterface) sb.append("Interface ");

        sb.append("}");

        return sb.toString();
    }
}
