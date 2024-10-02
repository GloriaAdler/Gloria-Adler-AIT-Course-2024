package homework;
//Задача 1. Написать метод copyOfArray.
//Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength.
//Метод должен создать новый массив длиной newLength.
//В новый массив должны быть скопированы элементы из входящего массива:
//Пример: Исходный массив: {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2} +

import java.util.Arrays;//это Arrays.toString для вывода на печать

import static homework.Task1_ArrayMethods.copyOfArray;

public class Task1_ArrayMethodsAppl {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6};// Исходный массив

        int [] newArray = copyOfArray(array, 3);// Вызываем метод для копирования массива


        System.out.println("New array " + Arrays.toString(newArray)); // Выводим результат, но результат toString выводит только в квадратных скобках (не в фигурных, как в условии задачи).

    }//end of main

}//end of class

