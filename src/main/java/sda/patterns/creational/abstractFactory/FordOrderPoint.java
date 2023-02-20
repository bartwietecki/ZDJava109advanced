package sda.patterns.creational.abstractFactory;

public class FordOrderPoint {
    public static Ford orderYourDreamedFord(FordFactory factory) {
        System.out.println("Ordering new Ford");
        return factory.createFord();
    }
}
