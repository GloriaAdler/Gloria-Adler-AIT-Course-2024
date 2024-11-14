package classwork_46_14_11.AIT.toDoList;

import classwork_46_14_11.AIT.toDoList.dau.ToDoListImpl;
import classwork_46_14_11.AIT.toDoList.model.Menu;

import java.util.Scanner;

public class ToDoListAppl {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");

        ToDoListImpl toDoList = new ToDoListImpl();

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");


                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");

                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");

                    break;
                }
                case 4: {
                    System.out.println("Saving... ");

                    break;
                }
                case 5:{
                    System.out.println("Loading... ");
                    break;

                }
                case 6:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}
