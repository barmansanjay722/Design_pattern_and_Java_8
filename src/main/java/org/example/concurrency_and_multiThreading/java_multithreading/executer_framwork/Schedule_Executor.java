package org.example.concurrency_and_multiThreading.java_multithreading.executer_framwork;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule_Executor {
    public static void main(String[] args) {
        ScheduledExecutorService schedulor = Executors.newScheduledThreadPool(1);

//        schedulor.schedule(() -> System.out.println("Task executed after 5 second delay"),5, TimeUnit.SECONDS);

        schedulor.scheduleAtFixedRate(() -> System.out.println("Task executed after every5 second delay"),
                5, 5,TimeUnit.SECONDS);

        schedulor.schedule(()-> {
            System.out.println("Initiating shutdown ");
            schedulor.shutdown();
        }, 20, TimeUnit.SECONDS);


//        schedulor.shutdown();
    }
}
