
class Solution {
    public void recoverTree(TreeNode root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        inorder(root , ans);
        
      
        
        Collections.sort(ans);
        
        inorder1(root , ans);
        
        
    }
   int i = 0;
    
     public void inorder1(TreeNode root , ArrayList<Integer> ans){
        
        if(root == null){
            return;
        }
        
        inorder1(root.left , ans);
        
       root.val = ans.get(i);
         i++;
        
        inorder1(root.right , ans);
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void inorder(TreeNode root , ArrayList<Integer> ans){
        
        if(root == null){
            return;
        }
        
        inorder(root.left , ans);
        ans.add(root.val);
        
        inorder(root.right , ans);
        
        
        
        
    }
}