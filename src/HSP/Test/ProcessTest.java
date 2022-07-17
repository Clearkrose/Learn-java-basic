package HSP.Test;

import java.util.*;

@SuppressWarnings({"all"})
public class ProcessTest {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Tom",11));
        students.add(new Student("Jack",15));
        students.add(new Student("Mary",17));

        for (Student student :students) {
            System.out.println(student);
        }

        System.out.println("\n");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("\n");
        HashMap<Integer, Student> studentHashMap = new HashMap<Integer, Student>();
        studentHashMap.put(1, new Student("Tom",11));
        studentHashMap.put(2, new Student("Jack",15));
        studentHashMap.put(3, new Student("Mary",17));

        Set<Map.Entry<Integer, Student>> entries = studentHashMap.entrySet();
        Iterator<Map.Entry<Integer, Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, Student> next = iterator1.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }

    }
}


class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}