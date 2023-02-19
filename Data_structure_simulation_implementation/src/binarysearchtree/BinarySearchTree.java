package binarysearchtree;

import heap.Test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-02-17
 * Time: 11:06
 */
public class BinarySearchTree {
    //结点
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //根结点
    public TreeNode root;

    //查找
    public TreeNode find(int val) {
        if(root == null) {
            return null;
        }
        TreeNode cur = root;
        while(cur != null) {
            if(cur.val == val) {
                return cur;
            }else if(cur.val < val) {
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
        return null;
    }

    //插入数据
    public void insert(int val) {
        //如果root 为null，将插入的数据变成root
        if(root == null) {
            root = new TreeNode(val);
        }
        TreeNode cur = root;
        TreeNode parent = null;
        //找到需要插入的结点(parent)
        while(cur != null) {
            if(cur.val < val) {
                parent = cur;
                cur = cur.right;
            }else if(cur.val == val) {
                return;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
        //找到后再判断比较val和parent.val 决定插入在parent 的左左边还是右边
        TreeNode node = new TreeNode(val);
        if(parent.val > val) {
            parent.left = node;
        }else {
            parent.right = node;
        }
    }

    //删除数据
    public boolean remove(int val) {
        TreeNode cur = root;
        TreeNode parent = null;
        while(cur != null) {
            if(cur.val < val) {
                parent = cur;
                cur = cur.right;
            }else if(cur.val == val) {
                removeNode(parent,cur);
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
        return false;
    }

    private void removeNode(TreeNode parent, TreeNode cur) {
        if(cur.left == null) {//左为空
            if(cur == root) {
                root = root.right;
            }else if(parent.left == cur) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {//右为空
            if(cur == root) {
                root = root.left;
            }else if(parent.left == cur) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {//都不为空
            TreeNode targetParent = cur;
            TreeNode target = cur.right;
            //找到 cur 右子树里最小的那一个
            while(target.left != null) {
                targetParent = target;
                target = target.left;
            }
            cur.val = target.val;

            if(targetParent.left == target) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }
}
