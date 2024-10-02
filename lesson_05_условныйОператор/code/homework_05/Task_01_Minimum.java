package homework_05;
//Задача 1. Написать метод, возвращающий минимальное из двух целых чисел. Числа задаются в программе.

public class Task_01_Minimum {

    public static void main(String[] args) {
        int a = 16;
        int b= 15;
        int min = minimum (a, b);

        System.out.println("Minimum " +min+ ".");

    }//end of main

    private static int minimum (int a, int b){
        int min;
        if (a<=b){
            min = a;
        }else {
            min = b;
        }
        return min;
    }

}//end of class
