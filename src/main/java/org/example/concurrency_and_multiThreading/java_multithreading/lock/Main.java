package org.example.concurrency_and_multiThreading.java_multithreading.lock;

public class Main {
    public static void main(String[] args) {

  /*        BackAccount backAccount = new BackAccount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    backAccount.withdraw(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

      Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();*/


        FairLockExample fairLockExample = new FairLockExample();
        Runnable taskUnfair = new Runnable() {
            @Override
            public void run() {
                fairLockExample.accessResource();
            }
        };

        Thread thread = new Thread(taskUnfair, "Thread 1");
        Thread thread1 = new Thread(taskUnfair, "Thread 2");
        Thread thread2 = new Thread(taskUnfair, "Thread 3");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
