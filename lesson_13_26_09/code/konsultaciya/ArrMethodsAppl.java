package konsultaciya;

public class ArrMethodsAppl {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 13};
        System.out.println( ArrayMethod.sumOfElements(intArray));//intArray аргумент из int[] intArray = {1,

       double[] doubleArray = {1, 2, 3, 4, 5, 13, 0, 1};
        System.out.println(ArrayMethod.averageValue(doubleArray));

        //данные из массива intArray перенести в doubleArray

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = intArray[i];//тип double поглощает тип int, остановится тогда когда закончится массив int
            System.out.print(doubleArray[i] + " ");

        }


    }
}
