package HSP.class_;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/8 12:28
 */

public class ClassLoader_ {

    public static void main(String[] args) {

        System.out.println(A.num);
        new A();
    }
}

class A {
    static {
        System.out.println("A...");
        int num = 100;
    }

    static int num = 200;

    public A() {
        System.out.println("Constructor...");
    }
}