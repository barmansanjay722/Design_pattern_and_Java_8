package org.example.interview.basic_logical_questions;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int res[] = new int[arr.length];

        int index = 0;
        for(int i=0;i<arr.length;i++) {
            if(i > 0 && arr[i-1] == arr[i]) {
                continue;
            }
            res[index++] = arr[i];
        }
        print(res);
    }

    static void print(int[] a) {
        for(int i : a) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
