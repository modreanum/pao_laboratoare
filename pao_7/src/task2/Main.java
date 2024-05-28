package task2;

import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) { String filePath = Objects.requireNonNull(task2.Main.class.getResource("task2.txt")).getFile();

        try (FileReader fileReader = new FileReader(filePath)) {

            char[] buf=new char[20];
            fileReader.read(buf);

            buf = new char[8];
            fileReader.read(buf);
            String line = new String(buf);
            System.out.println(line);


        } catch (IOException ignored) {

        }


       // String filePath = Objects.requireNonNull(task2.Main.class.getResource("task2.txt")).getFile();

        try (FileReader fileReader = new FileReader(filePath)) {

            char[] buf=new char[20];
            fileReader.read(buf);

            buf = new char[8];
            fileReader.read(buf);
            String line = new String(buf);
            System.out.println(line);


        } catch (IOException ignored) {

        }



        try (FileReader fileReader = new FileReader(filePath)) {


            fileReader.skip(20);

            char[] buf = new char[8];
            fileReader.read(buf);
            String line = new String(buf);
            System.out.println(line);


        } catch (IOException ignored) {

        }

    }
}