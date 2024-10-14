package classwork_14_10;

import java.util.Random;
import java.util.Scanner;

//Задача 2. Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
// Запросите у пользователя какое-то натуральное число.
// Определите, есть ли это число в массиве.
// Создайте и используйте метод searchInArray, который получает на вход массив и искомое число,
// а возвращает ответ - нашлось ли это число в массиве.
public class Task02 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];
        //fill in array numbers
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = random.nextInt(100) + 1;//т.к. от 1, то нужно указать +1. По условию до 100, если в скобках пишем 100, то 100 войдет в диапазон

        }

        //print array numbers
        printArray(numbers);// вызываем метод - private static void printArray (в конце)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int n = scanner.nextInt();//n-переменная, в этот ввод прилетит наше необходимая переменная

        boolean isInArray = searchInArray(numbers, n);//пишем, что нам нужен новый метод

        System.out.println("Number " + n + " is in array: " + isInArray);

    }
    private static boolean searchInArray (int[] numbers, int n){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==n){
                return true;
            }
        }
        return false;
    }

    private static void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");

    }


}

