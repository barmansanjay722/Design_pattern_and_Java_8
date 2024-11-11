package org.example.concurrency_and_multiThreading.java_multithreading.multithread;

// by implement Runnable interface
public class Sanjay implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Sanjay");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
