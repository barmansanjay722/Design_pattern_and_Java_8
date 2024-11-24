package org.example.interview.basic_logical_questions;

public class NumberIsPowerOfAny {
    public static void main(String[] args) {
        System.out.println(isPower(27,3));
    }

    static boolean isPower(int n, int p) {
        if (n <= 0 || p <= 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % p != 0) {
            return false;
        }
        return isPower(n / p, p);
    }
}
