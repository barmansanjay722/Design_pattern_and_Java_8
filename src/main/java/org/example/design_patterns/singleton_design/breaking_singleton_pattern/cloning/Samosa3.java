package org.example.design_patterns.singleton_design.breaking_singleton_pattern.cloning;

public class Samosa3 {


    private static Samosa3 samosa3;
    private Samosa3() {}

    // Lazy intialization (when i need i have created)
    // if only One Thread is there then it's good but if not then it's a problem
    public static Samosa3 getSamosa() {
        // object of this class

       /* if(samosa == null) {
            samosa = new Samosa();
        }*/

        // we can't use method synchronized also beacase for this, even to get object data another thread should have to wait
        // so we use synchronized block

        if(samosa3 == null) {
            synchronized (Samosa3.class) {
                if (samosa3 == null) {
                    samosa3 = new Samosa3();
                }
            }
        }
        return samosa3;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return samosa3;
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
