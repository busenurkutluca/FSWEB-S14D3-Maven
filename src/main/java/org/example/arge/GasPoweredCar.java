package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    // Getter metotları eklendi
    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " is starting its gas-powered engine with " + cylinders + " cylinders";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + " is driving with an average of " + avgKmPerLitre + " km per litre";
    }
}