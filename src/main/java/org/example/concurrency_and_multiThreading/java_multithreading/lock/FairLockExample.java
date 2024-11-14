package org.example.concurrency_and_multiThreading.java_multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {

    private final Lock lock = new ReentrantLock(true);

    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquire the lock ");
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName() + " release the lock");
        }
    }
}

// fairness true means every thread will get chance to perform (even when any thread take to much time to execute)

// synchronized diadvantage
    /* don't have fairness,
    there is no blocking,
    there is no interruptiblity,
    no idea about read/write locking */
