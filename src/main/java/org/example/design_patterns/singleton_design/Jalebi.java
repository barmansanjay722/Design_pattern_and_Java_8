package org.example.design_patterns.singleton_design;

public class Jalebi {

    // Eager way of creating singleton object (Eager means static variable initilize first)
    // proble with this is if there is no usage but also it will crate object it will make system slow
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi() {
        return jalebi;
    }
}
