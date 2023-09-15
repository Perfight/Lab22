package com.company;

public class Main {

    public static void main(String[] args) {
        Voltage voltage = new Voltage();
        PhoneCharger phoneCharger = new PhoneCharger();
        com.company.Charger adapter = new com.company.Adapter(voltage);

        adapter.charger(phoneCharger);
    }
}
