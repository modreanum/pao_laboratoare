import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

class LetterCounter extends Thread {
    private String line;
    private char ch;
    private int counter = 0;

    public LetterCounter(String line, char ch) {
        this.line = line;
        this.ch = ch;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) {
                counter++;
            }

        }

    }
}


public class T6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        List<LetterCounter> threads = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine())!=null) {
                threads.add(new LetterCounter(line, ch));
                threads.get(threads.size()-1).start();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        int total = 0;
        for (LetterCounter l : threads) {
            try {
                l.join();
                total += l.getCounter();
            } catch (InterruptedException e) {
            }
        }
        System.out.println(total);
    }
}
