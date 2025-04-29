package org.example.company;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "the car's engine is starting";
    }

    public String accelerate() {
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "the car is accelerating";
    }

    public String brake() {
        String className = getClass().getSimpleName();
        System.out.println("Class: " + className);
        return "the car is braking";
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + cylinders;
        return result;
    }
}