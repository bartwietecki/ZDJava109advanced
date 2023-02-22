package practicalTasks.fifth.toy;

public class Puzzles extends Toy {
    private TypesOfToys type;
    private String size;
    private int quantity;

    public Puzzles(String name, int minimumAge, double price, TypesOfToys type, String size, int quantity) {
        super(name, minimumAge, price);
        this.type = type;
        this.size = size;
        this.quantity = quantity;
    }

    public TypesOfToys getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Puzzles{" +
                "type=" + type +
                ", size='" + size + '\'' +
                ", quantity=" + quantity +
                "} " + super.toString();
    }
}
