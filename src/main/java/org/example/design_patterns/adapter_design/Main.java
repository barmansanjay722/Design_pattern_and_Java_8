package org.example.design_patterns.adapter_design;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started");

//        AppleCharger appleCharger = new IphoneChargerCompany();     // suppose i do not have apple charger
        AppleCharger charger = new AdapterCharger(new AndroidChargerCompany());

        Iphone14 iphone14 = new Iphone14(charger);
        iphone14.chargeIphone();
    }
}
