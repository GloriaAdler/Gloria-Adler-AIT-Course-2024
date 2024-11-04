package homework_38_4_11.students;
//Задача 3.(*) Распределить группу студентов на две примерно равных группы (+/- 1 человек) случайным образом. Определить список студентов в программе. Получить на выходе 2 списка студентов.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupsAppl {

    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();
        //список предполагаемых студентов
            students.add(new Students("F1", "female"));
            students.add(new Students("M1", "male"));
            students.add(new Students("F2", "female"));
            students.add(new Students("M2", "male"));
            students.add(new Students("F3", "female"));
            students.add(new Students("M3", "male"));
            students.add(new Students("F4", "female"));
            students.add(new Students("M4", "male"));
            students.add(new Students("F5", "female"));
            students.add(new Students("M5", "male"));
            students.add(new Students("F6", "female"));
            students.add(new Students("M6", "male"));
            students.add(new Students("F7", "female"));
            students.add(new Students("M7", "male"));
            students.add(new Students("F8", "female"));
            students.add(new Students("M8", "male"));
            students.add(new Students("F9", "female"));
            students.add(new Students("M9", "male"));
            students.add(new Students("F10", "female"));
            students.add(new Students("M10", "male"));
            students.add(new Students("F11", "female"));

        // делим студентов по гендеру
        List<Students> maleStudents = new ArrayList<>();
        List<Students> femaleStudents = new ArrayList<>();

            for (Students student : students) {
                if (student.getGender().equals("male")) {
                    maleStudents.add(student);
                } else {
                    femaleStudents.add(student);
                }
            }

        // Перемешиваем гендерные списки, чтобы распределение было случайным
        Collections.shuffle(maleStudents);
        Collections.shuffle(femaleStudents);

        // делим на две подгруппы
        List<Students> group1 = new ArrayList<>();
        List<Students> group2 = new ArrayList<>();

        // Добавляем половину студентов каждого гендера в первую группу, остальную часть во вторую, т.к. в списке 21 студент, в одной из групп будет на 1го человека больше
        group1.addAll(maleStudents.subList(0, maleStudents.size() / 2));
        group2.addAll(maleStudents.subList(maleStudents.size() / 2, maleStudents.size()));

        group1.addAll(femaleStudents.subList(0, femaleStudents.size() / 2));
        group2.addAll(femaleStudents.subList(femaleStudents.size() / 2, femaleStudents.size()));

        System.out.println("Group one: " + group1);
        System.out.println();
        System.out.print("Group two: " + group2);

















    }
}
