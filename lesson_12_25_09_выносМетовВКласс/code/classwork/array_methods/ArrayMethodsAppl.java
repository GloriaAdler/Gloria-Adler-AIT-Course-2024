package classwork.array_methods;

import java.util.Scanner;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

        int[] myArray = ArrayMethods.fillArray(-10, 20, 20);//сюда нужно вписать ТОЛЬКО цифры, буквы тянуться из методов в другом классе

        ArrayMethods.printArray(myArray);//пишем имя класса с большой буквы, вызывая его

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for searching: ");
        int n = scanner.nextInt();

        boolean isInArray = ArrayMethods.searchInArray(myArray, n);
        System.out.println("Number " + n + " is in array: " + isInArray);
        System.out.println();

//Задание 2. Дополните класс ArrayMethods методом calculatePercent,
//который получает массив данных об остатках на счетах пользователей банка и возвращает их с начисленными X процентами.
//Дополните класс ArrayMethods методом printArrayDouble(), который печатает массив данных типа double.
//В классе ArrayMethodsAppl создайте тестовый массив и вызовите для него метод calculatePercent,
//а затем распечатайте полученный результат.

        double[] accounts = {500, 300, 1580, 3000, 4500, 100};// Создаем тестовый массив остатков на счетах пользователей

        // Выводим исходный массив accounts - счета
        System.out.println("Остатки на счетах пользователей банка: ");

        ArrayMethods.printArrayDouble(accounts);//вызываем метод из класса ArrayMethods

        // Применяем начисление процентов (например 3,5 %)
        double percent = 3.5;

        ArrayMethods.calculatePercent(accounts, percent);//вызываем метод из класса ArrayMethods

        // Выводим массив, который возвращает данные по счетам с начисленными X процентами, в нашем случае 3,5%
        System.out.println("Остатки на счетах пользователей банка с начисленными " + percent + " %:");


        ArrayMethods.printArrayDouble(accounts);//и снова вызываем метод из класса ArrayMethods для вывода исходного массива, но уже после прибавления 3,5%
        System.out.println();

//Задание 3. Дополните класс ArrayMethods методами: sumArray(int[] array) - возвращает сумму всех элементов массива.
// averageValue(double[] array) - возвращает среднее арифметическое значение всех элементов массива.
// Вызовите и проверьте работу этих методов из класса ArrayMethodsAppl.

            // Тестовый массив целых чисел для метода sumArray
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            // Вызов метода sumArray и вывод результата
            int sum = ArrayMethods.sumArray(intArray);
            System.out.println("Сумма всех элементов массива: " + sum);

        System.out.println();

            // Тестовый массив для метода averageValue
            double[] doubleArray = {0.5, 2.5, 3.0, 4.7, 6.9};

            // Вызов метода averageValue и вывод результата
            double average = ArrayMethods.averageValue(doubleArray);
            System.out.println("Среднее арифметическое значение: " + average);

    }//end of main

}//end of class
