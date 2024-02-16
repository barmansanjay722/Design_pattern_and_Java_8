package org.example.design_patterns.adapter_design;

public class IphoneChargerCompany implements AppleCharger{
    @Override
    public void chargeIPhone() {
        System.out.println("iphone is charging");
    }
}
