package HSP.reflection_;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/9 21:18
 */

public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        //1.Class.forName
        Class<?> aClass = Class.forName("com.example.reflection_.Cat");
        System.out.println("显示aClass的对象为" + aClass);

        //2.类名.class
        System.out.println(int.class);

        //3.对象.getClass()
        System.out.println(aClass.getClass()); //输入运行类型

        //4.其他
        Object o = aClass.newInstance();
        ClassLoader classLoader = o.getClass().getClassLoader(); //得到类加载器
        Class<?> aClass1 = classLoader.loadClass("com.example.reflection_.Dog");
        System.out.println(aClass1);

        Class<Integer> integerClass = int.class;
        System.out.println(integerClass.hashCode());

        Class<Integer> type = Integer.TYPE;
        System.out.println(type.hashCode());

    }
}
