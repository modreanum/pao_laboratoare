package task3;

public class Client {
    private String name;
    private Double funds;
    private String method;

    public Client(String name, Double funds,String method) {
        this.name = name;
        this.funds = funds;
        this.method=method;
    }

    public String getName() {
        return name;
    }

    public Double getFunds() {
        return funds;
    }

    public String getMethod() {
        return method;
    }

    public boolean subtractSum(Double sum) {
        if (this.funds >= sum) {
            this.funds -= sum;
            return true;
        } else return false;
    }

}
