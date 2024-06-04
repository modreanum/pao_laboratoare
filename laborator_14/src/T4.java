class G {
    public int a = 0;
}

public class T4 {
    public static void main(String[] args) {
        G f = new G();
        bar(f);
        System.out.println(f.a);
        System.out.println(foo());
    }

    private static void bar(G f) {
        try {
            f.a = 1;
        } finally {
            f.a = 2;
        }
    }

    private static int foo() {
        try {
            return 0;
        } finally {
            return 3;
        }
    }
}
//bar(f) seteaza f.a=1 dupa care il seteaza pe a la 2, se afiseaza 2
//foo() finally se executa inaintea returnului din try => se afiseaza 3
//2
//3