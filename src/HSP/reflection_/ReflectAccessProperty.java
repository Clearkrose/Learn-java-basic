package HSP.reflection_;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/9 22:46
 */

public class ReflectAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> aClass = Class.forName("com.example.reflection_.User2");
        Object o = aClass.newInstance(); //别忘记实例啊！！！！！
        Field declaredField = aClass.getDeclaredField("num");
        declaredField.setAccessible(true);
        declaredField.set(o, 100);
        System.out.println(declaredField.get(o));

        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(null, "AMAO");
        System.out.println(name.get(null));

        Method hi = aClass.getDeclaredMethod("Hi");
        hi.setAccessible(true);
        hi.invoke(o);
        System.out.println(hi.invoke(o)); //打印返回值
    }
}

class User2 {
    private int num;
    public static String name;

    public int Hi() {
        System.out.println("Hello");
        return 0;
    }
}