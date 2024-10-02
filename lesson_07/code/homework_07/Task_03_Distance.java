package homework_07;
import java.util.Scanner;
//В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
//Определите номер того дня, на который пробег спортсмена составит не менее target километров.
//Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.
public class Task_03_Distance {
    public static void main(String[] args) {
        //Нужен Scanner для получения информации о кол-ве км. от пользователя через клаву.
        Scanner scanner = new Scanner(System.in);
        //Просим ввести кол-во км
        System.out.println("Input the distance for the first day (in kilometers).");
        double km = scanner.nextDouble();
        // просим ввести цель
        System.out.println("Input the target (in kilometers).");
        double target = scanner.nextDouble();
        //вводим переменные
        int count = 0; //вводим счетчик с первого дня пробежки
        double distance = km;

        // Используем while, пока пробег не достигнет цели
        while (distance < target){
            distance = distance + (distance*0.1); // пробег на 10% больше
            System.out.println("Увеличение пробежки: " + distance);
            count++; // переход на следующий день
        }
        //вывод результатов
        System.out.println("On the " + count+ " day the athlete will run at least " + target+ " kilometers.");
    }
}
