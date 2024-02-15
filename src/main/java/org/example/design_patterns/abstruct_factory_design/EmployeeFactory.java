package org.example.design_patterns.abstruct_factory_design;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstruct_Factory employeeAbstructFactory) {
        return employeeAbstructFactory.createEmployee();
    }
}
