package testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calculator;

    @BeforeEach
    void setup() {
        calculator = new StringCalculator();
    }

    // Jeśli prekażemy pusty String to mamy na wyjściu dostać 0
    @Test
    void shouldReturnZeroWhenEmptyStringPassed() {
        String entry = "";

        int result = calculator.add(entry);

        assertEquals(0, result, "Result is not zero!!!");
    }


    // Jeśli przekażemy do Stringa jedną liczbę to mamy ją dostać na wyjściu
    @Test
    void shouldReturnNumberPassedFromEntry() {
        String entry = "1";

        int result = calculator.add(entry);

        assertEquals(1, result, "Should return 1");
    }

    // Jeśli przekażemy w Stringu liczby po przecinku to mamy dostać ich sumę: "3.6" -> 9
    @Test
    void shouldReturnSumOfCommaSeperatedNumbers() {
        String entry = "3,5";

        int result = calculator.add(entry);

        assertEquals(8, result, "Should return 8");
    }

    // Jeśli przekażemy w Stringu liczby po przecinku to mamy dostać ich sumę: "3,6,1,2" -> 12
    @Test
    void shouldReturnSumOfCommaAllSeperatedNumbers() {
        String entry = "3,6,1,2";

        int result = calculator.add(entry);

        assertEquals(12, result, "Should return 12");
    }

    // Jeśli przekażemy w Stringu znak nowej linii zamiast jednego (lub kilku) z przecinków to też ma zadziałać:
    // "1,2\n5,6" -> 14
    @Test
    void shouldAddNumbersFromSeperatedLines() {
        String entry = "1,2\n5,6";

        int result = calculator.add(entry);

        assertEquals(14, result, "Result is not correct, expected 14");
    }

    // Dodajemy możliwość określenia własnego "przecinka", czyli w pierwszej linii możemy zdefiniować
    // czym liczby będą oddzielane, format następujący: "//;\n1;2\n3;4" -> 10
    //TODO
    // TEST NIE PRZECHODZI, METODA NIE DZIAłA
    @Test
    void shouldAllowDefiningCustomSeperator() {
        String entry = "//;\n1;2\n3;4;5";

        int result = calculator.add(entry);

        assertEquals(15, result, "Result is not correct, expected 15");
    }


    // Przekazanie liczby większej lub równej 1000 powoduje rzucenie wyjątku: Too Big Number
    @Test
    void shouldRaiseExceptionOnNumberOver3Digits() {
        String entry = "1000,22,34,2";
        try {
            int result = calculator.add(entry);
        } catch (Exception e) {
            assertEquals("Too Big Number", e.getMessage());
        }
    }
}