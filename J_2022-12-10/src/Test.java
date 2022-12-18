import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-10
 * Time: 8:34
 */
public class Test {
    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = nums1.length - 1;
            m -= 1;
            n -= 1;
            while(n >= 0) {
                if(m > 0 && nums1[m] > nums2[n]) {
                    nums1[i--] = nums1[m--];
                }else {
                    nums1[i--] = nums2[n--];
                }
            }
        }
    }
    public static void main1(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {2,0};
        int[] arr2 = {1};
        solution.merge(arr1,1,arr2,1);
    }
    public static List<List<Integer>> generate(int num) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        ret.add(row1);

        for (int i = 1; i < num; i++) {
            List<Integer> row2 = new ArrayList<>();
            row2.add(1);
            for (int j = 1; j < i; j++) {
                int sum = ret.get(i-1).get(j) + ret.get(i-1).get(j-1);
                row2.add(sum);
            }
            row2.add(1);
            ret.add(row2);
        }
        return ret;
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int c = nums1.length - 1;
        while(n >= 0) {
            while(m>0 && nums1[m] >= nums2[n]) {
                nums1[c--] = nums1[m--];
            }
            nums1[c--] = nums2[n--];
        }
    }

    public static void main4(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
    public static void main3(String[] args) {
        int[] arr1 = {2,0};
        int[] arr2 = {1};
        merge(arr1,1,arr2,1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        List<List<Integer>> list = generate(a);
        Integer b = 1;
        System.out.println(b.equals(2));
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < a - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(list.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
