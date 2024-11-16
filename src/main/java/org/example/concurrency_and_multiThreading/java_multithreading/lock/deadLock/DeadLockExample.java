package org.example.concurrency_and_multiThreading.java_multithreading.lock.deadLock;

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName()+ "is using pen "+this + "and tyring to use paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen "+this);
    }
}

class Paper {
    public synchronized void writeWithPenAndPaper(Pen pen) {
        System.out.println(Thread.currentThread().getName()+ "is using pen "+this + "and tyring to use pen");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen "+this);
    }
}

class Task1 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper); // thread1 locks pen and trying lock paper
    }
}


class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
      /*  synchronized (pen) {                              // this is how we can stop deadlock ( here fistly geting pen by using synchronized )
            paper.writeWithPenAndPaper(pen);
        }*/
        paper.writeWithPenAndPaper(pen); // thread2 locks paper and trying lock pen
    }
}

public class DeadLockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen,paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen,paper), "Thread-2");
        thread1.start();
        thread2.start();
    }
}