package homework_06;
import java.util.Scanner;
//Напишите программу для машины на светофоре.
//Что делать водителю, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.
public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input traffic light color: red, yellow или green");
        String color = scanner.next();

        switch (color) {
            case "red" -> {
                System.out.println("Stop!!!");
            }
            case "yellow" -> {
                System.out.println("Attention! Get ready to go.");
            }
            case "green" -> {
                System.out.println("Let´s go!!!");
            }
            default -> System.out.printf("Wrong input!");

        }//end of swich
    }//end of main
}//end of class
