package homework;
//Задача 3(*). Написать метод, принимающий на вход массив строк.+
//Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.+
//Создайте массив типа String и заполните его названиями знакомых вам городов. +
//Проверьте работу написанного метода на этом массиве.
public class Task3_26_09 {
    public static void main(String[] args) {
        // Создаем массив типа String с названиями городов
        String[] cities = {"Berlin", "Jekaterinburg", "Rom", "Hamburg", "London", "Paris", "Leipzig", "Dresden"};

        // Вызываем метод для поиска самой короткой и самой длинной строки
        String[] result = findShortestAndLongest(cities);

        // Выводим результат
        System.out.println("The shortest: " + result[0]);
        System.out.println("The longest: " + result[1]);
    }//end of main

    // Создаем метод, принимающий массив строк и возвращающий массив с самой короткой и самой длинной строками
    public static String[] findShortestAndLongest(String[] array) {

        String shortest = array[0]; // Задаем переменную для самой короткой строки
        String longest = array[0];  // Задаем переменную для самой длинной строки

        for (int i = 1; i < array.length; i++) { // Проверяем массив циклом for
            if (array[i].length() < shortest.length()) {
                shortest = array[i]; // Находим самую короткую строку
            }
            if (array[i].length() > longest.length()) {
                longest = array[i]; // Находим самую длинную строку
            }
        }//end of for

        return new String[]{shortest, longest}; // Возвращаем в метод main результат, содержащий самую короткую и самую длинную строки
    }//end of findShortestAndLongest

}//end of class
