package org.example.java_8.learn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s);    // it's only consume,
        consumer.accept("Sanjay");


        Consumer<List<Integer>> listConsumer = li -> {
            for(Integer i : li) {
                System.out.println(i * 100);
            }
        };

        listConsumer.accept(Arrays.asList(1,2,3,4));

    }
}
