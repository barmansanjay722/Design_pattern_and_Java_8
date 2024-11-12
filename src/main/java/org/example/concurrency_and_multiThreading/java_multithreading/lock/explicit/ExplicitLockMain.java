package org.example.concurrency_and_multiThreading.java_multithreading.lock.explicit;

public class ExplicitLockMain {
    public static void main(String[] args) {

        ExplicitLockBankAccount bankAccount = new ExplicitLockBankAccount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    bankAccount.withdraw(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}


// lock method -> lock, trylock, trylock(with time), unlock, deadlock, lockintruptly,