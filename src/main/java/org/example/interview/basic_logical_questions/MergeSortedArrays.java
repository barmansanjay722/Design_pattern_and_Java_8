package org.example.interview.basic_logical_questions;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        int[] mergedArrya = mergeArrays(arr1,arr2);
        System.out.println(Arrays.toString(mergedArrya));
    }

    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;

        while(i < arr1.length && j< arr2.length) {
            if(arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            }
            else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}
