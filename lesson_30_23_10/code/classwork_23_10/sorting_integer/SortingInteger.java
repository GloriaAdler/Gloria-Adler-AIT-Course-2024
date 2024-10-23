package classwork_23_10.sorting_integer;

import java.util.Arrays;

public class SortingInteger {
    public static void main(String[] args) {

        Integer[] numbers = {
                -100,
                2,
                Integer.MAX_VALUE,
                15,
                35,
                Integer.MIN_VALUE,
                71
        }; // ; - потому что это заканчивается массив, который мы заводим

        //1й способ печати
        //по умолчанию, в порядке возрастания
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //по убыванию
        Arrays.sort(numbers, (n1, n2) -> Integer.compare(n2, n1));
        System.out.println(Arrays.toString(numbers));

        //2й способ печати
        int index = 0;
        for (Integer i:numbers){//for (:) - for each
            System.out.print(i + " " + index + " |");
            index++;
        }
    }
}
