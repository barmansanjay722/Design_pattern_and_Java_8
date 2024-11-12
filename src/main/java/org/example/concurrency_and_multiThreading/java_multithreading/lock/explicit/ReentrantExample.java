package org.example.concurrency_and_multiThreading.java_multithreading.lock.explicit;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Outer Method");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner Method");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample reentrantExample = new ReentrantExample();
        reentrantExample.outerMethod();
    }
}


// Dead Lock
    /*in this we can se innerMethod and outerMethod both are dependent (or have dependency from other) so it's call
    Thread deadlock, to prevent from this issue java have introduced ReentrantLock()*/
