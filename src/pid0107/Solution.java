package pid0107;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		if (root == null) {
			return res;
		}
		que.offer(root);
		while (!que.isEmpty()) {
			int layerLen = que.size();
			List<Integer> layer = new LinkedList<Integer>();
			for (int i = 0; i < layerLen; i++) {
				TreeNode node = que.poll();
				layer.add(node.val);
				if (node.left != null)
					que.add(node.left);
				if (node.right != null)
					que.add(node.right);
			}
			res.add(0, layer);
		}
		return res;
	}
}