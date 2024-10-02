package classwork_07.cycles;

public class ApplesMethod2 {
    public static void main(String[] args) {

        int apples = 30;

        while (apples >= 0){
            System.out.println("В корзине " + apples + "яблок");
            apples = apples - 1;
            System.out.println("бери еще");
        }
            System.out.println("Яблоки кончились!");
    }

}
