package org.example.design_patterns.adapter_design;

public class Iphone14 {

    public Iphone14(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    private AppleCharger appleCharger;
    public void chargeIphone() {
        appleCharger.chargeIPhone();
    }
}
