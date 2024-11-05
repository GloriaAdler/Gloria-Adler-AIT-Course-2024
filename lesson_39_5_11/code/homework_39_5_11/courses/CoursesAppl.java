package homework_39_5_11.courses;
//Задача 1.(*) Напишите программу, которая: Создает список студентов, зарегистрированных на два разных курса: "Математика" и "Информатика". Выводит: Список студентов, которые записаны на оба курса.
//Список студентов, которые записаны только на один из курсов.
//Условия: Используйте два HashSet для хранения студентов каждого курса.
//Программа должна использовать операции пересечения и разности множеств для вывода нужных списков.
import java.util.HashSet;
import java.util.Set;

public class CoursesAppl {
    public static void main(String[] args) {

        // Создаем два множества для хранения студентов на каждом курсе
        Set<Courses> mathCourse = new HashSet<>();
        Set<Courses> csCourse = new HashSet<>();//cs - Computer science

        //"Математика"
        mathCourse.add(new Courses("Gloria"));
        mathCourse.add(new Courses("Dima"));
        mathCourse.add(new Courses("Artjom"));
        mathCourse.add(new Courses("German"));
        mathCourse.add(new Courses("Diana"));

        //"Информатика"
        csCourse.add(new Courses("Gloria"));
        csCourse.add(new Courses("Ivan"));
        csCourse.add(new Courses("Natalia"));
        csCourse.add(new Courses("Carina"));
        csCourse.add(new Courses("Artjom"));

        //студенты, которые записаны на оба курса (пересечение множеств)
        Set<Courses> bothCourses = new HashSet<>(mathCourse);
        bothCourses.retainAll(csCourse); // метод retainAll, чтобы оставить только тех студентов, которые находятся в обоих множествах. Пересечение множеств.
        System.out.println("Students enrolled in both courses: " + bothCourses);

        //студентов, которые записаны только на один из курсов (разность)
        Set<Courses> oneCourse = new HashSet<>(mathCourse);
        oneCourse.addAll(csCourse); // объединение всех студентов обоих курсов
        oneCourse.removeAll(bothCourses); // удаляем студентов, записанных на оба курса, т.е. тех студентов, которые попали в bothCourses
        System.out.println("Students enrolled in only one course: " + oneCourse);

    }

}
