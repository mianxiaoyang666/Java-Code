/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-11-02
 * Time: 16:03
 */
public class LeapYear {
    public static void main(String[] args) {
        /*
        公历年份是4的倍数，且不是100的倍数，为普通闰年。公历年份是整百数，
        且必须是400的倍数才是世纪闰年。归结起来就是通常说的：四年一闰；百年不闰，四百年再闰。
         */
        for (int i = 1000; i <= 2000; i+= 4) {
            if(i % 400 == 0 || i % 100 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
