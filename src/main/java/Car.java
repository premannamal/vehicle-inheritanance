public class Car extends Vehicle {
    // Specific properties unique to a Car
    private int numberOfDoors;
    private boolean hasSunroof;

    // Getter and Setter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Getter and Setter for hasSunroof
    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    // Custom behavior unique to a Car
    public void honkHorn() {
        System.out.println("Beep! Beep! The " + getColor() + " car with " + numberOfDoors + " doors is honking.");
    }
}
