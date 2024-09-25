package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;  // Varsayılan olarak tüm arabaların motoru var
        this.wheels = 4;     // Varsayılan olarak tüm arabaların 4 tekerleği var
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + "}";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": Motor çalışıyor.");
        return "The car's engine is starting";
    }

    public String accelerate(){
        System.out.println(getClass().getSimpleName() + ": Hızlanıyor.");
        return "The car is accelerating";
    }

    public String brake(){
        System.out.println(getClass().getSimpleName() + ": Fren yapıyor.");
        return "The car is braking";
    }
}



