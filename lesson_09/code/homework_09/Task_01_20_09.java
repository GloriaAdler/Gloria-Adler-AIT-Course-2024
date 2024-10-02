package homework_09;
import java.util.Scanner;
//Задача 1. В программе задаются часы, минуты и секунды.
//Нужно вывести общее количество секунд, прошедших с начала суток.
//Вычисление произведите в методе, который получает на вход часы, минуты и секунды.
public class Task_01_20_09 {
    public static void main(String[] args) {
        System.out.println("Вам нужно ввести время с точностью до секунд.");
        //Задаём часы, минуты и секунды через ввод. Пишем приглашения на 3 действия пользователю.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input hours: ");
        int hours = scanner.nextInt();
        System.out.println("Input minutes: ");
        int minutes = scanner.nextInt();
        System.out.println("Input seconds: ");
        int seconds = scanner.nextInt();

        int totalSeconds = calculateSeconds(hours, minutes, seconds); //нужен метод, чтобы посчитать секунды
        System.out.println("Общее количество секунд с начала суток: " + totalSeconds);//выводим на экран кол-во секунд

    }//end of main

    // Метод для вычисления общего кол-ва секунд
    private static int calculateSeconds(int hours, int minutes, int seconds) {
            int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;//тут посчитали, ретурном вернули в предыдущий метод
            return totalSeconds;//return - возвращение, идти обратно. return - нужен, чтобы вернуть в метод main полученные результат из метода calculateSeconds.
    }
}//end of class
