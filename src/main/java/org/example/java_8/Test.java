package org.example.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println(max.get().intValue());
    }
}
