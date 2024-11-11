package org.example.interview.sueper_keyword;

class Animal {
    String color = "White";
}

class Dog extends Animal{

    String color = "Black";

    void printColor() {
        System.out.println(color);
        System.out.println(super.color); // super keyword in Java is a reference variable
                                            // which is used to refer immediate parent class object
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
