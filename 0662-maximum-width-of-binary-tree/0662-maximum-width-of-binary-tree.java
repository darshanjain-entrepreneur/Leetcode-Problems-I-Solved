class Pair{
    
    TreeNode node;
    int level;
    public Pair(TreeNode node , int level){
        this.node = node;
        this.level = level;
    }
}
    
    
    
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            return 1;
        }
        
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root , 0));
        int first = 0;
        int second = 0;
        int ans = 1;
        
        while(!queue.isEmpty()){
            
            int levelsize = queue.size();
            
            for(int i = 0; i <levelsize; i++){
                
                Pair cur = queue.poll();
                
                TreeNode temp = cur.node;
                int level = cur.level;
                
                if(i == 0){
                    first = level;
                    
                }
                if(i == levelsize - 1){
                    second = level;
                    ans = Math.max(ans , second - first + 1);
                }
                
                
                if(temp.left != null){
                    
                    queue.add(new Pair(temp.left , 2*level + 1));
                }
                
                if(temp.right != null){
                    queue.add(new Pair(temp.right , 2*level + 2));
                }
                
                
                
                
            }
            
            
            
            
            
            
            
        }
        
        
        
        
        return ans;
        
        
    }
}