import java.util.ArrayList;
import java.util.List;

public class Bilant implements Comparable<Bilant> {
    private int positive;

    private int negative;

    Bilant() {
        this(0, 0);
    }

    Bilant(int nr1, int nr2) {
        this.positive = nr1;
        this.negative = nr2;
    }

    @Override
    public String toString() {
        return String.format("%d %d", this.positive, this.negative);
    }

    @Override
    public int compareTo(Bilant o) {
        Integer diff1 = this.positive - this.negative;
        Integer diff2 = o.positive - o.negative;
        return diff2.compareTo(diff1);
    }


    public static void main(String[] args) {
        List<Bilant> list = new ArrayList<>();
        list.add(new Bilant());
        list.add(new Bilant(7, 2));
        list.add(new Bilant(4, 5));
        list = list.stream().sorted(Bilant::compareTo).toList();
        System.out.println(list);
    }
}
