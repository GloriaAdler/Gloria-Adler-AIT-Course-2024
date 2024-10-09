package homework_09_10;
import java.util.Scanner;
//Задание 1. Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел. Используйте классы-обёртки для преобразования строк в соответствующие примитивы.
public class Task1_09_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//вводим сканер
        System.out.println("Input integers: ");//выводим приглашение на экран, чтобы пользователь ввел целые числа
        String input = scanner.nextLine();//сканер будет принимать на ввод строку

       String[] numbers = input.split(" ");//чтобы массив, введенный пользователем, не "склеивался" добавляем пробелы между числами. ".split" - метод деления строки (split-расщеплять). Выбрано split(String regex, int limit).
       int sum = 0;

       for (String number : numbers){
           sum += Integer.parseInt(number);//преобразуем строку в int и ищем сумму
       }
        System.out.println("Sum: " + sum);

    }

}
