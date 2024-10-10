package homework_10_10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Task2ArrayTest {

    Task2Array task2Array; //объект тестирования
    int[] array = {1, 2, 3, 4, 5};//заводим произвольный массив на 5 элементов

    @BeforeEach
    void setUp() {
        task2Array = new Task2Array (array);
    }

    @Test
    void minOfArray() {
        int expectedMin = 1;//минимальное число 1
        int actualMin = Task2Array.minOfArray(array);
        assertEquals(expectedMin, actualMin, "Error. The minimum value does not match.");//выводим ошибку, если ожидаемое expected не совпало с реальным actual
    }

    @Test
    void maxOfArray() {
        int expectedMax = 5;//максимальное число массива 5
        int actualMax = Task2Array.maxOfArray(array);
        assertEquals(expectedMax, actualMax, "Error. The maximum value does not match.");
    }

    @Test
    void minIndexOfArray() {
        int expectedMinIndex = 0;//индекс минимального числа 0
        int actualMinIndex = Task2Array.minIndexOfArray(array);
        assertEquals(expectedMinIndex, actualMinIndex, "Error. The index of minimum value does not match.");
    }

    @Test
    void maxIndexOfArray() {
        int expectedMaxIndex = 4;//индекс максимального числа 4
        int actualMaxIndex = Task2Array.maxIndexOfArray(array);
        assertEquals(expectedMaxIndex, actualMaxIndex, "Error. The index of maximum value does not match.");
    }
}