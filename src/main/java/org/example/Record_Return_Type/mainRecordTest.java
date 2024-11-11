package org.example.Record_Return_Type;

public class mainRecordTest {
    public static void main(String[] args) {

        Employee employee = new Employee(1,"Sanjay", "Barman");

        System.out.println(employee.fistName());
        System.out.println(employee.lastName());
        System.out.println(employee.nameSignature());
        System.out.println(employee);
    }
}
