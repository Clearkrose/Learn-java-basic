package HSP.reflection_;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/9 15:21
 */

public class ClassExample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        Class aClass = Class.forName("com.example.reflection_.Dog");
        Object o = aClass.newInstance();

        System.out.println("o的运行类型" + o.getClass());

        Field num = aClass.getField("num");
        System.out.println(num.get(o));

        Constructor constructor1 = aClass.getConstructor();
        System.out.println(constructor1);

        Constructor constructor2 = aClass.getConstructor(int.class);
        System.out.println(constructor2);

        Method hi = aClass.getMethod("Hi");
        System.out.println(hi);

        hi.invoke(o);
    }
}

class Dog {
    public int num;

    public Dog() {}

    public Dog(int num) {}

    public void Hi() {
        System.out.println("Hi");
    }
}