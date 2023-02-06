package test;

import binarytree.CharBinaryTree;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-23
 * Time: 21:01
 */
public class Test2 {
    public static void main(String[] args) {
        CharBinaryTree charBinaryTree = new CharBinaryTree();
        charBinaryTree.root= charBinaryTree.createTree();
        charBinaryTree.root2 = charBinaryTree.createTree2();
        boolean a = charBinaryTree.isSubtree(charBinaryTree.root, charBinaryTree.root2);
        System.out.println(a);
    }

}
