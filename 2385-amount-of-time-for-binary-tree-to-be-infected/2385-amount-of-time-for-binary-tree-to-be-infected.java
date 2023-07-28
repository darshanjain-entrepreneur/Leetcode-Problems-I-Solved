
class Pair{
    
    TreeNode tree;
    int time;
    public Pair(TreeNode tree , int time){
        this.tree = tree;
        this.time = time;
    }
}




class Solution {
    public int amountOfTime(TreeNode root, int start) {
        
        TreeNode startNode = null;
        
  HashMap<TreeNode , TreeNode> map = new HashMap<>();
       HashSet<TreeNode> set = new HashSet<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        
        q.add(root);
        
        while(!q.isEmpty()){
            
            
            TreeNode p = q.poll();
            if(p.val == start){
                startNode = p;
            }
            
            if(p.left != null){
                
                q.add(p.left);
                map.put(p.left , p);
            }
            
            if(p.right != null){
                
                q.add(p.right);
                map.put(p.right , p);
            }
            
            
        }
        
        
       int max = 0;
      
        
        if(startNode == null){
            return 0;
        }
        Queue<Pair> qp = new LinkedList<Pair>();
        
        qp.add(new Pair(startNode ,0));
       set.add(startNode);
        
        while(!qp.isEmpty()){
            
            Pair pp = qp.poll();
            
            TreeNode p = pp.tree;
            int time = pp.time;
         
            
            max = Math.max(time , max);
            
            if(p.left != null && set.contains(p.left) == false){
                qp.add(new Pair(p.left , time+1));
               set.add(p.left);
            }
               if(p.right != null && set.contains(p.right) == false){
                qp.add(new Pair(p.right , time+1));
                   set.add(p.right);
            }
            
            if(map.containsKey(p) && map.get(p) != null && set.contains(map.get(p)) == false){
                
                qp.add(new Pair(map.get(p) , time+1));
                  set.add(map.get(p));
            }
            
        }
        
        
        return max;
        
        
        
    }
}