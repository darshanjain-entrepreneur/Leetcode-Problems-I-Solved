
class Solution {
    
    int i = 0;
    
    public TreeNode find(int preorder[] , int max , int n){
        
      if(i >= n || preorder[i] > max){
          return null;
      }
        
        TreeNode temp = new TreeNode(preorder[i]);
      i++;
        
        temp.left = find(preorder , temp.val , n );
        temp.right = find(preorder , max , n );
        
        return temp;
        
        
        
        
    }
    
    
    
    
    
    
    
    public TreeNode bstFromPreorder(int[] preorder) {
        
        if(preorder.length == 0){
            return null;
        }
        
        
        return find(preorder , Integer.MAX_VALUE , preorder.length);
        
        
    }
}