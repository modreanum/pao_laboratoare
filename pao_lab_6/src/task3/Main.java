package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<PaymentFactory> paymentFactories = new ArrayList<>();
        paymentFactories.add(new BankAccountPaymentFactory());
        paymentFactories.add(new CashPaymentFactory());
        paymentFactories.add(new CardPaymentFactory());
        Client client1=new Client("client1",2000.0,"cash");
        Client client2=new Client("client2",1000.0,"bank account");
        Client client3=new Client("client3",4000.0,"card");
        Client client4=new Client("client4",2000.0,"");

        pickPaymentFactory(paymentFactories,client1).createPayment(client1,100.0).executePayment();
        pickPaymentFactory(paymentFactories,client1).createPayment(client1,10000.0).executePayment();

        pickPaymentFactory(paymentFactories,client2).createPayment(client2,400.0).executePayment();
        pickPaymentFactory(paymentFactories,client3).createPayment(client3,1540.0).executePayment();
        pickPaymentFactory(paymentFactories,client4).createPayment(client4,190.0).executePayment();


    }
    private static PaymentFactory pickPaymentFactory(List<PaymentFactory> paymentFactories, Client client){
        if(client.getMethod().equals("cash"))

        {
            return paymentFactories.get(1);
        }
        if(client.getMethod().equals("card"))

        {
            return paymentFactories.get(2);
        }if(client.getMethod().equals("bank account"))

        {
            return paymentFactories.get(0);
        }
        else{
            Random random=new Random();
            return paymentFactories.get(random.nextInt(0,3));
        }

    }
}
