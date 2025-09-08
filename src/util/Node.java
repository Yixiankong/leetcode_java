package util;

import java.util.List;
import java.util.LinkedList;

public class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int val) {
		this.val = val;
		children = new LinkedList<Node>();
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}

	// 层序遍历创建N叉树
	public static Node createTree(Integer[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		Node root = new Node(arr[0]);
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int index = 2;
		while (index < arr.length) {
			Node cur = queue.poll();
			while (index < arr.length) {
				if (arr[index] == null) {
					index++;
					break;
				}
				Node child = new Node(arr[index]);
				cur.children.add(child);
				queue.add(child);
				index++;
			}
		}
		return root;
	}
}
