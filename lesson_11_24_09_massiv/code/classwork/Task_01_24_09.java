package classwork;
//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
//Найдите минимальный элемент массива и его индекс.
// Каков будет результат, если в массиве несколько одинаковых минимальных элементов?
// Найдите максимальный элемент массива и его индекс.
// Поменяйте местами минимальный и максимальный элементы, распечатайте массив.
public class Task_01_24_09 {
    public static void main(String[] args) {
        int[] array = {75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145};

        //минимальный элемент массива и его индекс
        int minOfArray = array [0];
        int indexOfMinElement = 0;

        for (int i = 0; i < array.length; i++) {// выбираем fori
            if (array[i]<minOfArray){//array[i] - текущий элемент массива
                minOfArray = array[i];//minOfArray - равен i элементу массива
                indexOfMinElement = i;//индекс ищет именно место числа i.
            }
        }
        System.out.println("Min element of array = " + minOfArray + ", index of min element = " + indexOfMinElement + ".");//вывод должен быть за пределами for в main.

        //максимальный элемент массива и его индекс.
        int maxOfArray = array [0];
        int indexOfMaxElement = 0;

        for (int i = 0; i < array.length; i++) {// выбираем fori
            if (array[i]>maxOfArray){//array[i] - текущий элемент массива
                maxOfArray = array[i];//minOfArray - равен i элементу массива
                indexOfMaxElement = i;//индекс ищет именно место числа i.
            }
        }
        System.out.println("Max element of array = " + maxOfArray + ", index of max element = " + indexOfMaxElement + ".");

        // Поменяйте местами минимальный и максимальный элементы, распечатайте массив.
        int temp = array [indexOfMinElement];
        array[indexOfMinElement]=array[indexOfMaxElement];
        array[indexOfMaxElement] = temp;



       for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
        }

        System.out.println();//переход на новую строку

    }
}
