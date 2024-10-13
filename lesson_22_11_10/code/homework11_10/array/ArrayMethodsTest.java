package homework11_10.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    final ArrayMethods arrayMethods = new ArrayMethods();

    int[] array = arrayMethods.createRandomArray();//выносим над тестами, чтобы не вписывать в каждый тест массив

    @Test
    public void testCreateRandomArray() {//Длина массива должна быть 100 элементов
        assertEquals(100, array.length);
        for (int num : array) {
            assertTrue(num >= -10 && num <= 10);//проверяем, что все числа этого массива в диапазоне от -10 до 10
        }
    }

    @Test
    public void testCountPositiveNumbersLargeArray() {//проверяем кол-во положительных чисел
        int positiveCount = arrayMethods.countPositiveNumbers(array);
        assertTrue(positiveCount >= 0 && positiveCount <= 100);//positiveCount <= 100 - пердполагаем, что весь массив будет положительный
    }

    @Test
    public void testCountNegativeNumbersLargeArray() {//проверяем кол-во отрицательных чисел
        int negativeCount = arrayMethods.countNegativeNumbers(array);
        assertTrue(negativeCount >= 0 && negativeCount <= 100);//negativeCount <= 100 - пердполагаем, что весь массив будет отрицательным
    }

    @Test
    public void testCountEvenNumbersLargeArray() {//проверяем кол-во чётных чисел
        int evenCount = arrayMethods.countEvenNumbers(array);
        assertTrue(evenCount >= 0 && evenCount <= 100);//evenCount <= 100 пердполагаем, что весь массив будет состоять только из чётных цифр
    }

    @Test
    public void testCountZerosLargeArray() {//проверяем кол-во 0
        int zeroCount = arrayMethods.countZeros(array);
        assertTrue(zeroCount >= 0 && zeroCount <= 100);//zeroCount <= 100 - пердполагаем, что весь массив будет состоять только из нулей
    }

    @Test
    public void testSumOfOddIndexedElementsLargeArray() {//проверяем сумму индексов
        int sumOddIndex = arrayMethods.sumOfOddIndexedElements(array);
        // Так как диапазон от -10 до 10, сумма может быть положительной или отрицательной
        assertTrue(sumOddIndex >= -1000 && sumOddIndex <= 1000);//сумма всех элементов на нечетных индексах должна быть в пределах минимального и максимального значений (можно предположить, что все цифры массива будут либо -10, либо 10, тогда:  -10*100=-1000; 10*100=1000)
    }

    @Test
    public void testGetFifthElementLargeArray() {//проверяем существование 5го элемента на 4м индексе
        Integer fifthElement = arrayMethods.getFifthElement(array);
        assertNotNull(fifthElement);
    }
}