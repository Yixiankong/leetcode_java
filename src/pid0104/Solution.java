package pid0104;

import java.util.LinkedList;
import java.util.Queue;

import util.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        int maxDep = 0;
        if (root == null) {
            return maxDep;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int layerSize = que.size();
            maxDep++;
            for (int i = 0; i < layerSize; i++){
                TreeNode node = que.poll();
                if (node.left != null) {
                    que.offer(node.left);
                }
                if (node.right != null) {
                    que.offer(node.right);
                }
            }            
        }
        return maxDep;
    }
}