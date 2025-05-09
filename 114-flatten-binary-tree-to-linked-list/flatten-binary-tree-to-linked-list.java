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
    TreeNode head = null;
    public void flatten(TreeNode root) {
        if (root != null) revPreOrder(root);
    }

    private void revPreOrder(TreeNode node) {
        if (node.right != null) revPreOrder(node.right);
        if (node.left != null) revPreOrder(node.left);

        node.right = head;
        node.left = null;

        head = node;
    }
}