/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-13
 * Time: 9:53
 */
public class Sort {
    public static void insertSort(int[] array) {
        for (int k = 1; k < array.length; k++) {
            int tmp = array[k];
            for (int i = k-1; i >= 0 ; i--) {
                if(array[i] > tmp) {
                    array[i + 1] = array[i];
                }else {
                    break;
                }
            }
        }
    }
    public static void shellSort(int[] array) {
        int gap = array.length;
        while (gap > 1) {
            shell(array,gap);
            gap /= 2;
        }
//整体进行插入排序
        shell(array,1);
    }

    public static void shell(int[] array,int gap) {
        for (int i = gap; i < array.length; i ++) {
            int tmp = array[i];
            int j = i-gap;
            for (j = i-gap; j >= 0 ; j -= gap) {
                if(array[j] > tmp) {
                    array[j + gap] = array[j];
                }else {
                    break;
                }
            }
            array[j + gap] = tmp;
        }
    }

    public static void selectSort(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++){
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                }
            }
            array[i] = min;
        }
    }

    private static int partition(int[] array,int left,int right) {
        int tmp = array[left];
        while(left < right) {
            while(left < right && array[right] >= tmp) {
                right--;
            }
            int cur = array[left];
            array[left] = array[right];
            array[right] = cur;
            while(left < right && array[left] <= tmp) {
                left++;
            }
            cur = array[left];
            array[left] = array[right];
            array[right] = cur;
        }
        array[left] = tmp;
    }
}
