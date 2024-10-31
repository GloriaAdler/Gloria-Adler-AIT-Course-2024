package homework_36_31_10.numberArrayList;

import java.util.*;

//Задача 4.(*) Заполните структуру типа ArrayList 20-ю случайными целыми числами в интервале от 1 до 10. Удалите из полученного списка дубликаты.
public class NumberArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();//ArrayList для заполнения массива 20-ю случайными целыми числами в интервале от 1 до 10. Integer так как целые числа
        Random random = new Random();//объект для генерации случайных чисел

        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(10) + 1); // заполняем ArrayList 20ю случайными числами от 1 до 10
        }
        System.out.println("Original array: " + numbers);//массив из 20 случайных цифр

        // удаляем дубликаты, используя Set
        Set<Integer> newNumbers = new HashSet<>(numbers);//Set - автоматически гарантирует уникальность элементов, не может содержать в себе дубликаты! HashSet - не сортируется (хотя новый массив и без доп. метода Collections.sort () выводится в порядке возрастания...)

        // преобразуем Set обратно в ArrayList, но уже без дублей
        numbers = new ArrayList<>(newNumbers);
        Collections.sort(numbers);//метод Collections.sort () для сортировки в порядке возрастания нового массива без дублей

        System.out.println("Array without duplicates: " + numbers);//массив без дублей
    }
}
