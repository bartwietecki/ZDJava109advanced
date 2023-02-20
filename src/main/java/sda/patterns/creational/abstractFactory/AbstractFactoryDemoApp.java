package sda.patterns.creational.abstractFactory;

public class AbstractFactoryDemoApp {

    public static void main(String[] args) {

        Ford fiesta1 = FordOrderPoint.orderYourDreamedFord(new FiestaFactory("Fiesta ST-Line","1.6"
                ,"Radio" ));
        Ford focus = FordOrderPoint.orderYourDreamedFord(new FocusFactory("Focus Combi","1.3"
                , "Podgrzewane fotele" ));
        Ford fiesta2 = FordOrderPoint.orderYourDreamedFord(new FiestaFactory("Fiesta Eco","1.0"
                , "Brak dodatkowych opcji" ));
    }
}
