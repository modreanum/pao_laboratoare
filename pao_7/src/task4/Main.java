package task4;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner= new Scanner(System.in);
        n= scanner.nextInt();
        IntStream.range(0, n)
                .filter(num -> num % 2 == 0)
                .mapToObj(num -> new Square(num, num * num))
                .forEach(System.out::println);
    }

}

