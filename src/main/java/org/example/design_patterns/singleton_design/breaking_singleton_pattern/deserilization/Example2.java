package org.example.design_patterns.singleton_design.breaking_singleton_pattern.deserilization;

import org.example.design_patterns.singleton_design.Jalebi;

import java.io.*;

public class Example2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

/*        Samosa2 samosa2 = Samosa2.getSamosa();
        System.out.println(samosa2.hashCode());

        Samosa2 samosa21 = Samosa2.getSamosa();
        System.out.println(samosa21.hashCode());

        // here both hashcode is same

        Jalebi jalebi = Jalebi.getJalebi();
        System.out.println(jalebi.hashCode());

        Jalebi jalebi1 = Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());*/



        /*
         * ways to break singletone design pattern
         * --> 1. Reflection API to break singleton pattern
         *           solution -> 1. if object is there throw exception from inside constructor
         *                       2. user enum
         *
         * --> 2. Deserilization*/

        //serelization
        Samosa2 samosa2 = Samosa2.getSamosa();
        System.out.println(samosa2.hashCode());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        objectOutputStream.writeObject(samosa2);

        System.out.println("serilization done");

        //deseelization
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa2 s2 = (Samosa2) obj.readObject();
        System.out.println(s2.hashCode());

    }
}
