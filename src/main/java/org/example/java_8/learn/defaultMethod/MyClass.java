package org.example.java_8.learn.defaultMethod;

interface Parent {
     default void sayHello(){
        System.out.println("Hello");
    }
}

class Child implements Parent {

}

public class MyClass {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
    }
}

// can use default method without making implementation in child class bcz it have it's implementation in parent class
// we can also override the method
