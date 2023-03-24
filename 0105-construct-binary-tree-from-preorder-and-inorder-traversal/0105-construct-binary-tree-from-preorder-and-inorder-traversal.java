
class Solution {
    int pre = 0;
    
    public TreeNode find(int is , int ie , int[] preorder , int[] inorder){
        
        if(is > ie){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[pre]);
        pre++;
        
        int index = 0;
        for(int i = is; i <= ie; i++){
            
            if(inorder[i] == root.val){
                index = i;
                break;
            }
        }
        
        
        root.left = find(is , index-1 , preorder , inorder);
        root.right = find(index+1 , ie , preorder , inorder);
        
        return root;
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        if(preorder.length != inorder.length){
            return null;
        }
        
        
        
        return find(0 , inorder.length-1 , preorder ,inorder );
        
    }
}