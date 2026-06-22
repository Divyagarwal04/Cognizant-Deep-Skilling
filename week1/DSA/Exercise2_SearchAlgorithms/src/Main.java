import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Keyboard", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Mouse", "Electronics"),
                new Product(104, "Phone", "Electronics")

        };

        Product result = SearchOperations.linearSearch(products, "Mouse");

        System.out.println("Linear Search");

        System.out.println(result);

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        result = SearchOperations.binarySearch(products, "Mouse");

        System.out.println("\nBinary Search");

        System.out.println(result);

    }
}