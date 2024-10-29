package classwork_34_29_10.time_api_exercises;

import jdk.jshell.execution.LocalExecutionControlProvider;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeAppl {
    public static void main(String[] args) {

        //How much time?
        LocalDate ld = LocalDate.now();//LocalDate - определяет автоматически дату с ПК, которая в свою очередь сенхронизируется с инетом
        //LocalDate - формат: YYYY-mm-DD
        System.out.println(ld);

        LocalTime lt = LocalTime.now();//LocalDate - определяет автоматически время с ПК, которая в свою очередь сенхронизируется с инетом
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();//LocalDate - определяет автоматически и дату и время с ПК, которая в свою очередь сенхронизируется с инетом
        System.out.println(ldt);

        System.out.println("-------------------------------------------------------");

        LocalDate gagarin = LocalDate.of(1961, 4, 12);
        System.out.println(gagarin);//пока формат не задан, печать будет в ISO формате
        //какой день недели был?
        System.out.println(gagarin.getDayOfWeek());//после точки уже есть встроенные геттеры к Local...

        //какой был день года?
        System.out.println(gagarin.getDayOfYear());

        System.out.println("----------------------Is leap year?---------------------------------");//висакостный ли год
        int year = 2024;
        System.out.println("is year " + year + " leap: " + Year.isLeap(year));

        System.out.println("-------------------------------------------------------");

        System.out.println(gagarin.isBefore(ld));
        System.out.println(gagarin.isAfter(ld));//isAfter - до рождества христова, буленовское значение

        System.out.println("-------------------------------------------------------");

        long days = ChronoUnit.DAYS.between(gagarin, ld);//ChronoUnit - метод для подчета сколько и чего прошло с опр датой. ChronoUnit - сколько; .DAYS - дней; .between - между; (gagarin, - полетом гагарина; ld) - и 29.10.2024
        System.out.println(days);
        long period = ChronoUnit.YEARS.between(gagarin, ld);
        System.out.println(period);

        System.out.println("------------------------DateTimeFormatter-------------------------------");
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;//YYYY-mm-DD
        String date = gagarin.format(df);
        System.out.println(date);

        //выбираем другой формат
        df =DateTimeFormatter.BASIC_ISO_DATE;
        date = gagarin.format(df);
        System.out.println(date);

        System.out.println("-------------------------------------------------------");
        //задаем другой, собственный формат строки с датой
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");//ofPattern-пример своего формата
        date = gagarin.format(df);
        System.out.println(date);

        df = DateTimeFormatter.ofPattern("dd MMM yyyy");//MMMM - полностью месяц, MMM- сокращенно месяц, MM - месяц цифрами
        date = gagarin.format(df);
        System.out.println(date);

        //задаем Locale (лакацию, для выбора языка)
        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.GERMANY);//Locale.CHINA - выбор языка
        date = gagarin.format(df);
        System.out.println(date);

        //parsing LocalDate from String
        System.out.println("///////////////////////////////////////////////////////////////");
        String stringDate = "01:12/2024";
        LocalDate result = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd:MM:yyyy][dd/MM/yyyy][dd-MM-yyyy][dd:MM/yyyy]"));
        System.out.println(result);//ISO format (LocalDate)

        System.out.println("///////////////////////////////////////////////////////////////");
        String myDay = "25.09.1987";
        LocalDate myD = LocalDate.parse(myDay, DateTimeFormatter.ofPattern("[dd.MM.yyyy]"));
        System.out.println(myD);
        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRANCE);
        String d = myD.format(df);
        System.out.println(d);








    }
}
