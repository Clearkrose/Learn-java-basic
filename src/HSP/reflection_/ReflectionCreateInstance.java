package HSP.reflection_;

import org.omg.PortableServer.POAManagerOperations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/9 22:13
 */

public class ReflectionCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //public无参构造器
        Class<?> aClass = Class.forName("com.example.reflection_.User");
        Object o = aClass.newInstance();
        System.out.println(o);

        //public有参构造器
        Constructor<?> constructor = aClass.getConstructor(String.class);
        Object o1 = constructor.newInstance("AMAO~");
        System.out.println(o1);

        //非public
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class, String.class);
        declaredConstructor.setAccessible(true); //爆破
        Object syf = declaredConstructor.newInstance(32, "SYF");
        System.out.println(syf);
    }
}

class User {
    private int age = 20;
    private String name = "AMAO";

    public User() {}

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}