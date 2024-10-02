package classwork_07;
//повторение, в тип main вставляем сканер, просим через sout что-то ввести (пишеп приглашение для ввода через клаву)
// далее вводим тип переменной, в данном случае тип целого число int.
//далее пишем wich с кейсами. При вводе 1 получим январь, при цифре 2 получим февраль и т.д.
//если используем ->, то break НЕ используем (новая версия Java), если используем case ___ :то после кейса обязательно используем break
//next - подразумевает, что мы ждем от пользователя ЧТО-ТО. Int - после next - подразумевает, что пользователь может ввести только целое число!!! в (), если будет дабл - то можно ввести дробное число ит.д.

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");
        int choice = scanner.nextInt();

        switch (choice){

            case 1 -> System.out.println("January"); // быстрое копирование можно сделать через contr+D
            case 2 -> System.out.println("Февраль");
            case 3 -> System.out.println("март");
            case 4 -> System.out.println("апрель");
            case 5 -> System.out.println("май");
            case 6 -> System.out.println("июнь");
            case 7 -> System.out.println("июль");
            case 8 -> System.out.println("август");
            case 9 -> System.out.println("сентябрь");
            case 10 -> System.out.println("октябрь");
            case 11 -> System.out.println("ноябрь");
            case 12 -> System.out.println("декабрь");

        }
    }
}
