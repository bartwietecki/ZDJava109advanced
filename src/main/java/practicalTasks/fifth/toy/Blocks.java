package practicalTasks.fifth.toy;

public class Blocks extends Toy {
    private TypesOfToys type;
    private String material;
    private int quantinty;

    public Blocks(String name, int minimumAge, double price, String material, int quantinty) {
        super(name, minimumAge, price);
        type = TypesOfToys.BLOCKS;
        this.material = material;
        this.quantinty = quantinty;
    }

    Blocks(String name, int minimumAge, double price) {
        super(name, minimumAge, price);
        this.type = TypesOfToys.BLOCKS;
    }

    public TypesOfToys getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public int getQuantinty() {
        return quantinty;
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
                .append(", quantinty: ")
                .append(quantinty)
                .toString();
    }
}
