package task3;

public class BankAccountPaymentFactory implements PaymentFactory {

    @Override
    public Payment createPayment(Client client, Double sum) {
        return new  Payment(client,sum,"bank account");

    }
}
