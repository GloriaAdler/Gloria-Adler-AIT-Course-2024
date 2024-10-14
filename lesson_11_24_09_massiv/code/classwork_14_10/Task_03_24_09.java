package classwork_14_10;

import java.util.Random;

//Задача 3. Смоделируйте бросок игрального кубика 20 раз.
//Подсчитайте, сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней кубика?
public class Task_03_24_09 {
    public static void main(String[] args) {
        int [] toss = new int[20];//toss - бросок

        Random random =new Random(); //вводим в программу объект рандомного ввода (по аналогии со сканером). Рандом - генератор случайных чисел, он же датчик - сам подбирает рандомные числа

        for (int i = 0; i < toss.length; i++) {
            //во внуть цикла нужно поставить вызов датчика случайных цифр, в нашем случае мы должны дать коменду "дай нам 20 случайных цисел от 1 до 6, так как в задаче кубик
            int n = random.nextInt(6)+1; //n - просто случайная переменная, может быть что угодно. (bound: 6)-это диапозон кубика (в таком виде включает 0, которого нет на кубике), +1 - чтобы сдвинуть на 1, дает точность для нашего кубика, т.е. 0 не попадет, в 6 наоборот попадет
            System.out.print(n + " ");


        }
        System.out.println();//пустая строка



    }
}