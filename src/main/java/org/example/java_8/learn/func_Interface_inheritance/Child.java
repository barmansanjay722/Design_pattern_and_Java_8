package org.example.java_8.learn.func_Interface_inheritance;

@FunctionalInterface
public interface Child extends Parent{
    public void sayHello();

//    public void sayData();

    default void sayBye(){};
}


// if child interface extends Parent  interface and it's empty then it's and functional interface
// if child inteface have same method as in parent then it's also a functional interface
// if child have another method then it's not a functinal interface (ex -> sayData())
// default and static method is allow offcourse
