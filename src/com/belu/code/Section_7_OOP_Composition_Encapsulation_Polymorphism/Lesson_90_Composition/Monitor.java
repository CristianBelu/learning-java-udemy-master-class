package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_90_Composition;

public class Monitor {
    private String model;
    private String manufacturer;
    private int screenSize;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int screenSize, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel a " + x + ", " + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
