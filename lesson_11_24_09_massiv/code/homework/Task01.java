package homework;
//Задача 1
//Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
//Найдите максимальный элемент массива и его индекс.
//Поставьте этот элемент в начало массива вместо имеющегося.

public class Task01 {
    public static void main(String[] args) {

        int[] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83}; //задаем массив имеющихся целых чисел
//                      0   1   2    3   4    5   6   7    8   9
        int maxOfArray = array[0];//максимум в массиве
        int indexOfMaxArray = 0;//индекс максимума в массиве

        for (int i = 0; i < array.length; i++) {// задаем цикл для поиска максимального элемента (выбираем fori)
            if (array[i]>maxOfArray){//array[i] - текущий элемент массива
                maxOfArray = array[i];//maxOfArray - равен i элементу массива
                indexOfMaxArray = i;//индекс ищет именно место числа i.
            }
        }
        System.out.println("Max element of array = " + maxOfArray + ", index of max element = " + indexOfMaxArray + ".");//вывод должен быть за пределами for в main.

        ////Ставим максимальный элемент в начало массива вместо имеющегося
        int temp = array [indexOfMaxArray];
        array[0]=array[indexOfMaxArray];
        array[indexOfMaxArray] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }//end jf main
}//end of class
