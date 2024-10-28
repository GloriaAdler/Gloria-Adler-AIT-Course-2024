package classwork_30_28_10.month;

public class MonthAppl {
    public static void main(String[] args) {

        Month m = Month.AUG;
        System.out.println("Stsrt month: " + m);

        int k = 29;

        m = m.plusMonth(k);
        System.out.println("After " + k + " months: " + m);
    }
}
