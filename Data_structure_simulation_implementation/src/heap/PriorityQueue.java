package heap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-02-13
 * Time: 19:55
 */
public class PriorityQueue {
    public int[] elem;

    public int usedSize;

    public PriorityQueue()  {
        this.elem = new int[10];
    }

    public void initElem(int array[]) {
        checkSize(array.length);
        for (int i = 0; i < array.length; i++) {
            elem[i] = array[i];
            usedSize ++;
        }
    }
    //检查容量并扩容
    private void checkSize(int len) {
        while(len > elem.length) {
            this.elem = Arrays.copyOf(elem,elem.length*2);
        }
    }
    /**
     * 建堆的时间复杂度：
     *O(N)
     * @param array
     */
    //创建大堆
    public void createHeap(int[] array) {
        for (int parent = (usedSize-1-1)/2; parent >= 0; parent--) {
            shiftDown1(parent,usedSize);
        }
    }
    //创建小堆
    public void CreateASmallRootHeap(int[] array) {
        for (int parent = (usedSize-1-1)/2; parent >= 0; parent--) {
            shiftDown2(parent,usedSize);
        }
    }

    /**
     *
     * @param root 是每棵子树的根节点的下标
     * @param len  是每棵子树调整结束的结束条件
     * 向下调整的时间复杂度：O(logn)
     */
    //大根堆
    private void shiftDown1(int root,int len) {
        int child = root * 2 + 1;
        while(child < len) {
            if(child+1 < len && elem[child] < elem[child+1]) {
                child ++;
            }
            if(elem[child] > elem[root]) {
                int tmp = elem[child];
                elem[child] = elem[root];
                elem[root] = tmp;
                root = child;
                child = child*2 +1;
            }else {
                break;
            }
        }
    }
    //小根堆
    private void shiftDown2(int root,int len) {
        int child = root * 2 + 1;
        while(child < len) {
            if(child+1 < len && elem[child] > elem[child+1]) {
                child ++;
            }
            if(elem[child] < elem[root]) {
                int tmp = elem[child];
                elem[child] = elem[root];
                elem[root] = tmp;
                root = child;
                child = child*2 +1;
            }else {
                break;
            }
        }
    }


    /**
     * 入队：仍然要保持是大根堆
     * @param val
     */
    public void push(int val) {
        checkSize(usedSize+1);
        elem[usedSize++] = val;
        shiftUp(usedSize-1);
    }

    private void shiftUp(int child) {
        int parent = (child-1)/2;
        while(child > 0) {
            if(elem[child] > elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                child = parent;
                parent = (child-1) / 2;
            }else {
                break;
            }
        }
    }

    public boolean isFull() {
        return usedSize == elem.length;
    }

    /**
     * 出队【删除】：每次删除的都是优先级高的元素
     * 仍然要保持是大根堆
     */
    public void pollHeap() {
        if(!isEmpty()) {
            swap(0,usedSize-1);
            usedSize--;
            shiftDown1(0,usedSize);
        }
    }
    private void swap(int i,int j) {
        int tmp = elem[i];
        elem[i] = elem[j];
        elem[j] = tmp;
    }
    public boolean isEmpty() {
        return usedSize == 0;
    }

    /**
     * 获取堆顶元素
     * @return
     */
    public int peekHeap() {
        return elem[0];
    }

    class BigComparator implements Comparator<Integer> {//比较器
        public int compare(Integer o1,Integer o2) {
            return o2 - o1;
        }
    }

    public int[] smallestK(int[] arr, int k) {
        java.util.PriorityQueue<Integer> queue = new java.util.PriorityQueue<Integer>(new BigComparator());
        for(int i = 0;i < k;i++) {
            queue.offer(arr[i]);
        }
        for(int i = k;i < arr.length;i++) {
            if(arr[i] < queue.peek()) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        int[] ret = new int[k];
        for(int i = k-1;i >= 0; i--) {
            ret[i] = queue.poll();
        }
        return ret;
    }
}
