import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-12
 * Time: 14:53
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        System.out.println(list);
        list.removeR
    }
    public static void main2(String[] args) {
        Random random = new Random();
        int i = random.nextInt(51);
        int j = random.nextInt(51);
        System.out.println(i);
        System.out.println(j);
    }

}
