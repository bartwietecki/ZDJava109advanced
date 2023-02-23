package practicalTasks.fifth.toy;

public abstract class Toy {
    private String name;
    private int minimumAge;
    private double price;

    public Toy(String name, int minimumAge, double price) {
        this.name = name;
        this.minimumAge = minimumAge;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public double getPrice() {
        return price;
    }

    public abstract TypesOfToys getToyType();

    String info() {
        return new StringBuilder(name)
                .append(", minimum age: ")
                .append(minimumAge)
                .append(", price: ")
                .append(price)
                .toString();
    }

    public static Toy returnToyByTypeShortcut(String shortcut, String name, int minimumAge, double price) {
        TypesOfToys typesOfToys = TypesOfToys.findByShortcut(shortcut);

        return returnToyByType(name, minimumAge, price, typesOfToys);
    }

    public static Toy returnToyByType(String name, int minimumAge, double price, TypesOfToys typesOfToys) {
        switch (typesOfToys) {
            case DOLLS:
                return new Dolls(name, minimumAge, price);
            case BLOCKS:
                return new Blocks(name, minimumAge, price);
            case PUZZLES:
                return new Puzzles(name, minimumAge, price);
            case VEHICLES:
                return new Vehicles(name, minimumAge, price);
            case STUFFED_TOYS:
                return new StuffedToys(name, minimumAge, price);
            case FIGURINES:
                return new Figurines(name, minimumAge, price);
            default:
                throw new IllegalArgumentException("Toy type undefined");
        }
    }

    public static Toy returnToyByTypeNumber(int number, String name, int minimumAge, double price) {
        TypesOfToys typesOfToys = TypesOfToys.findByNumber(number);

        return returnToyByType(name, minimumAge, price, typesOfToys);
    }
}
