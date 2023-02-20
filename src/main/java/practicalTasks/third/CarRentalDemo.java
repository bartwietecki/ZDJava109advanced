package practicalTasks.third;

import practicalTasks.one.person.Gender;
import practicalTasks.one.person.Person;

import java.util.ArrayList;
import java.util.List;

public class CarRentalDemo {
    public static void main(String[] args) {
        // Tworzę listę dostępnych samochodów
        List<Car> availableCars = new ArrayList<>();
        availableCars.add(new Car("BMW", "X7", 2020, "Automatyczna skrzynia biegów",
                "PB 95", 3.0, 7));
        availableCars.add(new Car("Mercedes", "G Class", 2023,
                "Automatyczna skrzynia biegów", "ON", 4.0, 5));

        // Tworzę listę wypożyczonych samochodów
        List<Rental> rentedCars = new ArrayList<>();

        // Tworzę obiekt wypożyczalni
        CarRental carRental = new CarRental(availableCars, rentedCars);

        // Dodaję nowy samochód
        carRental.addCar(new Car("Opel", "Zafira", 2012,
                "Manualna skrzynia biegów", "PB 95", 1.8, 7));

        // Wypożycznie samochodu
        Person person = new Person("Jan", "Kowalski", 35, Gender.MALE, 2);
        Car car = availableCars.get(0);
        String fromDate = "2023-02-20";
        String toDate = "2023-02-23";
        double price = 450.0d;
        boolean delayed = false;
        carRental.rentExactCar(person, car, fromDate, toDate, price, delayed);

        // Wyświetlenie listy dostępnych i wypożyczonych samochodów
        System.out.println("Dostępne samochody");
        for (Car availableCar : carRental.getAvailableCars()) {
            System.out.println(availableCar);
        }

        System.out.println("Wypożyczone samochody");
        for (Rental rentedCar : carRental.getRentedCars()) {
            System.out.println(rentedCar.getCar() + " (" + rentedCar.getPerson() + ").");
        }



    }
}