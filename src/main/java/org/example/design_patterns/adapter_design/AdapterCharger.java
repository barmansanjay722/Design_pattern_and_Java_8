package org.example.design_patterns.adapter_design;

public class AdapterCharger implements AppleCharger{

    private AndroidCharger androidCharger;

    public AdapterCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeIPhone() {
        androidCharger.chargeAndroid();
        System.out.println("Your phone is charging with adapter");
    }
}
