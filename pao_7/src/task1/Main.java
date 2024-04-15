package task1;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        String filePath = Objects.requireNonNull(Main.class.getResource("task1.txt")).getFile();
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {

            byte[] buf=new byte[20];
            fileInputStream.read(buf);

            buf = new byte[fileInputStream.available()];
            fileInputStream.read(buf);
            String line = new String(buf);
            System.out.println(line);


        } catch (IOException ignored) {


        }


        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {


            fileInputStream.skip(20);

            byte[] buf = new byte[fileInputStream.available()];
            fileInputStream.read(buf);
            String line = new String(buf);
            System.out.println(line);


        } catch (IOException ignored) {

        }

    }
}