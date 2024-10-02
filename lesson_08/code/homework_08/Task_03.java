package homework_08;
import java.util.Scanner;
//Задача 3. Определение времени суток.
      //Напишите программу, которая принимает на вход текущий час (от 0 до 23) и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).
public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//задаем скан
        System.out.println("Input time (0 to 23): ");//просим ввести время
        int time = scanner.nextInt();//запрос на экране времени

        //заводим цикл while, он будет каждый раз нас возвращать в начало цикла, пока не будет введено верное число в диапазоне от 0 до 24
        while (time < 0 || time > 23) {// цикл while будет каждый раз нас возвращать в начало цикла, пока не будет введено верное число
            System.out.println("Wrong input!");
            System.out.println("Try again, please.");
            time = scanner.nextInt(); // повторный запрос, если число введено не верно в предыдущий раз, кол-во попыток не ограничено
        }//закрываем цикл,как только поступит верное число
            if (time >= 0 && time < 6) { //сравниваем вводимое число с 0 до 6 утра - ночь
                System.out.println("Night.");
            } else if (time >= 6 && time < 12) {//если с 6 утра до 12 это утро
                System.out.println("Morning.");
            } else if (time >= 12 && time < 18) {// с 12 до 18 - день
                System.out.println("Day.");
            } else {//всё остальное, что не попало в предыдущие сравнения - это вечер.
                System.out.println("Evening.");
            }
    }
}
