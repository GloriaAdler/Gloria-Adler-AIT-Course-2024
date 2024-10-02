package homework;

import java.util.Arrays;

//Задача 4.(*)
//Написать метод, принимающий массив целых чисел, и "разворачивающий" его.
//Последний элемент становится нулевым, предпоследний, первым, и т. д.
//Подсказка: этот метод должен изменить полученный массив, а не распечатать его в обратном порядке.
public class Task04 {
    public static void main(String[] args) {
      //вводим произвольный массив целых чисел
      int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        // Выводим исходный массив
        System.out.println("The source array: " + Arrays.toString(numbers));//The source array - исходный массив. Arrays.toString - отражает строкой целые числа int

        // Разворачиваем массив
        reverseArray(numbers);//reverse array - обратный массив

        // Выводим развернутый массив
        System.out.println("The reverse array: " + Arrays.toString(numbers));
    }//end of main

    // используем новый метод для того, чтобы развернуть исходный массив
    public static void reverseArray(int[] array) {//reverse array - обратный массив

        // Нужно поменять местами элементы массива, начиная с первого и последнего
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i]; // Временная переменная для хранения значения
            array[i] = array[array.length - i - 1]; // Меняем местами
            array[array.length - i - 1] = temp; // Устанавливаем сохраненное значение
        }//end of for

    }//end of reverseArray
}//end of class
