package org.example.design_patterns.abstruct_factory_design;

public class WebDevFactory extends EmployeeAbstruct_Factory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
