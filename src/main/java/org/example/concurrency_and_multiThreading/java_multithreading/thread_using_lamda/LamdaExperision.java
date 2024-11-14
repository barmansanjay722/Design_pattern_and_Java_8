package org.example.concurrency_and_multiThreading.java_multithreading.thread_using_lamda;

public class LamdaExperision {
    public static void main(String[] args) {

        // basic way
       /* Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };*/

        // lamdafunction
    /*    Runnable task1 = ()-> {
            System.out.println("Hello from lamda");
        };*/

        // more preciouse way
        Thread t1 = new Thread(() -> {

        });
        t1.start();
    }
}
