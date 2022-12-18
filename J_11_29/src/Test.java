/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-29
 * Time: 14:48
 */
public class Test {

    public static int countSegments(String s) {
        // String[] str = s.split(" ");
        // return str.length;
        int count = 0;
        System.out.println(' ' != s.charAt(0));
        for (int i = 0;i < s.length() ; i++) {
            if((i == 0 || s.charAt(i - 1) == ' ' )&& s.charAt(i) != ' ') {
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //System.out.println(countSegments("                "));
        char a = 65 + 32;
        System.out.println(a);
    }
}
