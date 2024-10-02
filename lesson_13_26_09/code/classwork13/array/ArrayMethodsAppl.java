package classwork13.array;

import java.util.Scanner;

public class ArrayMethodsAppl {

    public static void main(String[] args) {


       int[] myArray = {50, 40, 30, 20, 10};
        System.out.println(ArrayMethods.linearSearch(myArray, 10));
        System.out.println(ArrayMethods.linearSearch(myArray,100));

        System.out.println("_________________________________________________");

        int index = ArrayMethods.binarySearch(myArray, 10);
        System.out.println(index);




    }//end of main

}//end of class
