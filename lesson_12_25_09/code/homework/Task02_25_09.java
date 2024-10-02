package homework;

import java.util.Scanner;

//Задача 2. Вводится n - натуральное число.
//Напишите метод, который получает на вход n и вычисляет n! = 1 * 2 * 3 *... * n.
//Вызовите полученный метод.
//При каком значении n происходит переполнение памяти (результат станет отрицательным), выделяемой для значения n! типа int?
//Использовать цикл for.
public class Task02_25_09 {
    public static void main(String[] args) {
        // Вводим число n с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scanner.nextInt();



        // Вызываем метод для вычисления факториала
        long factorial = calculateFactorial(n);
        if (factorial == -1) {
            System.out.println("Переполнение памяти при вычислении факториала числа " + n);
        } else {
            System.out.println("Факториал числа " + n + " равен: " + factorial);
        }

        // Найдем значение n, при котором происходит переполнение
        findOverflowLimit();
    }

    // Метод для вычисления факториала
    public static long calculateFactorial(int n) {
        long result = 1; // Используем long для хранения результата
        for (int i = 1; i <= n; i++) {
            result *= i;
            // Проверка на переполнение
            if (result < 0) {
                return -1; // Возвращаем -1 в случае переполнения
            }
        }
        return result;
    }

    // Метод для нахождения значения n, при котором происходит переполнение памяти
    public static void findOverflowLimit() {
        long result = 1;
        int i = 1;
        while (true) {
            result *= i;
            if (result < 0) {
                System.out.println("Переполнение памяти произошло при n = " + i);
                break;
            }
            i++;
        }





    }




}
