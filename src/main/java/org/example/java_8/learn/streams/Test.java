package org.example.java_8.learn.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        // imparative approach
        int[] array = {1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<array.length;i++) {
            if(array[i] % 2 == 0) {
                sum += array[i];
            }
        }
//        System.out.println(sum);

        // stream
        int sum2 = Arrays.stream(array).filter(n -> n % 2 == 0).sum();
//        System.out.println(sum2);


        // how to create stream
        List<String> list = Arrays.asList("Sanjay","banana","software");
        Stream<String> stream = list.stream();

        String[] strings = {"apple","banana","cherry"};
        Stream<String> stream1 = Arrays.stream(strings);

        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);

        Stream<String> limit1 = Stream.generate(() -> "hello").limit(5);



        // filter in stream
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,434,56,23,323,4443,3423);
        List<Integer> filteredlist = list1.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(filteredlist);
        List<Integer> list2 = filteredlist.stream().map(x -> x / 2).toList();
        System.out.println(list2);

        List<Integer> filteredlist1 = list1.stream()
                .filter(n -> n % 2 == 0)
                .map(x -> x /2)             // map is a function means will take something in input and return something
                .distinct()     // only unique value can be in result list
                .sorted((a,b) -> (b-a))    // sorting
                .limit(2)   // add limit in the result list
                .skip(1)    // skip from the frist side in the result list
                .toList();
        System.out.println(filteredlist1);
    }
}
