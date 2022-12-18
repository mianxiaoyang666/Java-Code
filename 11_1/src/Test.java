import sun.util.resources.cldr.fr.CalendarData_fr_MQ;

import java.nio.Buffer;
import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-01
 * Time: 19:22
 */

public class Test {
    //素数
    public static void primeNumber(int n) {
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i % j == 0){
                    break;
                }
                if(j > Math.sqrt(i)){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100;
        primeNumber(7);
        double a = Math.sqrt(2);
        System.out.println(2 % Math.sqrt(2));
        System.out.println(a);
    }
}
