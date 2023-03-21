package 蓝桥杯小明的衣服;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040S
 * Date: 2023-03-21
 * Time: 23:11
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 衣服数量
        int[] a = new int[n]; // 邮费数组
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // 获取邮费
        }
        Arrays.sort(a); // 按照邮费从小到大排序
        long cost = 0; // 总代价
        for (int i = 0; i < n; i++) {
            cost += (long) a[i] * (i + 1); // 计算代价
        }
        System.out.println(cost); // 输出总代价
    }
}
