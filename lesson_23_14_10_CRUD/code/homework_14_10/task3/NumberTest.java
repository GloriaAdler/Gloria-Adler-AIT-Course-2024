package homework_14_10.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    private final Number numbers = new Number();

    @Test
    public void testIsPrimeWithPrimeNumber() {//тест с простыми числами
        assertTrue(numbers.isPrime(2));
        assertTrue(numbers.isPrime(3));
        assertTrue(numbers.isPrime(11));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {//тест с вариантами непростых чисел
        assertFalse(numbers.isPrime(-3));
        assertFalse(numbers.isPrime(0));
        assertFalse(numbers.isPrime(1));
        assertFalse(numbers.isPrime(12));
    }
}