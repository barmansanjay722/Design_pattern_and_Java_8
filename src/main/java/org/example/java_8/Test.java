package org.example.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // even number only
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        // sum of Square
        int sumOfSquare = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();

        // filter and upperCase
        List<String> words = Arrays.asList("Java", "Python", "C", "JavaScript");
        words.stream().filter(s -> s.length() > 3).map(String::toUpperCase).forEach(System.out::println);

        //  average of squares of all odd numbers
        double avarageOfSqueare = numbers.stream().filter(n -> n % 2 != 0).mapToDouble(n -> Math.pow(n, 2)).average().orElse(0.0);


        // Maximum length
        int maxLength = words.stream().mapToInt(String::length).max().orElse(0);

        // 6 Combine list and remove duplicate
        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = Arrays.asList("banana", "grape", "kiwi");
        List<String> combineedAndDistinct = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());

        // 7 Find fist Three square
        List<Integer> numbersSquare = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> fistThreeSquare = numbersSquare.stream().filter(n -> n % 2 == 0).map(n -> n * n).limit(3).collect(Collectors.toList());

        // 8 Factorial
        int number = 5;
        long factorial = LongStream.rangeClosed(1, number).reduce(1, (x, y) -> x * y);

        // 9 prime NUmber
        List<Integer> primeNumbers = numbers.stream().filter(n -> n > 1 && java.util.stream.IntStream.range(2, (int) (Math.sqrt(n) + 1)).noneMatch(i -> n % i == 0)).collect(Collectors.toList());

        // 10 upperCase in list
        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());

        // 11 summing numbers
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        // 12 find max element
        Integer max = numbers.stream().max(Integer::compareTo).orElse(null);

        // 13 concating String
        String result = words.stream().collect(Collectors.joining());

        // 14 if matching any condition
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);

        // 15 remove duplicates
        List<String> unique = words.stream().distinct().collect(Collectors.toList());

        // 16 Counting element
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "banana", "date");
        long count = fruits.stream().filter(fruit -> fruit.equals("banana")).count();


        //17 find max value from list
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);

        //18 reverse a single string from list
        String reverseStringValue = "hello";
        Function<String, String> reverser = str -> new StringBuilder(str).reverse().toString();
        String reverseString = reverser.apply(reverseStringValue);


        System.out.println(count);

    }
}
