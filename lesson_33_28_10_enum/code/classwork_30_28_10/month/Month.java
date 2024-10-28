package classwork_30_28_10.month;
//Задайте Enum Month, определите месяца, их наименования и количество в них дней.
//Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
//Пример: AUG + 6 month = FEB
//Проверьте работу метода в приложении.
public enum Month {

    JAN ("January", 31), FEB ("February", 28), MAR ("March", 31), APR ("April", 30), MAY("May", 31), JUN ("June", 30), JUL ("July", 31), AUG("August", 31), SEP ("September", 30), OCT ("October", 31), NOV ("November", 30), DEC ("December", 31);//константы

    //fields
    private String name;
    private int days;

    Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }
    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Month{");
        sb.append("name='").append(name).append('\'');
        sb.append(", days=").append(days);
        sb.append('}');
        return sb.toString();
    }

    public Month plusMonth (int quantity){//в методе передаем к какому методу и сколько месяцев добавляем
        int n = this.ordinal();//оригинальное мемто в массиве
        int index = n + quantity;//индекс месяца от 0 до 11
        Month[] months = values();
        int res = index % months.length;//это Month[] months = values() сделано для months.length (перепрогнали элементы в массив)
        return months[res];
    }
}
