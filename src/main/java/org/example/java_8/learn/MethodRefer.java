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
    }
}


