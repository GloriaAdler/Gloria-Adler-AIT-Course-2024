package homework_30_28_10.weekDay;
//Задача 1. Задать ENUM weekDay - дни недели. Опробовать на нем методы: .values() .toString .ordinal() .valueOf()
//Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели. Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг) Проверьте работу метода с помощью теста.
public class WeekDayAppl {
    public static void main(String[] args) {

        WeekDay [] weekDays = WeekDay.values();

        System.out.println("------------------values of Enum------------------");
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println(weekDays[i]);
            System.out.println(weekDays[i].getName());
        }

        System.out.println("---------------------------------------------------");

        for (WeekDay weekDay : weekDays) {
            System.out.println(weekDay.getName());//печать только названия дня
        }

        System.out.println("---------------------------------------------------");

        System.out.println("------------------toString()------------------");
        String str = WeekDay.MONDAY.toString();
        System.out.println(str);

        System.out.println("---------------------------------------------------");

        System.out.println("------------------ordinal()------------------");
        System.out.println("Дни недели:");
        for (WeekDay day : WeekDay.values()) {
            System.out.println(day + " - ordinal index: " + day.ordinal());
        }

        System.out.println("---------------------------------------------------");

        System.out.println("------------------valueOf()------------------");
        WeekDay day = WeekDay.MONDAY.valueOf("MONDAY");//"SPRING" - написано должно быть ровно также, как в классе enum
        System.out.println(day);

        System.out.println("---------------------------------------------------");

        System.out.println("------------------plusDay()------------------");
        WeekDay d = WeekDay.MONDAY;
        System.out.println("Start day: " + d);
        int k = 10;
        d = d.plusDay(k);
        System.out.println("After " + k + " days: " + d);
    }

}
