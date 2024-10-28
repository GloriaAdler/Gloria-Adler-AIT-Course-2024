package homework_30_28_10.to_do_list;
import java.util.Scanner;
//Задача 2. Начать реализацию приложения "Список дел".
//Использовать enum для организации меню (номер пункта, действие) приложения:
//добавить задачу
//посмотреть все задачи
//удалить задачу (по номеру)
//выйти из меню
public class ToDoListAppl {

    public static void main(String[] args) {

    ToDoList [] toDoLists = ToDoList.values();
    String [] tasks = new String[10];//предполагаем, что массив будет содержать 10 элементов
    int taskCount = 0; // Счётчик добавленных задач
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;

        while (flag) {
            System.out.println("\nImput your choice:");//\n — это специальный символ в Java, обозначающий перевод строки (или новую строку). \n в строке добавляет разрыв строки, и текст, идущий после него, начнётся с новой строки при выводе на экран.
            for (ToDoList option : toDoLists) {
                System.out.println(option.getNumber() + ". " + option.getDescription());
            }
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка новой строки

            switch (choice) {
                // Добавить задачу
                case 1 -> {
                    if (taskCount >= tasks.length) {
                        String[] newTasks = new String[tasks.length * 2];// увеличиваем размер массива задач при необходимости
                        for (int i = 0; i < tasks.length; i++) {
                            newTasks[i] = tasks[i];
                        }
                        tasks = newTasks;
                    }

                    System.out.print("Imput task: ");
                    String task = scanner.nextLine();
                    tasks[taskCount] = task; // Добавляем задачу в массив
                    taskCount++;
                    System.out.println("The task has been added!");

                }
                // Посмотреть все задачи
                case 2 -> {
                    if (taskCount == 0) {
                        System.out.println("The task list is empty.");
                    } else {
                        System.out.println("\nTask List:");
                        for (int i = 0; i < taskCount; i++) {
                            System.out.println((i + 1) + ". " + tasks[i]);
                        }
                    }
                }
                // Удалить задачу
                case 3 -> {
                    if (taskCount == 0) {
                        System.out.println("The task list is empty.");
                    } else {
                        System.out.println("\nСписок задач:");
                        for (int i = 0; i < taskCount; i++) {
                            System.out.println((i + 1) + ". " + tasks[i]);
                        }
                    }

                    System.out.print("Enter the number of the task to delete: ");
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine(); // Очистка новой строки

                    if (taskNumber > 0 && taskNumber <= taskCount) {
                        for (int i = taskNumber - 1; i < taskCount - 1; i++) {
                            tasks[i] = tasks[i + 1];
                            }
                    tasks[taskCount - 1] = null; // Убираем последнюю задачу
                    taskCount--;
                    System.out.println("The task has been deleted!");
                    } else {
                        System.out.println("Invalid issue number.");
                    }
                }

                case 4 -> {
                    System.out.println("Exit the program. Goodbye!");
                    flag = false;
                }

                default -> System.out.println("Wrong choice");

            }//end of switch

        }//end of while

    }//end of main

}//end of class
