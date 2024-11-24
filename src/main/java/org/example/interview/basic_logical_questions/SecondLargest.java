package org.example.interview.basic_logical_questions;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {3,4,6,3,7,2};

        // second largest
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length - 2]);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);
    }
}
