package homework_43_11_11.students;
//Задание 1. Имеется набор оценок 20 студентов в диапазоне от 5 до 1 балла за семестр по 10 предметам. Смоделируйте этот набор данных, найдите студентов с максимальным/минимальным средним баллом. Используйте методы stream()

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentsAppl {
    public static void main(String[] args) {

        Random random = new Random();
        List <Students> students = new ArrayList<>();

        //генерим 20 случайных студентов
        for (int i = 1; i <=20; i++) {
            List<Integer> grades = IntStream.range(0, 10)// IntStream.range - создает последовательность целых чисел в заданном диапазоне, создает поток чисел от start (включительно) до end (исключительно). То есть, диапазон включает нижнюю границу, но исключает верхнюю.
                    .map(g -> random.nextInt(5) +1)//чтобы захватить 5, как верхнюю границу, добавляем единицу (+1)
                    .boxed()//преобразование в Stream<Integer>
                    .collect(Collectors.toList());
            students.add(new Students("Student " + i, grades));
        }
        students.forEach(System.out::println);
        System.out.println("-----------------------------------------------------");

        //максимальный средний балл
        Students maxStudent = students.stream()
                .max(Comparator.comparingDouble(Students::getAverageGrade))
                .orElse(null);//orElse() - содержит null
        System.out.println(maxStudent);
        System.out.println("-----------------------------------------------------");

        //минимальный средний балл
        Students minStudent = students.stream()
                .min(Comparator.comparingDouble(Students::getAverageGrade))
                .orElse(null);
        System.out.println(minStudent);


    }
}
