class A {
    public static int a = 0;
}

class B extends A {
    public static int a = 5;
}

public class T1 {
    public static void main(String[] args) {
        A a = new B();
        a.a++;
        System.out.println(A.a);
        System.out.println(B.a);
    }
    //a este de tip A deci a.a incrementeaza a-ul din classA A.a=1
    //B.a ramane 5
    //1
    //5
}