package org.example.design_patterns.abstruct_factory_design;

public class Manager implements Employee{
    @Override
    public int salary() {
        return 150000;
    }

    @Override
    public String name() {
        System.out.println("I am a manager");
        return "MANAGER";
    }
}
