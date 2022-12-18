import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-11
 * Time: 20:28
 */
public class Test2 {
    //给定一个有序整型数组, 实现二分查找
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int right = array.length - 1;
        int mid;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (a < array[mid]) {
                right = mid - 1;
            } else if (a > array[mid]) {
                left = mid + 1;
            } else {
                System.out.println("找到了" + array[mid]);
                return;
            }
        }
        if (left > right) {
            System.out.println("找不到");
        }
    }
}
