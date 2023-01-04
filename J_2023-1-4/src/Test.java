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
    }

    Node head;

    public MyLinkedList(Node head) {
        this.head = head;
    }
}

public class Test {
//    public ListNode detectCycle(ListNode head) {
//        if(head == null || head.next == null) {
//            return null;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//        while(slow != fast) {
//            if(fast == null || fast.next == null) {
//                return null;
//            }
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        ListNode pHead = head;
//        while(pHead != slow) {
//            slow = slow.next;
//            pHead = pHead.next;
//        }
//        return pHead;
//    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(2);
        System.out.println(list);
        list.firs
    }
}
