package org.example.design_patterns.singleton_design.breaking_singleton_pattern.deserilization;

import java.io.Serializable;

public class Samosa2 implements Serializable {


    private static Samosa2 samosa2;
    private Samosa2() {}

    // Lazy intialization (when i need i have created)
    // if only One Thread is there then it's good but if not then it's a problem
    public static Samosa2 getSamosa() {
        // object of this class

       /* if(samosa == null) {
            samosa = new Samosa();
        }*/

        // we can't use method synchronized also beacase for this, even to get object data another thread should have to wait
        // so we use synchronized block

        if(samosa2 == null) {
            synchronized (Samosa2.class) {
                if (samosa2 == null) {
                    samosa2 = new Samosa2();
                }
            }
        }
        return samosa2;
    }

    public Object readResolve() {
        return samosa2;
    }
}

/*
*  1. Constructor should be private
*
*  2. object create with the help of method.
*
*  3. create field to store object is private.
*
*
* */
