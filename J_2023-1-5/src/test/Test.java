package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-05
 * Time: 15:21
 */
public class Test {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();//存放左括号
        for(int i = 0;i < s.length();i++) {
            Character c = s.charAt(i);
            if(c == '{') {
                stack.push('}');
            }else if(c == '(') {
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(stack.empty() || stack.pop() != c) {
                return false;
            }else {
                stack.pop();
            }
        }
        return true;
}

    public static void main(String[] args) {
        char c = '1';
        int a = (Integer)(int)c;
        System.out.println(a);

    }
    public static void main1(String[] args) {
//        boolean flag = isValid("()");
        Stack<Character> s = new Stack<>();
        Character a = s.peek();
        int c = 1;
    }
    public static void main2(String[] args) {
        Queue<Integer> list =  new LinkedList<>();
        String s = "1";
    }
}
