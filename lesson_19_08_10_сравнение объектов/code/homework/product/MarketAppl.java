package homework.product;

import homework.product.model.Food;
import homework.product.model.MeatFood;
import homework.product.model.MilkFood;
import homework.product.model.Product;

// Создать класс MarketAppl и в нем метод main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта. Реализовать методы:
//печатающий все продукты из массива, и метод возвращающий сумму цен всех продуктов.
// В классе MarketAppl создать метод принимающий баркод и возвращающий продукт с данным баркодом. В методе main вызвать новые методы. Результат их работы напечатать в консоль.
//В классе MarketAppl создать метод печатающий в консоль все не пищевые продукты.
public class MarketAppl {
    public static void main(String[] args) {

        Product[] products = new Product[4];//заводим массив на 4 позиции, в первую позицию заводим на пищевой продукт для 3го задания
        products[0] = new Product(2.5, "Persil", 123456789000L);
        products[1] = new Food(3, "Chips", 234567891000L,"08-10-2025");
        products[2] = new MeatFood(13, "Beef", 345678912000L,"10-10-2024", "Steak");
        products[3] = new MilkFood(0.99, "Milk", 456789123000L,"15-10-2024", "Cow", 1.5);

        printAllProducts(products);//печатаем все товары из массива
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Total price of all products: " + calculateTotalPrice(products));//печатаем стоимость продуктов и не пищевого товара
        System.out.println("------------------------------------------------------------------------------------");

        Product foundProduct = findProductByBarcode(products, 234567891000L);//Найденный продукт
        System.out.println("Product with barcode 234567891000: " + foundProduct);

        System.out.println("------------------------------------------------------------------------------------");


        System.out.println("Non-food products:");// Вывод только непищевых товаров
        printProducts(products, true);

    }//end of main

    //метод печатающий все продукты из массива
    public static void printAllProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
    //метод возвращающий сумму цен всех продуктов.
    public static double calculateTotalPrice(Product[] products) {
        double total = 0;
        for (Product product : products) {//это усиленный цикл for (или цикл for-each) в Java. Он предназначен для перебора элементов коллекций, массивов или других итерируемых объектов. Эта запись означает: для каждого элемента product из массива products выполните код внутри цикла. В каждой итерации product ссылается на следующий элемент массива products. Таким образом, мы можем работать с каждым элементом по очереди, не прибегая к индексам массива. Эквивалентная запись с использованием обычного цикла for: for (int i = 0; i < products.length; i++){Product product = products[i];}

            total += product.getPrice();
        }
        return total;
    }

    //метод принимающий баркод и возвращающий продукт с данным баркодом.
    public static Product findProductByBarcode(Product[] products, long barCode) {
        for (Product product : products) {
            if (product.getBarCode() == barCode) {
                return product;
            }
        }
        return null; // Если продукт с данным штрих-кодом не найден
    }

    //метод печатающий в консоль все не пищевые продукты
    public static void printProducts (Product[]products,boolean printOnlyNonFood){
        for (Product product : products) {
            if (printOnlyNonFood) {
                if (!(product instanceof Food)) { //проверяем все продукты и печатаем только те, что не входят в класс Food, т.е. продукт не должен входить ни в один дочерний и последующие классы
                    System.out.println(product);
                }
            }
        }
    }

}//end of class
