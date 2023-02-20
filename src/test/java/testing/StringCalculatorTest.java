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



}