package HSP.Collection;

import java.util.*;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/13 9:29
 * 遍历Map
 */

public class MapFor {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("肖战","马蓉");
        map.put("刘凌波","null");
        map.put("null","刘亦菲");
        map.put("鹿晗","关晓彤");

        Set keys = map.keySet();

        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = map.get(key);
            System.out.println(key + "::" + value);
        }

        for (Object key : keys) {
            System.out.println(key + "::" + map.get(key));
        }

        System.out.println("");

        Collection values = map.values();

        for (Object value : values) {
            System.out.println(value);
        }

        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }

        System.out.println("");

        Set entrys = map.entrySet(); // EntrySet<Entry<K,V>>
        for (Object entry : entrys) {
            Map.Entry e = (Map.Entry) entry;
            System.out.println(e.getKey() + "::" + e.getValue());
        }

        Iterator iterator2 = entrys.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            System.out.println(next.getClass());
            Map.Entry m = (Map.Entry) next;
            System.out.println(m.getKey() + "::" + m.getValue());
        }
    }
}
