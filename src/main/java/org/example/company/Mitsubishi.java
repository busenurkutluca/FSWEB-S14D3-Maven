package org.example.company;

public class Mitsubishi extends Car {


    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": Mitsubishi motoru çalışıyor.");
        return "Mitsubishi's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": Mitsubishi hızlanıyor.");
        return "Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": Mitsubishi fren yapıyor.");
        return "Mitsubishi is braking";
    }
}


