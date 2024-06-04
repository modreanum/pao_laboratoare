class C {
    public C() {
        System.out.println("C");
    }

    public C(int x) {
        System.out.println("C " + x);
    }
}

class D extends C {
    public D() {
        super(1);
        System.out.println("D");
    }

    public D(int x) {
        System.out.println("D " + x);
    }
}

class E extends D {
    public E() {
        super(1);
        System.out.println("E");
    }
}

public class T2 {
    public static void main(String[] args) {
        new E();
    }
    //C
    //D 1
    //E
    // se apeleaza D(1) care cheama constructorul fara param din C care afiseaza C
    // dupa care D(1) afiseaza D +1 in final E(1) afiseaza E
}