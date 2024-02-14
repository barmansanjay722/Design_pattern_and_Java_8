package org.example.design_patterns.factory_design;

public class EmployeeFactory {

    // get the employee
    public static Employee getEmployee(String empType) {
        if(empType.trim().equalsIgnoreCase("Android Developer")) {
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("Backend Developer")) {
            return new BackendDeveloper();
        }
        else {
            return null;
        }
    }
}
