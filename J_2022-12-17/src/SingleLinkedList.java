/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-17
 * Time: 22:26
 */
// 1、无头单向非循环链表实现
public class SingleLinkedList {
    Node head;
    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        head = node1;
    }



    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    //尾插法
    public void addLast(int data){
        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        Node node = new Node(data);
        cur.next = node;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        if(index > getSize() || index < 0) {
            return false;
        }
        Node node = new Node(data);
        Node cur = head;
        int count = 0;

        while(count < index-2) {
            cur = cur.next;
            count++;
        }
        node.next = cur.next;
        cur.next = node;
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
        if(head.val == key) {
            head = head.next;
            return;
        }
        if(head == null) {
            return;
        }
        Node cur = head.next;
        Node p = head;
        while(cur != null) {
            if(cur.val == key) {
                p.next = cur.next;
                return;
            }
            p = p.next;
            cur = cur.next;
        }
    }

//    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (head == null) {
            return;
        }
        Node cur = head.next;
        Node p = head;
        while (cur != null) {
            if (cur.val != key) {
                p.next = cur;
                p = cur;
            }
            cur = cur.next;
            if (head.val == key) {
                head = head.next;
            }
        }
    }

    //得到单链表的长度
    public int getSize() {
        int size = 0;
        Node cur = head;
        while(cur != null) {
            cur = cur.next;
            size ++;
        }
        return size;
    }
    public void disPaly() {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear() {
        head.next = null;
    }
}
class Test{
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        System.out.println("无插");
        singleLinkedList.disPaly();
        System.out.println("头插");
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(2);
        singleLinkedList.disPaly();
        System.out.println("尾插");
        singleLinkedList.addLast(5);
        singleLinkedList.disPaly();
        System.out.println("指定插入");
        singleLinkedList.addIndex(7,7);
        singleLinkedList.disPaly();
        System.out.println("查询");
        System.out.println(singleLinkedList.contains(7));
        System.out.println("删除第一次出现的key");
        singleLinkedList.remove(2);
        singleLinkedList.disPaly();
        System.out.println("删除所有key");
        singleLinkedList.removeAllKey(2);
        singleLinkedList.disPaly();
    }
}