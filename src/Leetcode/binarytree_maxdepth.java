package Leetcode;

/**
 * Created by srujithpoondla on 11/28/16.
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class binarytree_maxdepth {
    public static int maxDepth(TreeNode root) {
        if(root!=null){
            return  Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }else {
            return 0;
        }

    }
}
