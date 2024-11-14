package org.example.concurrency_and_multiThreading.java_multithreading.executer_framwork;

import java.util.concurrent.*;

public class Cyclic_Barier {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int numOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numOfServices);

        CyclicBarrier barrier = new CyclicBarrier(numOfServices);
        executorService.submit(new DependentServiceBarrier(barrier));
        executorService.submit(new DependentServiceBarrier(barrier));
        executorService.submit(new DependentServiceBarrier(barrier));

        System.out.println("Main thread started ");
        barrier.reset();
        executorService.shutdown();

    }
}

class DependentServiceBarrier implements Callable<String> {

    private final CyclicBarrier barrier;

    public DependentServiceBarrier(CyclicBarrier barrier) {
        this.barrier = barrier;
    }


    @Override
    public String call() throws Exception {

        System.out.println(Thread.currentThread().getName() + " service started. ");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
        barrier.await();                      // in this Threads are waiting for all the threads and then they execution together
        return "ok";                          // main therad will not wait only barrier thread will wait
    }
}
