package homework_39_5_11.superMarket.dao;

public interface Supermarket <Product> extends Iterable <Product>{

    boolean addProduct (Product product);

    Product removeProduct (long barCode);

    Product findByBarCode (long barCode);

    Iterable <Product> findByCategory (String category);

    Iterable <Product> findByBrand (String brand);

    Iterable <Product> findProductsWithExpiredDate ();

    int skuQuantity ();

}
