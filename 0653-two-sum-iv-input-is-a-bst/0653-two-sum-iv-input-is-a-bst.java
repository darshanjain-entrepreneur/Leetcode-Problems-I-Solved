
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        
        if(root == null){
            return false;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        findans(root , ans);
        
        if(ans.size() == 0 || ans.size() == 1){
            return false;
        }
        
        int start = 0;
        int end = ans.size() - 1;
        
        while(start < end){
            
            if(ans.get(start) + ans.get(end) == k){
                return true;
            }else if(ans.get(start) + ans.get(end) > k){
                
                end = end-1;
            }else{
                
                start = start + 1;
            }
        }
        
        return false;
    }
    
    public void findans(TreeNode root , ArrayList<Integer> ans){
        
        if(root == null){
            return;
        }
        
        findans(root.left , ans);
        ans.add(root.val);
        findans(root.right , ans);
        
        
    }
    
}