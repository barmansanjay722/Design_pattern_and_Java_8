package org.example.concurrency_and_multiThreading.java_multithreading;

public class Main  {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {
            System.out.println("Hello Sanjay print "+i+" time.");
        }
        System.out.println("Hello Sanjay print complete.");
    }
}