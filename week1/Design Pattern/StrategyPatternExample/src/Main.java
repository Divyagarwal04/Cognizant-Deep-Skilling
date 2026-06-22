public class Main {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());

        context.makePayment(5000);

        context.setStrategy(new PayPalPayment());

        context.makePayment(3000);

    }

}