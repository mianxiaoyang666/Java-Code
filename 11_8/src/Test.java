import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-08
 * Time: 19:30
 */
public class Test {
    public static void printArray(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        printArray(array);
    }
    public static void main12(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
    public static  void hanoi(int n) {

    }
    public static void main11(String[] args) {

    }
    public static  int fib(int n) {
        if (n < 3) {
            return 1;
        }
        else {
            return fib(n -1) + fib(n - 2);
        }
    }
    public static void main10(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = fib(n);
        System.out.println(ret);
    }
    public static int reSum(int n) {
        if(n > 9) {
            return reSum(n / 10) + n % 10;
        }
        else {
            return n;
        }
    }
    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = reSum(n);
        System.out.println(ret);
    }
    public static void printt(int n) {

        if (n >= 10) {
            printt(n / 10);
        }
        System.out.print(n % 10);
    }
    public static void main8(String[] args) {
        //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归
        int n = 1234;
        printt(n);
    }
    public static int sumFactorial(int n) {
        if(n == 1) {
          return 1;
        }
        return n + sumFactorial(n-1);
    }
    public static void main7(String[] args) {
        int n = 4;
        int ret = sumFactorial(n);
        System.out.println(ret);
    }
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main6(String[] args) {
        //递归求 N 的阶乘
        int n = 10;
        int ret = factorial(n);
        System.out.println(ret);
    }
    public static void main4(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[]{1,2,3};
        array[1] = new int[]{11,22,33,44,55,66};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main3(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        for (int[] ret : array) {//二维数组的元素是一维数组
            for (int x : ret) {//再使用一个for each 去遍历一维数组
                System.out.print(x + " ");
            }
            System.out.println();
        }
        String str = Arrays.deepToString(array);
        System.out.println(str);
    }
    public static void main2(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main1(String[] args) {
        int[][] array2 = new int[][] {{1,2,3},{4,5,6}};
        int[][] array3 = {{1,2,3},{4,5,6}};
    }
}