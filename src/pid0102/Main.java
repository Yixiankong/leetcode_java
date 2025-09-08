package pid0102;

import java.util.List;
import util.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Integer[] arr = { 3, 9, 20, null, null, 15, 7 };
        TreeNode root = TreeNode.createTree(arr);
        List<List<Integer>> res = solution.levelOrder(root);
        System.out.println("res: " + res);
    }
}
