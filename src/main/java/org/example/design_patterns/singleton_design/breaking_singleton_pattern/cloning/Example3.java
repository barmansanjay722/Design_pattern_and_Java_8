package org.example.design_patterns.singleton_design.breaking_singleton_pattern.cloning;


public class Example3 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Samosa3 samosa3 = Samosa3.getSamosa();
        System.out.println(samosa3.hashCode());

        Samosa3 samosa31 = (Samosa3) samosa3.clone();
        System.out.println(samosa31.hashCode());
    }
}
