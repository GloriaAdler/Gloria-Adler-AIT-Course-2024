package homework;
//Задача 3 (*).
//Написать метод, принимающий массив целых чисел, и возвращающий среднее арифметическое всех его элементов.
//Проверьте его работу на массиве ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};
public class Task03 {
    public static void main(String[] args) {

        int[] ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

        double averageAge = averageAge (ageOfGroup);//вызываем метод private static double averageAge
        System.out.println("Average age " + averageAge);
    }//end of main

    private static double averageAge (int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (double) sum/array.length;

    }//end of averageAge

}//end of class
