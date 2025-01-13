package org.example;

public class Hello {
    public static void main(String[] args) {
        Greeting greet = (message) -> System.out.print("Hello " +message);
        greet.demomessage("Shivani Bist");
    }
}


@FunctionalInterface
interface Greeting {
    void demomessage(String message);
}

