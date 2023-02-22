package practicalTasks.fifth.toy;

public class Toy {
    private TypesOfToys number;
    private String name;
    private int minimumAge;
    private double price;

    public Toy(String name, int minimumAge, double price) {
        this.name = name;
        this.minimumAge = minimumAge;
        this.price = price;
    }

    //TODO Grzegorz musi zobaczyć jak to sensownie zrobić - na razie mam to zostawić (zrobienie Fabryki)

//     drugi konstruktor aby dodać możliwość wprowadzenia nowej zabawki
    public Toy(int number, String name, int minimumAge, double price) {
        this.number = TypesOfToys.findByNumber(number);
        this.name = name;
        this.minimumAge = minimumAge;
        this.price = price;
    }

    public TypesOfToys getNumber() {
        return number;
    }

    public void setNumber(TypesOfToys number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", minimumAge=" + minimumAge +
                ", price=" + price +
                '}';
    }
}
