package sda.patterns.behavioral.visitor;

public class Butter implements Merchandise {

    private int commonValue;
    private int itemValue;
    private String name;

    public Butter(int commonValue, int itemValue, String name) {
        this.commonValue = commonValue;
        this.itemValue = itemValue;
        this.name = name;
    }

    public int getCommonValue() {
        return commonValue;
    }

    public int getItemValue() {
        return itemValue;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(Calculator calculator) {
        return calculator.calculate(this);
    }
}
