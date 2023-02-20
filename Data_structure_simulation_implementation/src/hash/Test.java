package hash;

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
        public Cup(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
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
        Cup cup1 = new Cup("猫爪杯子");
        Cup cup2 = new Cup("派大星杯子");
        Cup cup3 = new Cup("海绵宝宝杯子");
        treeMap.put(cup1,10);
        treeMap.put(cup2,25);
        treeMap.put(cup3,30);
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
