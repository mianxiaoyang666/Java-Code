/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 21040
 * Date: 2023-01-06
 * Time: 9:53
 */
public class Test {
    int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return getLeafNodeCount(root.left) > (getLeafNodeCount(root.right) ?
    }
    int getLeafNodeCount(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafNodeCount(root.left) + getLeafNodeCount(root.ight);
    }
    public int size(TreeNode root) {
        int count = 0;
        if(root == null) {
            return count;
        }
        if(root.left != null) {
            count++;
            size(root.left);
        }else {
            count++;
            size(root.right);
        }
    }
}
