/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-18
 * Time: 14:23
 */
class ListNode {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public Node head;
    public Node getHead() {
        return this.head;
    }

    {
        Node node = new Node(1);
        head = node;
    }

    void add(int val) {
        Node node1 = new Node(val);
        node1.next = head;
        head = node1;
    }

    void disPlay() {
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.val);
            cur = cur.next;
        }
    }
     Node reverseList(Node head) {
        Node cur = head;
        head = head.next;
        Node p = head.next;
        cur.next = null;
        do{
            head.next = cur;
            cur = head;
            head = p;
            p = p.next;
        }while(p != null);
        head.next = cur;
        return head;
    }


}
public class Test {

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.add(2);
        listNode.add(3);
        listNode.add(4);
        listNode.add(5);
        listNode.add(6);
        listNode.reverseList(listNode.getHead());
        listNode.disPlay();
    }
}
