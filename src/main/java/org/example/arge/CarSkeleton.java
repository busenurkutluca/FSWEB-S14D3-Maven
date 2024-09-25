package org.example.arge;

public class CarSkeleton {
    private  String name;
    private  String description;

    public CarSkeleton(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public CarSkeleton() {
    }

    public void startEngine(){}
    public void  drive(){}
    public void runEngine(){}
}
