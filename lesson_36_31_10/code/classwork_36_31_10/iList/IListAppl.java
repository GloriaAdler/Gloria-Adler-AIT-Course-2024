package classwork_36_31_10.iList;

import classwork_23_10.soldier.Soldier;
import classwork_36_31_10.iList.model.IList;
import classwork_36_31_10.iList.model.IListImpl;
import homework_22_10.carCopy.cars.model.Car;

import java.util.ArrayList;
import java.util.List;

public class IListAppl {
    public static void main(String[] args) {
        //список с целыми числами
        IList <Integer> listOfAge =  new IListImpl<>();

        listOfAge.add(61);
        listOfAge.add(38);
        listOfAge.add(37);
        listOfAge.add(35);
        listOfAge.add(44);
        listOfAge.add(27);
        listOfAge.add(37);
        listOfAge.add(37);
        listOfAge.add(37);
        listOfAge.add(46);
        listOfAge.add(23);
        listOfAge.add(45);
        listOfAge.add(18);
        listOfAge.add(63);

        System.out.println(listOfAge.size());//длина элементов
        System.out.println(listOfAge.indexOf(37));//ищем конкретный возраст на каком он индексе, при чем если есть одинаковые элементы, будет показан индекс первого попавшегося

        System.out.println("-----------------------------------------------------------------");

        System.out.println(listOfAge);//печатает только ссылку, т.к. нет метода printArray
        int index = 0;
        for (Integer i : listOfAge) {//когда нет метода printArray можно пройтись по элементам for each вывести все итые элементы на печать
            System.out.println(index++ + " : " + i);
        }
        System.out.println();//пустая строка

        System.out.println("-----------------------------------------------------------------");

        int indexNew = 0;
        for (Integer i : listOfAge) {//ищем только элемент 37 с его индексами
            if (i == 37) {
                System.out.println(indexNew + " : " + i);
            }
            indexNew++;
        }

        System.out.println("-----------------------------------------------------------------");
        int sum = 0;
        for (Integer i : listOfAge) {//ищем средний возраст
            sum += i;
        }
        System.out.println(sum);
        double avgAge = (double) sum / listOfAge.size();
        System.out.println(avgAge);

        System.out.println("-----------------------------------------------------------------");

        IList <String> listOfNames = new IListImpl<>();
        listOfNames.add("Gloria");
        System.out.println(listOfNames.size());
        listOfNames.add("Dima");
        listOfNames.add("Artem");
        listOfNames.add("Diana");
        listOfNames.add("Yuri");
        listOfNames.add("Dima");
        listOfNames.add("Ivan");
        listOfNames.add("Leonid");
        listOfNames.add("Karina");
        listOfNames.add("Nastya");
        listOfNames.add("Nastya");
        listOfNames.add("Nata");
        listOfNames.add("German");
        listOfNames.add(null);

        System.out.println(listOfAge.size());

        index = 0;
        for (String str : listOfNames) {
            System.out.println(index++ + " : " + str);
        }

        String  strTotal ="";
        for (String str : listOfNames) {
            strTotal += str;
        }
        System.out.println(strTotal);

        System.out.println("-----------------------------------------------------------------");


        //удаляем элемент по индексу и имени
        listOfNames.remove(1);
        listOfNames.remove("Leonid");

        index = 0;
        for (String str : listOfNames) {
            System.out.println(index++ + " : " + str);
        }

        List <Car> listCars = new ArrayList<>();
        //listCars.add()

    }
}
