/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-02
 * Time: 16:01
 */
public class AppearNine {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(i / 10 == 9) {
                count ++;
            }
            if(i % 10 == 9) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
