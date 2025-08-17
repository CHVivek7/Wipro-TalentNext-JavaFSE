package com.automobile.twowheeler;
import com.automobile.Vehicle;

public class Hero extends Vehicle {
    private String modelName, regNumber, ownerName;
    private int speed;
    public Hero(String model, String reg, String owner, int speed) {
        this.modelName = model;
        this.regNumber = reg;
        this.ownerName = owner;
        this.speed = speed;
    }
    public String getModelName() { return modelName; }
    public String getRegistrationNumber() { return regNumber; }
    public String getOwnerName() { return ownerName; }
    public int getSpeed() { return speed; }
    public void radio() { System.out.println("Radio is ON in Hero"); }
}
