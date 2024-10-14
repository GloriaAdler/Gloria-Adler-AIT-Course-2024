package classwork_14_10;
//Задача 2. Создайте массив и заполните его символами латинского алфавита от A до Z. Раcпечатайте полученный массив.
public class Task_02 {
    public static void main(String[] args) {
        char[] alphabet = new char[26]; //char - используется для символов

        for (int i = 0; i < alphabet.length; i++){

            alphabet[i] = (char) (65+i); // 65 код латинской А, он стандарный! нужно сделать Cast из подсказки, чтобы привести типы в порядок, т.е. чтобы символьный вид, сработал как целое число
            System.out.print(alphabet[i] + " ");

        }
    }
}
