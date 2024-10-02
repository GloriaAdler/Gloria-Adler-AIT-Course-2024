package homework_09;
//Задача 3. Анна использует различные электроприборы в своем доме.
//У неё есть холодильник, который потребляет 150 Вт, и кондиционер с потреблением 2000 Вт.
//Анна хочет узнать, сколько она тратит на электроэнергию в месяц, если стоимость 1 кВт·ч составляет 0.15 евро.
//Вопросы: Сколько электроэнергии тратят холодильник и кондиционер вместе в час? (calculateHourlyConsumption)
//Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)
public class Task_03_20_09 {
    //1 Вт = 0,001 кВт
    public static void main(String[] args) {
        double fridge = 150;// метод double, т.к. при переводе из Вт в кВт идет округдение до тысячных. fridge -холодильник
        double conditioner = 2000;
        double $ = 0.15;//0.15 евро.

        double totalHourlyConsumption = calculateHourlyConsumption (fridge, conditioner);
        System.out.println("Холодильник и кондиционер тратят вместе " + totalHourlyConsumption+ " кВт электроэнергии в час.");

        double totalMonthlyCost = calculateMonthlyCost (fridge,conditioner, $);
        System.out.println("Анна тратит на электроэнергию  " + totalMonthlyCost + " евро в месяц?");

    }//end of maim

    //по условию задачи, используем 2 метода (calculateHourlyConsumption для подчета э/э в час и calculateMonthlyCost для подчета стоимости э/э в месяц)

    private static double calculateHourlyConsumption (double fridge, double conditioner){
        return (fridge+conditioner)*0.001;//1 Вт = 0,001 кВт
    }//end of calculateHourlyConsumption

    private static double calculateMonthlyCost (double fridge, double conditioner, double $){
        return ((fridge+conditioner)*0.001)*30.5*$;//1 Вт = 0,001 кВт, 30,5 - среднее кол-во дней в месяце в году
    }//end of calculateMonthlyCost
}//end of class
