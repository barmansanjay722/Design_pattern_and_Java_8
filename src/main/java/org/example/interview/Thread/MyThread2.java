package org.example.interview.Thread;

public class MyThread2 extends Thread{

    public void run() {
        for(int i=1;i<5;i++) {
            System.out.println(i * 5);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
