import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-09
 * Time: 22:28
 */
class MyStack {
    Queue<Integer> list1;
    Queue<Integer> list2;
    public MyStack() {
        list1 = new LinkedList<Integer> ();
        list2 = new LinkedList<Integer> ();
    }

    public void push(int x) {
        list2.offer(x);
        while(!list1.isEmpty()) {
            list2.offer(list1.poll());
        }
        Queue<Integer> tmp = list2;
        list2 = list1;
        list1 = tmp;
    }

    public int pop() {
        return list1.poll();
    }

    public int top() {
        return list1.peek();
    }

    public boolean empty() {
        return list1.isEmpty();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        int a = myStack.pop();
        a = myStack.pop();
        a = myStack.pop();
        System.out.println(a);
        System.out.println(myStack.empty());
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(2);
        deque.offer(1);
        deque.addLast(3);
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);
        int[] arr;
        arr = new int[2];
    }
}
