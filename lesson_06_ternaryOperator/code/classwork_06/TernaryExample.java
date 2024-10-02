package classwork_06;

import java.util.Scanner;

//*Задание 2.*
//  В программе задаются два целых числа.
//  Найдите минимальное из них с помощью тернарного оператора.
//  Дополните программу возможностью ввода чисел пользователем
public class TernaryExample {
    public static void main(String[] args) {
        int a = 300;
        int b = 200;

        int min = (a<b)?a:b; // ternary operator,очень эффективный оператор сравнения

        System.out.println("min= " + min);

        int max = (a>b)?a:b; // ternary operator, b это иначе, если а всё таки не больше чем b по условию
        System.out.println("max = " + max);

//  Сценарий работы с пользователем:
// - "Включить" Scanner: ```Scanner scanner = new Scanner(System.in);``
// - Напечатать приглашение пользователю ввести данные с клавиатуры:
// - System.out.println("Input data: ");
// - Принять вводимые данные в переменную соответствующего типа:
        // int number = scanner.nextInt();
        // String str = scanner.nextLine();
        // char ch = scanner.next().charAt(0); если ничего не введено, то ничего и не считается, т.к. (0)

      //inpur data
        Scanner scanner = new Scanner(System.in);//есть готовый класс в Java, нужно включить в метод main, можно использовать один сканер для нескольких запросов от пользователей
        System.out.println("Input 1nd number: ");
        a= scanner.nextInt();
        System.out.println("Input 2nd number: ");
        b = scanner.nextInt();

        min = min(a,b);
        System.out.println("min= " + min);

    }

    public static int min (int a, int b){
        return (a<b)?a:b;
    }
}
