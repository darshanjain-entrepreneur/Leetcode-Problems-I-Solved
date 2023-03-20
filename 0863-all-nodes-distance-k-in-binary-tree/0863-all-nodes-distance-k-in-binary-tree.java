
class Solution {
    
    
    public void findparent(TreeNode root , HashMap<TreeNode , TreeNode> map){
        
        if(root == null){
            return;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            
            TreeNode temp = q.poll();
            
            if(temp.left != null){
                
                q.add(temp.left);
                map.put(temp.left , temp);
            }
            
            if(temp.right != null){
                q.add(temp.right);
                map.put(temp.right , temp);
            }
            
            
            
            
        }
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        HashMap<TreeNode , TreeNode> map = new HashMap<>();
        
        // from this we find parents
        findparent(root , map);
        
        HashMap<TreeNode , Boolean>  map2 = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        map2.put(target , true);
        q.add(target);
        int level = 0;
        
        while(!q.isEmpty()){
            
            
            int size = q.size();
            
            if(level == k){
                break;
            }
            
            level++;
            
            for(int i = 0; i < size; i++){
                
                TreeNode temp = q.poll();
                
                if(temp.left != null && map2.get(temp.left) == null){
                    
                    map2.put(temp.left , true);
                    q.add(temp.left);
                    
                }
                
                   if(temp.right != null && map2.get(temp.right) == null){
                    
                    map2.put(temp.right , true);
                    q.add(temp.right);
                    
                }
                
                if(map.get(temp) != null && map2.get(map.get(temp)) == null){
                    
                    map2.put(map.get(temp) , true);
                    q.add(map.get(temp));
                }
                
                
                
                
                
                
            }
            
            
            
        }
        List<Integer> ans = new ArrayList<>();
        
        while(!q.isEmpty()){
            ans.add(q.poll().val);
            
        }
        
        
        return ans;
        
        
        
    }
}