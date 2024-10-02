package homework;
import java.util.Scanner;
//Задание 2. Напишите программу, которая запрашивает строку от пользователя и затем:
//
//сообщает сколько слов в строке
//сообщает сколько букв (символов) в строке
//печатает строку задом наперед, начиная с последнего слова.
public class Task2_30_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input string:");
        String input = scanner.nextLine(); //Ich mache gerne Hausaufgaben - 4 слова, 25 букв

        System.out.println();

        String[] words = input.split(" ");//подразумеваем, что массив состоит из слов фразы введенной с клавы. (regex: " ") - это разделитель слов. Проверка массива идет с лева на право, каждое слово отделено пробелом, т.е. если 2 пробела, то 3 слова.
        int n = words.length;//берем некую переменную n, чтобы узнать длину получившегося массива
        System.out.println("Numbers of words in sentence: " + n);

        int let = input.replaceAll("\\s", "").length();//Используем метод replaceAll. str.replaceAll("\\s", "") удаляет все пробелы, а затем считаем количество символов.

        System.out.println("Numbers of letters in sentence: " + let);

       System.out.print("Prints the line backwards: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
       }
    }
}
