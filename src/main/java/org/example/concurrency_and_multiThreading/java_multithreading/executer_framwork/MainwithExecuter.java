package org.example.concurrency_and_multiThreading.java_multithreading.executer_framwork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainwithExecuter {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(9);      // creating multiple thread by using ExcuterService
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {                                               // submit thread to executer service
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown();                                                      // it's necessary to shutdown excecutor
        try {
            executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total time : " + (System.currentTimeMillis() - startTime));
    }

    private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= n;
        }
        return res;
    }
}

/*There is also another Executer service which is called 'Executors.newChaedThreadPool' which is create new therad and save to cache
memory , it only valid for 60 sec and there is no validation any amount we can create cachedtreadpool and it's mainly used for short term
use*/
