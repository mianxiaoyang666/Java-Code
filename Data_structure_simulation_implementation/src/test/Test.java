package test;

import binarytree.BinaryTree;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-13
 * Time: 15:46
 */
public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = binaryTree.createTree();
        binaryTree.preOrder(binaryTree.root);
        System.out.println("=====");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("=====");
        binaryTree.postOrder(binaryTree.root);
        System.out.println("=====");
//        System.out.println(binaryTree.func(binaryTree.root));
//        System.out.println("=====");
        System.out.println(binaryTree.size2(binaryTree.root));
        System.out.println("=====");
        System.out.println("叶子数为：" +
                binaryTree.getLeafNodeCount2(binaryTree.root));
        System.out.println("=====");
        int k = 2;
        System.out.println("第" + k + "层结点数为：" +
                binaryTree.getKLevelNodeCount(binaryTree.root,k));
        System.out.println("=====");
        System.out.println("树的高度为：" +
                binaryTree.getHeight(binaryTree.root));
        System.out.println("=====");

        if(binaryTree.find(binaryTree.root,'C') != null) {
            System.out.println("找到了");
        }else {
            System.out.println("未找到");
        }
        System.out.println("=====");
        binaryTree.levelOrder(binaryTree.root);
        System.out.println();
        System.out.println("=====");
        System.out.println(binaryTree.isCompleteTree(binaryTree.root));
    }
}
