class SUV extends Car {
    public SUV(String name, int wheels, String type) {
        super(name, wheels, type);
    }

    public void accelerate(double newSpeed) {
        if (newSpeed < 0) {
            System.out.println("Speed cannot be less than 0.");
            return;
        }

        // Accessing currentSpeed using the getter method
        double updatedSpeed = getCurrentSpeed() + newSpeed;

        if (newSpeed == 0) {
            // Accessing currentGear using the setter method
            changeGear(0);
        } else if (newSpeed <= 20) {
            changeGear(1);
        } else if (newSpeed <= 40) {
            changeGear(2);
        } else if (newSpeed <= 60) {
            changeGear(3);
        } else if (newSpeed <= 80) {
            changeGear(4);
        }


       // System.out.println(getName() + " accelerated to speed " + updatedSpeed + " in gear " + getCurrentGear());
    }
}
