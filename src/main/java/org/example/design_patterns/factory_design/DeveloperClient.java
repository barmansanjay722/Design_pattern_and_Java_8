package org.example.design_patterns.factory_design;

public class DeveloperClient {

    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Backend Developer");
        System.out.println(employee.salary());

        Employee employee1 = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(employee1.salary());
    }
}
