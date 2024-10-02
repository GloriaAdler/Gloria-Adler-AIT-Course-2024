package classwork_07.cycles;
//Задача 4. Пользователь вводит натуральное число (целое, положительное).
// Выясните, сколько цифр в числе.

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        //5 467 пример
        // 5467 % 10 = 7 (остаток, т.к. % деление с остатком)
        // 5467 / 10 = 546 (только целые числа без остатка!!! т.к. используем деление /)
        //продолжим делать деление на 10 в цикле, пока не закончиться возможность делить на 10, т.е. пока результат не будет >0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter positive integer number: ");
        int number = scanner.nextInt();
        int number1 = number;

        int count = 0; // счетчик

        while (number > 0){
            // параметр number (в данном случае) обязательно участвует в сравнении
            number = number / 10;
            System.out.println(number);
            count++;
        }

        System.out.println("Digits in number " + number1 + " are = " + count);// в ответе мы увидем количество цифр в после ввода числа: 123 содержит 3 цифры
    }
}
