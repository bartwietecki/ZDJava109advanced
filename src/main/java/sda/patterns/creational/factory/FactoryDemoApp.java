package sda.patterns.creational.factory;

public class FactoryDemoApp {
    public static void main(String[] args) {

        /**
         * Factory polega na tym, że rodzina obiektów jest tworzona w ramach jednego wspólnego
         * punktu wejścia - zamiast tworzyć obiekt w "main" - zlecamy jego utworzenie
         * do metody która "wie" jak to zrobić
         */

        MacBook macBook1 = MacBookFactory.getMac("Air", 256,512,13);
        MacBook macBook2 = MacBookFactory.getMac("Pro", 512,1024, 13);
        MacBook macBook3 = MacBookFactory.getMac("Classic", 128, 512, 14);

    }
}
