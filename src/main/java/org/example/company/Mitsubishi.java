package org.example.company;


public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "Mitsubishi's engine is starting";
    }

    @Override
    public String accelerate() {
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "Mitsubishi is braking";
    }
}