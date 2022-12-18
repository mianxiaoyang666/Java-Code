import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-06
 * Time: 20:44
 */
public class Test {
    public static int add(int a, int b) {
        return a + b;
    }
    public static float add(float a, float b, float c) {
        return a + b + c;
    }
    public static void main7(String[] args) {
        int a = 10, b = 15;
        float c = 10.5f, d = 11.4f, e = 5.6f;
        int sum1 = add(a, b);
        float sum2 = add(c, d, e);
        System.out.println(sum1);
        System.out.println(sum2);
    }
    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b = 1, c = 0;
        while(n > 2) {
            c = a + b;
            a = b;
            b = c;
            n --;
        }
        System.out.println(c);
    }
    public  static int Max1(int max,int min) {
        if(max > min) {
            return max;
        }
        else {
            return min;
        }
    }
    public static void Max3(int n,int x,int y) {
        int Max2 = Max1(n,x);
        if(Max2 < y) {
            System.out.println(y);
        }
        else {
            System.out.println(Max2);
        }
    }
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        Max3(n,x,y);
    }
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
    public static void main3(String[] args) {
        String key = "12345zzz";
        boolean flag = true;
        int count = 3;
        while(flag) {
            Scanner sc = new Scanner(System.in);
            String key2 = sc.nextLine();
            if(key.equals(key2)) {
                System.out.println("输入正确");
                break;
            }
            else {
                count --;
                System.out.println("输入错误你还有" + count + "次机会");
            }
            if(count == 0) {
                break;
            }
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0) {
            System.out.println(n%10);
            n /= 10;
        }
    }
    public static void main1(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 1) {
                sum += 1.0/i;
            }
            else if (i % 2 == 0) {
                sum -= 1.0/i;
            }
        }
        System.out.println(sum);
    }
}
