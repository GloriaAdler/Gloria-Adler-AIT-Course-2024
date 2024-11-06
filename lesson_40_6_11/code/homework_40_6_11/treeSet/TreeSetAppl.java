package homework_40_6_11.treeSet;

import java.util.TreeSet;

public class TreeSetAppl {
    public static void main(String[] args) {

        TreeSet <Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);//дубль убирает

        System.out.println(numbers);

        TreeSet <String> letters = new TreeSet<>();

        letters.add("b");
        letters.add("l");
        letters.add("a");
        letters.add("b");//дубль убирает
        letters.add("j");

        System.out.println(letters);

        TreeSet <String> symbols = new TreeSet<>();

        symbols.add("=");
        symbols.add("*");
        symbols.add(".");
        symbols.add("-");
        symbols.add(":");

        System.out.println(symbols);




    }
}
