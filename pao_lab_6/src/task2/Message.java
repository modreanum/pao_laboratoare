package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Message {
    private String topic;
    private String client;
    private String message;

    public Message(String topic, String client, String message) {
        this.message = message;
        this.client = client;
        this.topic = topic;
    }

    public static Message read() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("message: ");
        String t = null, c = null, m ="";

        String[] words=scanner.nextLine().trim().split(" ");
        t=words[0];
        c=words[1];
        for(int i=2;i<words.length;i++){

        m+=words[i];
        m+=" ";}

        return new Message(t, c, m);

    }

    public String getClient() {
        return client;
    }

    public String getMessage() {
        return message;
    }

    public String getTopic() {
        return topic;
    }
}
