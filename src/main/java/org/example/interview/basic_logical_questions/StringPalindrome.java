package org.example.interview.basic_logical_questions;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrom(str));
    }
    public static boolean isPalindrom(String str) {
        int left = 0, right = str.length()-1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
