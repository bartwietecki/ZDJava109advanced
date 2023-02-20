package practicalTasks.third.correct;

import practicalTasks.one.person.Gender;
import practicalTasks.one.person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarRentalDemoApp {
    public static void main(String[] args) {
        // Create a list of available cars
        List<Car> availableCars = new ArrayList<>();
        availableCars.add(new Car("BMW", "X7", 2020, "Automatic transmission",
                "Petrol", 3.0, 7));
        availableCars.add(new Car("Mercedes", "G Class", 2023,
                "Automatic transmission", "Diesel", 4.0, 5));

        // Create a list of rented cars
        List<CarRental.Rental> rentedCars = new ArrayList<>();

        // Create a car rental object
        CarRental carRental = new CarRental(availableCars, rentedCars);

        // Add a new car
        carRental.addCar(new Car("Opel", "Zafira", 2012,
                "Manual transmission", "Petrol", 1.8, 7));



        // Rent a car
        Person person = new Person("Adam", "Smith", 23, Gender.MALE, 0);
        Car car = availableCars.get(0);
        String fromDate = "2023-02-20";
        String toDate = "2023-02-23";
        double price = 450.0d;
        boolean delayed = false;
        carRental.rentExactCar(person, car, fromDate, LocalDate.parse(toDate), price, delayed);

        // Display the list of available and rented cars
        System.out.println("Available cars:");
        for (Car availableCar : carRental.getAvailableCars()) {
            System.out.println(availableCar);
        }

        System.out.println("Rented cars:");
        for (CarRental.Rental rentedCar : carRental.getRentedCars()) {
            System.out.println(rentedCar.getCar() + " (" + rentedCar.getPerson() + ").");
        }


    }


}

