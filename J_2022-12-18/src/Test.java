/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-18
 * Time: 14:23
 */
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
    void a () {
        ListNode node = new ListNode(1);
    }
    ListNode head = 
    void add(int val) {
        ListNode node = new ListNode(val);

    }
}
public class Test {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        head = head.next;
        ListNode p = head.next;
        do{
            head.next = cur;
            cur = head;
            head = p;
            p = p.next;
        }while(p != null);
        return cur;
    }
    public static void main(String[] args) {

    }
}
