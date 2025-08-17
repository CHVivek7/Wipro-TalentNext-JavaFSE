package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Logan extends Vehicle {
    private String modelName, regNumber, ownerName;
    private int speed;
    public Logan(String model, String reg, String owner, int speed) {
        this.modelName = model;
        this.regNumber = reg;
        this.ownerName = owner;
        this.speed = speed;
    }
    public String getModelName() { return modelName; }
    public String getRegistrationNumber() { return regNumber; }
    public String getOwnerName() { return ownerName; }
    public int speed() { return speed; }
    public void gps() { System.out.println("GPS is ON in Logan"); }
}
