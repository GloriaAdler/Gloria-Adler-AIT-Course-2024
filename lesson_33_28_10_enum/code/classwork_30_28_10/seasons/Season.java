package classwork_30_28_10.seasons;

public enum Season {//enum - класс
    WINTER ("Winter", 90, 1), SPRING ("Spring", 92, 2), SUMMER ("Summer", 92, 3), AUTUMN ("Autumn", 91, 4);// ** ; ** - ставиться по шаблону автоматом после сщздания конструктора на поля, перед ней перечисляются ВСЕ наши КОНСТАНТЫ

    //определяем поля
    private String name;
    private int duration; //продалжительность
    private int number;

    Season(String name, int duration, int number) {
        this.name = name;
        this.duration = duration;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Seasons{");
        sb.append("name='").append(name).append('\'');
        sb.append(", duration=").append(duration);
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
