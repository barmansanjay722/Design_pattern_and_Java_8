package org.example.interview.Thread;

public class MyThread1 implements Runnable{


    @Override
    public void run() {

        // thread task
        for(int i=1;i<=20;i++) {
            System.out.println("i = "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
