package AST;

public class ImportItem {
     String itemName;
     boolean isNgModule;
     boolean isDecorator;
     boolean isComponent;
     boolean isInput;
     boolean isOutput;
     boolean isOnInit;
     boolean isInjectable;
     boolean isHostBinding;
     boolean isHostListener;
     boolean isEventEmitter;

    // Getters and setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean isNgModule() {
        return isNgModule;
    }

    public void setNgModule(boolean isNgModule) {
        this.isNgModule = isNgModule;
    }

    public boolean isDecorator() {
        return isDecorator;
    }

    public void setDecorator(boolean isDecorator) {
        this.isDecorator = isDecorator;
    }

    public boolean isComponent() {
        return isComponent;
    }

    public void setComponent(boolean isComponent) {
        this.isComponent = isComponent;
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

    public boolean isOnInit() {
        return isOnInit;
    }

    public void setOnInit(boolean isOnInit) {
        this.isOnInit = isOnInit;
    }

    public boolean isInjectable() {
        return isInjectable;
    }

    public void setInjectable(boolean isInjectable) {
        this.isInjectable = isInjectable;
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

    public boolean isEventEmitter() {
        return isEventEmitter;
    }

    public void setEventEmitter(boolean isEventEmitter) {
        this.isEventEmitter = isEventEmitter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (itemName != null) {
            sb.append(itemName).append(" { Identifier } ");
        }

        if (isNgModule) sb.append("NgModule { NgModule } ");
        if (isDecorator) sb.append("Decorator { Decorator } ");
        if (isComponent) sb.append("Component { Component } ");
        if (isInput) sb.append("Input { Input } ");
        if (isOutput) sb.append("Output { Output } ");
        if (isOnInit) sb.append("OnInit { OnInit } ");
        if (isInjectable) sb.append("Injectable { Injectable } ");
        if (isHostBinding) sb.append("HostBinding { HostBinding } ");
        if (isHostListener) sb.append("HostListener { HostListener } ");
        if (isEventEmitter) sb.append("EventEmitter { EventEmitter } ");

        return sb.toString();
    }
}
