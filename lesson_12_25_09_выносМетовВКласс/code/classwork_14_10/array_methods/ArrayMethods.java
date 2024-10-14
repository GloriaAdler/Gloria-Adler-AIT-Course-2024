package classwork_14_10.array_methods;
//заполнение массива случайными целыми числами из интервала от а до b
//печать массива целых чисел
//поиск Элемента
public class ArrayMethods {

    //fill array random numbers - заполнить массив случайными числами
    //a - left border, b - right border, n - quantity
    public static int[] fillArray(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a); //будут случайно выпадать случайные числа в пределах диапазона А и В, включая и А и В
        }
        return res;
    }

    //print array, просто печатает и ничего не возвращает
    public static void printArray(int[] array) {//в этот метод отдадим целочисленный массив, который мы заполним (какой массив программа получит, такой и напечатает)
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();//пустая строка для перехода
        System.out.println("-------------------------------");
    }


    //search in array
    public static boolean searchInArray(int[] array, int n) {//n-целочисленное число
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;//говорим, что это правда, если итое в массиве будет равен заданной переменной
            }
        }
        return false;//если for не срабатывает значит это фальшь. Этот return относится к методу, а не к циклу, поэтому return в нутри метода, но за пределами цикла for. return - это вывод резутьтата!
    }

//Задание 2. Дополните класс ArrayMethods методом calculatePercent,
//который получает массив данных об остатках на счетах пользователей банка и возвращает их с начисленными X процентами.
//Дополните класс ArrayMethods методом printArrayDouble(), который печатает массив данных типа double.
//В классе ArrayMethodsAppl создайте тестовый массив и вызовите для него метод calculatePercent,
//а затем распечатайте полученный результат.

    //calculatePercent. Который получает массив данных об остатках на счетах пользователей банка и возвращает их с начисленными X процентами.
    public static void calculatePercent(double[] accounts, double percent) {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] += accounts[i] * (percent / 100); // Добавляем процент
        }
    }

    //printArrayDouble(), который печатает массив данных типа double.
    public static void printArrayDouble(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // Переход на новую строку
    }

//Задание 3. Дополните класс ArrayMethods методами: sumArray(int[] array) - возвращает сумму всех элементов массива.
//averageValue(double[] array) - возвращает среднее арифметическое значение всех элементов массива.
//Вызовите и проверьте работу этих методов из класса ArrayMethodsAppl.

    // Метод для подсчета суммы всех элементов массива целых чисел
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num; // Добавляем каждый элемент к сумме
        }
        return sum;
    }

    // Метод для подсчета среднего арифметического всех элементов массива
    public static double averageValue(double[] array) {
        if (array.length == 0) {
            return 0; // Если массив пустой, возвращаем 0
        }

        double sum = 0;
        for (double num : array) {
            sum += num; // Суммируем все элементы
        }
        return sum / array.length; // Возвращаем сумму, деленную на количество элементов
    }
}//end of class















