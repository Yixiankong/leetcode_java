package pid0094;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import util.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution1 {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	traversal(root, res);
    	return res;
    	
    }
    
    public void traversal(TreeNode root, List<Integer> res) {
    	if (root== null) {
			return;
		}
    	traversal(root.left, res);
    	res.add(root.val);
    	traversal(root.right, res);
    	return;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	Deque<TreeNode> st = new LinkedList<TreeNode>();
    	TreeNode node = root;
    	while (node != null || !st.isEmpty()) {
    		if (node != null) {
				st.push(node);
				node = node.left;
			}
    		else {
				node = st.pop();
				res.add(node.val);
				node = node.right;
			}
    	}
    	return res;
    }
}