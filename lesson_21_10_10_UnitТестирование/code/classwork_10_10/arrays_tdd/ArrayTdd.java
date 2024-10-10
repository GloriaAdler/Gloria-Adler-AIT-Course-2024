package classwork_10_10.arrays_tdd;

import java.util.Arrays;
import java.util.Objects;

public class ArrayTdd {

    private int[] array;//поле в нашем классе, которое на вход примет целочисленный массив

    public ArrayTdd(int[] array) {
        this.array = array;
    }

    public int[] getArray() {//здесь введем массив
        return array;
    }

    public void setArray(int[] array) {//здесь voidом заполним
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayTdd{" +
                "array=" + Arrays.toString(array) +//Arrays.toString - класс-обёртка с кучей методов
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayTdd arrayTdd)) return false;
        return Objects.deepEquals(array, arrayTdd.array);//deepEquals - метод массива и сравниваем массив по элементам
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    //метод - посчитать целые положительные числа в массиве  - count positive numbers in array
    public int countPositive (int[]array){//int[]array - теперь метод знает, что у нас есть целочисленный массив с именем array
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                count++;
            }
        }
        return count;//результат это наш итый счетчик, который сработал в массиве
    }


}
