package homework;
//Задача 1
//Собрать в массив данные о дневной температуре в вашем городе за прошедшую неделю.
//Выведите на печать температуру, которая была во вторник и затем в четверг.
//Найти среднюю температуру за прошлую неделю.
public class Task_01 {
    public static void main(String[] args) {
        int[] temperature = {25, 18, 20, 20, 19, 15, 16};//погода в Берлине с 23 по 29 сентября

        int sum = 0;

        for (int i = 0; i < temperature.length; i++){
            sum = sum + temperature[i];//нужно найти сумму, чтобы найти среднее
        }//end of for

        System.out.println("Temperature on Tuesday - " + temperature[1] + ".");//выводим темп. во вторник
        System.out.println("Temperature on Thursday - " + temperature[3] + ".");//выводим темп. в четверг

    double averageTemperature = (double) sum / temperature.length; //
        System.out.println("Average temperature = " + averageTemperature + ".");//выводим ср.темп.

    }//end of main
}//end of class
