package homework_1_10;
//В классе StudentAppl создать несколько студентов. Отобразить процесс учебы.

import homework_1_10.modelStudent.Student;

public class StudentAppl {
    public static void main(String[] args) {
        Student A = new Student(1, "A", "AA", 2003, "IT");
        Student B = new Student(1, "B", "BB", 1995, "economy");
        Student C = new Student(1, "C", "CC", 2005, "IT");
        Student D = new Student(1, "D", "DD", 1999, "economy");
        Student E = new Student(1, "E", "EE", 2000, "IT");
//выводим информацию о студентах
        System.out.println(A.displayStudent());
        System.out.println(B.displayStudent());
        System.out.println(C.displayStudent());
        System.out.println(D.displayStudent());
        System.out.println(E.displayStudent());
//выводим процесс учебы
        A.mustStudy();
        B.mustPassExam();
        C.mustTakeVacation();
        D.mustPassExam();
        E.mustStudy();
    }
}
