package org.example.concurrency_and_multiThreading.java_multithreading.multithread;

public class MyThreadMethodSecond extends Thread{

    @Override
    public void run() {
        for (int i=0;i<5;i++) {
     /*       try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread intruppted successfully "+e);
            }*/
            System.out.println("Thread is running "+i);
            Thread.yield();      // this method give hint to main Thread that you can give change to another Threads
        }
    }

    public static void main(String[] args) {
        MyThreadMethodSecond t = new MyThreadMethodSecond();   // here t is user Thread (user Thread is basically by which we use to work)
        MyThreadMethodSecond t1 = new MyThreadMethodSecond();   // here t1 is user Thread
        t1.setDaemon(true);
        t.start();
        System.out.println("first Thread done");
        t1.start();
//        t.interrupt();              // this method intruppt it's current state/first (in this example intrupt the sleep state)
    }
}



// DAEMON THREADS
 /* daemon thread is working on background */