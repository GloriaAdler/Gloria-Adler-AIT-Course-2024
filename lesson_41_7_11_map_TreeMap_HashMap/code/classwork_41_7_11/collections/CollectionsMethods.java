package classwork_41_7_11.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class CollectionsMethods {

    public static void main(String[] args) {

        //max, .min
        //.reverse - разворот
        //.shuffle - перетосовка

        List <String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("papaya");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("grape");
        fruits.add("apricot");
        fruits.add("peach");
        fruits.add("pear");
        fruits.add("banana");

        //1й способ
        for (String fruit : fruits) {
            System.out.print(fruits + " | ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        //2й способ
        fruits.forEach(System.out::println);

        System.out.println("----------------sorting-------------------");
        //в обратную сторону
        Comparator <String> fruitComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        };
        Collections.sort(fruits);
        fruits.forEach(System.out::println);//автосортинг и печать одной строкой

        System.out.println("----------------sorting reverse-------------------");
        Collections.sort(fruits, fruitComparator);//обычно сортировка переписывает коллекцию, это значит, что элементы переставляются местами
        fruits.forEach(System.out::println);

        System.out.println("----------------max-------------------");
        System.out.println(Collections.max(fruits));

        System.out.println("----------------min-------------------");
        System.out.println(Collections.min(fruits));

        System.out.println("----------------reverse-------------------");
        Collections.reverse(fruits);
        fruits.forEach(System.out::println);

        System.out.println("----------------shuffle-------------------");
        Collections.shuffle(fruits);
        fruits.forEach(System.out::println);






    }
}
