package homework_36_31_10.bubbleSort;
import static homework_36_31_10.bubbleSort.BubbleSort.bubbleSort;
import static homework_36_31_10.bubbleSort.BubbleSort.generateRandomArray;
//Задача 1. Дополните метод bubbleSort() счетчиком, который позволяет узнать, сколько операций было выполнено по ходу сортировки. Выполните сортировку элементов массивов, в которых содержатся 10, 100 и 1000 элементов. Массивы заполните случайными целыми числами в интервале от 0 до 1000. Как растет количество операций при сортировке при росте количества элементов массива?
public class BubbleSortAppl {
    public static void main(String[] args) {
        // Массивы с 10, 100 и 1000 элементами
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            int count = bubbleSort(array);
            System.out.println("The number of operations for an array of " + size + " elements: " + count);//количество операций для массива из
        }
    }
}
