package com.company;

public class Adapter implements Charger{
    Voltage voltage;

    public Adapter(Voltage voltage) {
        this.voltage = voltage;
    }

    @Override
    public void charger(PhoneCharger phoneCharger) {
        voltage.connect();
        System.out.println("Напряжение в 380V преобразуется в 220V");
        phoneCharger.charger();
    }
}
