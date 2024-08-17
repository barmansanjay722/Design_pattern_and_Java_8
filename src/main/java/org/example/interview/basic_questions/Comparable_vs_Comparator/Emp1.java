package org.example.interview.basic_questions.Comparable_vs_Comparator;

public class Emp1 implements Comparable<Emp1>{

    private String name;
    private String phone;
    private int empId;


    @Override
    public int compareTo(Emp1 o) {
        return this.empId - o.empId;
    }

    public Emp1(String name, String phone, int empId) {
        this.empId = empId;
        this.phone = phone;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId=" + empId +
                '}';
    }


}
