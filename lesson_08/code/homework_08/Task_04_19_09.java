package homework_08;
import java.util.Scanner;
//Задача 4. В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
           //Каждый тип билета имеет свою стоимость.
           //Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
           //Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента и флаг VIP-места, а возвращает итоговую стоимость билета.
           //Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.
public class Task_04_19_09 {
    public static void main(String[] args) {
        System.out.println("В нашем кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).");//вводное сообщение
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите, пожалуйста, ваш возраст:");//Запрашиваем возраст, для определения пенсионного возраста
        int age = scanner.nextInt();//нужно только целое число возраста
        System.out.print("Вы студент? (1-да/2-нет): ");//Запрашиваем информацию, является ли студентом
        int isStudent = scanner.nextInt(); // нужна введенная строка
        System.out.print("Вы хотите VIP-место? (1-да/2-нет): ");// Запрашиваем, хочет ли пользователь VIP-место
        int vip = scanner.nextInt();// нужна введенная строка

        // Рассчитываем стоимость билета
        double ticketPrice = calculateTicketPrice(age, isStudent, vip);

        // Выводим итоговую стоимость билета
        System.out.println("Итоговая стоимость вашего билета: " + ticketPrice);
    }//end of main

    private static double calculateTicketPrice(int age, int isStudent, int vip) {

        double basePrice = 20.0;  // Базовая стоимость стандартного билета

        // Определяем скидки
        if (age >= 67) {  // Скидка для пенсионеров (25%)
            basePrice = basePrice * 0.75;
        } else if (isStudent==1) {  // Скидка для студентов (10%)
            basePrice = basePrice * 0.9;
        }
        //Увеличиваем стоимость, если выбрано VIP-место
        if (vip==1) {
            basePrice = basePrice * 1.25;
        }
        return basePrice;

    }//end of calculateTicketPrice
}//end of class


