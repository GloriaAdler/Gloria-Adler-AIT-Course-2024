package classwork_16_10.sb_vs_string;

//100 000 сказать "Meow"
//String против StringBuilder

public class PerformanceTest {

    private static final  int N_INTERATION = 100_000;//заводим константу. В длинных числах допустимо нижнее подчеркивание , как разделитель для читаемости
    private static final String WORD = "Meow";

    public static void main(String[] args) {

        //String
        long t1 = System.currentTimeMillis();//это таймер для замера времени, это старт нашего секундомера
        String str = "";//"" две рядом стоящие кавычки это пустая строка
        for (int i = 0; i < N_INTERATION; i++) {//этот цикл пройдет 100000 раз (так как начинаем с 0, то с константой указываем, что i < N_INTERATION, т.е от 0 до 99999, это и будет 100000 раз
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis();//остановка нашего таймера
        System.out.println("Time String= " + (t2-t1));//(t2-t1) - это разница между началом старта и концом

        //StringBuilder
        t1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");//нужна пустая строка
        for (int i = 0; i < N_INTERATION; i++) {
            sb = sb.append(WORD);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Time StringBuilder= " + (t2-t1));




    }



}
