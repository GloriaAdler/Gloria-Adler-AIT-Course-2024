package classwork_40_6_11.supermarket_heshset.dao;

import classwork_40_6_11.supermarket_heshset.model.Product;

public interface Supermarket extends Iterable <Product> {

    boolean addProduct (Product product);

    Product removeProduct (long barCode);

    Product findByBarCode (long barCode);

    Iterable <Product> findByCategory (String category);

    Iterable <Product> findByBrand (String brand);

    Iterable <Product> findProductsWithExpiredDate ();

    int skuQuantity ();

}
