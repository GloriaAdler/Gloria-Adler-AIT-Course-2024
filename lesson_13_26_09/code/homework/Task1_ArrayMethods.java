package homework;
//Задача 1. Написать метод copyOfArray.
//Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength +
//Метод должен создать новый массив длиной newLength. +
//В новый массив должны быть скопированы элементы из входящего массива:
//Пример: Исходный массив: {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

public class Task1_ArrayMethods {

    // Метод для копирования массива - copyOfArray

public static int[] copyOfArray (int[] array, int newLength ){//int[] array - массив целых чисел; int newLength - целое число - длина нового массива newLength

        int[] newArray = new int[newLength]; //Создаем новый массив нужной нам длины

        // Копируем элементы из исходного массива в новый

        for (int i = 0; i < newLength; i++) {
            newArray[i] = array[i];
        }
        return newArray;

    }//end of copyOfArray

}//end of class
