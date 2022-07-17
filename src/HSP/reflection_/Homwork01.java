package HSP.reflection_;

import org.omg.PortableServer.POAManagerOperations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/9 23:10
 */

public class Homwork01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        Class<?> aClass = Class.forName("com.example.reflection_.PrivateTest");
        Object o = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o, "AMAO");
        System.out.println(name.get(o));

        Method getName = aClass.getMethod("getName");
        System.out.println(getName.invoke(o));
    }
}

class  PrivateTest {
    private String name = "hellokitty";

    public String getName() {
        return name;
    }
}