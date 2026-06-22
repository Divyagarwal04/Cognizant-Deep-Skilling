public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101,"Laptop",10,65000));
        inventory.addProduct(new Product(102,"Mouse",50,800));
        inventory.addProduct(new Product(103,"Keyboard",25,1500));

        System.out.println("Inventory");

        inventory.displayProducts();

        inventory.updateProduct(102,60,900);

        System.out.println("\nAfter Update");

        inventory.displayProducts();

        inventory.deleteProduct(103);

        System.out.println("\nAfter Delete");

        inventory.displayProducts();

    }
}