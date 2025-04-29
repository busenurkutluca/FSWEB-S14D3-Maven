import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;
import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    // Sınıf tipini ekrana basan metot
    public static void printClassType(Object obj) {
        System.out.println("Object type: " + obj.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        // Pacific Car Company Testleri
        System.out.println("=== Pacific Car Company Testleri ===");
        Car car = new Car(8, "Base car");
        printClassType(car);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println();

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        printClassType(mitsubishi);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println();

        Car ford = new Ford(6, "Ford Falcon");
        printClassType(ford);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println();

        Car holden = new Holden(6, "Holden Commodore");
        printClassType(holden);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
        System.out.println();

        // Car R&D Company Testleri
        System.out.println("=== Car R&D Company Testleri ===");
        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "Gas-powered vehicle", 15.5, 4);
        printClassType(gasCar);
        System.out.println(gasCar.startEngine());
        System.out.println(gasCar.drive());
        System.out.println();

        CarSkeleton electricCar = new ElectricCar("Electric Car", "Electric vehicle", 300.0, 75);
        printClassType(electricCar);
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());
        System.out.println();

        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "Hybrid vehicle", 20.0, 50, 4);
        printClassType(hybridCar);
        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());
    }
}