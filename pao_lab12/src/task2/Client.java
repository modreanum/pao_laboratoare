package task2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Random;

public class Client {

   private final String URL;
    private final HttpClient client;
    private final Random random;
    public Client(String URL){//"https://jsonplaceholder.typicode.com/posts";
      this.URL = URL;
      this.client=HttpClient.newHttpClient();
      this.random = new Random();
    }


    public void GET() {
        int id = random.nextInt(100) + 1;
        String url = URL + "/" + id;

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            System.out.println("GET");
            System.out.println(response.body());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void post() {
        String json = """
                    {
                       "userId":1,
                                     "title": "delectus aut autem",
                                     "completed": false
                    }
                """;

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(URL))
                    .header("Content-Type", "application/json")
                    .POST(BodyPublishers.ofString(json))
                    .build();

            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            System.out.println("POST request");
            System.out.println(json);
            System.out.println("POST response");
            System.out.println(response.body());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
