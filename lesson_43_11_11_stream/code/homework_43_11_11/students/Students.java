package homework_43_11_11.students;
import java.util.List;
//Задание 1. Имеется набор оценок 20 студентов в диапазоне от 5 до 1 балла за семестр по 10 предметам. Смоделируйте этот набор данных, найдите студентов с максимальным/минимальным средним баллом. Используйте методы stream()

public class Students {

    private String name;
    private List<Integer> grades;

    public Students(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return name + " average grade: " + getAverageGrade();
    }

    //метод для расчета ср.балла
    public double getAverageGrade (){
        return grades.stream()
                .mapToInt(Integer::intValue) // mapToInt - преобразует элементы потока в числовой тип int. mapToInt(Integer::intValue) преобразует поток Integer в поток примитивных int значений.
                .average()
                .orElse(0);//.orElse(0.0) - указывает, что если значения нет, вернуть 0 как значение по умолчанию.
    }
}
