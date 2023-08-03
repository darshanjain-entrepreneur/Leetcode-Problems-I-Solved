
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        
        find(root1 , a);
        find(root2 , b);
        
     if(a.size() != b.size()){
         return false;
     }   
        
        
        for(int i = 0; i < a.size(); i++){
            
            if(a.get(i) != b.get(i)){
                return false;
            }
            
        }
        
       return true; 
    }
    
    public void find(TreeNode root , List<Integer> ans){
        
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            ans.add(root.val);
            return;
        }
        
        
        find(root.left , ans);
        
        find(root.right , ans);
        
        
        
        
        
    }
    
    
}