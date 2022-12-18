import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-09
 * Time: 11:33
 */
class Solution {
    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] nums;
        int m = num1.length;
        int n = num2.length;
        nums = new int[m + n];
        if (m == 0) {
            if (n % 2 == 0) {
                return (num2[n / 2 - 1] + num2[n / 2]) / 2.0;
            } else {

                return num2[n / 2];
            }
        }
        if (n == 0) {
            if (m % 2 == 0) {
                return (num1[m / 2 - 1] + num1[m / 2]) / 2.0;
            } else {
                return num1[m / 2];
            }
        }

        int count = 0;
        int i = 0, j = 0;
        while (count != (m + n)) {
            if (i == m) {
                while (j != n) {
                    nums[count++] = num2[j++];
                }
                break;
            }
            if (j == n) {
                while (i != m) {
                    nums[count++] = num1[i++];
                }
                break;
            }

            if (num1[i] < num2[j]) {
                nums[count++] = num1[i++];
            } else {
                nums[count++] = num2[j++];
            }
        }

        if (count % 2 == 0) {
            return (nums[count / 2 - 1] + nums[count / 2]) / 2.0;
        } else {
            return nums[count / 2];
        }
    }
    public static double findMedianSortedArrays2(int[] num1, int[] num2) {
        int m = num1.length;
        int n = num2.length;
        int[] nums = new int[m + n];
        if(m == 0) {//如果nums1 是null
            if(n % 2 == 0) {
                return (num2[n/2 -1] + nums[n/2]) / 2.0;
            }else {
                return num2[n/2];
            }
        }
        if(n == 0) {//如果nums2 是null
            if(m % 2 == 0) {
                return (num1[m/2 -1] + nums[m/2]) / 2.0;
            }else {
                return num1[m/2];
            }
        }
        int count = 0;
        int i = 0;//m
        int j = 0;//n
        while(count != m+n) {//合并
            if(i == m) {
                while(j != n) {
                    nums[count++] = num2[j++];
                }
                break;
            }
            if(j == n) {
                while(i != m) {
                    nums[count++] = num1[i++];
                }
                break;
            }
            if(num1[i] <= num2[j]) {
                nums[count++] = num1[i++];
            }else {
                nums[count++] = num2[j++];
            }
        }
        if(count % 2 == 0) {
            return (nums[count/2 -1] + nums[count/2]) / 2.0;
        }else {
            return nums[count/2];
        }
    }
}


public class Test {
    public static void main(String[] args) {
        int[] num1 = {};
        int[] num2 = {2,3};
        double b = Solution.findMedianSortedArrays2(num1,num2);
        double a = Solution.findMedianSortedArrays(num1,num2);
    }
}
