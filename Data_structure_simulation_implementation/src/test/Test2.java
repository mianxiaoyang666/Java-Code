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
        char[] ch = new char[]{'h','e','l','l','o'};
        String a = new String(ch);
        a.intern();
        String b = "hello";
        System.out.println(a == b);
    }
    public static void main3(String[] args) {
        String a = "hello";
        String b = "hello" + "World";
        String c = "helloWorld";
        String d = new String("haha");
    }
//    public static void main2(String[] args) {
//        String a = "hello";
//        String b = "hello";
//        System.out.println(a == b);
//
//        String aa = new String("haha");
//        String bb = new String("haha");
//        System.out.println(aa == bb);
//    }

    public static void main2(String[] args) {
        String a = new String("aaa");
        String b = "aaa";
        System.out.println(a == b);
        String c = "bbb";
        String d = new String("ccc");
        String e = "ccc";
    }
    public static void main1(String[] args) {
        CharBinaryTree charBinaryTree = new CharBinaryTree();
        charBinaryTree.root= charBinaryTree.createTree();
        charBinaryTree.root2 = charBinaryTree.createTree2();
        boolean a = charBinaryTree.isSubtree(charBinaryTree.root, charBinaryTree.root2);
        System.out.println(a);
        String s = "aaa";
        s.intern();
    }

}
