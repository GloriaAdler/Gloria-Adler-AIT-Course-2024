package homework;

//Задача 2. Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел и сколько решка.
//Запишите результаты в массив. Рассчитайте вероятность выпадения орла и решки.

import java.util.Random;

public class Task2_26_09 {
    public static void main(String[] args) {
        // Задаем переменные
        int[] tossResults = new int[100]; // Массив для хранения результатов бросков монетки. new int[100] - т.к. 100 бросков.
        int eagleCount = 0; // Счетчик для орлов
        int tailsCount = 0; // Счетчик для решек

        // Создаем новый объект класса Random для того, чтобы сгенерировать 100 случайных чисел, где предположим 0 это орел, а 1 - решка.
        Random random = new Random();

        // Вводим цикл бросков монетки (100 раз)
        for (int i = 0; i < 100; i++) {
            // Генерируем случайное числа 0 или 1: 0 - решка, 1 - орел
            tossResults[i] = random.nextInt(2);//2 - это только лишь две генерации, т.к. монетка имеет только 2 стороны

            // Подсчитываем количество орлов и решек
            if (tossResults[i] == 1) {
                eagleCount++; // Если выпал орел
            } else {
                tailsCount++; // Если не орел, то выпала решка
            }
            System.out.print(tossResults [i] + " ");// Массив выпавших чисел, где 0 это орёл, а 1 это решка-
        }//end of for

        // Рассчитываем вероятность, для этого сумму выпавших 0 и 1 делим на 100 бросков
        double eagleProbability = (double) eagleCount / 100;//Probability - вероятность.
        double tailsProbability = (double) tailsCount / 100;

        // Выводим результаты

        System.out.println();
        System.out.println("Eagles: " + eagleCount);
        System.out.println("Tails: " + tailsCount);
        System.out.println("The probability of an eagle falling out: " + eagleProbability + ".");
        System.out.println("The probability of tails falling out: " + tailsProbability + ".");
    }//end of main

}//end of class
