package org.example.concurrency_and_multiThreading.java_multithreading.executer_framwork;

import java.util.concurrent.*;

public class FutureMethods {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception occured "+e);
            }
            return 42;
        });
        future.cancel(true);
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
        executorService.shutdown();



        /*Integer i = null;
        try {
//            i = future.get();                                           // here thread wait
            i = future.get(1, TimeUnit.SECONDS);                                           // here thread wait within time
            System.out.println(future.isDone());                        // isDone method returns true or false
            System.out.println(i);
        }catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("Exception occured -> "+e);
        }
        executorService.shutdown();*/
    }
}
