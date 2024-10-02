package classwork_08;

import java.util.Scanner;

//Пользователь вводит натуральное число n.
// Определите, является ли оно простым.
// Простое число - это такое число, которое делится только на себя и на 1.
// Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ... Обеспечьте защиту от ввода пользователем отрицательных чисел.
// простые числа в третем десятке: 31, 37 (это числа, которые делятся только сами на себя!!!)
// 15 является ли число простым? нет, т.к. делится на 5
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive number: ");

        int number = scanner.nextInt();//scanner.nextInt - получим только целое число

        // check correct number
        while (number<=0){// цикл while будет каждый раз нас возвращать в начало цикла, пока не будет введено верное число
            System.out.println("Wrong input!");
            System.out.println("Try again, please.");
            number = scanner.nextInt();// повторный запрос, если число введено не верно в предыдущий раз, кол-во попыток не ограничено
        }

        boolean isPrime = isPrimeNumber (number);
        System.out.println(number + " is prime: " + isPrime);
    }

    private static boolean isPrimeNumber (int number){
        int div = 2; //div-делитель, минимально 2, т.к. простое число делится на 1 и само на себя, чтобы это исключить нужно поделить на что-то другое

        while (div < number) {
            if(number % div == 0){//если остаток от деления равен 0, то это значит, что число поделисось, т.е. не простое
                return false;

            }
            div++;
        }
      return true;
    }
}
