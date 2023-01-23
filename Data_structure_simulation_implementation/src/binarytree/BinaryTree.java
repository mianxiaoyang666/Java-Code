package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-12
 * Time: 16:31
 */
public class BinaryTree {
    static class TreeNode {
        public char val;
        public TreeNode left;//左孩子的引用
        public TreeNode right;//右孩子的引用

        public TreeNode(char val) {
            this.val = val;
        }
    }

    public TreeNode root;
    public TreeNode root2;

    /**
     * 创建一棵二叉树 返回这棵树的根节点
     *
     * @return
     */
    public TreeNode createTree() {
        TreeNode A = new TreeNode('3');
        TreeNode B = new TreeNode('4');
        TreeNode C = new TreeNode('5');
        TreeNode D = new TreeNode('1');
        TreeNode E = new TreeNode('2');
        TreeNode F = new TreeNode('0');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.left = F;
        return A;
    }
    public TreeNode createTree2() {
        TreeNode A = new TreeNode('4');
        TreeNode B = new TreeNode('1');
        TreeNode C = new TreeNode('2');
        A.left = B;
        A.right = C;
        return A;
    }

    //判断是否是子树
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) {
            return false;
        }
        return isSameTree(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot != null || root != null && subRoot == null) {
            return false;
        }
        if(root == null && subRoot == null) {
            return true;
        }
        if(root.val != subRoot.val) {
            return false;
        }
        return isSameTree(root.left,subRoot.left) && isSameTree(root.right,subRoot.right);
    }

    // 前序遍历
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 中序遍历
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    // 后序遍历
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    public static int nodeSize;

    /**
     * 获取树中节点的个数：遍历思路
     */
    void size(TreeNode root) {
        if (root == null) {
            return;
        }
        nodeSize++;
        size(root.left);
        size(root.right);
    }

    /**
     * //     * 获取节点的个数：子问题的思路
     * //     *
     * //     * @param root
     * //     * @return
     * //
     */
    public int size2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return size2(root.left) + size2(root.right) + 1;
    }


    /*
     获取叶子节点的个数：遍历思路
     */
    public static int leafSize = 0;

    void getLeafNodeCount1(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafNodeCount1(root.left);
        getLeafNodeCount1(root.right);
    }

    /*
     获取叶子节点的个数：子问题
     */
    public int getLeafNodeCount2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftLeafSize = getLeafNodeCount2(root.left);
        int rightLeafSize = getLeafNodeCount2(root.right);
        return leftLeafSize + rightLeafSize;
    }

    /*
    获取第K层节点的个数
     */
    public int getKLevelNodeCount(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        int leftSize = getKLevelNodeCount(root.left, k - 1);
        int rightSize = getKLevelNodeCount(root.right, k - 1);
        return leftSize + rightSize;
    }

    /*
     获取二叉树的高度
     时间复杂度：O(N)
     */
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftTree = getHeight(root.left);
        int rightTree = getHeight(root.right);
        return leftTree > rightTree ? leftTree + 1 : rightTree + 1;
    }


    // 检测值为value的元素是否存在
    public TreeNode find(TreeNode root, char val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        TreeNode leftTree = find(root.left, val);
        TreeNode rightTree = find(root.right, val);
        if (leftTree != null) {
            return leftTree;
        }
        if (rightTree != null) {
            return rightTree;
        }
        return null;
    }

    //层序遍历
    public void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
            System.out.print(cur.val + " ");
        }

    }


    // 判断一棵树是不是完全二叉树
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flg = false;
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (flg) {
                if (cur.left != null || cur.right != null) {
                    return false;
                }
            } else {
                if (cur.left != null && cur.right != null) {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else if (cur.left != null) {//cur.left != null && cur.right == null
                    queue.offer(cur.left);
                    flg = true;
                } else if (cur.right != null) {//cur.right != null && cur.left == null
                    return false;
                } else {
                    flg = true;
                }
            }

        }
        return true;
    }
}

    //中序遍历
//    public List<Character> func(TreeNode root) {
//        List<Character> ret = new ArrayList<>();
//        if (root == null) {
//            return ret;
//        }
//        List<Character> leftTree = func(root.left);
//        ret.addAll(leftTree);
//        ret.add(root.val);
//        List<Character> rightTree = func(root.right);
//        ret.addAll(rightTree);
//        return ret;
//    }
//}
