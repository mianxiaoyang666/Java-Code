import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-20
 * Time: 22:05
 */
public class Test {
    public static void main(String[] args) {
        String[] strings = new String[10];
        strings[0] = new String("ABC");
        System.out.println(strings[0]);
        Integer[] integers = new Integer[10];
        List<Integer> list = new ArrayList();
        list.add(1);
        System.out.println(list.get(1));
    }
}
