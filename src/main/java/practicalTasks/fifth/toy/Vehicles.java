package practicalTasks.fifth.toy;

public class Vehicles extends Toy {
    private TypesOfToys type;
    private String typeOfControl;
    private int amountOfWheels;

    public Vehicles(String name, int minimumAge, double price, TypesOfToys type, String typeOfControl, int amountOfWheels) {
        super(name, minimumAge, price);
        this.type = type;
        this.typeOfControl = typeOfControl;
        this.amountOfWheels = amountOfWheels;
    }

    public TypesOfToys getType() {
        return type;
    }

    public String getTypeOfControl() {
        return typeOfControl;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "type=" + type +
                ", typeOfControl='" + typeOfControl + '\'' +
                ", amountOfWheels=" + amountOfWheels +
                "} " + super.toString();
    }
}
