package org.example.interview.basic_logical_questions;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 10, b = 20;

        // by using temp variable
       /* int temp = a;
        a = b;
        b = temp;*/


        // by using operator only
     /*   a = a + b;
        b = a - b;
        a = a - b;*/

        // by suing XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println("a value -> "+a);
        System.out.println("b value -> "+b);
    }
}
