package sda.patterns.creational.builder;

import java.util.List;

public class BuilderDemoApp {

    public static void main(String[] args) {

        House smallHouse = new House.HouseBuilder("bloczki", "Max", "Blacha")
                .build();

        House houseWithGarage = new House.HouseBuilder("Bloczki", "Ytong", "Dachówka")
                .withGarage("W bryle budynku")
                .build();

        House houseWithGarden = new House.HouseBuilder("Wylewany fundament", "Cegła", "Papodachówka")
                .withGarden("Duży ogród")
                .build();

        House houseWithGardenAndGarage = new House.HouseBuilder("Bloczki", "Bale", "Słoma")
                .withGarden("Zewnętrzny dwustanowiskow")
                .withGarage("Duży ogród z basenem")
                .build();

        House houseWithGarageAndGarden = new House.HouseBuilder("Wylewany", "Ytong", "Dachówka")
                .withGarage("W piwnicy")
                .withGarden("Łąka i las")
                .build();

        List<House> houses = List.of(smallHouse, houseWithGarage, houseWithGarden, houseWithGardenAndGarage,
                houseWithGarageAndGarden);
        System.out.println("Lista domów:");
        houses.forEach(x -> System.out.println(x.getInfo()));
    }
}
