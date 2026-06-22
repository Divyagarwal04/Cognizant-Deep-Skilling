import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(1, "Java", "James"),
                new Book(2, "DSA", "Striver"),
                new Book(3, "Python", "Guido")

        };

        System.out.println(Library.linearSearch(books, "DSA"));

        Arrays.sort(books, Comparator.comparing(b -> b.title));

        System.out.println(Library.binarySearch(books, "DSA"));

    }

}