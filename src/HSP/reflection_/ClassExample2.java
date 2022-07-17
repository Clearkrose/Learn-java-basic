package HSP.reflection_;

import java.lang.reflect.Field;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/9 16:19
 */

public class ClassExample2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        /*
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return loadClass(name, false);
            }
         */
        Class<?> aClass = Class.forName("com.example.reflection_.Cat");
        System.out.println("显示aClass对象" + aClass);
        System.out.println("aClass的运行类型: " + aClass.getClass());

        System.out.println(aClass.getPackage()); //包名
        System.out.println(aClass.getName()); //全类名

        Object o = aClass.newInstance();
        System.out.println(o);
        Cat cat = (Cat) o;
        System.out.println(cat);

        Field num = aClass.getField("num");
        System.out.println(num.get(o));
        num.set(o, 100);
        System.out.println(num.get(o));

        Field[] fields = aClass.getFields();
        for (Object field : fields) {
            System.out.println(field);
        }

    }
}

class Cat {
    public int num;
    public String name;
}