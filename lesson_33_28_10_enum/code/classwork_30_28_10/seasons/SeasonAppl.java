package classwork_30_28_10.seasons;
//Задать ENUM seasons - времена года (Summer, Autumn, Winter, Spring)
//Опробовать на нем методы:
//.values() - извлекает данные в массив
//.toString
//.ordinal()
//.valueOf()
public class SeasonAppl {
    public static void main(String[] args) {

        Season [] seasons = Season.values ();
        System.out.println("------------------values of Enum------------------");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
            System.out.println(seasons[i].getNumber() + ":" + seasons[i].getName());
        }
        System.out.println("---------------------------------------------------");
        for (Season season : seasons) {//season - переменная типа Season, пробегает по всему массиву seasons; seasons - тут должно быть то, что с таким - Season типом объектов.
            System.out.println(season.getName());
            System.out.println(season.getDuration());

        }
        System.out.println("------------------toString()------------------");
        String str = Season.AUTUMN.toString();
        System.out.println(str);

        System.out.println("------------------ordinal()------------------");
        int num = Season.AUTUMN.ordinal();
        System.out.println(num);//выдает индекс сезона [3]
        num = Season.WINTER.ordinal();
        System.out.println(num);//выдает индекс сезона [0]

        System.out.println("------------------valueOf()------------------");

        Season s = Season.SPRING.valueOf("SPRING");//"SPRING" - написано должно быть ровно также, как в классе enum
        System.out.println(s);


    }




}
