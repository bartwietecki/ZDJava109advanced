package practicalTasks.fifth.toy;

public class Puzzles extends Toy {
    private TypesOfToys type;
    private String size;
    private int quantity;

    public Puzzles(String name, int minimumAge, double price, String size, int quantity) {
        super(name, minimumAge, price);
        type = TypesOfToys.PUZZLES;
        this.size = size;
        this.quantity = quantity;
    }

    Puzzles(String name, int minimumAge, double price) {
        super(name, minimumAge, price);
        this.type = TypesOfToys.PUZZLES ;
    }

    public String getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public TypesOfToys getToyType() {
        return type;
    }

    @Override
    public String info() {
        return new StringBuilder(getToyType().getPolishName())
                .append(": ")
                .append(super.info())
                .append(", size: ")
                .append(size)
                .append(", quantity: ")
                .append(quantity)
                .toString();
    }

}
