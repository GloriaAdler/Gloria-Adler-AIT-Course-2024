package homework_09_10;
import java.util.Scanner;
//Задание 2. Разработайте приложение, которое принимает от пользователя строку (некое предложение, например: "Мама мыла раму.") и выводит:
//количество символов в строке;
//количество символов в верхнем регистре;
//количество цифр в строке;
//количество пробелов в строке (код пробела = 32);
//в зависимости от последнего символа в строке сообщает, какое это предложение:
//повествовательное;
//вопросительное;
//восклицательное. Используйте методы класса Character.
public class Task2_09_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//вводим сканер
        System.out.println("Введите предложение.");//печатаем пользователю приглашение на ввод
        String string = scanner.nextLine();//принимаем на вход строку

        int totalChars = string.length();// находим общее кол-во символов, оно равно длине строки
        int uppercaseChars = 0;// Кол-во символов в верхнем регистре
        int digitCount = 0;// Кол-во цифр
        int spaceCount = 0;// Кол-во пробелов

        for (int i = 0; i < totalChars; i++) { //с помощью fori считаем кол-во символов в строке
            char ch = string.charAt(i);

            if (Character.isUpperCase(ch)) {//Character.isUpperCase(ch) проверяет все символы и находит символ в верхнем регистре.
                uppercaseChars++;
            }
            if (Character.isDigit(ch)) {//Character.isDigit(ch) — проверяет все символы и находит цифры.
                digitCount++;
            }
            if (ch == 32) { //проверяем, является ли символ пробелом. Код пробела = 32.
                spaceCount++;
            }
        }

        // Определяем тип предложения по последнему введенному символу, а если знак не соответствует ., ! или ? то оно будет не определено по цели высказывания
        String sentenceType = "Предложение не определено по цели высказывания."; // Начальное значение
        if (totalChars > 0) { // Проверяем, что строка не пустая
            char lastChar = string.charAt(totalChars - 1);
            if (lastChar == '.') {
                sentenceType = "Повествовательное предложение.";
            } else if (lastChar == '?') {
                sentenceType = "Вопросительное предложение.";
            } else if (lastChar == '!') {
                sentenceType = "Восклицательное предложение.";
            }
        }

        //выводим всю информацию на экран
        System.out.println("Количество символов в строке: " + totalChars);
        System.out.println("Количество символов в верхнем регистре: " + uppercaseChars);
        System.out.println("Количество цифр в строке: " + digitCount);
        System.out.println("Количество пробелов в строке: " + spaceCount);
        System.out.println("Предложение: " + sentenceType);

    }
}
