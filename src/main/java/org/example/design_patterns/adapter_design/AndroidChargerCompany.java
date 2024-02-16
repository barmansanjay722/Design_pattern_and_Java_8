package org.example.design_patterns.adapter_design;

public class AndroidChargerCompany implements AndroidCharger{
    @Override
    public void chargeAndroid() {
        System.out.println("Android phone is charging");
    }
}
