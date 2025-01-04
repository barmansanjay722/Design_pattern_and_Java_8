package org.example.concurrency_and_multiThreading.java_multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {

    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();

    private final Lock writeLock = lock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            count++;
        }finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        }finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    System.out.println(Thread.currentThread().getName()+ " read "+ counter.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName()+ " increment");
                }
            }
        };


        Thread writeThread = new Thread(writeTask);
        Thread readThread = new Thread(readTask);
        Thread readThread1 = new Thread(readTask);

        writeThread.start();
        readThread.start();
        readThread1.start();

        writeThread.join();
        readThread1.join();
        readThread1.join();


        System.out.println("Final count "+counter.getCount());
    }

}


// ReadWriteLock alows multiple threads to read resources concurrently, as long
// as restricting write access to a single thread at a time.


