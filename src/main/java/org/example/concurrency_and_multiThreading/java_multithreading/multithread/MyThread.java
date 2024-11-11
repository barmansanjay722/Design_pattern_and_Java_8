package org.example.concurrency_and_multiThreading.java_multithreading.multithread;

// Thread life cycle
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("running");
        try {
            Thread.sleep(2000);  // timed_watinng
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(100);
        System.out.println(t.getState());
        t.join();
        System.out.println(t.getState());
    }
}
