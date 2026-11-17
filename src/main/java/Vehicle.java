import java.util.*;

public class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    public Vehicle() {
        this.color = "Unknown";
        this.numberOfPassengers = 0;
        this.cargoCapacity = 0;
        this.fuelCapacity = 0;
    }

    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    public static void main(String[] args) {
        // 1. Moped instance (using your exact example)
        String color;
        int numberOfPassengers;
        int cargoCapacity;
        int fuelCapacity;

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Moped slowRide = new Moped(color,numberOfPassengers,cargoCapacity,fuelCapacity);

        //Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(15);

        // 2. Car instance
        Car commuterCar = new Car();
        commuterCar.setColor("Silver");
        commuterCar.setFuelCapacity(14);
        commuterCar.setNumberOfPassengers(5);
        commuterCar.setCargoCapacity(450);

        // 3. SemiTruck instance
        SemiTruck freightHauler = new SemiTruck();
        freightHauler.setColor("Black");
        freightHauler.setFuelCapacity(200);
        freightHauler.setNumberOfPassengers(2);
        freightHauler.setCargoCapacity(45000);

        // 4. Hovercraft instance
        HoverCraft coastalGlider = new HoverCraft();
        coastalGlider.setColor("Orange");
        coastalGlider.setFuelCapacity(80);
        coastalGlider.setNumberOfPassengers(10);
        coastalGlider.setCargoCapacity(1500);

        // Verify the values using the inherited getters
        System.out.println("--- Vehicle Fleet Test ---");
        System.out.println("Moped: " + slowRide.getColor() + " | Fuel: " + slowRide.getFuelCapacity() + " gal | Passengers: " + slowRide.getNumberOfPassengers() + " | Cargo: " + slowRide.getCargoCapacity() + " lbs");
        System.out.println("Car: " + commuterCar.getColor() + " | Fuel: " + commuterCar.getFuelCapacity() + " gal | Passengers: " + commuterCar.getNumberOfPassengers() + " | Cargo: " + commuterCar.getCargoCapacity() + " lbs");
        System.out.println("SemiTruck: " + freightHauler.getColor() + " | Fuel: " + freightHauler.getFuelCapacity() + " gal | Passengers: " + freightHauler.getNumberOfPassengers() + " | Cargo: " + freightHauler.getCargoCapacity() + " lbs");
        System.out.println("Hovercraft: " + coastalGlider.getColor() + " | Fuel: " + coastalGlider.getFuelCapacity() + " gal | Passengers: " + coastalGlider.getNumberOfPassengers() + " | Cargo: " + coastalGlider.getCargoCapacity() + " lbs");
    }

}



