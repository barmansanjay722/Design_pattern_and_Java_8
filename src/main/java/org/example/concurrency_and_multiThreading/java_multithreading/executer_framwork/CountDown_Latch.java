package org.example.concurrency_and_multiThreading.java_multithreading.executer_framwork;

import java.util.concurrent.*;

public class CountDown_Latch {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
      /*  ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> future1 = executorService.submit(new DependentService());
        Future<String> future2 = executorService.submit(new DependentService());
        Future<String> future3 = executorService.submit(new DependentService());

        future1.get();
        future2.get();
        future3.get();

        System.out.println("All dependent service finished. Starting main service ...");
        executorService.shutdown();*/

        // now CountDownLatch way
        int numOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numOfServices);

        CountDownLatch latch = new CountDownLatch(numOfServices);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();

        System.out.println("Main thread started ");
        executorService.shutdown();

    }
}

class DependentService implements Callable<String> {

   /* @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" service started. ");
        Thread.sleep(2000);
        return "ok";
    }*/


    // now countDownLatch way
    private final CountDownLatch latch;

    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }


    @Override
    public String call() throws Exception {

        try {
            System.out.println(Thread.currentThread().getName()+" service started. ");
            Thread.sleep(2000);
        }finally {
            latch.countDown();
        }
        return "ok";
    }
}

// we use countdownLatch when we want to wait 1 or more then 1 Thread to wait for finish the task
