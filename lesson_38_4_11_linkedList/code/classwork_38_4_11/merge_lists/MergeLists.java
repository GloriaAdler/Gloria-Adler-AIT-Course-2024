package classwork_38_4_11.merge_lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Напишите программу, которая объединяет два списка целых чисел (ArrayList<Integer>), удаляет из объединенного списка дубликаты и сортирует его в порядке возрастания.
//list1 = [3, 5, 1, 9, 3]
//list2 = [8, 2, 5, 3]
public class MergeLists {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>(List.of(3, 5, 1, 9, 3));
        ArrayList <Integer> list2 = new ArrayList<>(List.of(8, 2, 5, 3));

        //Merging lists - Объединение списков

        ArrayList <Integer> mergeList = new ArrayList <> (list1); //нам не нужно никаких циклов запускать
        mergeList.addAll(list2); //addAll в качестве аргумента принимает целый объект с множеством элементов, в просто add - добавляет только элемент.
        System.out.println(mergeList);

        //Remove dublicates
        Set <Integer> uniqueNambers = new HashSet<>(mergeList);// HashSet - убирет все дубликаты в mergeList
        System.out.println(uniqueNambers);

        //put Set into List
        mergeList = new ArrayList<>(uniqueNambers);
        mergeList.sort(Integer::compareTo);//обращаемся к классу Integer и вытаскиваем из него compareTo, аналогия лямды выражений
        System.out.println(mergeList);



    }
}
