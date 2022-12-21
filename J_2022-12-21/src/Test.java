import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-21
 * Time: 18:13
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
        System.out.println(arrayList);
    }
    public static void main2(String[] args) {
        int[] array = new int[10];

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.remove(2);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);
        arrayList.trimToSize();
    }
}
