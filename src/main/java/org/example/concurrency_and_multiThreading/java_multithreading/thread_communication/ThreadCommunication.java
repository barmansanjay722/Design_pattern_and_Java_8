package org.example.concurrency_and_multiThreading.java_multithreading.thread_communication;


        // Thread Communication
/*Thread communication is basically communication between thread when one thread is working at that time other thread is "wait" and
            after completing the task the working thread "notify" to jvm that thread work is complete*/

class SharedResource {

    private int data;
    private boolean hasData;

    public synchronized void produce(int value) {              // wait and notify are not synchronized so here add synchronized
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Comsumed: "+ data);
        notify();
        return data;
    }
}


class Producer implements Runnable {

    private SharedResource resource;

    public Producer(SharedResource sharedResource) {
        this.resource = sharedResource;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {

    private SharedResource resource;

    public Consumer(SharedResource sharedResource) {
        this.resource = sharedResource;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            int value = resource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread produceThread = new Thread(new Producer(sharedResource));
        Thread consumeThread = new Thread(new Consumer(sharedResource));

        produceThread.start();
        consumeThread.start();
    }
}
