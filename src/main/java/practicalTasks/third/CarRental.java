package practicalTasks.third;

import practicalTasks.one.person.Person;

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

    public void rentExactCar(Person person, Car car, String fromDate, String toDate, double price, boolean delayed) {
        if(availableCars.contains(car)) {
            availableCars.remove(car);
            rentedCars.add(new Rental(person, car, fromDate, toDate, price, delayed));
        } else {
            System.out.println("Car is already rented");
        }
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public List<Rental> getRentedCars() {
        return rentedCars;
    }

    @Override
    public String toString() {
        return "CarRental{" +
                "availableCars=" + availableCars +
                ", rentedCars=" + rentedCars +
                '}';
    }
}