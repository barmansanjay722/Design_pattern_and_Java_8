package org.example.java_8.learn.lamda_expression.thread_lamda;

public class MyClass {
    public static void main(String[] args) {
        Runnable runnable = ()-> {
            for (int i=0;i<10;i++) {
                System.out.println("Hello "+i);
            }
        };
        Thread thread = new Thread(runnable);
//        thread.run();
        thread.start();
    }
}
