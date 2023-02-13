package heap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-02-13
 * Time: 20:18
 */
public class Test {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        int[] array = {12,34,54,32,76,43,65,74,38,48};
        priorityQueue.initElem(array);
        priorityQueue.createHeap(priorityQueue.elem);
        priorityQueue.createHeap(array);
        priorityQueue.push(100);

    }
}
