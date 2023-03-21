package 蓝桥杯分巧克力;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-03-21
 * Time: 22:37
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[][] chocolates = new int[n][2];
        int sideLength = Integer.MAX_VALUE;
        for(int i = 0; i < n; ++i) {
            chocolates[i][0] = scan.nextInt();
            sideLength = Math.min(sideLength, chocolates[i][0]);
            chocolates[i][1] = scan.nextInt();
            sideLength = Math.min(sideLength, chocolates[i][1]);
        }
        while(sideLength > 0) {
            for(int i = 0; i < n; ++i) {
                int x = chocolates[i][0] / sideLength;
                int y = chocolates[i][1] / sideLength;
                int sum = x * y;
                if(sum >= k) {
                    break;
                }else {
                    sideLength--;
                }
            }
        }
        System.out.println(sideLength);
        scan.close();
    }
}
