package org.example.design_patterns.singleton_design.breaking_singleton_pattern.reflection_API;

import java.lang.reflect.Constructor;

public class Example1 {
    public static void main(String[] args) throws Exception{
        /*
         * ways to break singletone design pattern
         * --> 1. Reflection API to break singleton pattern
         *           solution -> 1. if object is there throw exception from inside constructor
         *                       2. user enum
         *
         * --> 2.*/

        // Reflection Api to break singleton pattern
        Samosa1 s1 = Samosa1.getSamosa();
        System.out.println(s1.hashCode());

        Constructor<Samosa1> constructor = Samosa1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa1 s2 = constructor.newInstance();
        System.out.println(s2.hashCode());
    }
}
