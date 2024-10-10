package homework_10_10;
import java.util.Arrays;
//Задание 2. Разработайте тесты для методов обрабатывающих массивы:
//поиск минимального (максимального) элемента
//поиск индекса минимального (максимального) элемента
public class Task2Array {

    private int [] array;
//конструктор
    public Task2Array(int[] array) {
        this.array = array;
    }

    //поиск минимального элемента
    public static int minOfArray (int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //поиск максимального элемента
    public static int maxOfArray (int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //поиск индекса минимального элемента
    public static int minIndexOfArray (int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    //поиск индекса максимального элемента
    public static int maxIndexOfArray (int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
