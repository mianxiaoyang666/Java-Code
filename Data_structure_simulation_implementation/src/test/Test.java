package test;

import binarytree.CharBinaryTree;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-13
 * Time: 15:46
 */
public class Test {
    public static void main(String[] args) {
        CharBinaryTree charBinaryTree = new CharBinaryTree();
        charBinaryTree.root = charBinaryTree.createTree();
        charBinaryTree.preOrder(charBinaryTree.root);
        System.out.println("=====");
        charBinaryTree.inOrder(charBinaryTree.root);
        System.out.println("=====");
        charBinaryTree.postOrder(charBinaryTree.root);
        System.out.println("=====");
//        System.out.println(binaryTree.func(binaryTree.root));
//        System.out.println("=====");
        System.out.println(charBinaryTree.size2(charBinaryTree.root));
        System.out.println("=====");
        System.out.println("叶子数为：" +
                charBinaryTree.getLeafNodeCount2(charBinaryTree.root));
        System.out.println("=====");
        int k = 2;
        System.out.println("第" + k + "层结点数为：" +
                charBinaryTree.getKLevelNodeCount(charBinaryTree.root,k));
        System.out.println("=====");
        System.out.println("树的高度为：" +
                charBinaryTree.getHeight(charBinaryTree.root));
        System.out.println("=====");

        if(charBinaryTree.find(charBinaryTree.root,'C') != null) {
            System.out.println("找到了");
        }else {
            System.out.println("未找到");
        }
        System.out.println("=====");
        charBinaryTree.levelOrder(charBinaryTree.root);
        System.out.println();
        System.out.println("=====");
        System.out.println(charBinaryTree.isCompleteTree(charBinaryTree.root));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        queue.offer(2);
        int[] ret;
    }
}
