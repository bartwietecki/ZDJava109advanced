package sda.patterns.structural.flyweight;

import java.util.List;

public class FlyweightDemoApp {

    public static void main(String[] args) {
        FordMustang mustang1 = new FordMustang("Midnight Sky", "4.5", "Denon");
        FordMustang mustang2 = new FordMustang("Ruby Red", "4.0", "Denon");
        FordMustang mustang3 = new FordMustang("Midnight Sky", "3.5", "Sony");
        FordMustang mustang4 = new FordMustang("Black Panther", "3.5", "Embed");
        FordMustang mustang5 = new FordMustang("Midnight Sky", "4.5", "Denon");

        List<FordMustang> mustangList = List.of(mustang1, mustang2, mustang3, mustang4, mustang5);
        System.out.println("======================================");
        mustangList.forEach(each -> System.out.println(each.getCarInfo()));

        System.out.println("======================================");
        System.out.println("Sprawdzamy elementy Base:");
        System.out.println("Ilość: " + MustangBaseFactory.getFordMustangBaseSet().size());
        MustangBaseFactory.getFordMustangBaseSet()
                .stream()
                .forEach(each -> System.out.println(each.getColor() + " " + each.getEngine()));
    }
}
