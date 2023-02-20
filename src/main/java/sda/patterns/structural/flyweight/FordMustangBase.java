package sda.patterns.structural.flyweight;

public class FordMustangBase {
    private String color;
    private String engine;

    public FordMustangBase(String color, String engine) {
        System.out.println(this.getClass() + " - konstruktor - " + color + ", " + engine);
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }
}
