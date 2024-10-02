package homework_07;

import java.util.Scanner;

//Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.
// Пример: строка - молоко, кол-во раз 3 молоко молоко молоко
public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input word: ");
        String inputString =scanner.nextLine();//ввод слова, nextLine - берет всю строку с пробелами + ему нужно нажатие enter

        System.out.println("Input quantity: ");
        int quantity = scanner.nextInt();

        int count = 0;
        System.out.println("Result:");
        while (count < quantity){
            System.out.println(inputString);
            count++;
        }
    }
}
