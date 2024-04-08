package task2;

import java.util.List;

public class Topic {
    private String name;
    private List<Client> subscribers;

    public Topic(String name, List<Client> subscribers) {
        this.name = name;
        this.subscribers = subscribers;
    }

    public String getName() {
        return name;
    }


    public void notify(Message message) {
        for (Client subscriber : subscribers) {
            if (!message.getClient().equals(subscriber.getName()))
                subscriber.onNotification(message);
        }
    }

    public void addSubscriber(Client client) {
        this.subscribers.add(client);

    }

    public void deleteSubscriber(Client client) {
        this.subscribers.remove(client);

    }

}
