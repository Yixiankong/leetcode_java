package pid0144;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import util.TreeNode;

class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new LinkedList<Integer>();
		Deque<TreeNode> st = new LinkedList<TreeNode>();
		if (root == null) {
			return res;
		}
		st.add(root);
		while (!st.isEmpty()) {
			TreeNode node = st.pop();
			res.add(node.val);
			if (node.right != null) {
				st.push(node.right);
			}
			if (node.left != null) {
				st.push(node.left);
			}

		}
		return res;
	}
}