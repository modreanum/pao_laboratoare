package task2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Topic> topics = new ArrayList<>();

        List<Client> subscribers1 = new ArrayList<>();
        subscribers1.add(new Client("Adrian"));
        subscribers1.add(new Client("Ion"));
        subscribers1.add(new Client("Maria"));
        subscribers1.add(new Client("Matei"));
        Topic topic1 = new Topic("programare", subscribers1);
        List<Client> subscribers2 = new ArrayList<>();
        subscribers2.add(new Client("Adrian"));
        subscribers2.add(new Client("Maria"));
        Topic topic2 = new Topic("gatit", subscribers2);

        topics.add(topic1);
        topics.add(topic2);


        Message message1 = Message.read();
        Topic topic=topicFind(topics,message1);
        if(topic!=null){
            topic.notify(message1);
        }
        Message message2 = Message.read();
        topic=topicFind(topics,message2);
        if(topic!=null){
            topic.notify(message2);
        }

        //input
        //gatit Adrian Omlette du frommage!
        //programare Ion Salutare!


    }

    public static Topic topicFind(List<Topic> topics, Message message) {
        for (Topic topic : topics) {
            if (message.getTopic().equals(topic.getName()))
                return topic;
        }
        return null;

    }

}