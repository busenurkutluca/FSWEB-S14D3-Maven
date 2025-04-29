package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "Holden's engine is starting";
    }

    @Override
    public String accelerate() {
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "Holden is accelerating";
    }

    @Override
    public String brake() {
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "Holden is braking";
    }
}