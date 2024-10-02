package homework_09;
import java.util.Scanner;
//Задача 5.(*) Программа запрашивает у пользователя количество секунд, прошедших с начала суток.
//Нужно вывести часы, минуты и секунды.
//Проверьте, что число введенных пользователем секунд не более 86 400.
public class Task_05_20_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд, прошедших с начала суток. Помните, что в сутках 86 400 секунд!");
        int totalSeconds = scanner.nextInt();

        if (totalSeconds < 0 || totalSeconds > 86400){//сначала введем проверку на корректность ввода кол-ва секунд в сутках
            System.out.println("Ошибка ввода!");
        }else {//если ввод верный нужно вычеслить кол-во часов, минут и секунд
            int hours = totalSeconds / 3600;// кол-во часов, в 1 часе 3600 сек.
            int minutes = (totalSeconds % 3600)/60;// кол-во минут, высчитываем остаток минут, который делим на 60 сек.
            int seconds = totalSeconds % 60;// кол-во секунд, высчитываем остаток секунд

            System.out.println(hours + " hours, " + minutes + " minutes " + seconds + " seconds.");//выводим результат
        }

    }//end of main

}//end of class
