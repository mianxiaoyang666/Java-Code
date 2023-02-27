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
    public static boolean wordBreak(String s, Set<String> dict){
        boolean[] canBreak = new boolean[s.length() + 1];
        canBreak[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(canBreak[j] && dict.contains(s.substring(j,i))) {
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[s.length()];
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] minTriangle= new int[n][n];
        //初始状态
        minTriangle[0][0] = triangle.get(0).get(0);

        for(int i = 1; i < n; ++i) {
            for(int j = 0; j <= i; ++j) {
                //转移方程
                if(j == 0) {
                    minTriangle[i][0] = triangle.get(i).get(0) + triangle.get(i-1).get(0);
                }else if(j == i) {
                    minTriangle[i][j] = triangle.get(i).get(j) + triangle.get(i-1).get(j-1);
                }else {
                    minTriangle[i][j] =
                            Math.min(triangle.get(i-1).get(j-1),triangle.get(i-1).get(j))
                                    + triangle.get(i).get(j);
                }
            }
        }
        //返回结果:最后一行的最小值
        int minPath = 0;
        for(int j = 0; j < n-1; ++j) {
            minPath = Math.min(minTriangle[n-1][j],minTriangle[n-1][j+1]);
        }
        return minPath;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        list5.add(2);
        list.add(list5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        list.add(list3);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        list.add(list4);

        minimumTotal(list);
    }
    public static void main2(String[] args) {
        String s = "aleetcodec";
        Set<String> dict = new HashSet<>();
        dict.add("leet");
        dict.add("code");
        System.out.println(wordBreak(s,dict));
        int a = 1;
        int b = 2;
        Math.max(a,b);
        List<List<Integer>> list = new LinkedList<>();

    }
    public static void main1(String[] args) {
        int[] array = {44,34,74,12,2,13,52,8};
        Sort sort = new Sort();
        sort.insertSort(array);
        System.out.println(Arrays.toString(array));
        boolean[] flg = new boolean[10];
    }
}
public class Sort {
    //插入排序
    public int[] insertSort(int[] array) {
        int i = 1;
        int j = 0;
        while(i < array.length) {
            int tmp  = array[i];
            while(j >= 0) {
                if(array[j] > tmp) {
                    tmp = array[j+1];
                    array[j + 1] = array[j];
                    j--;
                }else {
                    array[j+1] = tmp;
                    break;
                }
                array[j+1] = tmp;
            }
            i++;
            j = i-1;
        }
        return array;
    }

}
