import java.util.*;
        public class Moped extends Vehicle {
            // Specific properties unique to a Moped
            private boolean hasPedals;
            private int maxSpeedMph;

            public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasPedals, int maxSpeedMph) {
                super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
                this.hasPedals = hasPedals;
                this.maxSpeedMph = maxSpeedMph;
            }


            // Getter and Setter for hasPedals
            public boolean isHasPedals() {
                return hasPedals;
            }

            public void setHasPedals(boolean hasPedals) {
                this.hasPedals = hasPedals;
            }

            // Getter and Setter for maxSpeedMph
            public int getMaxSpeedMph() {
                return maxSpeedMph;
            }

            public void setMaxSpeedMph(int maxSpeedMph) {
                this.maxSpeedMph = maxSpeedMph;
            }

            // Custom behavior unique to a Moped
            public void ringBell() {
                System.out.println("Ring! Ring! The " + getColor() + " moped is passing by.");
            }
        }
