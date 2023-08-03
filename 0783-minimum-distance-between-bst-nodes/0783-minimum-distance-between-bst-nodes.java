
class Solution {
    public int minDiffInBST(TreeNode root) {
        
        List<Integer> ll = new ArrayList<>();
        
        find(root , ll);
        
        Collections.sort(ll);
        
        int min = (int)1e9;
        
        for(int i = 0; i < ll.size()-1; i++ ){
            
            min = Math.min(min , ll.get(i+1) - ll.get(i));
            
            
            
            
        }
        System.out.println(ll);
        
        return min;
    }
    
    public void find(TreeNode root , List<Integer> ll ){
        
        
        if(root == null){
            return;
        }
        
        
        ll.add(root.val);
        
        find(root.left , ll);
        find(root.right , ll);
        
        
        
        
    }
}