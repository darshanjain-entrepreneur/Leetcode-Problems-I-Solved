
class Solution {
    
    
    
    public int find(TreeNode root , int diameter[]){
        
        if(root == null){
            return 0;
        }
        
        
        int left = find(root.left , diameter);
        int right = find(root.right , diameter);
        
        diameter[0] = Math.max(diameter[0] , left + right );
        return 1 + Math.max(left , right);
        
        
        
    }
    
    
    
    
    
    
    
    
    public int diameterOfBinaryTree(TreeNode root ) {
        
        int diameter[] = new int[1];
        
        find(root , diameter);
        return diameter[0];
        
    }
}