package classwork_39_5_11.friends;

import java.util.*;

//- Поиск общих друзей у двух пользователей соц.сети.
//  В социальной сети у каждого пользователя есть список друзей. Напишите программу, которая определяет общих друзей для двух заданных пользователей.
//  Пример:
//  Список друзей пользователя A: ["Иван", "Мария", "Анна", "Петр"]
//  Список друзей пользователя B: ["Анна", "Елена", "Петр", "Дмитрий"]
//  Выход: ["Анна", "Петр"]
public class CommonFriends {
    public static void main(String[] args) {

        //List<String> friendsA = new LinkedList<>(Arrays.asList("Иван", "Мария", "Анна", "Петр"));//1й способ
        List <String> friendsA = Arrays.asList("Иван", "Мария", "Анна", "Петр");//2й способ, так как <String> можно и сокращенно
        List <String> friendsB = Arrays.asList("Анна", "Елена", "Петр", "Дмитрий");

        System.out.println("Common friends: " + findCommonFriends (friendsA, friendsB));

    }

    private static List<String> findCommonFriends(List<String> friendsA, List<String> friendsB) {//сделано с помощью Show Context Actions
        HashSet <String> setA = new HashSet<>(friendsA);

        List <String> commonFriends = new ArrayList<>();
        //пройдемся по сету А и по ходу обхода будет сравнивать его с сетом В
        for (String f : friendsB) {
            if (setA.contains(f)){//перебираем все f и если этот f есть в сете А, добавляем его в друзья
                commonFriends.add(f);
            }
        }
        // а если их нет?
        if (commonFriends.isEmpty()){
            System.out.println("There is no any common friends.");
            return null;
        }
        return commonFriends;
    }
}
