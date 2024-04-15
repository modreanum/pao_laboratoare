package task4;

public class Square {
    int number;
    int square;


    public Square(int number, int square) {
        this.number = number;
        this.square = square;
    }

    @Override
    public String toString() {
        return "Number: " + number + ", Square: " + square;
    }
}