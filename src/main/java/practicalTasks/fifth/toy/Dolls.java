package practicalTasks.fifth.toy;

public class Dolls extends Toy {
    private TypesOfToys type;
    private int numberOfOutfits;
    private String hairColor;

    public Dolls(String name, int minimumAge, double price, TypesOfToys type, int numberOfOutfits, String hairColor) {
        super(name, minimumAge, price);
        this.type = type;
        this.numberOfOutfits = numberOfOutfits;
        this.hairColor = hairColor;
    }

    public TypesOfToys getType() {
        return type;
    }

    public int getNumberOfOutfits() {
        return numberOfOutfits;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return "Dolls{" +
                "type=" + type +
                ", numberOfOutfits=" + numberOfOutfits +
                ", hairColor='" + hairColor + '\'' +
                "} " + super.toString();
    }
}
