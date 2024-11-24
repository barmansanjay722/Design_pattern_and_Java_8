package org.example.interview.basic_logical_questions;

public class SwapString {
    public static void main(String[] args) {
        String a = "Hello", b = "World";

        System.out.println("before swap "+a+" "+b);
        a = a + b;
        b = a.substring(0,a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("after swap "+a+" "+b);
    }
}
