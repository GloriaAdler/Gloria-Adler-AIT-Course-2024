package homewoork_23_10.doubleArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//Задание 2. Создайте массив действительных чисел на базе класса-обертки Double на 10 элементов, заполните его случайными числами в интервале от 0 до 10. Выполните сортровки:
//ascending; //
//descending. //
public class DoubleArray {
    public static void main(String[] args) {
        Double [] numbers = new Double[10];//Создаем массив Double на 10 элементов
//Заполняем массив случайными числами от 0 до 10
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = random.nextDouble()*10;//случайные числа от 0 до 10
        }

        System.out.println("Print as is:" + Arrays.toString(numbers));
        System.out.println("==============================================================================================");
        Arrays.sort(numbers);
        System.out.println("Ascending array: " + Arrays.toString(numbers));
        System.out.println("==============================================================================================");
        Arrays.sort(numbers, Collections.reverseOrder());//метод - Collections.reverseOrder() позволяет сортировать по убыванию.
        System.out.println("Descending array: " + Arrays.toString(numbers));

    }//end of main
}//end of class
