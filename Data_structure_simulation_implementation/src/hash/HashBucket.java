package hash;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-02-19
 * Time: 19:44
 */
public class HashBucket {
    //结点
     class Node {
         int key;
         int val;
         Node next;

         public Node(int key, int val) {
             this.key = key;
             this.val = val;
         }
     }

    private Node[]  array;//底层操作数组
    private int size;   // 当前的数据个数
    private static final double LOAD_FACTOR = 0.75;//负载因子
    private static final int DEFAULT_SIZE = 8;//默认桶的大小

    //设置元素
    public int put(int key, int value) {
        //先找有没有相同的key
        int index = key % array.length;
        Node cur = array[index];
        while(cur != null) {
            if(cur.key == key) {
                cur.val = value;
                return value;
            }
            cur = cur.next;
        }
        //index 没有元素就放入key
        Node node = new Node(key,value);
        cur = array[index];
        if(cur == null) {
            array[index] = node;
            size++;
            //检查负载因子扩容
            if(loadFactor() > LOAD_FACTOR) {
                resize();
            }
            return value;
        }
        //index 位置有元素了，使用尾插法插入
        cur.next = node;
        size++;
        //检查负载因子扩容
        if(loadFactor() > LOAD_FACTOR) {
            resize();
        }
        return value;
    }

    //扩容
    private void resize() {
        //扩容对新数组进行操作，操作完成后赋值给原数组
        //因为新数组可能需要重新散列元素，例如 20 大小数组 key 为14 时位置已经不在原数组(10大小) 4 的位置上

        Node[] newArray = new Node[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            Node cur = array[i];
            while(cur != null) {
                int index = cur.key % newArray.length;
                if(newArray[index] == null) {
                    newArray[index] = cur;
                }else {
                    newArray[index].next = cur;
                }
                cur = cur.next;
            }
        }
        array = newArray;
    }

    //检查负载因子
    private double loadFactor() {
        return size * 1.0 / array.length;
    }


    public HashBucket() {
        array = new Node[10];
    }

    //获取key.val
    public int get(int key) {
        int index = key % array.length;
        Node cur = array[index];
        while(cur != null) {
            if(cur.key == key) {
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }
}
