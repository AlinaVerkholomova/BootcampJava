package Package1;

public class Task5Day3 {
    public static void main(String[] args) {

        Car tesla = new ElectricCar();
        tesla.drive(60);
        tesla.handleSteering();
        System.out.println(tesla);

    }
}

class Vehicle {

    protected int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void drive(int newSpeed) {
        speed += newSpeed;
        System.out.print("Now my speed is " + speed);
    }

    @Override
    public String toString() {
        return "Vehicle " +
                "speed = " + speed;
    }
}

class Car extends Vehicle {

    protected boolean manualGears;
    protected char gears;

    public Car(boolean manualGears, char gears) {
        this.manualGears = manualGears;
        this.gears = gears;

    }

    public boolean isManualGears() {
        return manualGears;
    }

    public void setManualGears(boolean manualGears) {
        this.manualGears = manualGears;
    }

    public char getGears() {
        return gears;
    }

    public void setGears(char gears) {
        this.gears = gears;
    }

    public void changeGears() {
        if (manualGears)
            System.out.printf("My gear right now is %s", gears);
        else
            System.out.println("Gears are changed automatically");
    }

    public void handleSteering() {
        System.out.println("I'm handling my car's steering");
    }

    public void drive(int newSpeed){
        speed += newSpeed;
        System.out.println("I'm driving my car");

    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Car" +
                "manualGears = " + manualGears +
                ", gears = " + gears;
    }
}

class ElectricCar extends Car {

    private final boolean electricMotor = true;

    public ElectricCar(){
        super(false, 'D');
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "ElectricCar " +
                "electricMotor = " + electricMotor;
    }
}