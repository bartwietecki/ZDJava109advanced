package practicalTasks.fifth.toy;

public class StuffedToys extends Toy {
    private TypesOfToys type;
    private String size;
    private String typeOfFilling;

    public StuffedToys(String name, int minimumAge, double price, String size, String typeOfFilling) {
        super(name, minimumAge, price);
        type = TypesOfToys.STUFFED_TOYS;
        this.size = size;
        this.typeOfFilling = typeOfFilling;
    }

    StuffedToys(String name, int minimumAge, double price) {
        super(name, minimumAge, price);
        this.type = TypesOfToys.STUFFED_TOYS;
    }

    public String getSize() {
        return size;
    }

    public String getTypeOfFilling() {
        return typeOfFilling;
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
                .append(", typeOfFilling: ")
                .append(typeOfFilling)
                .toString();
    }
}
