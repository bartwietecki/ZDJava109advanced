package sda.patterns.creational.abstractFactory;

public class FiestaFactory implements FordFactory {

    private String name;
    private String engine;
    private String addons;

    public FiestaFactory(String name, String engine, String addons) {
        this.name = name;
        this.engine = engine;
        this.addons = addons;
    }

    @Override
    public Ford createFord() {
        System.out.println("Zlecenie na Fieste");
        return new FordFiesta(name, engine, addons);
    }
}
