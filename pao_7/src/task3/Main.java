package task3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            String fileName = "fisier_" + i + ".txt";
            LocalDateTime currentTime = LocalDateTime.now();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm:ss");
            String formattedDateTime = currentTime.format(formatter);

            try (FileWriter fileWriter = new FileWriter(fileName)) {

                fileWriter.write(i + "\n");
                fileWriter.write( formattedDateTime );
            } catch (IOException ignored) {

            }
        }

    }

}

