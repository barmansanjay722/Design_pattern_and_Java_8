package org.example.interview.Thread;

public class Main {
    public static void main(String[] args) {
      /*  MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1);
        thread.start();*/

        /*MyThread2 myThread2 = new MyThread2();
        myThread2.start();*/


        // shortcut way to creating thread

            // by using annonymouse class
/*            Runnable at1 = new Runnable() {
                @Override
                public void run() {
                    System.out.println("this is testing thread");
                }
            };

           Thread t1 = new Thread(at1);
           t1.start();*/

            // by using lamda function
            Runnable r=() -> {
                System.out.println("this is testing thread form lamda func !!");
            };
            Thread h = new Thread(r);
            h.start();

    }
}
