package classwork27_09;



//**Задача 1.**
//Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100. +
//Выполните сортировку полученного массива.                                  +
//Попало ли число 0 в этот массив? (выяснить с помощью binary search)        -
//            Если да, то на какое место (индекс) в массиве?                 -
//            Если нет, то на какой индекс его следует поставить?            -
public class RandomNumbers {
    public static void main(String[] args) {

        int[]arrayNumbers = new int [20];
        arrayNumbers = ArrayMethods.fillArray(-100, 100, 20);//так делаем потому что метод int[] fillArray возвращающий (не void), поэтому мы должны массив прировнять к методу
        ArrayMethods.printArray(arrayNumbers);//печатаем

        ArrayMethods.bubbleSort(arrayNumbers);//сортируем
        ArrayMethods.printArray(arrayNumbers);//снова печатаем, но уже после сортировки

        //проверяем попался ли 0
        int index = ArrayMethods.binarySearch(arrayNumbers, 0); //0-это искомый элемент из условия задачи
        index = (index > 0) ? index : -index - 1;//тернарный оператор
        System.out.println(index);





    }
}
