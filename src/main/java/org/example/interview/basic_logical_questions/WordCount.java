package org.example.interview.basic_logical_questions;

public class WordCount {
    public static void main(String[] args) {
        String s = "Hi Sanjay how are you, i hope you look good, be happy!";
        System.out.println(countWords(s));
    }
    public static int countWords(String str) {
        if(str == null || str.isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
