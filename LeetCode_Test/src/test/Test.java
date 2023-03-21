package test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-03-12
 * Time: 14:13
 */
public class Test {
    public static void main8(String[] args) {
//        for(Integer i = 2022;i < 3000; ++i) {
//            System.out.println(Integer.toHexString(i));
//        }
        System.out.println(Integer.toHexString(2730));
    }
    public static void main7(String[] args) {
        int count = 0;
        for(int i  = 1; i <= 26; ++i) {
            count++;
        }
        for(int i = 1; i <= 26; ++i) {
            for(int j = 1; j <= 26; j++) {
                count++;
            }
        }
        for(int i = 1; i <= 26; ++i) {
            for(int j = 1; j <= 26; ++j) {
                for(int k = 1; k <= 26; ++k) {
                    count++;
                    if(count == 2022) {
                        System.out.println("i = "+ i + "j = " + j + "k = " + k);
                        System.out.println(count);
                    }

                }
            }
        }
    }
    public static void main6(String[] args) {
        int year = 1900;
        int month = 1;
        int day = 1;
        int count = 0;
        for(; year <= 9999; ++year) {
            for(month = 1; month <= 12; ++month) {
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    for(day = 1; day <= 31; ++day) {
                        int a = (year/1000) + ((year%1000)/100) + ((year%100)/10) + (year%10);
                        int b = (month/10 + month%10) + (day/10 + day%10);
                        if(a == b) {
                            count++;
                        }
                    }
                }else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    for(day = 1; day <= 30; ++day) {
                        int a = (year/1000) + ((year%1000)/100) + ((year%100)/10) + (year%10);
                        int b = (month/10 + month%10) + (day/10 + day%10);
                        if(a == b) {
                            count++;
                        }
                    }
                }else {
                    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        for(day = 1; day <= 29; ++day) {
                            int a = (year/1000) + ((year%1000)/100) + ((year%100)/10) + (year%10);
                            int b = (month/10 + month%10) + (day/10 + day%10);
                            if(a == b) {
                                count++;
                            }
                        }
                    }else {
                        for(day = 1; day <= 28; ++day) {
                            int a = (year/1000) + ((year%1000)/100) + ((year%100)/10) + (year%10);
                            int b = (month/10 + month%10) + (day/10 + day%10);
                            if(a == b) {
                                count++;
                            }
                        }
                    }
                }

            }
        }
        System.out.println(count);
    }
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            int[][] dp = new int[n][m];
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < m; ++j) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < m; ++j) {
                    dp[i][j] = dfs(arr,i,j);
                    max = Math.max(dp[i][j],max);
                }
            }
            System.out.println(max);
        }
    }
    private static int dfs(int[][] arr, int i, int j) {
        int max = 1;
        if(i != 0 && arr[i][j] > arr[i-1][j]) {
            max = dfs(arr,i-1,j) + 1;
        }
        if(j != arr[0].length-1 && arr[i][j] > arr[i][j+1]) {
            max =  Math.max(max,dfs(arr,i,j+1) + 1);
        }
        if( i != arr.length-1 && arr[i][j] > arr[i+1][j]) {
            max =  Math.max(dfs(arr,i+1,j) + 1,max);
        }
        if(j != 0 && arr[i][j] > arr[i][j-1]) {
            max =  Math.max(dfs(arr,i,j-1) + 1,max);
        }
        return max;
    }
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int t = sc.nextInt();
            int[][] arr = new int[n][m];
            int count = n * m;
            for(; t > 0 ; --t) {
                int r1 = sc.nextInt();
                int c1 = sc.nextInt();
                int r2 = sc.nextInt();
                int c2 = sc.nextInt();
                for(int i = r1-1; i <= r2-1; ++i) {
                    for(int j = c1 - 1; j <= c2-1; ++j) {
                        if(arr[i][j] == 0) {
                            arr[i][j] = 1;
                            count--;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str2 = "lanqiao";
        while(sc.hasNext()) {
            String str = sc.nextLine();
            str = str.toLowerCase();
            if(str.equals(str2)) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int n = sc.nextInt();
        int R = sc.nextInt();
        int[][] array = new int[W+1][H=1];
        for(int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();

        }
    }
    public static void main1(String[] args) {
        int count = 0;
        int[] arr = {99, 22, 51, 63, 72, 61, 20, 88, 40, 21, 63, 30, 11, 18, 99, 12, 93, 16, 7, 53, 64, 9, 28, 84, 34, 96, 52, 82, 51, 77};
        for(int i = 0; i < arr.length; ++i) {
            for(int j = i + 1; j < arr.length; ++j) {
                if(arr[i] * arr[j] >= 2022) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
