package homework11_10.array;
import java.util.Random;
//Задача 1. Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
         //сумма всех элементов массива с нечетными индексами;
         //поиск 5-го элемента в массиве. Разработайте тесты для этих методов.
//Задача 2. Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
          //положительных чисел;
          //отрицательных чисел;
          //четных чисел;
          //нулей.
          //Реализуйте все подсчеты методами и напишите для них тесты.
public class ArrayMethods {

    // Метод для массива из 100 случайных целых чисел в диапазоне от -10 до 10
    public int[] createRandomArray() {
        int[] array = new int[100];//массив из 10 случайных целых чисел
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;  // random.nextInt(21) - формируем массив от 0 до 20; -10 - вычитаем 10, чтобы получить диапозон от -10 до 10 (0-10=-10; 20-10=10)
        }
        return array;
    }

    // ищем сумму всех элементов массива с нечетными индексами
    public int sumOfOddIndexedElements(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i += 2) {//проходим по всему массиву со второго элемента (i = 1) и через один (i += 2), т.е. проверяем 1,3,5 и последующие нечетные индексы
            sum += array[i];
        }
        return sum;
    }

    // поиск 5-го элемента в массиве
    public Integer getFifthElement(int[] array) {
        if (array.length < 5) {//проверяем длину до 5го элемента
            return null;
        }
        return array[4];//за результат берем 4й индекс, т.е. 5й элемент
    }

    // Считаем положительные числа в массиве
    public int countPositiveNumbers(int[] array) {
        int count = 0;
        for (int num : array) {//перебираем весь массив
            if (num > 0) count++;//число в случайном массиве должно быть больше 0
        }
        return count;
    }

    // Считаем отрицательные числа в массиве
    public int countNegativeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num < 0) count++;//число в случайном массиве должно быть меньше 0
        }
        return count;
    }

    // считаем четные числа в массиве
    public int countEvenNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) count++;//при делении на 2 остаток должен быть равен 0
        }
        return count;
    }

    // считаем кол-во нулей в массиве
    public int countZeros(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == 0) count++;//число равно 0
        }
        return count;
    }

}
