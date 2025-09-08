package pid0429;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.Node;

class Solution {
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		Queue<Node> que = new LinkedList<Node>();
		if (root == null) {
			return res;
		}
		que.add(root);
		while (!que.isEmpty()) {
			int nodeSize = que.size();
			List<Integer> layer = new LinkedList<Integer>();
			for (int i = 0; i < nodeSize; i++) {
				Node cur = que.poll();
				layer.add(cur.val);
				List<Node> child = cur.children;
				for (Node node : child) {
					if (node == null) {
						break;
					}
					que.offer(node);
				}
			}
			res.add(layer);
		}
		return res;
	}
}