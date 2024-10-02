package homework_06;

import java.util.Scanner;

//Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает, какому времени года принадлежит введенный месяц.
public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Input - ввод
        System.out.println("Input the month ordinal number:");
        int month = scanner.nextInt();

        switch (month) {
            case 1 -> {
                System.out.println("This is January.");
            }
            case 2 -> {
                System.out.println("This is February.");
            }
            case 3 -> {
                System.out.println("This is March.");
            }
            case 4 -> {
                System.out.println("This is April.");
            }
            case 5 -> {
                System.out.println("This is May.");
            }
            case 6 -> {
                System.out.println("This is June.");
            }
            case 7 -> {
                System.out.println("This is July.");
            }
            case 8 -> {
                System.out.println("This is August.");
            }
            case 9 -> {
                System.out.println("This is September.");
            }
            case 10 -> {
                System.out.println("This is October.");
            }
            case 11 -> {
                System.out.println("This is November.");
            }
            case 12 -> {
                System.out.println("This is December.");
            }
            default -> System.out.printf("Wrong input!");
        }//end of swich
    }//end of main
}//end of class
