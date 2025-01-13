package org.example.java_8.learn.defaultMethod;

interface A {
    default void sayHello() {
        System.out.println("Hello");
    }
}

interface B {
    default void sayHello() {
        System.out.println("B Says Hello");
    }
}


public class Multiple_Inheritance implements A,B {
    public static void main(String[] args) {
        Multiple_Inheritance multipleInheritance = new Multiple_Inheritance();
        multipleInheritance.sayHello();
    }

    @Override
    public void sayHello() {
        A.super.sayHello();
    }
}



// in multiple inheritance multiple interface can't have same default value method, if so then one of them method need to be
// overide as in example.