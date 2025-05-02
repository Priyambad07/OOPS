interface Vehicle {
    void start();
    void stop();
    double getFuelLevel();
}

class Car implements Vehicle {
    private double fuelLevel;

    public Car(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    public void start() {
        System.out.println("Car is starting.");
    }
    public void stop() {
        System.out.println("Car is stopping.");
    }
    public double getFuelLevel() {
        return fuelLevel;
    }
}

class Motorcycle implements Vehicle {
    private double fuelLevel;

    public Motorcycle(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    public void start() {
        System.out.println("Motorcycle is starting.");
    }
    public void stop() {
        System.out.println("Motorcycle is stopping.");
    }
    public double getFuelLevel() {
        return fuelLevel;
    }
}

public class Experiment_7_2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car(50);
        Vehicle myMotorcycle = new Motorcycle(15);

        myCar.start();
        System.out.println("Car fuel levl: " + myCar.getFuelLevel());
        myCar.stop();

        myMotorcycle.start();
        System.out.println("Motorcycle fuel level: " + myMotorcycle.getFuelLevel());
        myMotorcycle.stop();
    }
}
