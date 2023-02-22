package practicalTasks.fifth.toy;

public class StuffedToys extends Toy {
    private TypesOfToys type;
    private String size;
    private String typeOfFilling;

    public StuffedToys(String name, int minimumAge, double price, TypesOfToys type, String size, String typeOfFilling) {
        super(name, minimumAge, price);
        this.type = type;
        this.size = size;
        this.typeOfFilling = typeOfFilling;
    }

    public TypesOfToys getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getTypeOfFilling() {
        return typeOfFilling;
    }

    @Override
    public String toString() {
        return "StuffedToys{" +
                "type=" + type +
                ", size='" + size + '\'' +
                ", typeOfFilling='" + typeOfFilling + '\'' +
                "} " + super.toString();
    }
}
