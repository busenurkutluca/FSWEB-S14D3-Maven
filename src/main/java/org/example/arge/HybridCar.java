package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    // Getter metotları eklendi
    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " is starting its hybrid engine with " + cylinders + " cylinders and a battery size of " + batterySize + " kWh";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + " is driving with an average of " + avgKmPerLitre + " km per litre and a battery size of " + batterySize + " kWh";
    }
}