package util;

import java.util.LinkedList;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	// 层序遍历创建二叉树
	public static TreeNode createTree(Integer[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		TreeNode root = new TreeNode(arr[0]);
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int index = 1;
		while (!queue.isEmpty() && index < arr.length) {
			TreeNode cur = queue.poll();
			if (arr[index] != null) {
				TreeNode leftChild = new TreeNode(arr[index]);
				cur.left = leftChild;
				queue.offer(leftChild);
			}
			index++;
			if (index >= arr.length) {
				break;
			}
			if (arr[index] != null) {
				TreeNode rightChild = new TreeNode(arr[index]);
				cur.right = rightChild;
				queue.offer(rightChild);
			}
			index++;
		}
		return root;
	}

}
