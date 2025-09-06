package pid0199;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

class Solution {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new LinkedList<Integer>();
		if (root == null) {
			return res;
		}
		Queue<TreeNode> que = new ArrayDeque<TreeNode>();
		que.offer(root);
		while (!que.isEmpty()) {
			int layerLen = que.size();
			for (int i = 0; i < layerLen; i++) {
				TreeNode node = que.poll();
				if (i == layerLen - 1) {
					res.add(node.val);
				}
				if (node.left != null) {
					que.offer(node.left);
				}
				if (node.right != null) {
					que.offer(node.right);
				}
			}
		}
		return res;
	}
}