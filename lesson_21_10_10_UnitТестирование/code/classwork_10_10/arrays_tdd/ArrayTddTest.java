package classwork_10_10.arrays_tdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ArrayTddTest {

    ArrayTdd arrayTdd;
    int[]array = {10, -10, 20, -15, 45, 23, 46};//массив

    @BeforeEach
    void setUp() {
        arrayTdd = new ArrayTdd(array);//объект, в который мы вложили созданный нами массив
    }

    @Test
    void countPositive() {//нам нужно создать 2 цели: желаемый результат и реальный
        //int[]array = {10, -10, 20, -15, 45};//массив
        //expected
        int expected = 5;//мы ожидаем на выходе 3 положит числа (10, 20, 45)
        //actual
        int actual = arrayTdd.countPositive(array);

        assertEquals(expected, actual, "Bad info");//можно ввести комент на случай выпадения ошибки
    }
}