package classwork_10_10.classwork_10_10_string_numbers_tdd;

public class StringWithNumbers {
    //fields
    private String string; //private - модификатор. Сюда ляжет объект


    //методы
    public StringWithNumbers(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "StringWithNumbers{" +
                "string='" + string + '\'' +
                '}';
    }

    //123 456 789 333

    public int sumOfNumbersInString(String string){
        int sum = 0;
        String[] numbers = string.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    }


}
