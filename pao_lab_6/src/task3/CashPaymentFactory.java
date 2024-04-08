package task3;

public class CashPaymentFactory implements PaymentFactory {


    @Override
    public Payment createPayment(Client client, Double sum) {
        return new  Payment(client,sum,"cash");

    }
}
