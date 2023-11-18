
class Solution {
    
    int sum = 0;
    
    public int sumNumbers(TreeNode root) {
        
        
        
        
        
        find(root , "");
        
        
        return sum;
    }
    
    public void find( TreeNode root , String s ){
        
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            
       String b = s+""+root.val;
            
            int a = Integer.valueOf(b);
            
            sum = sum + a;
            
            return;
            
            
        }
        
        
        int a = root.val;
        
        find(root.left , s+""+a);
        find(root.right , s+""+a);
        
    }
}