package classwork_38_4_11.linkedListTest;

import java.util.*;

// заполнить список случайными целыми числами
// проверить работу методов LinkedList
public class LinkedListAppl {
    //константы в main НЕ пишутся
    private static final int N_NUMBERS = 10;
    private static final Random random = new Random();
    private static final int MIN = 10;
    private static final int MAX = 20;

    public static void main(String[] args) {
        List <Integer> list = new LinkedList<>();//конкретно под эти случаи можно пользоваться и ArrayList, все методы сработают также и менять ничего не нужно

        fillList (list);//creation, фор ичем заполнить НЕЛЬЗЯ, поэтому используем фори
        printList (list);//reading, т.к. это уже чтение, можно пройти фор ичем

        System.out.println(list.size());
        System.out.println(list.get(0));//1 элемент списка
        System.out.println(list.get(list.size()-1));//последний элемент списка

        System.out.println(list.indexOf(10));//поиск индекса по элементу, если элемента нет, то будет -1
        list.set(0, 50);//50 на нулевой индекс
        list.set(N_NUMBERS - 1, 100);//100 на последний индекс -1
        System.out.println(list);

        list.set((N_NUMBERS - 1)/2, 200);//добавляем 200 в середину
        printList(list);


        //удалить 15, если оно есть в списке
        //ТАК УДАЛЯТЬ НЕЛЬЗЯ, ошибка плавающая, т.к. рандом
//        for (Integer num : list) {
//            if (num == 15){
//                list.remove(num);
//            }
//        }
//        printList(list);

        //безопасное удаление
        Iterator <Integer> iterator = list.iterator();
        while (iterator.hasNext()){//hasNext - возврат буленовского значения
            Integer num = iterator.next();
            if (num.equals(15)){
                iterator.remove();//удаляет в позиции курсора итератора, в нашем случае это индекс элемента 15
            }
        }
        printList(list);

       // удаление элемента
        list.remove(list.indexOf(100));
        printList(list);

        //удаление по условию (предикат, лямбда)
        //удалим все кратные трем
        list.removeIf(e -> e%3 == 0);
        printList(list);


    }

    private static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");

    }

    private static void fillList (List<Integer> list){
        for (int i = 0; i < N_NUMBERS; i++) {
            list.add(random.nextInt(MIN, MAX));
        }

    }



}
