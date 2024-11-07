package homework_40_6_11.linkedList.dao;

import homework_40_6_11.linkedList.model.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class SupermarketImpl implements Supermarket {

    //constructor

    private Collection <Product> products = new LinkedList<>();


    @Override
    public boolean addProduct(Product product) {
        if (product == null || products.contains(product)){
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
        List <Product> res = new LinkedList<>();
        for (Product p : products) {
            if (predicate.test(p)){
                res.add(p);
            }
        }
        return res;
    }
}
