package org.example.interview.basic_logical_questions;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        int n = 6;   // total num count
        int expedtedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int num : arr) {
            actualSum += num;
        }

        System.out.println((expedtedSum - actualSum));
    }
}
