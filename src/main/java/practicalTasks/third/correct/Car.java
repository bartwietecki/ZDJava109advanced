package practicalTasks.third.correct;

public class Car extends Vehicle {
    private int seats;

    public Car(String brand, String model, int year, String transmissionType, String fuelType, double engineCapacity,
               int seats) {
        super(brand, model, year, transmissionType, fuelType, engineCapacity);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                "} " + super.toString();
    }
}
