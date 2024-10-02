package classwork;
//Задача 4. Создайте массив, который содержит возраст студентов группы.
//какой возраст максимальный?
//какой возраст минимальный?

public class Task_04MinMax {
    public static void main(String[] args) {

        int[] age = {47, 49, 37, 47, 52, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};
        int min = age[0];
        int max = age[0];
//возраст минимальный
        for (int i = 0; i < age.length; i++) {

            if (age[i] < min){
                min = age[i];
            }
        }
        System.out.println("Min age = " + min + ".");
//возраст максимальный
        for (int i = 0; i < age.length; i++) {

            if (age[i] > max){
                max = age[i];
            }
        }
        System.out.println("Max age = " + max + ".");
    }
}
