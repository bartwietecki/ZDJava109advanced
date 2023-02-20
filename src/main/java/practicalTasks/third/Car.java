package practicalTasks.third;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String brand, String model, int yearOfProduction, String gearBox, String fuel, double engine, int numberOfSeats) {
        super(brand, model, yearOfProduction, gearBox, fuel, engine);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                "} " + super.toString();
    }
}
