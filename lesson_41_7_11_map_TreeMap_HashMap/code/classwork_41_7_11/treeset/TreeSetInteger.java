package classwork_41_7_11.treeset;
import java.util.*;
public class TreeSetInteger {
    public static void main(String[] args) {

    List <Integer> num = new ArrayList<>(Arrays.asList(10, 20, 30, -80, -230, 0));

        TreeSet <Integer> numbers = new TreeSet<>(num);

        System.out.println(numbers);
        System.out.println(numbers.size());

        numbers.add(13);
        numbers.add(100500);
        System.out.println(numbers);
        System.out.println(numbers.size());

        for (Integer n : numbers) {//чтобы напечатать без скобок массива
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println((numbers).first());//-230
        System.out.println((numbers).last());//100500

        System.out.println((numbers).ceiling (5));//10
        System.out.println(numbers.contains(5));//false
        System.out.println((numbers).floor(5));//0

        System.out.println((numbers).tailSet(5));//всё что правее 5

        System.out.println((numbers).subSet(-50,true, 30, true));//0, 10, 13, 20

    }

}
