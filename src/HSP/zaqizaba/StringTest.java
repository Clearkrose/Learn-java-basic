package HSP.zaqizaba;

public class StringTest {
    public static void main(String[] args) {
        String a = "Hello";
        int index = 1;
        char b = a.charAt(index);
        System.out.println(b);

        int c = a.compareTo("low");
        System.out.println(c);

        if ("Hello".startsWith("H"))
        {
            System.out.println("am ao");
        }

        StringBuffer e = new StringBuffer();
        e.appendCodePoint(65);
        e.append("dasljflkasdjfkol");
        e.toString();
        System.out.println(e);
    }
}
