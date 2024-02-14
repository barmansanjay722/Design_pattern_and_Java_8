package org.example.design_patterns.factory_design;

public class BackendDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting backend developer salary ");
        return 70000;
    }
}
