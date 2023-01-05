/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-05
 * Time: 14:40
 */
public class LinkedList {
    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node last;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            last = node;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(head == null) {
            return;
        }else {
            node.prev = last;
            last.next = node;
            last = node;
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        Node cur = head;
        if(index < 0 || index >= size()) {
            return false;
        }
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        if(index == 0) {
            addFirst(data);
        }
        Node node = new Node(data);
        node.prev = cur.prev;
        node.next = cur;
        cur.prev.next = node;
        cur.prev = node;
        return true;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = head;
        while(cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        Node cur = head;
        while(cur != null) {
            if(cur.val == key) {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
                return;
            }
            cur = cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node cur = head;
        while(cur != null) {
            if(cur.val == key) {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
            }
            cur = cur.next;
        }
    }
//    //得到单链表的长度
    public int size() {
        Node cur = head;
        int size = 0;
        while(cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }
    public void display() {
        if(head == null) {
            return;
        }else {
            Node cur = head;
            while(cur != null) {
                System.out.println(cur.val);
                cur = cur.next;
            }
        }
    }
    public void clear() {
        Node cur = head.next;
        while(head != null) {
            head.prev = null;
            head.next = null;
            head = cur;
            if(cur != null) {
                cur = cur.next;
            }
        }
    }
}

class Test1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(4);
        list.addLast(6);
        list.addIndex(4,7);
        list.remove(2);
//        list.removeAllKey(2);
        System.out.println(list.contains(7));
//        list.clear();
        list.display();;
    }
}
