package org.example.interview.basic_logical_questions;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 16;

        if((num & (num -1)) == 0 && num > 0) {
            System.out.println(num + " is power of 2");
        }else {
            System.out.println(num + " is not power of 2");
        }
    }
}
