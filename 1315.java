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
    private static int result;
    public int sumEvenGrandparent(TreeNode root) {
        result=0;
        if(root==null){
            return result;
        }
        if(root.val%2==0){
            if(root.left!=null){
                if(root.left.left!=null){
                    result+=root.left.left.val;
                }
                if(root.left.right!=null){
                    result+=root.left.right.val;
                }
                
            }
            if(root.right!=null){
                if(root.right.left!=null){
                    result+=root.right.left.val;
                }
                if(root.right.right!=null){
                    result+=root.right.right.val;
                } 
                
            }           
        }
        if(root.left!=null){
            result+= sumEvenGrandparent(root.left);
        }
        if(root.right!=null){
            result+= sumEvenGrandparent(root.right);
        }
        return result;
    }
}
