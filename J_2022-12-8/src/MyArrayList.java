import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2022-12-08
 * Time: 15:14
 */
public class MyArrayList {
    public static void merge(int[] num1, int m, int[] num2, int n) {
        int i = 0;
        int j = 0;
        int[] num = new int[m];
        int count = 0;
        while(count != m) {
            if(num1[i] <= num2[j] && i < m-n) {
                num[count++] = num1[i++];
            }else {
                num[count++] = num2[j++];
            }
        }
        num1 = num;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        MyArrayList.merge(arr1,6,arr2,3);
    }
    public static int removeDuplicates(int[] num) {
        int p = 0;
        int q = 1;
        while(q < num.length) {
            if(num[p] != num[q]) {
                if(q - p > 1) {
                    num[p+1] = num[q];
                    p++;
                }
            }
            q++;
        }
        return p + 1;
    }
    public static void main1(String[] args) {
        int[] arr = {1,2};
        int[] arr2 = {1,2,3};
        arr = arr2;
        MyArrayList.removeDuplicates(arr);
    }

    public int[] elem;
    public int usedSize;//0
    //默认容量
    private static final int DEFAULT_SIZE = 5;

    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
    }

    /**
     * 打印顺序表:
     * 根据usedSize判断即可
     */
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.println(this.elem[i]);
        }
    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        if (isFull()) {
            vapacityExpansion(this.elem);
        }
        elem[this.usedSize] = data;
        this.usedSize++;
    }

    private void vapacityExpansion(int[] elem) {//扩容
        this.elem = Arrays.copyOf(this.elem, 2 * elem.length);
    }

    /**
     * 判断当前的顺序表是不是满的！
     *
     * @return true:满   false代表空
     */
    public boolean isFull() {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    private boolean checkPosInAdd(int pos) {
        if (pos > usedSize) {
            return false;
        }
        return true;//合法
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (checkPosInAdd(pos)) {
            if (isFull()) {
                vapacityExpansion(this.elem);
            }
            for (int i = usedSize; i >= pos; --i) {
                this.elem[usedSize] = this.elem[usedSize - 1];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.elem[i]) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        if (!checkPosInAdd(pos)) {
            return -1;
        }
        return this.elem[pos];
    }

    // 给 pos 位置的元素设为【更新为】 value
    public void set(int pos, int value) {
        if (checkPosInAdd(pos)) {
            this.elem[pos] = value;
        }
    }

    /**
     * 删除第一次出现的关键字key
     *
     * @param key
     */
    public void remove(int key) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == key) {
                for (int j = i; j < usedSize - 1; j++) {
                    this.elem[j] = this.elem[j + 1];
                }
            }
            this.usedSize--;
            return;
        }
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
        for (int i = 0; i < usedSize; i++) {
            elem[i] = 0;
        }
        usedSize = 0;
    }
}
/*
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(1);
        myArrayList.add(1,2);
        myArrayList.add(3);
        myArrayList.add(6);
        myArrayList.add(9);
        myArrayList.clear();
        myArrayList.remove(1);
        myArrayList.display();
        System.out.println(myArrayList.contains(9));
        System.out.println(myArrayList.indexOf(9));
        myArrayList.set(3,5);
    }
}*/
