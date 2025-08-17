package com.wipro.automobile.ship;

public class compartment {
    private int height;
    private int width;
    private int breadth;

    public compartment(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Height: " + height + ", Width: " + width + ", Breadth: " + breadth);
    }
}
