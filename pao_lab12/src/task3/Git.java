package task3;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Git {

    public void createDirectory(String path){
        Path path2 = Paths.get(path);
        try {
            Files.createDirectory(path2);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
    public void createFile(String path){
        Path path2 = Paths.get(path);
        try {
            Files.createFile(path2);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public void writeToFile(String file,String message){
       try(BufferedWriter buf=new BufferedWriter(new FileWriter(file))) {
           buf.write(message);
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }
    }
}
