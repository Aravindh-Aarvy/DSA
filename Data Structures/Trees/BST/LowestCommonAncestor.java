/**
 *find the lowest common ancestor (LCA) node of two given nodes in the BST.

 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the 
 * lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            int val = root.val;
            if(val > p.val && val > q.val) root = root.left;
            else if(val < p.val && val < q.val) root = root.right;
            else if(val == p.val || val == q.val) return root;
            else return root;
        }
        return root;
    }
}
