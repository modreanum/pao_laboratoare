package task2;


public class Main {
    public static void main(String[] args) {

        Client client=new Client("https://jsonplaceholder.typicode.com/posts");
        client.GET();
        client.post();
    }


}
