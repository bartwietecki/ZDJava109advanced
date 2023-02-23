package practicalTasks.fifth.toy;

public class Vehicles extends Toy {
    private TypesOfToys type;
    private String typeOfControl;
    private int amountOfWheels;

    public Vehicles(String name, int minimumAge, double price, String typeOfControl, int amountOfWheels) {
        super(name, minimumAge, price);
        type = TypesOfToys.VEHICLES;
        this.typeOfControl = typeOfControl;
        this.amountOfWheels = amountOfWheels;
    }

    Vehicles(String name, int minimumAge, double price) {
        super(name, minimumAge, price);
        this.type = TypesOfToys.VEHICLES;
    }

    public String getTypeOfControl() {
        return typeOfControl;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
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
                .append(", typeOfControl: ")
                .append(typeOfControl)
                .append(", amountOfWheels: ")
                .append(amountOfWheels)
                .toString();
    }
}
