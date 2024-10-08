package homework;
//Задача 2
//Заполнить массив четными числами от 0 до 50. 0, 2, 4, 8, ... , 42, 44, 48, 50
//Распечатать массив в порядке возрастания, затем в порядке убывания.
public class Task_02 {
    public static void main(String[] args) {

        int[] evenNumbers = new int[26];//размер массива для четных чисел от 0 до 50 (всего 26 элементов)
        int number= 0;

        //// Выводим массив в порядке возрастания
        System.out.println("Even numbers in ascending order:");
        for (int i = 0; i < evenNumbers.length; i++) {

            evenNumbers[i] = number;
            number += 2; // Увеличиваем на 2, чтобы получить следующее четное число
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();//пустая строка для перехода

        // Выводим массив в порядке убывания
        System.out.println("Even numbers in descending order:");
        for (int i = evenNumbers.length - 1; i >= 0; i--) {
            System.out.print(evenNumbers[i] + " ");
        }

    }
}
