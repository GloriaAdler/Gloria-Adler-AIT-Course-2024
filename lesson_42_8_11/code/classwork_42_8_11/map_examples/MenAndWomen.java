package classwork_42_8_11.map_examples;

import java.util.HashMap;
import java.util.Map;

public class MenAndWomen {
    public static void main(String[] args) {
       // m - man, f - female
        Map <String, String> genderMap = new HashMap();

        genderMap.put("LK", "m");
        genderMap.put("AD", "m");
        genderMap.put("DM", "m");
        genderMap.put("GA", "f");
        genderMap.put("IV", "m");
        genderMap.put("NB", "f");
        genderMap.put("JR", "m");
        genderMap.put("DV", "f");

        //1 option - проход по Keys, их можно достать с помощью keySet

        int men = 0;
        for (String name : genderMap.keySet()) {
            if (genderMap.get(name).equals("m")){
                men++;
            }
        }
        int s = genderMap.size();
        int women = s - men;

        System.out.println("Men: " + men + ", women: " + women);

        men =0;//зануляем, чтобы посчитать women
        women = 0;

        //2 option - проходим по values, values ()
        for (String value : genderMap.values()) {
            if (value.equals("f")){
                women ++;
            }
        }
        System.out.println(women);


















    }
}
