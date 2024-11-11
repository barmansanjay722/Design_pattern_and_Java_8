package org.example.concurrency_and_multiThreading.java_multithreading.multithread;

public class Test {
    public static void main(String[] args) {

        /*World world = new World();    // new thread is created
        world.start();*/                   // runnable

        Sanjay sanjay = new Sanjay();
        Thread t = new Thread(sanjay);
        t.start();

        for(int i=0;i<10;i++) {
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
