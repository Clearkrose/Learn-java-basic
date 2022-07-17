package HSP.Collection;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/12 20:09
 * 模拟双向链表
 */

public class LinkedListRemote {
    public static void main(String[] args) {

        Node jack = new Node("Jack");
        Node david = new Node("David");
        Node nancy = new Node("Nancy");

        jack.next = david;
//        Node first = jack;

        david.next = nancy;
        david.pre = jack;

        Node last = nancy;
        nancy.pre = david;

        //遍历
//        while (true) {
//            if(first == null) {
//                break;
//            }
//            System.out.println(first);
//            first = first.next;
//        }

        //插入
        Node aMao = new Node("AMao");
        aMao.next = nancy;
        aMao.pre = david;
        nancy.pre = aMao;
        david.next = aMao;

        Node first = jack;

        while (true) {
            if(first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}

class Node {
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}