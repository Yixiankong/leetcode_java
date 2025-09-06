package pid0102;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		if (root == null) {
			return res;
		}
		que.offer(root);
		while (!que.isEmpty()) {
			int layer_size = que.size();
			List<Integer> layer = new LinkedList<Integer>();
			for (int i = 0; i < layer_size; i++) {
				TreeNode node = que.poll();
				layer.add(node.val);
				if (node.left != null) {
					que.offer(node.left);
				}
				if (node.right != null) {
					que.offer(node.right);
				}
			}
			res.add(layer);
		}
		return res;
	}
}