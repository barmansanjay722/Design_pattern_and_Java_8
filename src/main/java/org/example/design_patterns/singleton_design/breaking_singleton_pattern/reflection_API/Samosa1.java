package org.example.design_patterns.singleton_design.breaking_singleton_pattern.reflection_API;

import org.example.design_patterns.singleton_design.Samosa;

public class Samosa1 {

    private static Samosa1 samosa;

    // construtor
    // for breaking the pattern safe option is
    private Samosa1() {
        if(samosa != null) {
            throw new RuntimeException("Your are trying to break singlton pattern");
        }
    }

    // Lazy intialization (when i need i have created)
    // if only One Thread is there then it's good but if not then it's a problem
    public static Samosa1 getSamosa() {
        // object of this class

       /* if(samosa == null) {
            samosa = new Samosa();
        }*/

        // we can't use method synchronized also beacase for this, even to get object data another thread should have to wait
        // so we use synchronized block

        if(samosa == null) {
            synchronized (Samosa.class) {
                if (samosa == null) {
                    samosa = new Samosa1();
                }
            }
        }
        return samosa;
    }


    // if we use enum then no need constructor erc
}
