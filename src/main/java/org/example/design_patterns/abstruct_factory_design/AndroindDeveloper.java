package org.example.design_patterns.abstruct_factory_design;

public class AndroindDeveloper implements Employee{
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("I am andriod Developer");
        return "ANDROID DEVELOPER";
    }
}
