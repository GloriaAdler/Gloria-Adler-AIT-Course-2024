package homework_38_4_11.temperature;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Задача 1. Имеются результаты измерений температуры в городе за последнюю неделю октября и первую неделю ноября. Создайте класс DayTemperature c полями:+
//LocalDate date;+
//double temperature;+
// Сформируйте два ArrayList и внесите в них данные измерений температуры. +
// Рассчитайте среднюю температуру в городе за прошедшие две недели.+
// В какой день была минимальная температура?
// В какой день максимальная?
public class DayTemperature {

    public static void main(String[] args) {

        ArrayList<Integer> october = new ArrayList<>(List.of(15, 13, 10, 11, 8, 10, 9));
        ArrayList <Integer> november = new ArrayList<>(List.of(6, 4, 8, 5, 10, 8, 7));

        //объединяем массивы
        ArrayList <Integer> allTemperatures = new ArrayList<>(october);
        allTemperatures.addAll(november);//addAll в качестве аргумента принимает целый объект с множеством элементов
        System.out.println(allTemperatures);

        //средняя температура
        int sum = 0;
        for (Integer t : allTemperatures) {
            sum += t;//сумма всех температур за 2 недели
        }
        double avgTemperature = (double) sum / allTemperatures.size();//средняя за 2 недели. (double) - кастинг
        System.out.println(avgTemperature);

        // Нахождение минимальной температуры
        int minTemperature = Collections.min(allTemperatures);
        int minTemperatureDayIndex = allTemperatures.indexOf(minTemperature);
        LocalDate minTempDate = getDateByIndex (minTemperatureDayIndex);
        System.out.println("Min temperature was " + minTemperature + " degrees on " + minTempDate );

        // Нахождение максимальной температуры
        int maxTemperature = Collections.max(allTemperatures);
             int maxTemperatureDayIndex = allTemperatures.indexOf(maxTemperature);
              LocalDate maxTempDate = getDateByIndex(maxTemperatureDayIndex);
        System.out.println("Max temperature was "  + maxTemperature + " degrees on " + maxTempDate);
    }

    // Метод для получения даты по индексу
    private static LocalDate getDateByIndex(int index) {
        LocalDate startOctober = LocalDate.of(2023, 10, 25); // Начало последней недели октября
        if (index < 7) {
            return startOctober.plusDays(index); // Дата в октябре
        } else {
            LocalDate startNovember = LocalDate.of(2023, 11, 1); // Начало первой недели ноября
            return startNovember.plusDays(index - 7); // Дата в ноябре
        }
    }

}
