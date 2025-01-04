package org.example.practice;

class Counter {
    public int count = 0;

    public void increament() {   // in this case both threads want to incraese value concurrently
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {

    private Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            counter.increament();
        }
    }
}
public class Test {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        MyThread m = new MyThread(counter);
        MyThread m1 = new MyThread(counter);
        m.start();
        m1.start();
        m.join();
        m1.join();

        System.out.println(counter.getCount());
    }
}

