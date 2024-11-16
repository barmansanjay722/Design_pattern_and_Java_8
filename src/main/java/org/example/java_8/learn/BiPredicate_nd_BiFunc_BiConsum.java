package org.example.java_8.learn;

import java.util.function.*;

public class BiPredicate_nd_BiFunc_BiConsum {
    public static void main(String[] args) {
        // Bi Predicate
        Predicate<Integer> predicateThantCheckEven = x -> x % 2== 0;                            // predicate checks for only one integer (for checking even )
        predicateThantCheckEven.test(3);

        BiPredicate<Integer,Integer> biPredicate = (x,y) -> x % 2==0 && y % 2 ==0;        // bi predicate checks for two value (for checking even )
        biPredicate.test(3,2);

        System.out.println("-------------------");

        // Bi Function
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Sanjay"));

        BiFunction<String, String, Integer> biFunction = (x,y) -> x.length() + y.length();
        System.out.println(biFunction.apply("Hi","Hello"));

        System.out.println("-------------");

        // Counsumer
        Consumer<Integer> consumer = (x) -> {
            System.out.println(x);
        };
        consumer.accept(23);


        BiConsumer<Integer,Integer> biConsumer = (x,y) -> {
            System.out.println(x+y);
        };
        biConsumer.accept(1,3);


        System.out.println("------------");

        // Supplier (there is no BiSupplier ( beacause any function can only return one value)
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());
    }
}
