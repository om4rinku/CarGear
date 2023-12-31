// Abstract class representing a generic vehicle
abstract class Vehicle {
    // Private attributes of a vehicle
    private String name;                // Name of the vehicle
    private double currentSpeed;        // Current speed of the vehicle
    private String currentDirection;    // Current direction of the vehicle

    // Constructor to initialize the vehicle with a name and default values
    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;           // Default speed is set to 0
        this.currentDirection = "N/A";   // Default direction is set to "N/A"
    }

    // Abstract method for moving the vehicle, to be implemented by subclasses
    public abstract void move(double speed, String direction);

    // Abstract method for steering the vehicle, to be implemented by subclasses
    public abstract void steer(String direction);

    // Getter method to retrieve the name of the vehicle
    public String getName() {
        return name;
    }

    // Getter method to retrieve the current speed of the vehicle
    public double getCurrentSpeed() {
        return currentSpeed;
    }

     //Setter method to update the current speed of the vehicle
    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    // Getter method to retrieve the current direction of the vehicle
    public String getCurrentDirection() {
        return currentDirection;
    }

    // Setter method to update the current direction of the vehicle
    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }
}
