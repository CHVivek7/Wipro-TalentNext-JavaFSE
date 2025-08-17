package com.automobile.twowheeler;
import com.automobile.Vehicle;

public class Honda extends Vehicle {
    private String modelName, regNumber, ownerName;
    private int speed;
    public Honda(String model, String reg, String owner, int speed) {
        this.modelName = model;
        this.regNumber = reg;
        this.ownerName = owner;
        this.speed = speed;
    }
    public String getModelName() { return modelName; }
    public String getRegistrationNumber() { return regNumber; }
    public String getOwnerName() { return ownerName; }
    public int getSpeed() { return speed; }
    public void cdplayer() { System.out.println("CD Player is ON in Honda"); }
}
