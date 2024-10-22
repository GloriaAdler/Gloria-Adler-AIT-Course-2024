package homework_22_10.array;
//Задание 3(*). Напишите OddEvenComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке: четные целые числа должны идти перед нечетными числами. Для проверки работы компаратора создайте обычный класс, в нем метод main, задайте в нем массив из 10 случайных чисел в интервале от 1 до 100 и отсортируйте его с помощью OddEvenComparator.
//Пример: int[] array = {2, 5, 6, 10, 11, 18, 3}
//Результат после сортировки: {2, 6, 10, 18, 5, 11, 3}
import java.util.Arrays;
import java.util.Random;
public class OddEvenSortAppl {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        //генерируем массив случайных чисел от 1 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // Печать исходного массива
        System.out.println("Array: " + Arrays.toString(array));

        // Преобразование массива в массив объектов Integer для использования компаратора
        Integer[] arrayInteger = Arrays.stream(array).boxed().toArray(Integer[]::new);

        // Сортировка массива с использованием OddEvenComparator
        Arrays.sort(arrayInteger, new OddEvenComparator());

        // Печать отсортированного массива
        System.out.println("Sorted array: " + Arrays.toString(arrayInteger));
    }
}
