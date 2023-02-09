package sda.patterns.creational.singleton;

public class EagerSingletonDemo {

    public static void main(String[] args) {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

        System.out.println("=================================");
        System.out.println("Counter na 1 instancji = " + instance1.getCounter());
        System.out.println("Counter na 2 instancji = " + instance2.getCounter());
        System.out.println("=================================");
        instance1.increment();
        System.out.println("=================================");
        System.out.println("Counter na 1 instancji = " + instance1.getCounter());
        System.out.println("Counter na 2 instancji = " + instance2.getCounter());
        System.out.println("=================================");
        instance2.decrement();
        System.out.println("=================================");
        System.out.println("Counter na 1 instancji = " + instance1.getCounter());
        System.out.println("Counter na 2 instancji = " + instance2.getCounter());
        System.out.println("=================================");

        // za każdym razem mamy doczynienia z tym samym obiektem, bo modyfikując jeden, modyfikuje się również drugi

        /**
         * modyfikowanie countera na 1 obiekcie zmieni go też na 2 obiekcie, czyli
         * mamy do czynienia z tym samym obiektem podpiętym do 2 zmiennych
         */

        // PO CO ?
        // Zdarzają się sytuacje że chcemy mieć pewność że mamy 1 obiekt w całej aplikacji i zawsze chcemy się odwoływać
        // do tego jednego obiektu.
        // Tworzymy go raz, ustawiamy w taki sposób jak nam to odpowiada i mamy go na cały czas, dostępnego wszędzie -
        // takiego samego
    }
}
