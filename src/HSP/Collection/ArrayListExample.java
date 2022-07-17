package HSP.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/12 16:47
 */

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("String");
        list.add("JAVA");

        for (Object o : list) {
            System.out.println(o);
        }

    }
}
