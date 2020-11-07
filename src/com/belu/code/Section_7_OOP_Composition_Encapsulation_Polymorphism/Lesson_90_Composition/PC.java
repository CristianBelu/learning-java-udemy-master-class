package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_90_Composition;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt(1200,50,"Yellow");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}
