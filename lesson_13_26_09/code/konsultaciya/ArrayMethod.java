package konsultaciya;

public class ArrayMethod {
    public static int sumOfElements (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];

        }
        return  sum;

    }
    public static double averageValue (double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];

        }
        return  sum / array.length;

    }

}

