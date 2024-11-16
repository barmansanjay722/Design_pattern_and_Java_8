package org.example.java_8.learn;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String,String> function = s -> s.toUpperCase();              // one function and then another function
        Function<String,String> function1 = s -> s.substring(0,3);

        Function<String,String> stringStringFunction = function.andThen(function1);
        System.out.println(stringStringFunction.apply("Sanjay"));

        System.out.println("---------------");

        Function<Object, Object> identity = Function.identity();                    // same input and output is identity
        System.out.println(identity.apply("Sanjay"));
    }
}
