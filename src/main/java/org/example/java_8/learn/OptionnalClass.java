package org.example.java_8.learn;

import java.util.Optional;

public class OptionnalClass {
    public static void main(String[] args) {

        Optional<String> name = getName(1);
        if(name.isPresent()) {
            System.out.println(name.get().toUpperCase());
        }

        name.ifPresent(System.out::println);
    }

    private static Optional<String> getName(int id) {
        String name = "Ram";
        return Optional.ofNullable(name);               // ofNUllable for value can be null
    }
}
