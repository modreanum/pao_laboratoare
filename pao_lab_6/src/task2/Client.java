package task2;

import java.util.List;

public class Client {
    private String name;
    public Client(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void onNotification(Message message){
        System.out.println("[" + this.name + "] " + message.getClient() + " @ " + message.getTopic()+ " : " + message.getMessage());

    }
}
