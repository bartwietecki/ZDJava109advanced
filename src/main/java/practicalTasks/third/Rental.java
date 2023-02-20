package practicalTasks.third;

import practicalTasks.one.person.Person;

public class Rental {
    private Person person;
    private Car car;
    private String fromDate;
    private String toDate;
    private double price;
    private boolean delayed;

    public Rental(Person person, Car car, String fromDate, String toDate, double price, boolean delayed) {
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

    public String getToDate() {
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
        return "Rental{" +
                "person=" + person +
                ", car=" + car +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", price=" + price +
                ", delayed=" + delayed +
                '}';
    }
}
