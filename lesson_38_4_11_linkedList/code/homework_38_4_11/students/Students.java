package homework_38_4_11.students;
//Задача 3.(*) Распределить группу студентов на две примерно равных группы (+/- 1 человек) случайным образом. Определить список студентов в программе. Получить на выходе 2 списка студентов.
public class Students {
    private String name;
    private String gender;//делить будем по гендерному признаку, чтобы группы состояли на половину из М и Ж

    public Students(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Students{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
