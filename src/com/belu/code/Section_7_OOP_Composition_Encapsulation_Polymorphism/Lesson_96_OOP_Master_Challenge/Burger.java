package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_96_OOP_Master_Challenge;

public class Burger {
    private Salad salad;
    private Meat meat;
    private Bread bread;
    private Sos sos;

    public void createBurger() {
        System.out.printf("Classic Burger with: %s bread, %s meat, %s salad and %s sos, at only %.2f$%n",
                getBread().getName(), getMeat().getName(), getSalad().getName(), getSos().getName(), calculatePrice());
    }



    public double calculatePrice() {

        return salad.getSaladPrice().getPrice() + meat.getPrice().getPrice() + bread.getPrice().getPrice() + sos.getPrice().getPrice();
    }

    public Burger(Salad salad, Meat meat, Bread bread, Sos sos) {
        this.salad = salad;
        this.meat = meat;
        this.bread = bread;
        this.sos = sos;
    }


    public Salad getSalad() {
        return salad;
    }

    public Meat getMeat() {
        return meat;
    }

    public Bread getBread() {
        return bread;
    }

    public Sos getSos() {
        return sos;
    }
}
