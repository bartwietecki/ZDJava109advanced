package practicalTasks.fifth.toy;

public class Figurines extends Toy {
    private TypesOfToys type;
    private String material;
    private boolean movable;

    public Figurines(String name, int minimumAge, double price, TypesOfToys type, String material, boolean movable) {
        super(name, minimumAge, price);
        this.type = type;
        this.material = material;
        this.movable = movable;
    }

    public TypesOfToys getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isMovable() {
        return movable;
    }

    @Override
    public String toString() {
        return "Figurines{" +
                "type=" + type +
                ", material='" + material + '\'' +
                ", movable=" + movable +
                "} " + super.toString();
    }
}
