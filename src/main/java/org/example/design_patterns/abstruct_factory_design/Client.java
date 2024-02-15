package org.example.design_patterns.abstruct_factory_design;

public class Client {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
        employee.name();

        Employee employee1 = EmployeeFactory.getEmployee(new WebDevFactory());
        employee1.name();

        Employee employee2 = EmployeeFactory.getEmployee(new ManagerFactory());
        employee2.name();
    }
}
