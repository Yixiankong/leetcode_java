package pid0101;

import java.util.LinkedList;
import java.util.Queue;

import util.TreeNode;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root.left);
        que.offer(root.right);
        while (!que.isEmpty()) {
            TreeNode leftNode = que.poll();
            TreeNode rightNode = que.poll();
            if (leftNode == null && rightNode == null) {
                continue;
            }
            if (leftNode == null || rightNode == null || leftNode.val != rightNode.val) {
                return false;
            }
            que.offer(leftNode.left);
            que.offer(rightNode.right);
            que.offer(leftNode.right);
            que.offer(rightNode.left);
        }
        return true;
    }
}