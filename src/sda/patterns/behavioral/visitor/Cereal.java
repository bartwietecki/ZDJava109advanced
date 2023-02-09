package sda.patterns.behavioral.visitor;

public class Cereal implements Merchandise {

    private String name;
    private float weight;
    private int pricePerKilo;

    public Cereal(String name, float weight, int pricePerKilo) {
        this.name = name;
        this.weight = weight;
        this.pricePerKilo = pricePerKilo;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public int getPricePerKilo() {
        return pricePerKilo;
    }

    @Override
    public int accept(Calculator calculator) {
        return calculator.calculate(this);
    }
}
