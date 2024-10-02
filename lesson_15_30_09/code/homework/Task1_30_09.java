package homework;
//Задача 1. Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!" Выполнить практикум с этой строкой:
//
//Распечатать последний символ строки. +
//Найти позицию подстроки “Java” в строке. +
//Проверить, содержит ли заданная строка подстроку “Java”. +
//Заменить все символы “o” на “a”. +
//Преобразуйте строку к верхнему регистру. +
//Преобразуйте строку к нижнему регистру. +
//Вырезать подстроку Java c помощью метода substring(). +
//Проверить, заканчивается ли строка подстрокой “!!!”. +
//Проверить, начинается ли строка подстрокой “I'm proud”. +

import java.util.Locale;

public class Task1_30_09 {
    public static void main(String[] args) {

        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(str);

//Распечатать последний символ строки.
        char ch = str.charAt(str.length()-1);//charAt(int position) - возвращает символ находящийся на данной позиции (нумерация позиций начинается с нуля);
        System.out.println("Last symbol: " + ch);

//Найти позицию подстроки “Java” в строке.
        int index = str.indexOf("Java");//indexOf - возвращают позицию первой найденной строки или символа в строке, начиная искать с начала (indexOf) или с конца (lastIndexOf)
        System.out.println("Index 'Java' in string: " + index);//По условию нужно найти позициЮ, поэтому ищем одну (первую) позицию.

//Проверить, содержит ли заданная строка подстроку “Java”.
        String substring = "Java"; //substring - подстрока, возвращает часть строки (подстроку), начиная с позиции start, и заканчивая позицией end, при этом символ стоящий на стартовой позиции будет включен в результирующую строку, а символ стоящий на позиции end не включен
        boolean containJava = str.contains(substring);//contains - содержать

        if (containJava) {
            System.out.println("The string contains a substring 'Java'.");//если содержит
        } else {
            System.out.println("The string does not contain a substring 'Java'.");//если не содержит
        }
        System.out.println();

//Заменить все символы “o” на “a”.
        System.out.println(str.replace("o", "a"));//replace - заменяет все найденные в строке элементы на другие заданные
        System.out.println();

//Преобразуйте строку к верхнему регистру.
        String upperStr = str.toUpperCase();//upper - верхний, toUpperCase()  - возвращает строку в верхнем регистре
        System.out.println(upperStr);
        System.out.println();

//Преобразуйте строку к нижнему регистру.
        String lowerStr = str.toLowerCase(); //lower - нижний, toLowerCase() - возвращает строку в нижнем регистре
        System.out.println(lowerStr);
        System.out.println();

//Вырезать подстроку Java c помощью метода substring().
        System.out.println(str.substring(19,23));//зная из предыдущего решения, что индекс Java 19, можно напечатать интервал между индексами...

        //...либо можно найти начало и конец индексов подстроки Java
        int endIndex = index + "Java".length();//index - найден выше. К найденному индексу добавляем длину подстроки Java.
        String subStr = str.substring(index, endIndex);//возвращает часть строки (подстроку), начиная с позиции start, и заканчивая позицией end, при этом символ стоящий на стартовой позиции будет включен в результирующую строку, а символ стоящий на позиции end не включен;
        System.out.println(subStr);
        System.out.println();

//Проверить, заканчивается ли строка подстрокой “!!!”.
        String str1 = "!!!"; //вводим новую переменную str1
        boolean checker = str.endsWith(str1); //checker - проверяющий, конец строки можно проверить методом endsWith
        System.out.println("The end is '!!!': " + checker);

//Проверить, начинается ли строка подстрокой “I'm proud”.
        String str2 = "I'm proud";
        boolean check = str.startsWith(str2);//check - проверять. Начало строки можно проверить методом startsWith
        System.out.println("The beginning is 'I'm proud': " + check);

    }
}
