package org.example.java_8.learn.lamda_expression;

public class Main {
    public static void main(String[] args) {
 /*       Employee employee = new SoftwareEngineer();
        System.out.println(employee.getName());*/

        // above code in lamda expression
        Employee employee1 = ()-> "Software Engineer";
        System.out.println(employee1.getName());
    }
}
