package homework_39_5_11.superMarket.dao;

import java.util.Iterator;

public class SupermarketImpl <Product> implements Supermarket <Product>{
    @Override
    public boolean addProduct(Product product) {
        return false;
    }

    @Override
    public Product removeProduct(long barCode) {
        return null;
    }

    @Override
    public Product findByBarCode(long barCode) {
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return null;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return null;
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        return null;
    }

    @Override
    public int skuQuantity() {
        return skuQuantity();
    }

    @Override
    public Iterator<Product> iterator() {
        return null;
    }
}
