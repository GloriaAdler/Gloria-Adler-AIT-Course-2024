package classwork_40_6_11.supermarket_heshset.dao;

import classwork_40_6_11.supermarket_heshset.model.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class SupermarketImpl implements Supermarket {

    //constructor

    private Collection <Product> products = new HashSet<>();



    @Override
    public boolean addProduct(Product product) {
        if (product == null){//удалили проверку на дубликаты, т.к. это хешьсет, в нем не может быть дубликатов
            return false;
        }
        return products.add(product);
    }

    @Override
    public Product removeProduct(long barCode) {
        Product product = findByBarCode(barCode);
        products.remove(product);
        return product;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product p : products) {
            if (p.getBarCode() == barCode){
                return p;
            };
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return findByPredicate(product -> product.getCategory().equalsIgnoreCase(category));
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return findByPredicate(product -> product.getBrand().equalsIgnoreCase(brand));
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        return findByPredicate(product -> product.getExpDate().isBefore(LocalDate.now()));
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    private Iterable <Product> findByPredicate (Predicate <Product> predicate){
        Set <Product> res = new HashSet<>();
        for (Product p : products) {
            if (predicate.test(p)){
                res.add(p);
            }
        }
        return res;
    }
}
