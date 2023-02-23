package practicalTasks.fifth.toy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class DemoApp {

    public static void main(String[] args) throws IOException {
        Dolls doll = new Dolls("Lalka", 3, 89.99d, 2, "Brown");

        Blocks block = new Blocks("LEGO", 6, 150, "Plastic", 500);

        Vehicles vehicle = new Vehicles("Samochodzik", 6, 205.89d,
                "Zdalnie sterowany", 4);

        StuffedToys stuffedToy = new StuffedToys("Pluszowy miś", 1, 50,
                "Small", "Polyester ");

        Figurines figure = new Figurines("Figurka LEGO", 6, 69.99d,
                "Plastic", true);

        Puzzles puzzles = new Puzzles("Puzzle krajobrazu", 12, 399.99d,
                "Duże puzzle", 5000);

        // dodawanie nowej zabawki za pomocą numeru lub skrótu:
        Toy legoMustang = Toy.returnToyByTypeNumber(02, "Ford Mustang", 16, 699);
        Toy puzzleTajMahal = Toy.returnToyByTypeShortcut("Pu", "Taj Mahal", 14, 159);

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
//                .forEach(System.out::println);
                .forEach(each -> System.out.println(each.info()));


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // Wypisać wszystkie puzzle i klocki
        System.out.println("Wszystkie puzzle i klocki");
        toys.stream()
                .filter(toy -> toy instanceof Puzzles || toy instanceof Blocks)
//                .forEach(System.out::println);
                .forEach(each -> System.out.println(each.info()));


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // Policzyć sumę wartości wszystkich lalek
        double sum = toys.stream()
                .filter(toy -> toy instanceof Dolls)
                .mapToDouble(Toy::getPrice)
                .sum();
        System.out.println("Suma wartości wszystkich lalek: " + sum);


        //Wypisać podsumowanie ile kosztują łącznie zabawki poszczególnych typów - np pluszaki łącznie 300
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("Podsumowanie ile kosztują łącznie zabawki poszczególnych typów");
        Map<TypesOfToys, Double> toysValuedByType = toys.stream()
                .collect(Collectors.groupingBy(Toy::getToyType, Collectors.toList()))
                .entrySet().stream()
                .map(entry -> countForType(entry))
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        toysValuedByType.entrySet()
                .stream()
                .forEach(each -> System.out.println(each.getKey().getPolishName() + " : " + each.getValue()));

        /*
        Kod przedstawiony w pytaniu służy do podsumowania łącznych kosztów zabawek poszczególnych typów.
        W celu uzyskania takiej informacji, kod wykonuje operacje na strumieniach w Javie.

        Pierwszy strumień rozpoczyna się od listy zabawek i grupuje je według typu, używając klasy Collectors.
        Na wyjściu otrzymujemy mapę, w której kluczem jest typ zabawki, a wartością jest lista zabawek danego typu.

        Drugi strumień rozpoczyna się od otrzymanej mapy, a następnie wywołuje metodę countForType() na każdym wpisie w mapie.
        Metoda ta pobiera typ zabawki i odpowiadające mu wartości z listy zabawek, a następnie oblicza sumę cen zabawek za pomocą
        strumienia. Na koniec metoda umieszcza typ zabawki i obliczoną sumę w nowej mapie i zwraca tę mapę.

        Trzeci strumień rozpoczyna się od listy map zwróconych przez metodę countForType().
        Strumień ten spłaszcza listy map do strumienia wpisów (klucz-wartość) i następnie łączy je w jedną mapę,
        używając klasy Collectors.

        Na koniec, ostatnia linijka kodu wyświetla wynik, przechodząc przez wpisy w mapie z łącznymi kosztami zabawek
        dla każdego typu i drukując informacje na konsoli.

        Ogólnie kod jest czytelny i łatwy do zrozumienia, ponieważ jest on napisany w sposób deklaratywny z użyciem
        strumieni w Javie, co pozwala na bardziej zrozumiałe i uporządkowane przetwarzanie danych.
         */

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("Przekształcenie wszystkich klocków ogólnego typu zabawki na klocki");
        List<Blocks> blocks = toys.stream()
                .filter(toy -> toy instanceof Blocks)
                .map(each -> (Blocks)each)
                .collect(Collectors.toList());
        System.out.println("Wypisuje klocki");
        blocks.forEach(each -> System.out.println(each.info()));

    }



    // opis działania metody znajduje się powyżej
    private static Map<TypesOfToys, Double> countForType(Map.Entry<TypesOfToys, List<Toy>> entry) {
        TypesOfToys typesOfToys = entry.getKey();
        Map<TypesOfToys, Double> result = new HashMap<>();

        double sum = entry.getValue()
                .stream()
                .map(Toy::getPrice)
                .reduce((double) 0, (x, y) -> x + y);
        result.put(typesOfToys, sum);
        return result;
    }

    // Wypisanie do pliku listy zabawek - alfabetycznie
    // Poniższa metoda nie zadziała bo nie zapisuje zabawek do pliku
    // !!!
    public void saveToysToFileAlphabetically(String filename, List<Toy> toys) {
        File file = new File(filename);
        try (PrintWriter writer = new PrintWriter(file)) {
            toys.stream()
                    .sorted(Comparator.comparing(Toy::getName))
                    .forEach(toy -> writer.println(toy.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Poniżej użyta metoda write
    public void saveToysAplhabetically(String filename, List<Toy> toys) {
        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            toys.stream()
                    .sorted(Comparator.comparing(Toy::getName))
                    .forEach(toy -> {
                        try {
                            writer.write(toy.toString());
                        } catch (IOException e) {
                            throw new RuntimeException();
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    Ta metoda ma za zadanie zapisać listę zabawek (obiektów typu Toy) do pliku tekstowego,
    w kolejności alfabetycznej nazw zabawek.

    Najpierw metoda tworzy obiekt File na podstawie podanej nazwy pliku.

    Następnie otwierana jest strumień zapisu (FileWriter) do tego pliku.

    Kolejnym krokiem jest przetworzenie listy zabawek. Zabawki są sortowane w kolejności alfabetycznej ich nazw za pomocą
    sorted(Comparator.comparing(Toy::getName)).

    Następnie każda zabawka jest przekazywana do metody forEach, która zapisuje reprezentację tekstową każdej zabawki
    do pliku tekstowego.

    Jeśli wystąpi jakikolwiek błąd podczas zapisywania pliku, metoda rzuca wyjątek RuntimeException.

    W skrócie, ta metoda sortuje listę zabawek alfabetycznie i zapisuje je do pliku tekstowego.
     */

    // Wypisanie do pliku listy zabawek - sortując po cenie malejąco
    public void saveToysToFileFromLowestPrice(String filename, List<Toy> toys) {
        File file = new File(filename);

        try (FileWriter writer = new FileWriter(file)) {
            toys.stream()
                    .sorted(Comparator.comparing(Toy::getPrice).reversed())
                    .forEach(toy -> {
                        try {
                            writer.write(toy.toString() + System.lineSeparator());
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    // JESZCZE ZOSTAŁO

    // Wypisać do pliku listę zabawek wybierając najdroższą zabawkę danego typu - czyli np najdroższe klocki,
    // najdroższe puzzle itp. plik wygenerować w osobnym wątku










}
