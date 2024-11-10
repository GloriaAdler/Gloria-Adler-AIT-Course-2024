package homework_42_10_11.digitsFreq;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
//Задача 3(*). В классе DigitsFreqApp сгенерировать один миллион положительных целых чисел в интервале от 100 до 1000, и подсчитать частоту встречаемости цифр в этих числах.
public class DigitsFreqApp {
    public static void main(String[] args) {

        Random random = new Random();//генератор случайных чисел

        Map<Integer, Integer> digitFrequency = new HashMap<>();  //Map для хранения частоты цифр

        for (int i = 0; i <= 9; i++) {// Инициализируем Map значениями от 0 до 9 с начальной частотой 0
            digitFrequency.put(i, 0);
        }

        // генерируем 1 миллион случайных чисел и считаем частоту цифр
        for (int i = 0; i <= 1_000_000; i++) {

            int number = 100 + random.nextInt(901);//генерируем случайные числа от 100 до 1000
            System.out.print(number + " ");

            while (number > 0) {//обработка всех цифр из рандома
                int digit = number % 10; //получаем последнюю цифру
                digitFrequency.put(digit, digitFrequency.get(digit) + 1); //увеличиваем частоту
                number /= 10; //убираем последнюю цифру
            }
        }

        System.out.println("Частота встречаемости цифр в миллионе случайных чисел в интервале от 100 до 1000:");
        for (Map.Entry<Integer, Integer> entry : digitFrequency.entrySet()) {
            System.out.println("Digit " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
