import java.util.Stack;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-08
 * Time: 9:26
 */
public class Test {

    public static void main(String[] args) {//测试
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
    public static void main1(String[] args) {
        String c = "a";
        boolean a = c.equals("a");
        System.out.println(a);
        Stack s = new Stack();
        s.empty();
        s.isEmpty();
//        Math.max();
    }
}
