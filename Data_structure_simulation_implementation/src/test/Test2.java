package test;

import binarytree.BinaryTree;

import javax.swing.tree.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-23
 * Time: 21:01
 */
public class Test2 {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root= binaryTree.createTree();
        binaryTree.root2 = binaryTree.createTree2();
        boolean a = binaryTree.isSubtree(binaryTree.root,binaryTree.root2);
        System.out.println(a);
    }

}
