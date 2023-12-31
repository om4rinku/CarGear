class Car extends Vehicle {
    private int wheels;
    private String type;
    private String gear;
    private int currentGear;

    public Car(String name, int wheels, String type) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.gear = "N";
        this.currentGear = 0;
    }

    @Override
    public void move(double speed, String direction) {
        setCurrentSpeed(speed);
        setCurrentDirection(direction);
        System.out.println(getName() + " is moving at speed " + getCurrentSpeed() + " in the direction " + getCurrentDirection());
    }

    @Override
    public void steer(String direction) {
        setCurrentDirection(direction);
        System.out.println(getName() + " is steering in the direction " + getCurrentDirection());
    }
    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("A " + getName() + " SUV equipped with " + wheels +
                " wheels, classified as a " + type + ", is currently in gear " + currentGear + ".");
    }



//    public void changeGear(int newGear) {
//        this.currentGear = newGear;
//        System.out.println("A " + getName() + "SUV equipped with"+ wheels + " wheels, classified as a "+type+ " is currently moving at a speed of "+++ currentGear);
//    } //A Tata SUV equipped with 4 wheels, classified as an SUV, is currently moving at a speed of 12 km/h and is in gear 2

    public void changeSpeed(double speed, String direction) {
        move(speed, direction);
    }
}
