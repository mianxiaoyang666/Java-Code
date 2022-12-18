import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-02
 * Time: 16:37
 */
public class FoundBinaryByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i <=31 ; i++) {
            if(((n >>> i) & 1) == 1) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
