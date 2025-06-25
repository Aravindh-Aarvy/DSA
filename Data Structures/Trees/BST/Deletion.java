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
class Deletion {
    public TreeNode deleteNode(TreeNode root, int key) {

        return  inOrder(root, key);
    }

    public TreeNode inOrder(TreeNode root, int key) {
        if (root == null)
            return null;
        if(root.val == key) return delNode(root);
    
        TreeNode head =  root;
        while(root != null){

        if (root.left != null && root.left.val == key) {
            root.left = delNode(root.left);
            break;
        }
           
        else if (root.right != null && root.right.val == key){
            root.right = delNode(root.right);
            break;
        }
            
        root = root.val > key ? root.left : root.right;
        

        }

    return head;

    }

    TreeNode delNode(TreeNode node){

        if(node.left == null) return node.right;
        if(node.right == null) return node.left;

        TreeNode dummy = node;
        TreeNode rightNode = findLastRight(node.left);
        rightNode.right = node.right;
       
        return dummy.left;
    }

    TreeNode findLastRight(TreeNode node) {
        if (node.right == null)
            return node;
        return findLastRight(node.right);

    }
}
