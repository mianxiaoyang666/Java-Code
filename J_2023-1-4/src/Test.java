import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-04
 * Time: 16:24
 */
class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }
    int usedSize;
    Node head;

    public  MyLinkedList() {

    }
    public MyLinkedList(int val) {
        Node node1 = new Node(val);
        head = node1;
        usedSize++;
    }

    public void add(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
        }
        node.next = head;
        head = node;
        usedSize++;
    }
    public void addd() {
        Node cur = head;
        for (int i = 0; i < usedSize; i++) {
            cur = cur.next;
        }
        cur.next = head.next;
    }
    public void disPlay() {
        Node cur = head;
        while(cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
    public Node detectCycle(Node head) {
        if(head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(slow != fast) {
            if(fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        Node pHead = head;
        while(pHead != slow) {
            slow = slow.next;
            pHead = pHead.next;
        }
        return pHead;
    }
}

public class Test {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(-4);
        list.add(0);
        list.add(2);
        list.add(3);
        list.addd();
        //list.disPlay();
        list.detectCycle(list.head);
    }
}
