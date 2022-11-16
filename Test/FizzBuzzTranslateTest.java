import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void displayFizzBuzzDiv3And5() {
        String expected = "FizzBuzz";
        int numberCheck = 15;

        String result = FizzBuzzTranslate.getFizzBuzzFirst(numberCheck);
        assertEquals(expected,result);
    }

    @Test
    void displayFizzBuzzDiv3() {
        String expected = "Fizz";
        int numberCheck = 3;

        String result = FizzBuzzTranslate.getFizzBuzzFirst(numberCheck);
        assertEquals(expected,result);
    }

    @Test
    void displayFizzBuzzDiv5() {
        String expected = "Buzz";
        int numberCheck = 5;

        String result = FizzBuzzTranslate.getFizzBuzzFirst(numberCheck);
        assertEquals(expected,result);
    }

    @Test
    void displayFizzBuzzNotDiv3And5() {
        int numberCheck = 31;
        String expected = String.valueOf(numberCheck);

        String result = FizzBuzzTranslate.getFizzBuzzFirst(numberCheck);
        assertEquals(expected,result);
    }

    @Test
    void displayFizzBuzzNotDiv3And5Second() {
        int numberCheck = 8;
        String expected = String.valueOf(numberCheck);

        String result = FizzBuzzTranslate.getFizzBuzzFirst(numberCheck);
        assertEquals(expected,result);
    }

    @Test
    void displayFizzBuzz5() {
        int numberCheck = 52;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.getFizzBuzzAdvanced(numberCheck);
        assertEquals(expected,result);
    }

    @Test
    void displayFizzBuzz3() {
        int numberCheck = 13;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.getFizzBuzzAdvanced(numberCheck);
        assertEquals(expected,result);
    }

    @Test
    void readNumberString() {
        int numberCheck = 98;
        String expected = "ninety eight";

        String result = FizzBuzzTranslate.readNumber(numberCheck);
        assertEquals(expected,result);
    }
}