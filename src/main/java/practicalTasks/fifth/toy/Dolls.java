package practicalTasks.fifth.toy;

public class Dolls extends Toy {
    private TypesOfToys type;
    private int numberOfOutfits;
    private String hairColor;

    public Dolls(String name, int minimumAge, double price, int numberOfOutfits, String hairColor) {
        super(name, minimumAge, price);
        type = TypesOfToys.DOLLS;
        this.numberOfOutfits = numberOfOutfits;
        this.hairColor = hairColor;
    }

    Dolls(String name, int minimumAge, double price) {
        super(name, minimumAge, price);
        this.type = TypesOfToys.DOLLS;
    }

    public int getNumberOfOutfits() {
        return numberOfOutfits;
    }

    public String getHairColor() {
        return hairColor;
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
                .append(", numberOfOutfits: ")
                .append(numberOfOutfits)
                .append(", hairColor: ")
                .append(hairColor)
                .toString();
    }
}
