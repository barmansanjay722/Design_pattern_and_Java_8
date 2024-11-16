package org.example.java_8.learn;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryAndBinary {
    public static void main(String[] args) {
        // Unary
        Function<Integer,Integer> function = x -> x * x;   // can use this as Unary
        Function<String, Integer> function1 =  str -> str.length();
        Function<String,String> function2 = str -> str.toUpperCase();   // can use unary

        // we use unary when input and output is name data type
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(2));

        UnaryOperator<String> unaryOperator1 = str -> str.toUpperCase();
        System.out.println(unaryOperator1.apply("Sanjay"));


        // Binary is same also but it's use for function
        BiFunction<String,String,String> biFunction = (str1, str2) -> str1 + str2;
        System.out.println(biFunction.apply("Sanjay"," Shivani Bist"));


        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("Sanjay"," Shivani Bist"));

    }
}
