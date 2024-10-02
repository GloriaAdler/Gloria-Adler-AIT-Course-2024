package homework_05;
//Задача 3. Сделайте расчет покупки товаров со скидками.
           //Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
           // Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
           // Вычислите итоговую стоимость покупки и величину полученной скидки.
public class Task_03_Discount {
    public static void main(String[] args) {
        double priceA = 50;
        double priceB = 10;
        double discountA = 5;
        double discountB = 10;
        int costA = 3; //cost - стоимость
        int costB = 5;

        // Рассчитываем цену товаров A и B до всех скидок
        double totalCostAWithoutDiscountA = calculateDiscountedPriceWithoutDiscount (priceA, discountA, costA);
        double totalCostAWithoutDiscountB = calculateDiscountedPriceWithoutDiscount (priceB, discountB, costB);
        double totalCostAWithoutDiscount = totalCostAWithoutDiscountA + totalCostAWithoutDiscountB;

        // Рассчитываем цену товаров A и B с учетом скидок
        double totalCostA = calculateDiscountedPrice(priceA, discountA, costA);
        double totalCostB = calculateDiscountedPrice(priceB, discountB, costB);
        // Общая сумма до применения дополнительной скидки
        double totalCost = totalCostA + totalCostB;

        // Проверяем, превышает ли сумма покупок 100 евро, чтобы применить дополнительную скидку
        double additionalDiscount = 0; // additional discount - дополнительная скидка
        if (totalCost > 100) {
            additionalDiscount = totalCost * 0.05; //5% доп.скидка
        } //end of if

        // Итоговая стоимость после всех скидок
        double finalCost = totalCost - additionalDiscount;
        // Вывод результатов
        System.out.println("Итоговая стоимость покупки: " + finalCost + " евро.");
        System.out.println("Общая величина всех скидок: " + (totalCostAWithoutDiscount-finalCost) + " евро.");
        System.out.println("Общая величина дополнительной скидки: " + (totalCost - finalCost) + " евро.");

    } //end of main

    //Метод для расчета стоимости товаров до скидки
    public static double calculateDiscountedPriceWithoutDiscount(double price, double discount, int cost) {
        double withoutDiscountedPrice = price;  // discounted price -цена со скидкой.  Применяем процент скидки.
        return withoutDiscountedPrice * cost;  // Умножаем на количество товаров.
    }
    //Метод для расчета стоимости товаров с учетом скидки
    public static double calculateDiscountedPrice(double price, double discount, int cost) {
        double discountedPrice = price * (1 - discount / 100);  // discounted price -цена со скидкой.  Применяем процент скидки.
        return discountedPrice * cost;  // Умножаем на количество товаров.
    }
} // end of class
