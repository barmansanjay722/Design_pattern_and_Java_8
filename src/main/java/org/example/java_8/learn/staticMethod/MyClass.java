package org.example.java_8.learn.staticMethod;




interface A {
    static void sayHello() {
        System.out.println("Hello");
    }
    default void saybye() {
        System.out.println("Bye ! ");
    }
}


public class MyClass implements A{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.saybye();                   // can access default method but can't access static method by object
        A.sayHello();                       // can only access interface name
    }
}
