package homework_31_1_11.athletes;
//Задача 3.(*) Имеется протокол результатов забега 10 спортсменов на дистанции 100 метров, в котором зафиксированы фамилия, имя, регистрационный номер спортсмена, клуб и результат в секундах и десятых долях секунды. Создайте приложение, которое позволит ввести в компьютер результаты спортсменов и получить итоговый протокол соревнования.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ResultAppl {

    public static void main(String[] args) {
        List <Athlete> athletes = new ArrayList<>();

        athletes.add(new Athlete("AAA", "AAA", 101, "Club A", 10.15));
        athletes.add(new Athlete("BBB", "BBB", 102, "Club B", 10.37));
        athletes.add(new Athlete("CCC", "CCC", 103, "Club C", 11.01));
        athletes.add(new Athlete("DDD", "DDD", 104, "Club D", 11.17));
        athletes.add(new Athlete("EEE", "EEE", 105, "Club E", 10.75));
        athletes.add(new Athlete("FFF", "FFF", 106, "Club F", 10.24));
        athletes.add(new Athlete("GGG", "GGG", 107, "Club G", 10.18));
        athletes.add(new Athlete("HHH", "HHH", 108, "Club H", 10.58));
        athletes.add(new Athlete("III", "III", 109, "Club I", 11.03));
        athletes.add(new Athlete("JJJ", "JJJ", 110, "Club J", 10.42));


        // просим пользователя ввести результат
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input result new athlete: ");
        double newResultTime = scanner.nextDouble();

        // добавляем нового спортсмена с новым результатом, которого ввели с клавы
        Athlete newAthlete = new Athlete("XXX", "XXX", 111, "Club X", newResultTime);
        athletes.add(newAthlete);

        // Сортировка спортсменов по результату времени
        Collections.sort(athletes);

        System.out.println("The final protocol of the competition:");
        int position = 1;//c первого места
        for (Athlete athlete : athletes) {
            System.out.printf("%d place: %s%n", position++, athlete);// %d - номер позиции; %s результат athlete.toString(), инфа о бегуне из массива или из добавленного newAthlete; %n - переход на новую строку; position++ с каждым проходом цикла увеличиваем на 1
        }

    }
}
