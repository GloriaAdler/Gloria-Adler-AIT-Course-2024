package homework_09;
import java.util.Scanner;
//Задача 4. Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
          //упаковки в желтый бак.
          //пищевые отходы в коричневый бак.
          //бумага в зеленый бак.
          //прочие отходы в черный бак.
// Используйте цифры для кодирования вариантов действий.
public class Task_04_20_09 {
    public static void main(String[] args) {
        System.out.println("Этот бот поможет Вам верно выбросит мусор в необходимого цвета бак.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите вид мусора: 1 - упаковка.");
        System.out.println("                              : 2 - пищевые отходы.");
        System.out.println("                              : 3 - бумага.");
        System.out.println("                              : 4 - прочие отходы.");

        int number = scanner.nextInt();

       switch (number){//Используем swich case для кодирования вариантов действий.
           case 1 -> System.out.println("Воспользуйтесь желтым баком.");
           case 2 -> System.out.println("Воспользуйтесь коричневым баком.");
           case 3 -> System.out.println("Воспользуйтесь зеленым баком.");
           case 4 -> System.out.println("Воспользуйтесь черным баком.");

           default -> System.out.println("Данные введены не верно!");
       }//end of swich

    }//end of main

}//end of class
