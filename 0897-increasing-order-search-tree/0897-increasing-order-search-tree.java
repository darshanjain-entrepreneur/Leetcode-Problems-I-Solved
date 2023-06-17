
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        
        List<TreeNode> ll = new ArrayList<>();
        
        find(root , ll);
        
        for(int i = 0; i < ll.size() - 1; i++){
            
            ll.get(i).right  = ll.get(i+1);
            
            ll.get(i).left = null;
            
            
            
            
        }
        ll.get(ll.size()-1).left = null;
        ll.get(ll.size()-1).right = null;
        
        return ll.get(0);
        
        
    }
    
    public void find(TreeNode root ,  List<TreeNode> ll ){
        
        if(root == null){
            return;
        }
        
        
        
        find(root.left , ll);
        
        ll.add(root);
        find(root.right , ll);
        
        
        
        
    }
}