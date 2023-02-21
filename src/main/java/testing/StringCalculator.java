package testing;

import java.util.Arrays;

/**
 * TDD - Test Driven Development
 * Pisanie wg podejścia Red -> Green -> Refactor
 * czyli:
 * Piszemy najmniejszy możliwy niedziałający kawałek kodu
 * Następnie:
 *  1. Piszemy test do tego kawałka kodu - test się wywala przy uruchomieniu.
 *  2. Poprawiamy ten kawałek kodu ta aby test przeszedł.
 *  3. Robimy refactor kodu tak aby był ładniejszy, za każdym razem test i wszystkie poprzednie testy mają przechodzić
 *  4. Dostajemy nowy kaweałek kodu do napisania - wracamy do pkt. 1.
 */

public class StringCalculator {

    // metodka otrzymuje argument typu String, a ma zwrócić nam Integera

//    public int add(String numbers) {
//        if (numbers.equals("")) {
//            return 0;
//        }
//        return Integer.parseInt(numbers);
//    }
//

//    public int addComma(String number){
//        String[] numbers = number.split(",");
//        int sum = 0;
//        for(String num : numbers) {
//            sum += Integer.parseInt(num);
//        }
//        return sum;
//    }


    public int add(String entry) {

        if (entry.equals("")) { // sprawdzamy czy entry (nasz ciąg znaków) jest pusty. Tak -> zwraca 0, Nie -> Przechodzimy dalej
            return 0;

        } else {
            String[] numbers = entry.split("\n");
            String separator = ",|\n"; // tutaj mam domyślny separator

            if (numbers.length > 0 && numbers[0].startsWith("//")) {
                separator = numbers[0].substring(2); // ustawienie niestandardowego separatora
                numbers = Arrays.copyOfRange(numbers, 1, numbers.length); // usuń linię z separatorem
            }

            int sum = 0;
            for (String line : numbers) {
                String[] number = line.split(separator);
                for (String num : number) {
                    int intNum = Integer.parseInt(num);
                    if (intNum > 1000) {
                        throw new IllegalArgumentException("Too Big Number");
                    }
                    sum += intNum;
                }
            }
            return sum;
        }
    }

    /*
Metoda add() przyjmuje ciąg znaków entry jako parametr, reprezentujący liczby do dodania.

Pierwsza linia sprawdza, czy entry jest pusty. Jeśli tak, zwraca 0 jako wynik. W przeciwnym razie przechodzi do kolejnego kroku.

Następnie ciąg znaków entry jest dzielony na tablicę liczb za pomocą separatorów '\n' lub ','.

Tworzona jest zmienna separator, która początkowo ma wartość ",|\n", czyli standardowych separatorów.

Jeśli pierwszy element tablicy numbers zaczyna się od znaków "//", to zostaje to uznane za niestandardowy separator i przypisywany jest do zmiennej separator. Ponadto pierwszy element tablicy zostaje usunięty.

Tworzona jest zmienna sum o wartości początkowej 0.

Dla każdej linii w tablicy numbers (liczb), ta linia jest dzielona na mniejsze ciągi znaków za pomocą separatora separator.

Dla każdego elementu w nowej tablicy liczb, jest on przekształcany na liczbę całkowitą i dodawany do sum, chyba że jest większa niż 1000, wtedy rzucany jest wyjątek IllegalArgumentException.

Po zakończeniu pętli for zwracana jest suma.
     */

// Metoda od Grzegorza do ostatniego testu (wywalenie błędu przy większej lub równej liczbie od 1000)
    public int addGregMethod(String numbers) {
        int result =0;
        if(numbers.equals("")) {
            return 0;
        }

        String [] numbersDivided = numbers.split(",");

        for(String givenNumber : numbersDivided) {
            if (Integer.parseInt(givenNumber) >= 1000) {
                throw new IllegalArgumentException("Too Big Number");
            }
            result += Integer.parseInt(givenNumber);
        }
        return result;
    }

}