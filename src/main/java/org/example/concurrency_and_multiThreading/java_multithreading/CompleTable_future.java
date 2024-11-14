package org.example.concurrency_and_multiThreading.java_multithreading;


// to handle asyncronouse programe in java introdued in java 8
// by using CompletableFuture you can achive asynchrouse task


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompleTable_future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // it is also call Daemon Thread
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (Exception e) {

            }
            return "Ok";
        });
        String s = completableFuture.get();     // now main Thread will wait
        System.out.println(s);
        System.out.println("Main");
    }
}
