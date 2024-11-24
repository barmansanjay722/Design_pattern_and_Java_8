package org.example.interview.basic_logical_questions;

public class FactorialRecursion {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }

    public static int factorial(int n) {
        if(n == 0 ) return 1;
        return n * factorial(n-1);
    }
}
