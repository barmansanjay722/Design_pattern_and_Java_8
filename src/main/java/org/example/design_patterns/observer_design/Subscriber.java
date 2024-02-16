package org.example.design_patterns.observer_design;

public class Subscriber implements Observer{

    String name;

    Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified(String msg) {
        System.out.println("Hello :"+name+" New video uploaded : "+msg);
    }
}
