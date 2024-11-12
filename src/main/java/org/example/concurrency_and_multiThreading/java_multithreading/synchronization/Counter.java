package org.example.concurrency_and_multiThreading.java_multithreading.synchronization;

public class Counter {

    private int count = 0;

    public synchronized void increment() {
        count++;                                                                // critical condition (bcz multiple thread using it)
    }

    public int getCount() {
        return count;
    }
}

// synchronized alows only one thread at one time.
// when multiple thread shared one thing and they don't (this is called race condition )


