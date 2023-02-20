package practicalTasks.third.correct;

import practicalTasks.one.person.Person;

import java.time.LocalDate;
import java.util.List;

public class CarRental {
    private List<Car> availableCars;
    private List<Rental> rentedCars;

    public CarRental(List<Car> availableCars, List<Rental> rentedCars) {
        this.availableCars = availableCars;
        this.rentedCars = rentedCars;
    }

    public void addCar(Car car) {
        availableCars.add(car);
    }

    public void rentExactCar(Person person, Car car, String fromDate, LocalDate toDate, double price, boolean delayed) {
        if (availableCars.contains(car)) {
            availableCars.remove(car);
            rentedCars.add(new Rental(person, car, fromDate, toDate, price, delayed));
        } else {
            throw new IllegalArgumentException("Car is not available for rent.");
        }
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public List<Rental> getRentedCars() {
        return rentedCars;
    }

    public static class Rental {
        private Person person;
        private Car car;
        private String fromDate;
        private LocalDate toDate;
        private double price;
        private boolean delayed;

        public Rental(Person person, Car car, String fromDate, LocalDate toDate, double price, boolean delayed) {
            this.person = person;
            this.car = car;
            this.fromDate = fromDate;
            this.toDate = toDate;
            this.price = price;
            this.delayed = delayed;
        }

        public Person getPerson() {
            return person;
        }

        public Car getCar() {
            return car;
        }

        public String getFromDate() {
            return fromDate;
        }

        public LocalDate getToDate() {
            return toDate;
        }

        public double getPrice() {
            return price;
        }

        public boolean isDelayed() {
            return delayed;
        }

        @Override
        public String toString() {
            return car + " rented by " + person + " from " + fromDate + " to " + toDate +
                    ", price: " + price + ", delayed: " + delayed;
        }
    }
}
