package classwork_34_29_10.time.test;
import classwork_34_29_10.time.utilis.DateOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//В классе DateOperation из классной работы, реализовать метод getAge, принимающий дату рождения в виде стринга, и возвращающий возраст.
//Задача 2.
//В классе DateOperation из классной работы, реализовать метод sortStringDates, принимающий массив дат в виде массива стрингов, и возвращающий отсортированный массив стрингов-дат.
//Для проверки используйте класс DateOperationTest с юнит-тестами.
class DateOperationTest {

    @Test
    void getAge (){
        assertEquals(63, DateOperation.getAge("1961-04-12"));// проверка корректного возраста
        assertEquals(66, DateOperation.getAge("1957-11-28"));// проверка другого корректного возраста
        // Тест с некорректным форматом даты
        assertEquals(-1, DateOperation.getAge("12/04/1961"));
        assertEquals(-1, DateOperation.getAge("28-11-1961"));
    }

    @Test
    void testSortStringDates() {
        // Тест для метода sortStringDates
        String[] dates = {"2023-12-01", "2020-05-20", "2021-08-15", "2019-03-10"};
        String[] expectedSortedDates = {"2019-03-10", "2020-05-20", "2021-08-15", "2023-12-01"};
        // Сортировка и проверка на совпадение с ожидаемым результатом
        assertArrayEquals(expectedSortedDates, DateOperation.sortStringDates(dates));
    }
}