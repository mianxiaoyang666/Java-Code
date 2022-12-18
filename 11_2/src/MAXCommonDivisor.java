import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-02
 * Time: 16:51
 */
public class MAXCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入俩个数字");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;
        int min = 0;
        if(a > b) {
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;
        }
        for (int i = min; i >= 2; i--) {
            if((max % i == 0) && (min % i) == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
