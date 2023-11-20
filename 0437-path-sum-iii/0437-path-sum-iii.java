
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        
        if(root == null){
            return 0;
        }
        
        return (int)(pathSum(root.left , targetSum) +  solve(root , targetSum) + pathSum(root.right ,targetSum)); 
      
    }
    
    
    
    public long solve(TreeNode root , long sum){
        

        if(root == null){
            return 0;
        }
        
        
       long  res = 0;
        if(root.val == sum){
            res++;
        }
        
        res+= solve(root.left , sum-root.val);
        res+= solve(root.right ,sum - root.val);
        
        
        return res;
        
    }
    
}