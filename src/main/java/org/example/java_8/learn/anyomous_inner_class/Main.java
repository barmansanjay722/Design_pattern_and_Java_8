package org.example.java_8.learn.anyomous_inner_class;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "1000";
            }

            @Override
            public String getDesignation() {
                return "Software Enginer";
            }
        };

        System.out.println(employee.getSalary());
    }
}


// lambda use for single abstract method while annomouse inner class use for more then 2 inner class,
