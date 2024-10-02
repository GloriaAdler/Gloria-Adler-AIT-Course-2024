package homework_02;

public class Method {

    public static void main(String[] args) {

        method1();
    }
    public static void method1() {
        System.out.println("method1 - Start");
        method2();
        System.out.println("method1 - Finish");

    }

    public static void method2() {
        System.out.println("method2 - Start");
        method3();
        System.out.println("method2 - Finish");

    }

    public static void method3(){
        System.out.println("method3 - Start");
        System.out.println("method3 - Finish");
    }
}
