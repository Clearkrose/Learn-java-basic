package HSP.reflection_;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/9 21:51
 */

public class StaticExample {
    public static void main(String[] args) {

        new A();
        System.out.println(A.num);
    }
}

class A {
    static {
        System.out.println("hi~");
        int num = 100;
    }

    static int num = 200;

    public A() {
        System.out.println("Hello~");
    }
}