package org.example.interview.volatile_and_atomic.volatileEx;

class SharObj {
//    private boolean flag = false;
    private volatile boolean flag = false;

    public void setFlagTru() {
        System.out.println("Writer Flag is ture now");
        flag = true;
    }

    public void printFlag() {
        while (!flag) {
            //
        }
        System.out.println("Flag is true");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharObj sharObj = new SharObj();

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharObj.setFlagTru();
        });

        Thread t2 = new Thread(() -> sharObj.printFlag());

        t1.start();
        t2.start();
    }
}



// volatile work as a simple flag wise (just if you want to check something then use)
// for more complex things volatile can't handle