class Tuple{
    
    TreeNode node;
    int ind;
    
    public Tuple(TreeNode node , int ind){
        
        
            this.node = node;
        this.ind = ind; 
    }
    
    
}

class Pair{
    
    TreeNode node;
    int ind;
    public Pair(TreeNode node , int ind){
        
        this.node = node;
        this.ind = ind;
    }
    
    
}

class Solution {
    public List<Integer> largestValues(TreeNode root) {
              List<Integer> ans = new ArrayList<>();
        
       
        
        
        if(root == null){
            
            return ans;
            
        }

        
        if(root.left == null && root.right == null){
            ans.add(root.val);
            return ans;
        }
        
        
        PriorityQueue<Tuple> pq = new PriorityQueue<>((a , b) -> {
            
            
            
            if(a.ind == b.ind){
                return b.node.val - a.node.val;
            }
               return a.ind - b.ind;
        });
        
     
        
  int max = 1;
        
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root , 1));
        
        while(!q.isEmpty()){
            
            Pair it = q.poll();
            TreeNode temp = it.node;
            
            int ind = it.ind;
            max = Math.max(ind , max);
            
            pq.add(new Tuple(temp , ind));
            
            if(temp.left != null){
                
                q.add(new Pair(temp.left , ind+1));
                
            }
            
            if(temp.right != null){
                q.add(new Pair(temp.right , ind+1));
            }
            
            
        }
        
       
        
        int x = 1;
 
        while(ans.size() < max){
            
            int maxx = -Integer.MIN_VALUE;
          
            while(!pq.isEmpty() && pq.peek().ind <=x){
                
              maxx = Math.max(maxx , pq.peek().node.val);
                pq.poll();
                
            }
            x++;
            ans.add(maxx);
        
            
        }
        
        
        return ans;
    }
}