package classwork_41_7_11.treeset;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetString {
    public static void main(String[] args) {

        TreeSet <String> rivers = new TreeSet<>(Arrays.asList("Volga", "Lech", "Rein", "Elbe", "Neva", "Dunau", "Isar"));

        System.out.println(rivers.size());
        System.out.println(rivers);

        for (String str : rivers) {// : - итератор, который перебирает массив
            System.out.print(str + " ");
        }
        System.out.println("---------------------------------");
        System.out.println(rivers.higher("Rein"));
        System.out.println(rivers.lower("Rein"));





    }
}
