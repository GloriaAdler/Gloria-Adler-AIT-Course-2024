package classwork_06;
//Задание. Родители позволяют ребенку играть на компьютере 1 час. Напишите программу, которая будет реагировать на полученную в школе оценку:
     //"Молодец!", время для игр на компьютере увеличивается на 30 мин.
     //"Хорошо", ты можешь играть на компьютере обычные 60 минут.
     //"Посредственно.", время для игр уменьшается на 30 мин.
     //"Плохо!", сегодня никаких игр на компьютере.
     //"Позор семьи!", никаких игр на компьютере 2 дня.

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//полагаем, что ребенок может ввести свою оценку сам
        System.out.println("Which mark have you got today? (1, 2, 3, 4, 5)");// в ковычках идет приглашение для ввода
        int mark = scanner.nextInt();

        int timeOfGame = 60; //60 minut

        switch (mark) {// mark - аргумент, switch - оператор, который позволяет обработать несколько значений одновременно
            case 1: {//case - случай
                System.out.println("Good job!");
                timeOfGame = timeOfGame + 30;
                System.out.println("Time for game: " + timeOfGame);
                break;//выходим из switch с помощью оператора break
            }

            case 2: {//case - случай
                System.out.println("Good");
                System.out.println("Time for game: " + timeOfGame);
                break;//выходим из switch с помощью оператора break
            }

            case 3: {//case - случай
                System.out.println("Okay!");
                timeOfGame = timeOfGame - 30;
                System.out.println("Time for game: " + timeOfGame);
                break;//выходим из switch с помощью оператора break
            }

            case 4: {//case - случай
                System.out.println("Very bad");
                timeOfGame = 0;
                System.out.println("No game today!!!");
                break;//выходим из switch с помощью оператора break
            }

            case 5: {//case - случай
                System.out.println("Shame on you");
                timeOfGame = 0;
                System.out.println("Two days no games!!!");
                break;//выходим из switch с помощью оператора break
            }
            default:{
                System.out.println("Wrong input!");
            }
        }//end of swich
    }//end of main
}//end of class