package task3;

import task3.Client;

public class Payment {
    private Client client;
    private Double sum;
    private String method;

    public Payment(Client client, Double sum, String method) {
        this.client = client;
        this.sum = sum;
        this.method = method;
    }

    public void executePayment() {
        if (!client.subtractSum(sum))
            System.out.println("Not enough funds for "+sum);
        else

            System.out.println(sum+" "+this.method + " transaction successful");



    }
}