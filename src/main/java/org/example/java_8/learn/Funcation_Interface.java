package org.example.java_8.learn;

// example of functional interface

@FunctionalInterface
public interface Funcation_Interface {

    public void sayHello();

    default void sayBye(){};                // default method allowed in functional interface

    public static void sayaOk() {};         // static method allowed in funcational interface
}

// in funcational interface default and static method can have as much as can. but shold have one abstract method.