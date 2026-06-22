public class Main {

    public static void main(String[] args) {

        Image image = new ProxyImage("cat.jpg");

        System.out.println("Image object created.");

        image.display();

        System.out.println();

        image.display();

    }

}