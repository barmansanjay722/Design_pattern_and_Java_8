package org.example.interview.Serialization;

import java.io.Serializable;

public class Student implements Serializable {

    // what is Serializable interface ?
    // it's a marker interface which mark either the object is serilizable or not;

    private String name;
    private String email;
    private int age;
    transient private String address;

    public Student() {}

    public Student(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayName() {
        System.out.println("Hi my name is Sanjay");
    }
}
