package homework_43_11_11.number;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//Задание 2. Имеется набор целых чисел: 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20. Требуется из этого списка отобрать только простые числа. Используйте методы stream()
public class NumberFilterAppl {

    public static void main(String[] args) {
        // Набор целых чисел
        List<Integer> numbers = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Фильтрация простых чисел с использованием stream()
        List<Integer> primes = numbers.stream()//numbers.stream() - создает поток из списка чисел.
                .filter(NumberFilterAppl::isPrime)//.filter(PrimeFilterApp::isPrime) - создаем метод isPrime, который проходится по каждому числу и отбирает только те, которые возвращают true
                .collect(Collectors.toList());

        // Выводим список простых чисел
        System.out.println("Primes: " + primes);//Простые числа: 11, 13, 17, 19
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int number) {
        if (number < 2) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))//проверяем, делится ли оно на любое число от 2 до его квадратного корня.
                .allMatch(n -> number % n != 0);
    }

}
