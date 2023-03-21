package 蓝桥杯成绩分析;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-03-21
 * Time: 21:39
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int[] nums = new int[n];
        float sum = 0;
        for(int i = 0; i < n; ++i) {
            nums[i] = scan.nextInt();
            sum += nums[i];
        }
        Arrays.sort(nums);
        System.out.println(nums[n-1]);
        System.out.println(nums[0]);
        System.out.printf("%.2f",sum/n);
        scan.close();
    }
}
