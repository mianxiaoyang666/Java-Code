package sort;


import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-02-27
 * Time: 11:30
 */
class Test {
    public class Sort {
        //插入排序
        public int[] insertSort(int[] array) {
            int i = 1;
            int j = 0;
            while (i < array.length) {
                int tmp = array[i];
                while (j >= 0) {
                    if (array[j] > tmp) {
                        tmp = array[j + 1];
                        array[j + 1] = array[j];
                        j--;
                    } else {
                        array[j + 1] = tmp;
                        break;
                    }
                    array[j + 1] = tmp;
                }
                i++;
                j = i - 1;
            }
            return array;
        }
    }
}
