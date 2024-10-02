package classwork;

public class StringAppl {
    public static void main(String[] args) {
        String str1 = "Hello,";

        char[] chars = {32, 'W', 'o', 'r', 'l', 'd', '!'}; //32 - это код пробела по таблице ASCII

        String str2 = new String(chars);//new String() - конструктор в Java, str2 - объект класса String, сделанный в конструкторе (конструктор это тот же метод).
        //Именно слово *new* показывает, что мы обращаемся к конструктору класса.

        System.out.println(str1);//здесь мы ожидаем печать Hello,
        System.out.println(str2);//здесь мы ожидаем печать world!

        //concat (конкантиляция) - объединяем, складываем объекты типа String
        String str = str1 + str2;//объединение перед печатью
        System.out.println(str);

        System.out.println(str1.concat(str2));//конкантинация с помощью метода при печати

        str1.concat(str2);
        System.out.println(str1);// str1 не изменилась так как тип String не изменяемый - immutable

        //длина строки - length of String
        int l = str.length();//если мы хотим к применить метод, то мы к нашему объекту ставим точку и вызываем метод
        System.out.println(l);

        //first symbol - первый символ
        char ch = str.charAt(0);//.charAt - дает возможность найти любой символ; (0) - позволяет найти первый элемент (т.к. нумерация начинается с 0)
        System.out.println("First symbol: " + ch);

        //last symbol
        ch = str.charAt(str.length()-1); //(str.length()-1) - индекс последнего элемента массива
        System.out.println("Last symbol: " + ch);

        //print with spaces - печать с пробелами
        for (int i = 0; i < str.length(); i++) {//str.length() - проходим по длине строке
            System.out.print(str.charAt(i) + " "); //str.charAt(i) - каждый элемент
        }
        System.out.println();//пустая строка

        //проверит равенство строк - check equals
        String str3 = " worLD!";
        boolean checker = str3.equals(str2);//equals-метод сравнение str3 сравниваем с str2 (str2 - * World!* , str3 - * worLD!"*), boolean - так как выводит правда или лож
        System.out.println(checker);//false - так как не совпадает регистр букв
        checker = str3.equalsIgnoreCase(str2);//игнорируем регистр и проверяем только последовательность и наличие всех элементов, в том числе пробелы
        System.out.println(checker);//true

        System.out.println("================================================================================");

        //simbol in position - символ на позиции
        System.out.println(str);
        int index = str.indexOf("W");
        System.out.println(index);//ищем первое с лева вхождение буквы W (8 элемент с 7м индексом)

        int index1 = str.lastIndexOf('d');//при поиске идем справа на лево
        System.out.println(index1);
        index=str.indexOf('o');//при поиске *o* идем справа на лево
        index1 = str.lastIndexOf('o');
        System.out.println(index + ", " + index1);
        index = str.indexOf('X');
        System.out.println(index);//-1

        System.out.println("==========================substring=======================================================");

      //печать подстроки
        System.out.println(str.substring(7));// печать подстроки. с 7го индекса до конца
        System.out.println(str.substring(7,10));//печать подстроки. с 7го индекса по 10

        System.out.println("=========================replace========================================================");

        System.out.println( str.replace("o", "O-O-O"));

        System.out.println("=========================split========================================================");
// number of words - считаем слова
        String str4 = "I love string in Java.";
        String[] words = str4.split(" ");//заводим str4 в массив, String[] - подразумевает, что массив состоит из слов фразы str4. (regex: " ") - это наш разделитель слов. Проверка массива идет с лева на право, каждое слово отделено пробелом, т.е. если 4 пробела, то 5 слов.
        int w = words.length;//берем некую переменную w и спрашивает какая получилась длина массива
        System.out.println("Numbers of words in sentence: " + w);

        //считаем буквы - number of letters
        String[] letters = str4.split("");
        int let = letters.length;
        System.out.println("Numbers of letters in sentence: " + let);

        System.out.println("=========================String.format========================================================");
        //Вставьте в строку дату полета Гагарина в виде:
        //"Дата полета Гагарина в космос: число – месяц – год." и напечатайте ее в консоли.
        //    Используйте String.format()

        int day = 12;
        String month = "April";
        int year = 1961;

        String gagarinDay = String.format("Дата полета Гагарина в космос: %d - %s - %d", day, month, year);//d - цифра, s - слово. %d - %s - %d - обозначаем куда должны встать переменные.
        System.out.println(gagarinDay);














    }//end of main
}//end of class
