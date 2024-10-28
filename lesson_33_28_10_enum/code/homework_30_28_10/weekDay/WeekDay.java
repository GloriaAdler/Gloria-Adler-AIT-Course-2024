package homework_30_28_10.weekDay;
//Задача 1. Задать ENUM weekDay - дни недели. Опробовать на нем методы: .values() .toString .ordinal() .valueOf()
//Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели. Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг) Проверьте работу метода с помощью теста.

public enum WeekDay {
    MONDAY ("Monday"), TUESDAY ("Tuesday"), WEDNESDAY ("Wednesday"), THURSDAY ("Thursday"), FRIDAY ("Friday"), SATURDAY ("Satuday"), SUNDAY ("Sunday");

    private String name;

    WeekDay(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeekDay{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public WeekDay plusDay (int quantity){//в методе передаем к какому методу и сколько месяцев добавляем
        int n = this.ordinal();//оригинальное мемто в массиве
        int index = n + quantity;//индекс месяца от 0 до 11
        WeekDay[] weekDays = values();
        int res = index % weekDays.length;//это Month[] months = values() сделано для months.length (перепрогнали элементы в массив)
        return weekDays[res];
    }

}
