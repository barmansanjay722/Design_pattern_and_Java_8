package org.example.practice;

class Husband {
    String name = "Sanjay Barman";
}

class Wife extends Husband {
    String name = "Shivani Bist";

    void display() {
        System.out.println("Husband name is "+super.name);
        System.out.println("Wife name is "+name);
        System.out.println(name +" + "+ super.name);
    }
}

public class SuperCheck {
    public static void main(String[] args) {
        Wife wife = new Wife();
        wife.display();
    }
}
