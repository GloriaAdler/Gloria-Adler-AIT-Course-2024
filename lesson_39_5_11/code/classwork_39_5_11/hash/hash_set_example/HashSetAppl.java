package classwork_39_5_11.hash.hash_set_example;

import java.util.HashSet;
import java.util.Set;

public class HashSetAppl {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>(16,0.75F);//указаны собственные capacity и loadFactor

        //добавляем числа в наш сет
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);//0,10,20,30...,90
        }

        System.out.println(numbers.size());
        System.out.println("-------------------------");

        for (Integer i: numbers ) {
            System.out.println(i);
        }

        numbers.add(50);
        System.out.println(numbers.size());
        System.out.println("-------------------------");
        for (Integer i: numbers ) {
            System.out.println(i);
        }

    }
}
