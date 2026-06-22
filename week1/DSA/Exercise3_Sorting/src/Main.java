public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(1, "Divya", 4000),
                new Order(2, "Rahul", 1500),
                new Order(3, "Aman", 6000),
                new Order(4, "Priya", 2500)

        };

        System.out.println("Bubble Sort");

        Sorting.bubbleSort(orders);

        for (Order o : orders)
            System.out.println(o);

        orders = new Order[]{

                new Order(1, "Divya", 4000),
                new Order(2, "Rahul", 1500),
                new Order(3, "Aman", 6000),
                new Order(4, "Priya", 2500)

        };

        System.out.println("\nQuick Sort");

        Sorting.quickSort(orders, 0, orders.length - 1);

        for (Order o : orders)
            System.out.println(o);

    }
}