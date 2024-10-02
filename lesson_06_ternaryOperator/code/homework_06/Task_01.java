package homework_06;
import java.util.Scanner;
//Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
// - за 3 года работы надбавка 10%,
// - за 5 лет работы надбавка 50%,
// - за 10 лет работы надбавка 100%,
// - за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.
public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many years have you been working?");
        int sum = scanner.nextInt();
        double surcharge = 0;

        int salary = 500; //salary - зарплата

        if (sum > 0 && sum <3){
            surcharge = salary + 0;
        }else if (sum >=3 && sum <5){
            surcharge = salary+(salary*0.1);
        }else if (sum >=5 && sum <10){
            surcharge = salary+(salary*0.5);
        }else if (sum >=10 && sum <15){
            surcharge = salary+(salary*1);
        }else if (sum >=15){
            surcharge = salary+(salary*1.5);
        }

        System.out.println("Your salary: " +surcharge + " $");


    }//end of main
}//end of class
