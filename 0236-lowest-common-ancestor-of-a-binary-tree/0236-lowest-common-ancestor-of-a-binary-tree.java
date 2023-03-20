/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public boolean find(TreeNode root ,int target ,ArrayList<TreeNode> ans ){
        
        if(root == null){
            return false;
        }
        
        ans.add(root);
        if(root.val == target){
            return true;
        }
        
        
        if(find(root.left , target , ans) || find(root.right , target , ans)){
            
            return true;
            
        }
        
        ans.remove(ans.size() - 1);
        return false;
        
    }
    
    
    
    
    
    
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        
        ArrayList<TreeNode> p1 = new ArrayList<>();
         ArrayList<TreeNode> q1 = new ArrayList<>();
        
        TreeNode temp1 =root;
        TreeNode temp2 = root;
        
        find(temp1 , p.val , p1);
        find(temp2 , q.val , q1);
        
        int n = p1.size();
        int m = q1.size();
        
        int i = 0;
        int j = 0;
      TreeNode a  = p;
        
        while( i< n && j < m){
            
            if(p1.get(i) == q1.get(j)){
                a = p1.get(i);
            }else{
                break;
            }
            i++;
            j++;
            
        }
        
        return a;
        
    }
}