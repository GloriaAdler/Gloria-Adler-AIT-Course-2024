package classwork;
//Задача 1. Создайте массив и заполните его целыми числами от 1 до 20.
public class Task_01 {
    public static void main(String[] args) {

      int[]number = new int[20];//[]-символ того, что это массив; number - имя массива; new - обращение; int[...] - тип массива, 20 - длина массива
        //number [0] - 1st element of array
        //numbers.length = 20
        //number[numbers.length - 1]

        //fill in array (массив) numbers. Здесь отрабатываем индекс. Можно вывести в один шаг, а можно в 2 (ниже второй вариант закоментирован)
        for (int i =0; i < number.length; i++){//for - цикл. Цикл сам себя остановит, когда дойдет до конца (до 20). i++ -число будет увеличиваться на 1.i =0 всегда от 0!!!

            number[i] = i+1;// чтобы выполнить условие задания к i добавляем 1, т.е. мы получим ряд от 1 до 20. если к i 1 не добавлять будет ряд от 0 до 19, т.е. индексы идут с 0.

            System.out.print(number[i] + " ");//чтобы распечатать массив, нужно выводить с i, иначе мы получим только ссылку на место в оперативной памяти, где лежит массив
            }

        //print array numbers. Здесь отражаем результат
        //for (int i = 0; i < number.length; i++){
        //}

    }
}