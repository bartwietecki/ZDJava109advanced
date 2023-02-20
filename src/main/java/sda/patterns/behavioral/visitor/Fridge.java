package sda.patterns.behavioral.visitor;

public class Fridge implements Merchandise {

    private String name;
    private String serialNumber;
    private int value;

    public Fridge(String name, String serialNumber, int value) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int accept(Calculator calculator) {
        return calculator.calculate(this);
    }
}
