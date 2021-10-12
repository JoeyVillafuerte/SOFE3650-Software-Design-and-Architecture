import java.util.HashMap;

public class ProductDB {
    private HashMap<Integer, Product> productDB;

    public ProductDB() {
        Product productOne = new Product(1, 10.50, "Product One");
        Product productTwo = new Product(2, 5.50, "Product Two");
        Product productThree = new Product(2, 2.50, "Product Three");

        productDB = new HashMap<Integer, Product>();
        productDB.put(1, productOne);
        productDB.put(2, productTwo);
        productDB.put(3, productThree);
    }

    public Product getProductInfo(int upc) {
        Product product = productDB.get(upc);

        return product;
    }
}
