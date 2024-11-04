package homework_36_31_10.bubbleSort;
import java.util.Random;
//Задача 1. Дополните метод bubbleSort() счетчиком, который позволяет узнать, сколько операций было выполнено по ходу сортировки. Выполните сортировку элементов массивов, в которых содержатся 10, 100 и 1000 элементов. Массивы заполните случайными целыми числами в интервале от 0 до 1000. Как растет количество операций при сортировке при росте количества элементов массива?
public class BubbleSort {

    // Метод bubbleSort с подсчетом операций
    public static int bubbleSort(int[] array) {//сортируем массив с помощью пузырьковой сортировки
        int count = 0;
        boolean swap;//swap-обмен

        for (int i = 0; i < array.length - 1; i++) {
            swap = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                count++; // увеличиваем счетчик на каждое сравнение
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                    count++; // увеличиваем счетчик на каждую перестановку. В итоге счетчик фиксирует общее количество операций
                }
            }
            if (!swap) break; // если на данном проходе цикла не было обменов, массив уже отсортирован
        }
        return count;
    }

    // Метод для генерации массива случайных чисел
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1001); // Случайное число от 0 до 1000
        }
        return array;
    }
}//end of class
