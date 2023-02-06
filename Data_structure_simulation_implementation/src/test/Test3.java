package test;

import binarytree.CharBinaryTree;
import binarytree.IntBinaryTree;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-02-06
 * Time: 22:28
 */
public class Test3 {
    public static void main(String[] args) {
        IntBinaryTree intBinaryTree = new IntBinaryTree();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        intBinaryTree.buildTree(preorder,inorder);
    }
}
