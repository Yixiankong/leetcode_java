package pid0429;

import java.util.List;
import util.Node;

public class Main {
	public static void main(String[] args) {
		Integer[] arr = { 1, null, 3, 2, 4, null, 5, 6 };
		Node root = Node.createTree(arr);
		Solution sol = new Solution();
		List<List<Integer>> ret = sol.levelOrder(root);
		System.out.println(ret);
	}
}
