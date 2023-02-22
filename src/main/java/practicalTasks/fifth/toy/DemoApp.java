package practicalTasks.fifth.toy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoApp {

    public static void main(String[] args) throws IOException {
        Dolls doll = new Dolls("Lalka", 3, 89.99d, TypesOfToys.DOLLS, 2, "Brown");

        Blocks block = new Blocks("LEGO", 6, 150, TypesOfToys.BLOCKS, "Plastic", 500);

        Vehicles vehicle = new Vehicles("Samochodzik", 6, 205.89d, TypesOfToys.VEHICLES,
                "Zdalnie sterowany", 4);

        StuffedToys stuffedToy = new StuffedToys("Pluszowy miś", 1, 50, TypesOfToys.STUFFED_TOYS,
                "Small", "Polyester ");

        Figurines figure = new Figurines("Figurka LEGO", 6, 69.99d, TypesOfToys.FIGURINES,
                "Plastic", true);

        Puzzles puzzles = new Puzzles("Puzzle krajobrazu", 12, 399.99d, TypesOfToys.PUZZLES,
                "Duże puzzle", 5000);

        // dodawanie nowej zabawki za pomocą drugiego konstruktora:
        Toy newToy = new Toy(1, "Nowa zabawka", 3, 59.99d);
        Toy newToy2 = new Toy(1, "New toy", 3, 55.6);


        List<Toy> toys = new ArrayList<>();
        toys.add(doll);
        toys.add(block);
        toys.add(vehicle);
        toys.add(stuffedToy);
        toys.add(figure);
        toys.add(puzzles);

//        for (Toy myToys : toys) {
//            System.out.println(myToys);
//        }

        toys.forEach(System.out::println);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // Wypisać wszystkie które są przeznaczone dla 12 lat i więcej
        System.out.println("Zabawki dla dzieci powyżej 12 lat");

        // bez streama
//        for (Toy myToys : toys) {
//            if(myToys.getMinimumAge() >= 12) {
//                System.out.println(myToys.getName());
//            }
//        }

        // z użyciem streama
        toys.stream()
                .filter(toy -> toy.getMinimumAge() >= 12)
                .forEach(System.out::println);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        // Wypisać wszystkie puzzle i klocki

        System.out.println("Wszystkie puzzle i klocki");
        toys.stream()
                .filter(toy -> toy instanceof Puzzles || toy instanceof Blocks)
                .forEach(System.out::println);


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        // Policzyć sumę wartości wszystkich lalek
        double sum = toys.stream()
                .filter(toy -> toy instanceof Dolls)
                .mapToDouble(Toy::getPrice)
                .sum();
        System.out.println("Suma wartości wszystkich lalek: " + sum);

    }

    // Wypisanie do pliku listy zabawek - alfabetycznie
    public void saveToysToFileByAlphabetRules(String filename, List<Toy> toys) {
        File file = new File(filename);

        try (PrintWriter writer = new PrintWriter(file)) {
            toys.stream()
                    .sorted(Comparator.comparing(Toy::getName))
                    .forEach(toy -> writer.println(toy.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    Metoda tworzy nowy plik z daną nazwą i zapisuje do niego wszystkie zabawki z listy, posortowane alfabetycznie po nazwie.
    Wykorzystuje try-with-resources, aby automatycznie zamknąć PrintWriter i zapobiec wyciekom pamięci.
    Zabawki są zapisywane za pomocą ich metody toString(), którą można dostosować według potrzeb.
    W przypadku wystąpienia błędu podczas zapisywania, metoda rzuca wyjątek RuntimeException.
     */

    // Wypisanie do pliku listy zabawek - sortując po cenie malejąco
    public void saveToysToFileFromLowestPrice(String filename, List<Toy> toys) {
        File file = new File(filename);

        try (FileWriter writer = new FileWriter(file)) {
            toys.stream()
                    .sorted(Comparator.comparing(Toy::getPrice).reversed())
                    .forEach(toy -> toy.toString()); // czy to jest dobrze ???
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
