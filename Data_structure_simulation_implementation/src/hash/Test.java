package hash;

import javax.rmi.CORBA.StubDelegate;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-02-19
 * Time: 20:48
 */
public class Test {
    static class Cup {//杯子
        String name;
        Integer price;
        public Cup(String name,int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cup cup = (Cup) o;
            return Objects.equals(name, cup.name) && Objects.equals(price, cup.price);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price);
        }
    }

    public static void main(String[] args) {
            Cup cup1 = new Cup("猫爪杯子",10);
            Cup cup2 = new Cup("派大星杯子",22);
            Cup cup3 = new Cup("海绵宝宝杯子",25);
            Cup cup4 = new Cup("猫爪杯子",10);
            HashMap<Cup,Integer> hasMap = new HashMap<>();
            hasMap.put(cup1,100);
            hasMap.put(cup2,200);
            hasMap.put(cup3,300);
            hasMap.put(cup4,300);
            System.out.println(hasMap.get(cup1));
    }
    public static void main23(String[] args) {
        Cup cup1 = new Cup("猫爪杯子",10);
        Cup cup2 = new Cup("派大星杯子",22);
        Cup cup3 = new Cup("海绵宝宝杯子",25);
        Cup cup4 = new Cup("猫爪杯子",10);
        HashMap<Cup,Integer> hasMap = new HashMap<>();
        hasMap.put(cup1,100);
        hasMap.put(cup2,200);
        hasMap.put(cup3,300);
        hasMap.put(cup4,300);

        System.out.println(hasMap.get(cup1));
    }
    public static void main20(String[] args) {
        HashMap<String,Integer> hasMap = new HashMap<>();
        hasMap.put("111",1000);
    }
    public static void main21(String[] args) {
        Cup cup1 = new Cup("猫爪杯子",10);
        Cup cup2 = new Cup("派大星杯子",22);
        Cup cup3 = new Cup("海绵宝宝杯子",25);
        Cup cup4 = new Cup("猫爪杯子",10);
        HashMap<Cup,Integer> hasMap = new HashMap<>();
        System.out.println(cup1.hashCode());
        System.out.println(cup2.hashCode());
        System.out.println(cup3.hashCode());
//        System.out.println(cup1.hashCode());
//        System.out.println(cup2.hashCode());
//        System.out.println(cup3.hashCode());
//        System.out.println(cup4.hashCode());
        hasMap.put(cup1,100);
        hasMap.put(cup2,200);
        hasMap.put(cup3,300);
        System.out.println(hasMap.get(cup4));
    }
    public static void main19(String[] args) {
        HashBucket hashBucket = new HashBucket();
        hashBucket.put(24,12);
        hashBucket.put(14,111);
        hashBucket.put(2,111);
        hashBucket.put(3,111);
        hashBucket.put(41,11);
        hashBucket.put(5,111);
        hashBucket.put(6,111);
        hashBucket.put(7,111);

        int a = hashBucket.get(14);
        System.out.println(a);
    }
    public static void main18(String[] args) {
        Integer a = 1;
        System.out.println(a.hashCode());
    }
    public static void main17(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.hashCode();
    }
    public static void main16(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(15);
        treeSet.remove(15);
        treeSet.contains(12);

    }
    public static void main15(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("猫爪杯子",10);
        treeMap.put("派大星杯子",25);
        treeMap.put("海绵宝宝杯子",30);
        for (Map.Entry<String,Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + "=" +entry.getValue());
        }
    }
    public static void main14(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("猫爪杯子",10);
        treeMap.put("派大星杯子",25);
        treeMap.put("海绵宝宝杯子",30);
        System.out.println(treeMap.containsValue(99));
    }
    public static void main13(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("猫爪杯子",10);
        treeMap.put("派大星杯子",25);
        treeMap.put("海绵宝宝杯子",30);
        System.out.println(treeMap.containsKey("猫爪杯子"));
    }
    public static void main12(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("猫爪杯子",10);
        treeMap.put("派大星杯子",25);
        treeMap.put("海绵宝宝杯子",30);
        treeMap.put("杯子",10);
        treeMap.put("派杯子",25);
        treeMap.put("海杯子",30);
        System.out.println(treeMap.values());
    }
    public static void main11(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("猫爪杯子",10);
        treeMap.put("派大星杯子",25);
        treeMap.put("海绵宝宝杯子",30);
        System.out.println(treeMap.keySet());
    }
    public static void main10(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put(null,10);
        treeMap.put("派大星杯子",25);
        treeMap.put("海绵宝宝杯子",30);
    }
    public static void main88(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("猫爪杯子",10);
        treeMap.put("派大星杯子",25);
        treeMap.put("海绵宝宝杯子",30);
        treeMap.remove("派大星杯子");
        System.out.println(treeMap);
    }
    public static void main7(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("猫爪杯子",10);
        treeMap.put("派大星杯子",25);
        treeMap.put("海绵宝宝杯子",30);
        System.out.println(treeMap.getOrDefault("杯子",100));
    }
    public static void main6(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("猫爪杯子",10);
        treeMap.put("派大星杯子",25);
        treeMap.put("海绵宝宝杯子",30);
        System.out.println(treeMap.get("杯"));
    }
    public static void main3(String[] args) {
        Map<Cup,Integer> treeMap = new TreeMap<>();
//        Cup cup1 = new Cup("猫爪杯子");
//        Cup cup2 = new Cup("派大星杯子");
//        Cup cup3 = new Cup("海绵宝宝杯子");
//        treeMap.put(cup1,10);
//        treeMap.put(cup2,25);
//        treeMap.put(cup3,30);
        System.out.println(treeMap);
    }
    public static void main5(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("猫爪杯子",10);
        treeMap.put("猫爪杯子",100);
        System.out.println(treeMap);
    }
    public static void main4(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("猫爪杯子",10);
        treeMap.put("派大星杯子",25);
        treeMap.put("海绵宝宝杯子",30);
        System.out.println(treeMap);
    }
    public static void main2(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.contains((1));
        System.out.println(hashSet);
        Iterator<Integer> it = hashSet.iterator();
        it.next();
        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(0,"111");
        treeMap.put(2,"222");
        hashSet.isEmpty();
        hashSet.size();
        System.out.println(treeMap);
        Set set = treeMap.entrySet();
        System.out.println(set);

    }
}
