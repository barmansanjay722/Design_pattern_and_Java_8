package org.example.design_patterns.singleton_design;

public class Samosa {


    private static Samosa samosa;
    private Samosa() {}

    // Lazy intialization (when i need i have created)
    // if only One Thread is there then it's good but if not then it's a problem
    public static Samosa getSamosa() {
        // object of this class

       /* if(samosa == null) {
            samosa = new Samosa();
        }*/

        // we can't use method synchronized also beacase for this, even to get object data another thread should have to wait
        // so we use synchronized block

        if(samosa == null) {
            synchronized (Samosa.class) {
                if (samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
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
