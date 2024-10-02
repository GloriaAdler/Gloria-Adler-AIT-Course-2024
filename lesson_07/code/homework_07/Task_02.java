package homework_07;
import java.util.Scanner;
//Вводится положительное целое число, найдите сумму его цифр. Пример: 1725, сумма цифр = 15
public class Task_02 {
    public static void main(String[] args) {
        //Нужен Scanner для получения положительного целого числа от пользователя через клаву.
        Scanner scanner = new Scanner(System.in);
        //Просим ввести положительное целое число.
        System.out.println("Input a positive integer:");
        int integer = scanner.nextInt(); //integer - целое число, () - ввод пользователя.
        // Вводим переменную для хранения суммы цифр
        int count = 0; // счетчик

        // Находим сумму цифр числа
        while (integer > 0) {
            count += integer % 10;  //  Получаем последнюю цифру числа и добавляем к сумме
            integer = integer/10;   // или integer /= 10; Убираем последнюю цифру
        }
        // Выводим результат
        System.out.println("Sum of digits: " + count + ".");
    }
}
