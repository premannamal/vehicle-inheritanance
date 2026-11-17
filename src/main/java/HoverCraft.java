public class HoverCraft extends Vehicle {
    // Specific properties unique to a Hovercraft
    private int hoverHeightInches;
    private boolean isAmphibious;


    public HoverCraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int hoverHeightInches, boolean isAmphobious) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hoverHeightInches = hoverHeightInches;
        this.isAmphibious = isAmphibious;
    }


    // Getter and Setter for hoverHeightInches
    public int getHoverHeightInches() {
        return hoverHeightInches;
    }

    public void setHoverHeightInches(int hoverHeightInches) {
        this.hoverHeightInches = hoverHeightInches;
    }

    // Getter and Setter for isAmphibious
    public boolean isAmphibious() {
        return isAmphibious;
    }

    public void setAmphibious(boolean amphibious) {
        isAmphibious = amphibious;
    }

    // Custom behavior unique to a Hovercraft
    public void inflateSkirt() {
        System.out.println("Whoosh! The " + getColor() + " hovercraft is rising " + hoverHeightInches + " inches off the ground with " + getNumberOfPassengers() + " passengers.");
    }
}
