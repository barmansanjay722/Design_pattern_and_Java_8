package org.example.java_8.learn.lamda_expression;

public class Variabales {
    int a = 2;
    private static void doSomething() {
        int a = 4;                                              // a value can be overridden when it's a instance value
        Employee employee = () -> {
            int x = 10;                                         // local value
            return "100";
        };

        Employee employee1 = new Employee() {
            int x = 10;                                         // instance variable
            @Override
            public String getName() {
                return "100";
            }
        };
    }
}
