abstract class Vehicle {
    private String name;
    private double currentSpeed;
    private String currentDirection;
    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = "No Direction";
    }
    public abstract void move(double speed, String direction);
    public abstract void steer(String direction);
    
    public String getName() {
        return name;
    }
    public double getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    public String getCurrentDirection() {
        return currentDirection;
    }
    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }
}
