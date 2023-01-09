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
    Queue<Integer> pushList;
    Queue<Integer> popList;
    public MyStack() {
        pushList = new LinkedList<Integer> ();
        popList = new LinkedList<Integer>();
    }

    public void push(int x) {
        pushList.offer(x);
    }

    public int pop() {
        if(popList.isEmpty()) {
            while(!pushList.isEmpty()) {
                popList.offer(pushList.poll());
            }
        }
        return popList.poll();
    }

    public int top() {
        if(popList.isEmpty()) {
            while(!pushList.isEmpty()) {
                popList.offer(pushList.poll());
            }
        }
        return popList.peek();
    }

    public boolean empty() {
        if(pushList.isEmpty() && popList.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        int a = myStack.top();
        System.out.println(a);
        a = myStack.pop();
        System.out.println(a);
        System.out.println(myStack.empty());
    }
}
