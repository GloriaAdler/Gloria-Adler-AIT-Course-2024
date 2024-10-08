package classwork;
//Задача 3. Имеются оценки абитуриента из его аттестата, всего 12 оценок. Найдите средний балл абитуриента.
public class Task_03 {
    public static void main(String[] args) {

        int[]marks = {1, 6, 1, 4, 3, 1, 2, 3, 3, 2, 5, 2};//объявили массив в явном виде

        int sum = 0;//изначально сумма равна 0, т.к. еще ничего не посчитано

        for (int i = 0; i < marks.length; i++){//i++ -номер элемента в массиве
            sum = sum + marks[i];//marks[i] - это элемент массива "1" (в начале строчки)

        }
        System.out.println("Summa = " + sum);

        double averageMark = (double) sum / marks.length; // average mark - средняя оценка. length-уже знает что всего 12 позиций в массиве, т.е. считает автоматомю. (double) после = это casting - преобразователь
        System.out.println("Average mark = " + averageMark);

    }

}
