package homework;
import java.util.Random;
//Задача 2
//У стрелка есть 10 попыток поразить мишень.
//Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
//Ответьте на вопрос, сколько очков набрал стрелок?
//Попал ли он хоть раз в центр мишени?
public class Task02 {
    public static void main(String[] args) {

        int shots = 10; // Количество выстрелов
        int totalScore = 0; // Score - счет. Суммарное количество очков
        boolean center = false; // Проверяем попадания в центр мишени


        Random random =new Random(); //вводим в программу объект рандомного ввода чисел (по аналогии со сканером).

        for (int i = 1; i <= shots; i++) {
            //во внуть цикла нужно поставить вызов датчика случайных цифр, в нашем случае мы должны дать коменду "дай нам 20 случайных цисел от 1 до 6, так как в задаче кубик
            int score = random.nextInt(10)+1; // (bound: 10)-диапазон мишени - предположим, что в мишени 10 зон для попадания, где 10 это центр. +1 пишем, чтобы исключить 0 в рандоме.
            System.out.println("Shot " + i + " : " + score + " points");//points-баллы

            //сколько всего очков набрал стрелок?
            totalScore = totalScore + score;// или можно totalScore += score;

            if (score == 10) {//если наш диапазон равен 10, то предполагаем, что центр это десятка дающая 10 очков
                center = true;//если попали в десятку, то if срабатывает

            }
        }//end of for
        System.out.println();//пустая строка
        System.out.println("Total points: " + totalScore);
        System.out.println();//пустая строка
// Проверяем попал ли стрелок хоть раз в центр мишени?
        if (center){
            System.out.println("The shooter HIT the target!");
        }else {
            System.out.println("The shooter MISSED the target.");
        }

    }//end of main
}//end of class
