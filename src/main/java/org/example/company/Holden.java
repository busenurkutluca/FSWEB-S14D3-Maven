package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
        @Override
        public String startEngine() {
            System.out.println(getClass().getSimpleName() + ": Holden motoru çalışıyor.");
            return "Holden's engine is starting";
        }

        @Override
        public String accelerate() {
            System.out.println(getClass().getSimpleName() + ": Holden hızlanıyor.");
            return "Holden is accelerating";
        }

        @Override
        public String brake() {
            System.out.println(getClass().getSimpleName() + ": Holden fren yapıyor.");
            return "Holden is braking";
        }
}
