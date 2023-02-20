package sda.patterns.creational.singleton;

/**
 * LazySingleton czyli - od słowa Lazy - tworzony przy piewszej próbie użycia obiektu (EagerSingleton, był tworzony od
 * razu, niezależnie czy go użyjemy czy nie)
 *
 * !!! LazySingleton nie może być używany w aplikacji wielowątkowej - pytanie na teście, może się pojawić
 */
public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton() {
        System.out.println("Konstruktor LazySingleton");
    }

    public static LazySingleton getInstance() {
        System.out.println("Pobieramy instancje LazySingleton");
        if (INSTANCE == null) {
            // dajmy na to że w tym miejscu 1 wątek został zatrzymany i uruchamia się 2
            // no to drugi przeleci cały program, wygeneruje nową instancję
            // potem pierwszy się ponownie obudzi i kończy działanie - robi sout() i nowy obiekt
            System.out.println("Null, więc wywołujemy konstruktor");
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
