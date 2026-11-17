public class SemiTruck extends Vehicle {
    // Specific properties unique to a SemiTruck
    private int numberOfTrailers;
    private boolean hasSleeperCab;

    // Getter and Setter for numberOfTrailers
    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfTrailers, boolean hasSleeperCab) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfTrailers = numberOfTrailers;
        this.hasSleeperCab = hasSleeperCab;
    }

    // Constructor matching the 4 Vehicle parameters
    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public SemiTruck() {
        super(); // Optional, Java calls this automatically
    }

    // Getter and Setter for hasSleeperCab
    public boolean isHasSleeperCab() {
        return hasSleeperCab;
    }

    public void setHasSleeperCab(boolean hasSleeperCab) {
        this.hasSleeperCab = hasSleeperCab;
    }

    // Custom behavior unique to a SemiTruck
    public void soundAirHorn() {
        System.out.println(" HONK! HONK! The " + getColor() + " semi-truck is hauling " + numberOfTrailers + " trailer(s) with a max cargo of " + getCargoCapacity() + " lbs.");
    }
}
