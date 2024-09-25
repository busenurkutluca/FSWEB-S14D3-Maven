package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
        @Override
        public String startEngine() {
            System.out.println(getClass().getSimpleName() + ": Ford motoru çalışıyor.");
            return "Ford's engine is starting";
        }

        @Override
        public String accelerate() {
            System.out.println(getClass().getSimpleName() + ": Ford hızlanıyor.");
            return "Ford is accelerating";
        }

        @Override
        public String brake() {
            System.out.println(getClass().getSimpleName() + ": Ford fren yapıyor.");
            return "Ford is braking";
        }
    }

