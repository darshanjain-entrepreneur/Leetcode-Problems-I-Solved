
class Solution {
    
    public void find(TreeNode root ,List<Integer> ans , int level ){
        
        if(root == null){
            return;
        }
        
        if(ans.size() == level){
            ans.add(root.val);
        }
        
        find(root.right , ans , level + 1);
        find(root.left , ans , level + 1);
        
    }
    
    
    
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        
        find(root , ans , 0);
        return ans;
        
    }
}