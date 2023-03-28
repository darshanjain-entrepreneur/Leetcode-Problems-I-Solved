
class Solution {
    public void recoverTree(TreeNode root) {
        
        ArrayList<TreeNode> ans = new ArrayList<>();
        
        inorder(root , ans);
        
      int prev1 = 0;
        int pre1 = 0;
        
        int count1 = 0;
        int count2 = 0;
        
        int prev2 = 0;
        int pre2 = 0;
        
       for(int i = 0; i < ans.size() - 1; i++){
           
           if(ans.get(i).val > ans.get(i + 1).val){
               
               if(count1 == 0){
                   
                   prev1 = i;
                   pre1 = i+1;
                   count1 = 1;
               }else{
                   
                   prev2 =i;
                   pre2 = i+1;
                   count2 = 1;
               }
               
               
           }
           
           
           
           
       }
        
 
    if(count2 == 0){
        
        int temp = ans.get(prev1).val;
        ans.get(prev1).val = ans.get(pre1).val;
        ans.get(pre1).val = temp;
        
    }else{
        
        
          int temp = ans.get(prev1).val;
        ans.get(prev1).val = ans.get(pre2).val;
        ans.get(pre2).val = temp;
        
        
        
    }
    
    
    
    
    
    
    }
    
    
    
    
    
    public void inorder(TreeNode root , ArrayList<TreeNode> ans){
        
        if(root == null){
            return;
        }
        
        inorder(root.left , ans);
        ans.add(root);
        
        inorder(root.right , ans);
        
        
        
        
    }
}