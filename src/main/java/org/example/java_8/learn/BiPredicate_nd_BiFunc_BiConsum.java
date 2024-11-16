package org.example.java_8.learn;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

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

        System.out.println("---------------------");

        Integer value = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .distinct()
                .max((a, b) -> a - b).get();

        System.out.println(value);



        long count = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .distinct()
                .count();

        System.out.println("------------------");

        // parallerStream (paraller stream stream works divide list into chunks and multi threads (it's uses in very big list)
        List<Integer> list = Arrays.asList(1,4,5,7,7,74,43);
        Integer i = list.parallelStream().max((a, b) -> a - b).get();
        System.out.println(i);
    }
}
