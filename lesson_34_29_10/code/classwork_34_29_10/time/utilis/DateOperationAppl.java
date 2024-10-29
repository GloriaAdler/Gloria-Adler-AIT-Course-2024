package classwork_34_29_10.time.utilis;
import static classwork_34_29_10.time.utilis.DateOperation.getAge;
import static classwork_34_29_10.time.utilis.DateOperation.sortStringDates;
//В классе DateOperation из классной работы, реализовать метод getAge, принимающий дату рождения в виде стринга, и возвращающий возраст.
//Задача 2.
//В классе DateOperation из классной работы, реализовать метод sortStringDates, принимающий массив дат в виде массива стрингов, и возвращающий отсортированный массив стрингов-дат.
//Для проверки используйте класс DateOperationTest с юнит-тестами.
public class DateOperationAppl {
    public static void main(String[] args) {
        String birthDateString = "2008-01-02"; // Пример даты рождения
        int age = getAge(birthDateString);

        if (age != -1) {
            System.out.println("Age: " + age);
        }

        String[] dates = {"2024-10-29", "2023-10-29", "2022-10-29", "2011-10-29"};
        String[] sortedDates = sortStringDates(dates);

        System.out.println("\nSorted dates:");
        for (String date : sortedDates) {
            System.out.println(date);
        }
    }

}
