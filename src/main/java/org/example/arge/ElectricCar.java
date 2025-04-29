package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    // Getter metotları eklendi
    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " is starting its electric engine with a battery size of " + batterySize + " kWh";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + " is driving with an average of " + avgKmPerCharge + " km per charge";
    }
}