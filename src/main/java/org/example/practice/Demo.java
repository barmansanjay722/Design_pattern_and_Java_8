package org.example.practice;

public class Demo {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3};

        System.out.println(hasDuplicate(nums));
    }

    private static void sortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }


    public static boolean hasDuplicate(int[] nums) {
        sortArray(nums);
        boolean res = false;
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1] == nums[i]) {
                res = true;
            }
        }
        return res;
    }
}
