package homework_06;
import java.util.Scanner;
//Написать приложение - калькулятор для работы с целыми числами:
// oper 1 => + oper 2 => - oper 3 => *, oper 4 => /, oper 5 => % , other print "Wrong operation".
// Числа и требуемая операция вводятся с клавиатуры.
public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число :");

        int num1 = scanner.nextInt();

        System.out.println("Выберите операцию: "); // Запрос мат.операций.
        System.out.println("1 => сложение (+)");
        System.out.println("2 => вычитание (-)");
        System.out.println("3 => умножение (*)");
        System.out.println("4 => деление (/)");
        System.out.println("5 => остаток от деления (%)");

        int oper = scanner.nextInt();

        System.out.println("Введите второе число :");

        int num2 = scanner.nextInt();

        // Выполняем операцию в зависимости от выбора пользователя
        switch (oper) {
            case 1 -> {
                System.out.println("Результат: " + (num1 + num2));
            }
            case 2 -> {
                System.out.println("Результат: " + (num1 - num2));
            }
            case 3 -> {
                System.out.println("Результат: " + (num1 * num2));
            }
            case 4 -> {
                if (num2 != 0) {
                    System.out.println("Результат: " + (num1 / num2));
                } else {
                    System.out.println("Ошибка! На ноль делить нельзя!");
                }
            }
            case 5 -> {
                if (num2 != 0 && num1 >= num2) {
                    System.out.println("Результат: " + (num1 % num2));
                } else {
                    System.out.println("Ошибка!");
                }
            }
            default ->  System.out.println("Неверная операция! Пожалуйста, выберите от 1 до 5.");

        }//end of switch
    }//end of main
}//end of class
