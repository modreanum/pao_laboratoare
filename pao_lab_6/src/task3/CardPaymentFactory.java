package task3;

public class CardPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment(Client client, Double sum) {
        return new  Payment(client,sum,"card");

    }
}
