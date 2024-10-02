package classwork_06;
//Задание 5. Рассчитайте величину скидки и стоимость покупки с учетом скидки по следующим правилам:
          // -сумма покупки до 100 евро - скидка 0%
          // -сумма покупки от 101 евро до 200 евро - скидка 2%
          // -сумма покупки от 201 евро до 500 евро - скидка 5%
          // -сумма покупки от 501 евро до 1000 евро - скидка 10%
          // -сумма покупки от более 1000 евро - скидка 20% Сумма покупки вводится с клавиатуры.

//при таких условиях swich лучше не использовать, так как диапозон цен очень большой.

import java.util.Scanner;

public class DiskontTask_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // для ввода суммы покупки
        System.out.println("Input amount of purchase");//просим сообщить стоимомть покупки
        double sum = scanner.nextDouble();

        double discount = 0;

        if(sum > 0 && sum <= 100){
            discount = 0;
        }else if (sum > 100 && sum <= 200){
            discount = 0.02;
        } else if (sum>200 && sum <= 500) {
            discount = 0.05;
        } else if (sum>500 && sum<=1000) {
            discount = 0.1;
        } else if (sum>1000) {
            discount = 0.2;
        }
        System.out.println(discount);

    }//end of main

}//end of class
