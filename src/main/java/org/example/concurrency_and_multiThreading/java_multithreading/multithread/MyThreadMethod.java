package org.example.concurrency_and_multiThreading.java_multithreading.multithread;

public class MyThreadMethod extends Thread {

    public MyThreadMethod(String name) {     // this is how we can set name of a Thread
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Threed is running .....");
        for (int i = 1; i <= 100000; i++) {
            System.out.println(Thread.currentThread().getName() + "- priority: " + Thread.currentThread().getPriority() + " - count " + i);
            try {
                Thread.sleep(1000);   // sleep
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadMethod l = new MyThreadMethod("low priority Thread");
        MyThreadMethod m = new MyThreadMethod("mid priority Thread");
        MyThreadMethod h = new MyThreadMethod("high priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);   //prirority set
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();



//        t.join();    // join method is main Thread is waiting for the current Thread to finishes
        // in this case main thread is wating for finish of 't' Thread
    }
}


//start, run, sleep, join, setPriority, intrupt, yield, daemon Thread,
