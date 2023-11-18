
class Pair{
    
    TreeNode node;
    
    int level;
    
    public Pair(TreeNode node , int level){
        this.node = node;
        this.level = level;
    }
    
    
}

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null){
            
            return ans;
        }
        Stack<List<Integer>> st = new Stack<>();
        
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root , 0));
        
        
        while(!q.isEmpty()){
            
            
        
            
            List<Integer> ll = new ArrayList<>();
            
            int size = q.size();
            int llevel = q.peek().level;
            
        
            
            for(int i = 0; i < size; i++){
                
                
                Pair it = q.poll();
                
                TreeNode temp = it.node;
                int level = it.level;
                
              ll.add(temp.val);
                if(temp.left != null){
                    
                    q.add(new Pair(temp.left , level+1));
                }
                
                
                 if(temp.right != null){
                    
                    q.add(new Pair(temp.right , level+1));
                }
                
                
            }
            
            
            
        st.add(new ArrayList<>(ll));
            
            
            
        }
        
        
        while(!st.isEmpty()){
            
            ans.add(st.peek());
            st.pop();
            
        }
        
        
        
        return ans;
    }
}