package pid0637;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

class Solution {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> res = new LinkedList<Double>();
		if (root == null) {
			return res;
		}
		Queue<TreeNode> que = new ArrayDeque<TreeNode>();
		que.offer(root);
		while (!que.isEmpty()) {
			int layerSize = que.size();
			Double sum = 0.0;
			for (int i = 0; i < layerSize; i++) {
				TreeNode node = que.poll();
				sum += node.val;
				if (node.left != null)
					que.add(node.left);
				if (node.right != null)
					que.add(node.right);
			}
			res.add(sum / layerSize);
		}
		return res;
	}
}