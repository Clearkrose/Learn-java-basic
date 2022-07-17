package HSP.Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/12 10:55
 */

public class CollectionIterator {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(1);
        integers.add(4);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
