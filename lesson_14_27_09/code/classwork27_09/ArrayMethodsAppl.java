package classwork27_09;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

        //create array with random numbers
        //тестируем сортировку рандомного массива

//        int[] myArray = ArrayMethods.fillArray(0, 100, 10);//fill - заполнение массива случайными цифрами
//
//        //print array
//        ArrayMethods.printArray(myArray);
//
//        //sort array
//        ArrayMethods.bubbleSort(myArray);
//
//        //print array
//        ArrayMethods.printArray(myArray);


        //Тестируем разворот массива, на примере нового массива
        int[] newArray = ArrayMethods.fillArray(1, 20, 6);//например нам нужны 6 случайных числ от 1 до 20
        ArrayMethods.printArray(newArray);

        ArrayMethods.reverseArray(newArray);
        ArrayMethods.printArray(newArray);














    }//end of main

}//end of class
