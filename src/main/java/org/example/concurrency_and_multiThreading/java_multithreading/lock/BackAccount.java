package org.example.concurrency_and_multiThreading.java_multithreading.lock;

public class BackAccount {

    private int balance = 100;

    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrwal");
            Thread.sleep(3000);
            balance = -amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrwal. Remaining balance is " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }

    }
}
