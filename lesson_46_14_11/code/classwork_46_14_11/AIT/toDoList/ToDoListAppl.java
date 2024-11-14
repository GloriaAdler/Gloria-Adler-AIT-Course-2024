package classwork_46_14_11.AIT.toDoList;

import classwork_46_14_11.AIT.toDoList.dau.ToDoListImpl;
import classwork_46_14_11.AIT.toDoList.model.Task;
import classwork_46_14_11.AIT.toDoList.view.Menu;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ToDoListAppl implements Serializable{

    public static final String FILE_NAME = "task_list.dat";

    public static void main(String[] args) throws FileNotFoundException {
        // greeting
        System.out.println("Welcome to ToDo Application!");

        ToDoListImpl toDoList = new ToDoListImpl();//главный объект
        LocalDate now = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    Task t = new Task(task, now);
                    toDoList.addTask(t);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    toDoList.removeTask(taskNumber);
                    break;
                }
                case 4: {
                    System.out.println("Saving... ");//Экономия/сохранение
                    // call method
                    toDoList.saveTasks(FILE_NAME);
                    break;
                }
                case 5: {
                    // call method
                    System.out.println("Loading... ");//загрузка
                    toDoList.loadTasks(FILE_NAME);
                    break;
                }
                case 6:
                    return;
                default: {
                    System.out.println("Wrong input.");//ошибка ввода
                }
            }//end of switch
        }//end of while
    }//end of main
}//end of class
