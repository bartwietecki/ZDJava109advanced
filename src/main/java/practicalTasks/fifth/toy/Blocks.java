package practicalTasks.fifth.toy;

public class Blocks extends Toy {
    private TypesOfToys type;
    private String material;
    private int quantinty;

    public Blocks(String name, int minimumAge, double price, TypesOfToys type, String material, int quantinty) {
        super(name, minimumAge, price);
        this.type = type;
        this.material = material;
        this.quantinty = quantinty;
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
    public String toString() {
        return "Blocks{" +
                "type=" + type +
                ", material='" + material + '\'' +
                ", quantinty=" + quantinty +
                "} " + super.toString();
    }
}
