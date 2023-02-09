package sda.patterns.creational.abstractFactory;

public class FocusFactory implements FordFactory {

    private String name;
    private String engine;
    private String addons;

    public FocusFactory(String name, String engine, String addons) {
        this.name = name;
        this.engine = engine;
        this.addons = addons;
    }

    @Override
    public Ford createFord() {
        System.out.println("Zlecenie na Focusa");
        return new FordFocus(name, engine, addons);
    }
}
