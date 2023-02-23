package practicalTasks.fifth.toy;

public class Figurines extends Toy {
    private TypesOfToys type;
    private String material;
    private boolean movable;

    public Figurines(String name, int minimumAge, double price, String material, boolean movable) {
        super(name, minimumAge, price);
        type = TypesOfToys.FIGURINES;
        this.material = material;
        this.movable = movable;
    }

    Figurines(String name, int minimumAge, double price) {
        super(name, minimumAge, price);
        this.type = TypesOfToys.FIGURINES;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isMovable() {
        return movable;
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
                .append(", material: ")
                .append(material)
                .append(", movable: ")
                .append(movable)
                .toString();
    }
}
