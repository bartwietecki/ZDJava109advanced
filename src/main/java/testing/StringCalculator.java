package testing;

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
    public int add(String numbers) {
        if(numbers.equals("")) {
            return 0;
        }
        return Integer.parseInt(numbers);

    }
}
