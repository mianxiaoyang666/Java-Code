import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-08
 * Time: 22:20
 */
public class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minStack;
        public MinStack() {
            stack = new Stack<Integer>();
            minStack = new Stack<Integer>();
        }

    public void push(int val) {
            stack.push(val);
            if(minStack.empty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            if(stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
}
