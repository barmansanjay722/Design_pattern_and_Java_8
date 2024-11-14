package org.example.concurrency_and_multiThreading.java_multithreading.executer_framwork;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

// by using Future method in ExecutorService we can hold the result or can perform any operation from the Executer service
public class MainwithExecuterExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
       /* Future<Integer> future = executorService.submit(() -> 42);
        System.out.println(future.get());
        if(future.isDone()) {
            System.out.println("Task is done !!");
        }*/


        // in this case runable is calling (runable does not return anything)
/*        Future<String> future = executorService.submit(() -> "Hello");
        System.out.println(future.get());
        executorService.shutdown();
        Future<String> submit = executorService.submit(() -> System.out.println("Hello"), "success");*/


        // callable returns something (where Runnable doesn't return anything)
       /* Callable<String> callable = () -> "Hello";
        Future<String> future1 = executorService.submit(callable);
        System.out.println(future1.get());
        executorService.shutdown();*/


        /*ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(() -> 1 + 2);
        Integer i = future.get();
        System.out.println("Sum is " + i);
        executorService.shutdown();
        Thread.sleep(1);
        System.out.println(executorService.isTerminated());*/


        // invoke all example
        ExecutorService executorService = Executors.newFixedThreadPool(3);    // this also call Thread pooling
        Callable<Integer> callable1 = () -> {
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> callable2 = () -> {
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);
//        List<Future<Integer>> futures = executorService.invokeAll(list);
//        List<Future<Integer>> futures = executorService.invokeAll(list, 1, TimeUnit.SECONDS);
//        for(Future<Integer> f : futures) {
//            System.out.println(f.get());
//        }
        Integer i = executorService.invokeAny(list);            // any one task will return value on this
        executorService.shutdown();
        System.out.println("Hello World");
    }
}


// for invokeAll main thread will wait until invoke all process is finished