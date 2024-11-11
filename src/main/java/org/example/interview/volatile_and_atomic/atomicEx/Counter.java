package org.example.interview.volatile_and_atomic.atomicEx;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

//    private int counter = 0;
//    private volatile int counter = 0;  // volatile will do nothing


    // we will use AtomicInteger for isolate process in thread  (it is thread safe)
    private AtomicInteger counter = new AtomicInteger(0);


    public void increment() {                   // we can merge those thread by useing synchrosed keyword also
//        counter++;
        counter.incrementAndGet();
    }

    public int getCounter() {

//        return counter;
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=0;i<1000;i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++) {
                c.increment();
            }
        });

        t1.start();;
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.getCounter());
    }
}


// in this case both thread are incramenting value but in this case volatile doesn't do anything,
// (if we want to know state name or city name this kind of example volitle will do )