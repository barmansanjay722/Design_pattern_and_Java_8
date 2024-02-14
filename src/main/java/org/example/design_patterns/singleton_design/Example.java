package org.example.design_patterns.singleton_design;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) {

        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());

        // here both hashcode is same

        Jalebi jalebi = Jalebi.getJalebi();
        System.out.println(jalebi.hashCode());

        Jalebi jalebi1 = Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());

    }
}
