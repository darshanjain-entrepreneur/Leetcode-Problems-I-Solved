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
    
    public boolean find(TreeNode root ,TreeNode sol ,ArrayList<TreeNode> ans){
        if(root == null){
            return false;
        }
        ans.add(root);
        
        if(root.val == sol.val){
            
            return true;
            
        }
     
        if(find(root.left , sol , ans) || find(root.right , sol ,ans)){
            return true;
        }
        
        int sizes = ans.size() - 1;
        ans.remove(sizes);
        return false;
        
    }
    
    
    
    
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null){
            return null;
        }
        if(p == null && q != null){
            return q;
        }
        if(q == null && p != null){
            return p;
        }
        
        
       ArrayList<TreeNode> ans1 = new ArrayList<>();
        ArrayList<TreeNode> ans2 = new ArrayList<>();
        
        
        find(root , p , ans1 );
        find(root , q , ans2);
        TreeNode ans = null;
for(int i = 0 ; i < ans1.size(); i++){
    for(int j = 0; j < ans2.size(); j++){
        
        if(ans1.get(i) == ans2.get(j)){
            ans = ans1.get(i);
        }
        
    }
}
        
        
        
        return ans;
        
    }
}