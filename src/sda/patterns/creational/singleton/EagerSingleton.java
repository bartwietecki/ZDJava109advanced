package sda.patterns.creational.singleton;

/**
 * Wzorzec zakładający możliwość utworzenia dokładnie jednego obiektu
 * danej klasy
 * Eager - czyli w momencie uruchamiania programu, niezależnie czy obiekt ma szanse być użyty czy nie
 */
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private int counter;

    private EagerSingleton() {
        System.out.println("Prywatny konstruktor");
        counter = 0;
    }

    public static EagerSingleton getInstance() {
        System.out.println("Pobieramy obiekt");
        return INSTANCE;
    }

    public int getCounter() {
        return counter;
    }

    public int increment() {
        return counter++;
    }

    public int decrement() {
        return counter--;
    }
}
