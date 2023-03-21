package 蓝桥杯饮料换购;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-03-21
 * Time: 21:55
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int a = n;
        while(a >= 3) {
            int b = a%3;
            a /= 3;
            n += a;
            a += b;
        }
        System.out.println(n);
        scan.close();
    }
}
