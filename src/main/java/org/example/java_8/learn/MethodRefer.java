package org.example.java_8.learn;

import java.util.Arrays;
import java.util.List;

public class MethodRefer {

    public void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        MethodRefer test = new MethodRefer();
        List<String> students = Arrays.asList("Alice","Bob","charlie");
//        students.forEach(s -> System.out.println(s));
        students.forEach(test::print);

        System.out.println("----------------------");


        // constructor reference
        List<String> names = Arrays.asList("Sanjay", "Shivani", "Rahul");
//        List<Student> students1 = names.stream().map(x -> new Student("Sanjay")).toList();
        List<Student> students1 = names.stream().map(Student::new).toList();
    }
}

// we can use method reference instead of lamda expression

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}








