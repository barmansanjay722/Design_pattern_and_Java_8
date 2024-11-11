package org.example.concurrency_and_multiThreading.java_multithreading.multithread;


// by extending Thread
public class World extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
