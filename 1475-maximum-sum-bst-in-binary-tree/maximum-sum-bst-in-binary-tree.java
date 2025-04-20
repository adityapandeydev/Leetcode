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
class Solution {
    public int maxSumBST(TreeNode root) {
        int[] maxSum = new int[1];
        helper(root, maxSum);
        return maxSum[0];
    }

    private int[] helper(TreeNode node, int[] maxSum) {
        if (node == null) {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};  
        }

        int[] left = helper(node.left, maxSum);
        int[] right = helper(node.right, maxSum);

        if (left[1] < node.val && node.val < right[0]) {
            int sum = left[2] + right[2] + node.val;
            maxSum[0] = Math.max(maxSum[0], sum);
            return new int[]{Math.min(left[0], node.val), Math.max(right[1], node.val), sum};
        }

        return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
    }
}