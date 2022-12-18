import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-02
 * Time: 15:29
 */
public class PrimeNumber {
//    public static void printsPN(int n) {
//        System.out.println("2");
//        for (int i = 3; i <= n; i += 2) {
//            boolean flag = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//    }
    public static boolean judge(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        int n = 100;
//        printsPN(n);
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字");
        n = sc.nextInt();
        boolean a = judge(n);
        if(a) {
            System.out.println(n + "是素数");
        }
        else {
            System.out.println(n + "不是素数");
        }

    }
}
