package classwork_09;
import java.util.Scanner;
//Задание 1. Доработать калькулятор так, чтобы он продолжал работать после выполнения одного действия с парой чисел.
public class Calculator {

    static int num1, num2, action; //чтобы переменные int, указанные до метода main были видны, нужно присвоить им метод static, тогда переменные станут доступны всему классу
    static int result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //начать заново, чтобы каждый раз не запускать программу заново через зеленую кнопку пуска
        boolean flag = true; //boolean принимает только true/false. Flag остановит цикл, иначе он будет бесконечен

        while (flag){

            System.out.println("Continue? y/n");
            char ch = scanner.next().charAt(0);//считает символы с вводимой строки. charAt(0)- с этой строки берем первый символ, из того что ввел пользователь
            if (ch=='y') {

                System.out.println("Input 1st number");
                num1 = scanner.nextInt();
                System.out.println("Input 2nd number");
                num2 = scanner.nextInt();
                System.out.println("Input action");
                System.out.println("1 -> '+'");
                System.out.println("2 -> '-'");
                System.out.println("3 -> '*'");
                System.out.println("4 -> '/'");
                System.out.println("5 -> '%'");
                System.out.println("0 -> exit");

                action = scanner.nextInt();//1, 2, 3 ...

                switch (action) {
                    case 1 ->
                            result = sum(num1, num2);//в sum будут тянуться num1, num2, action. из этой строки инфа идет в метод int ниже, т.е. то что в скобках должно совпадать, но в методе пишем с int
                    case 2 ->
                            result = deduct(num1, num2);//в sum будут тянуться num1, num2, action. из этой строки инфа идет в метод int ниже, т.е. то что в скобках должно совпадать, но в методе пишем с int
                    case 3 ->
                            result = miltiplay(num1, num2);//в sum будут тянуться num1, num2, action. из этой строки инфа идет в метод int ниже, т.е. то что в скобках должно совпадать, но в методе пишем с int
                    case 4 ->
                            result = division(num1, num2);//в sum будут тянуться num1, num2, action. из этой строки инфа идет в метод int ниже, т.е. то что в скобках должно совпадать, но в методе пишем с int
                    case 5 -> result = restOfDivision(num1, num2);
                    case 0 ->
                            flag = false; // остановили цикл, цикл работает только пока он true, как только получим фальшь, цикл остановиться, т.е. как тольок пользователь введет 0, он будет воспринят как фальшь и цикл замкнется

                    default -> System.out.println("Wrong input!");
                }//end of swich

                System.out.println("Result: " + result);
            }else {flag=false;};//закрылся цикл, как только введено не Y!!!
            //весь свичь сработал в если, если правла, то всё работает, как только фальшь, цикл замкнули
            //начать заново, чтобы каждый раз не запускать программу заново через зеленую кнопку пуска

        }//end of while

    }//end of main

// вынесли все методы расчетов +-*/%
    private static int sum(int num1, int num2){// (метод возвращает результат) эти переменные (int num1, int num2, int action) в скобках доступны методу int. Переменные у нас в классе, поэтому новых не нужно придумывать
        return num1+num2;
    }
    private static int deduct(int num1, int num2){
        return num1-num2;
    }
    private static int miltiplay(int num1, int num2){
        return num1*num2;
    }
    private static int division(int num1, int num2){
        return num1/num2;
    }
    private static int restOfDivision(int num1, int num2){
        return num1%num2;
    }
}//end of class
