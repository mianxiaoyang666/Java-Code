import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-26
 * Time: 20:50
 */
public class Test {

    public static void isDays(int year,int month,int day) {
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        int ret = 0;
        if(year % 4 == 0 || year % 400 == 0) {
            if(year % 100 != 0) {
                monthDays[1] = 29;
            }
        }
        for (int i = 0; i < month-1; i++) {
            ret += monthDays[i];
        }
        System.out.println(ret += day);
    }
    public static boolean perfectNumber(int num){
        int sum = 0;
        for (int i = 1; i < Math.sqrt(num); i++) {
            if(num % i == 0) {
                sum += i;
            }
            int ret = num / i;
            if(ret != i && ret != num) {
                sum += ret;
            }
        }
        if(sum == num) {
            return true;
        }
        return false;
    }
    public static  int countHomogenous(String s) {
        final int MOD = 1000000007;
        long res = 0;
        char prev = s.charAt(0);
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == prev) {
                cnt++;
            } else {
                res += (long) (cnt + 1) * cnt / 2;
                cnt = 1;
                prev = c;
            }
        }
        res += (long) (cnt + 1) * cnt / 2;
        return (int) (res % MOD);
    }
    public static void main(String[] args) {
        String a = "abbcccaa";
        countHomogenous(a);
    }
    public static void main4(String[] args) {
        int sum = 1;
        for (int i = 0; i < 10; i++) {
            sum += 1;
            sum *= 2;
        }
        System.out.println(sum);
    }
    public static void main3(String[] args) {
        System.out.println(perfectNumber(6));
    }
    public static void main1(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        isDays(year,month,day);
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        if(a >= 'a' && a <= 'z') {
            a -= 32;
        }
        System.out.println(a);
    }
}
