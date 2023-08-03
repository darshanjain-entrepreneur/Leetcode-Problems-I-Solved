
class Solution {
    public int minDiffInBST(TreeNode root) {
        
        List<Integer> ll = new ArrayList<>();
        
        find(root , ll);
        
      
        
        int min = (int)1e9;
        
        for(int i = 0; i < ll.size()-1; i++ ){
            
            min = Math.min(min , ll.get(i+1) - ll.get(i));
            
            
            
            
        }
    
        
        return min;
    }
    
    public void find(TreeNode root , List<Integer> ll ){
        
        
        if(root == null){
            return;
        }
        
        
      
        
        find(root.left , ll);
         ll.add(root.val);
        find(root.right , ll);
        
        
        
        
    }
}