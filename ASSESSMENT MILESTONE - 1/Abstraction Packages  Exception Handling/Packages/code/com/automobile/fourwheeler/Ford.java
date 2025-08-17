package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Ford extends Vehicle {
    private String modelName, regNumber, ownerName;
    private int speed;
    public Ford(String model, String reg, String owner, int speed) {
        this.modelName = model;
        this.regNumber = reg;
        this.ownerName = owner;
        this.speed = speed;
    }
    public String getModelName() { return modelName; }
    public String getRegistrationNumber() { return regNumber; }
    public String getOwnerName() { return ownerName; }
    public int speed() { return speed; }
    public void tempControl() { System.out.println("Temperature Control is ON in Ford"); }
}
