package org.example.java_8.learn;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()-> 1;    // it's just supply
        System.out.println(supplier.get());


    }
}
