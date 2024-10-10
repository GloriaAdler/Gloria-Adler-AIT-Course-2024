package classwork_10_10.classwork_10_10_string_numbers_tdd;

import org.junit.jupiter.api.BeforeEach;//библиотека для тестов
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringWithNumbersTest {

    StringWithNumbers stringWithNumbers; //объект который мы будем тестировать

    @BeforeEach
    void setUp() {

        stringWithNumbers = new StringWithNumbers("123 321 10");
    }

    @Test
    void sumOfNumbersInStringTest(){//этот метод будет тестировать метод sumOfNumbersInString. Эти методы ТОЛЬКО void!!! Название берем от тестируемого метода и приписываем слово Test, можно и произвольное название, НО общепринято именно так
        String str = "123 321 10";
        int expected = 454;//int expected - это то что мы ожидаем получить от нашего метода
        int actual = stringWithNumbers.sumOfNumbersInString(str);//результат, который нам должен принести метод

        assertEquals(expected, actual);//делаем сравнение ожидаемого (int expected) и реального (int actual). Метод assertEquals импортирован из готовой библиотеки


    }
}