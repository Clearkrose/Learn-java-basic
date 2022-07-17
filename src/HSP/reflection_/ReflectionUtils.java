package HSP.reflection_;

import java.lang.reflect.Field;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/9 21:57
 */

public class ReflectionUtils {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> cls = Class.forName("com.example.reflection_.apple");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getModifiers());
            System.out.println(field.getType());
            System.out.println("===================");
        }


    }
}

class apple {
    public static int num;
    public String name;
    double aBox;
}