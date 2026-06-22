import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(int id, int quantity, double price) {
        if (products.containsKey(id)) {
            Product p = products.get(id);
            p.setQuantity(quantity);
            p.setPrice(price);
        }
    }

    public void deleteProduct(int id) {
        products.remove(id);
    }

    public void displayProducts() {
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}