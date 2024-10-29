package classwork_34_29_10.time.utilis;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
//В классе DateOperation из классной работы, реализовать метод getAge, принимающий дату рождения в виде стринга, и возвращающий возраст.
//Задача 2.
//В классе DateOperation из классной работы, реализовать метод sortStringDates, принимающий массив дат в виде массива стрингов, и возвращающий отсортированный массив стрингов-дат.
//Для проверки используйте класс DateOperationTest с юнит-тестами.
public class DateOperation {
    //Этот метод принимает дату рождения в виде стринга и возвращает возраст
    public static int getAge (String birthDate){
        // Проверка длины строки и наличия дефисов в нужных местах
        if (birthDate == null || birthDate.length() != 10 || birthDate.charAt(4) != '-' || birthDate.charAt(7) != '-') {
            System.out.println("The date format is incorrect. Use the format yyyy-MM-dd.");
        return -1;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Определяем формат даты
        LocalDate birthD = LocalDate.parse(birthDate, formatter); // Преобразуем строку в объект LocalDate
        LocalDate currentDate = LocalDate.now();// Получаем текущую дату

        return Period.between(birthD, currentDate).getYears(); // Вычисляем возраст
    }

    public static String[] sortStringDates (String[] dates){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        Arrays.sort(dates, (date1, date2) -> {
            LocalDate localDate1 = LocalDate.parse(date1, formatter);
            LocalDate localDate2 = LocalDate.parse(date2, formatter);
            return localDate1.compareTo(localDate2);
        });
        return dates;
    }
}
