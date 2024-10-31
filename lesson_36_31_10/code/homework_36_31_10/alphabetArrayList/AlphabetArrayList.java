package homework_36_31_10.alphabetArrayList;

import java.util.ArrayList;

//Задача 3.(*) Заполните структуру типа ArrayList<> символами латинского алфавита от A(65) до Z(...).
public class AlphabetArrayList {
//ASCII-код A - 65
//ASCII-код Z — 90.
public static void main(String[] args) {
    //ArrayList для заполнения массива символами латинского алфавита от A до Z
    ArrayList <Character> alphabet = new ArrayList<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {//проходимся циклом fori, так как алфавит это символы, меняем int на char, а i на ch, проходим по длине до равной Z
        alphabet.add(ch);
        }
    System.out.println("Alphabet" + alphabet);
    }
}
